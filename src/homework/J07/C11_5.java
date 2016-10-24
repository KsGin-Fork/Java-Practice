package homework.J07;

import java.util.ArrayList;

/**
 * Created by YangFan on 2016/10/19.
 */
public class C11_5 {
    public static void main(String[] args){
        Course course = new Course("数据结构");
        course.addStudent("Amnnny");
        course.addStudent("KsGin");
        System.out.println(course.getCourseName() + "课程学生为:");
        String[] a = course.getStudents();
        for (int i = 0 ; i < course.getNumberOfStudents() ; i++){
            System.out.println(a[i]);
        }
    }
}

class Course{
    private String courseName;
    private ArrayList<String> students = new ArrayList<>();
    public Course(String courseName){
        this.courseName = courseName;
    }
    public void addStudent(String student){
        students.add(student);
    }

    public String[] getStudents(){
        return students.toArray(new String[students.size()]);
    }

    public int getNumberOfStudents(){
        return students.size();
    }

    public String getCourseName(){
        return courseName;
    }
 }