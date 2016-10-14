package com.yangfan.J04;

import java.util.Calendar;

/**
 * Created by 杨帆 on 2016/9/22.
 */
public class E10_14 {
    public static void main(String[] args){
        MyDate date1 = new MyDate();
        MyDate date2 = new MyDate(561672391283L);
        System.out.println("Date1:" + date1.getYear() + "  " + date1.getMonth() + "  " + date1.getDay());
        System.out.println("Date2:" + date2.getYear() + "  " + date2.getMonth() + "  " + date2.getDay());
    }
}


class MyDate{
    private int year;
    private int month;

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    private int day;

    public MyDate(){
        Calendar calendar = Calendar.getInstance();
        this.year = calendar.get(Calendar.YEAR);
        this.month = calendar.get(Calendar.MONTH)+1;
        this.day = calendar.get(Calendar.DAY_OF_MONTH);
    }

    public MyDate(Long millisec){
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(millisec);
        this.year = calendar.get(Calendar.YEAR);
        this.month = calendar.get(Calendar.MONTH)+1;
        this.day = calendar.get(Calendar.DAY_OF_MONTH);
    }

    public MyDate(int year , int month , int day){
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public void setDate(long elapsedTime){
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(elapsedTime);
        this.year = calendar.get(Calendar.YEAR);
        this.month = calendar.get(Calendar.MONTH);
        this.day = calendar.get(Calendar.DAY_OF_MONTH);
    }

}