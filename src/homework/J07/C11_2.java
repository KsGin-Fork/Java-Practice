package homework.J07;

import java.util.Date;

/**
 * Created by YangFan on 2016/10/19.
 */
public class C11_2 {
    public static void main(String[] args){
        Person person = new Person();
        System.out.println(person.toString());
        Student student = new Student();
        System.out.println(student.toString());
        Employee employee = new Employee();
        System.out.println(employee.toString());
        Faculty faculty = new Faculty();
        System.out.println(faculty.toString());
        Staff staff = new Staff();
        System.out.println(staff.toString());
    }
}


class Person{
    String name = "zhangsan";
    String address = "m2:f4:5e:2g:4h";
    String tel = "10086";
    String email = "xupt@xupt.com";
    public String toString(){
        return "Class name : "+ this.getClass().getSimpleName() + "  name : " + name;
    }
}

class Student extends Person{
    int grade;
    public String toString(){
        return super.toString();
    }
}

class Employee extends Person{
    String office;
    double wage;
    Date date;
    public String toString(){
        return super.toString();
    }
}

class Faculty extends Employee{
    Date workTime;
    int level;
    public String toString(){
        return super.toString();
    }
}

class Staff extends Employee{
    String title;
    public String toString(){
        return super.toString();
    }
}

class MyDate{
    int year;
    int month;
    int day;
    public String toString(){
        return super.toString();
    }
}