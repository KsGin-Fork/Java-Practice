package homework.J08;

import java.util.Date;

/**
 * Created by YangFan on 2016/10/23.
 */
public class GeometricObject {
        private String color;
        private boolean filled;
        private Date dateCreated;
        public GeometricObject(){
            dateCreated = new Date();
        }
        public GeometricObject(String color , boolean filled){
            this.color = color;
            this.filled = filled;
            this.dateCreated = new Date();
        }
        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public boolean isFilled() {

            return filled;
        }

        public void setFilled(boolean filled) {

            this.filled = filled;
        }
        public String toString(){

            return "color is" + color + "isFill" + filled + "created date is " + dateCreated;
        }


        public static double sumArea(GeometricObject[] gto){
            double areaSum = 1.0;
            for (GeometricObject it : gto){
                if (it instanceof Retange){
                    areaSum += ((Retange) it).getArea();
                }
                if (it instanceof Circle){
                    areaSum += ((Circle) it).getArea();
                }
            }
            return areaSum;
        }
}

class Retange extends GeometricObject{
    double width , height;
    public Retange(double width , double height){
        this.width = width;
        this.height = height;
    }
    public double getArea(){
        return width*height;
    }
}