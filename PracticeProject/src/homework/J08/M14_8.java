package homework.J08;

/**
 * Created by YangFan on 2016/10/23.
 */
public class M14_8 {
    public static void main(String[] args){
        GeometricObject[] gto = { new Circle(10) , new Circle(12) , new Retange(7,8) ,new Retange(4,6)};
        System.out.println("sum = " + GeometricObject.sumArea(gto));
    }
}
