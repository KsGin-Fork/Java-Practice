package homework.J14;

import java.lang.Integer;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/**
 * Created by KsGin on 12/22/2016.
 */
public class T29_9 {
    public static void main(String[] args){
        Set<java.lang.Integer> integerSet = new CopyOnWriteArraySet<>();
        //Set<java.lang.Integer> integerSet = new HashSet<>();
        new Thread(() ->{
            for (int i = 0 ; i < 1000 ; ++i){
                try {
                    Thread.currentThread().sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                integerSet.add((int)(Math.random()*1000));
            }
        }).start();
        new Thread(() -> {
                for (int i = 0 ; i < 1000 ; ++i){
                try {
                    Thread.currentThread().sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                for (Integer integer : integerSet){
                    System.out.print( integer + " ");
                }

             }
        }).start();
    }
}

/*


    为了排查ConcurrentModificationException异常的出现  ， 去google了一下foreach实现

    发现了这个foreach实现的接口  其实也就是个迭代器
    public interface Iterable<T> {
        Iterator<T> iterator();
    }

    事实上
    for (Integer integer : integerSet){
        System.out.print(integer + " ");
    }

    这一段就相当于
    for(Iterator<Integer> itr = integerSet.iterator(); itr.hasNext();){
       System.out.print(itr.next() + " ");
    }

    追踪到这里加上之前查看异常记录

    Exception in thread "Thread-1" java.util.ConcurrentModificationException
	at java.util.HashMap$HashIterator.nextNode(HashMap.java:1437)
	at java.util.HashMap$KeyIterator.next(HashMap.java:1461)
	at homework.J14.T29_9.lambda$main$1(T29_9.java:35)
	at java.lang.Thread.run(Thread.java:745)

    知道了问题出在迭代器的next和hasNext上

    继续Google

    看到HashSet的源码中关于迭代器的方法定义

    public Iterator<E> iterator() {
        return map.keySet().iterator();
    }

    是实现的map的迭代器,继续找下去

    中间被绕来绕去  最后翻到了这个

    final Entry<K,V> nextEntry() {
            if (modCount != expectedModCount)
                throw new ConcurrentModificationException();         //Here
            Entry<K,V> e = next;
            if (e == null)
                throw new NoSuchElementException();

            if ((next = e.next) == null) {
                Entry[] t = table;
                while (index < t.length && ( next = t[index ++]) == null)
                    ;
            }
           current = e;
           return e;
        }

    啊  终于是看到了要看到的东西   是从

    if (modCount != expectedModCount)
       throw new ConcurrentModificationException();

    抛出去的  那么这个modCount 和 expectedModCount是什么的   仅凭名字来看   是修改的次数和期望修改的次数，是这样吗
    继续Google

    protected transient int modCount = 0;
    int expectedModCount = modCount;

    最后找到了这两行代码(并未在一起定义，上边仅仅是将这两行代码的定义拿出来放在一起而已)

    如变量名称所示，modCount确实是修改次数,expectedModCount是期望修改次数(并不懂要这个有什么意义) (查看到后边才明白这其实是一种保护机制)

    而在遍历的过程中，经过一圈的调用，会判断这两个数值是否相等，不相等抛出ConcurrentModificationException() 。

    那么这个modCount肯定是在set add和remove中发生改变的(查了一下果然如此) 遍历属于const操作应该不会改变这个值,那么expectedModCount呢

    google之后，这个是迭代器在初始化过程中将modCount值赋值给expectedModCount的 ，为的就是hashMap实现过程中处理线程不安全性

    在HashMap的API中指出：

    由所有HashMap类的“Collection视图方法”所返回的迭代器都是Fail-Fast的：在迭代器创建之后，如果从结构上对映射进行修改，除非通过迭代器本身的remove方法，
    其他任何时间任何方式的修改，迭代器都将抛出ConcurrentModificationException。
    因此，面对并发的修改，迭代器很快就会完全失败，并在将来的不确定的时间发生任意不确定的风险。

    到现在，也完全搞明白了这个异常的出现原理

    fail-fast机制是Java集合(Collection)中的一种错误机制。当多个线程对同一个集合的内容进行操作时，就可能会产生fail-fast事件。
    因此如果在使用迭代器的过程中有其他线程修改了map,会导致map本身的ModCount与迭代器的expectedModCount不相等,那么将抛出ConcurrentModificationException。

    这是一种对于可能出现的并发修改的一种保护措施

    那么如何避免这个错误呢,又如何在使用foreach的过程中解决可能出现的错误呢(除了自己手动迭代器和使用单线程)

    老办法 先Google

    OK 互联网就是好
    1: 我们可以使用 CopyOnWriteArraySet<>()  代替hashSet 以解千愁(至于这个如何实现的就等有时间慢慢探索吧)
    2: 在迭代前加锁,保证迭代过程中set不会被修改,但这样却失去了多线程的基本意义(首推第一条 ，虽然不知道怎么实现)

    至此完毕  (代码仅演示了第一种解决思路)

 */