package homework.J04;


import java.util.Scanner;

/**
 * Created by 杨帆 on 2016/9/22.
 */
public class E6_19 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please input the student's count:");
        int count = scanner.nextInt();
        scanner.nextLine();
        Student[] stu = new Student[count];
        for (int i = 0 ; i < count ; i++){
            System.out.println("Please input the " + (i+1) + "st student's Information");
            System.out.print("Name:");
            String name = scanner.nextLine();
            System.out.print("Score:");
            double score = scanner.nextDouble();
            stu[i] = new Student(name , score);
            scanner.nextLine();
        }
        for (int i = 0 ; i < count ; i++){
            for (int j = 0 ; j < count - i - 1 ; j++){
                if (stu[j].getScore() > stu[j+1].getScore()){
                    Student temp = stu[j];
                    stu[j] = stu[j+1];
                    stu[j+1] = temp;
                }
            }
        }
        for (int i = 0 ; i < stu.length ; i++ ){
            System.out.println("The student name is" + stu[i].getName() + "'s score is " + stu[i].getScore());
        }
    }
}

class Student{

    private String name;
    private double score;

    public String getName() {
        return name;
    }

    public double getScore() {
        return score;
    }

    public Student(String name , double socre){
        this.name = name;
        this.score = socre;
    }
    public Student(){

    }
}