package homework.J03;

/**
 * Created by 杨帆 on 2016/9/17.
 */

public class J09 {
    public static void main(String[] args){
        char[] arr = {'1','2','3'};
        MyInteger myInteger = new MyInteger(13);
        System.out.println(myInteger.getValue());

        System.out.println(myInteger.isEven() + "  " + myInteger.isOdd() + "  " + myInteger.isPrime());

        System.out.println(MyInteger.isEven(21) + "  " + MyInteger.isOdd(14) + "  " + MyInteger.isPrime(2));

        System.out.println(MyInteger.isEven(myInteger) + "  " + MyInteger.isOdd(myInteger) + "  " + MyInteger.isPrime(myInteger));

        System.out.println(myInteger.equals(13) + "  " + myInteger.equals(new MyInteger(79)));

        System.out.println(MyInteger.parseInt("231") + "  " +  MyInteger.parseInt(arr));
    }
}


class MyInteger{
    private int value;

    public int getValue(){
        return this.value;
    }

    public boolean isEven(){
        if (this.value % 2 == 0){
            return true;
        }
        return false;
    }

    public boolean isOdd(){
        if (!this.isEven()){
            return true;
        }
        return false;
    }

    public boolean isPrime(){
        if (this.value <= 2 && this.value >= -2) return false;
        for (int index = 2 ; index < this.value ; index++){
            if (this.value % index == 0){
                return false;
            }
        }
        return true;
    }

    public static boolean isEven(int value){
        if (value % 2 == 0){
            return true;
        }
        return false;
    }

    public static boolean isOdd(int value){
        if (!isEven(value)){
            return true;
        }
        return false;
    }

    public static boolean isPrime(int value){
        if (value <= 2 && value >= -2) return false;
        for (int index = 2 ; index < value ; index++){
            if (value % index == 0){
                return false;
            }
        }
        return true;
    }

    public static boolean isEven(MyInteger integer){
        if (integer.value % 2 == 0){
            return true;
        }
        return false;
    }

    public boolean equals(int value){
        if (this.value == value){
            return true;
        }
        return false;
    }

    public boolean equals(MyInteger integer){
        if (this.value == integer.getValue()){
            return true;
        }
        return false;
    }

    public static boolean isOdd(MyInteger integer){
        if (!isEven(integer.getValue())){
            return true;
        }
        return false;
    }

    public static boolean isPrime(MyInteger integer){
        for (int index = 2 ; index < integer.value ; index++){
            if (integer.value % index == 0){
                return false;
            }
        }
        return true;
    }

    public static int parseInt(char intArr[]){
        int sum = 0;
        for (int index = intArr.length-1 ; index >= 0 ; index--){
            sum += (intArr[index] - '0') * Math.pow(10,intArr.length - index - 1);
        }
        return sum;
    }

    public static int parseInt(String string){
        int sum = 0;
        for (int index = string.length()-1 ; index >= 0 ; index--){
            sum += (string.charAt(index) - '0') * Math.pow(10,string.length() - index - 1);
        }
        return sum;
    }

    public MyInteger(int value){
        this.value = value;
    }

    public MyInteger(){

    }
}