package homework.J07;

import java.util.ArrayList;

/**
 * Created by YangFan on 2016/10/19.
 */
public class C11_5 {
    public static void main(String[] args){

    }
}

class Course{
    private String courseName;
    private ArrayList<String> students;
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