package com.yangfan.J02;

import java.text.DecimalFormat;

//Stock类

/**
 * Created by imqqy on 2016/9/7.
 */
public class T05 {
    public static void main(String[] args){
        Stock stock = new Stock("java","Microsoft");
        stock.previousClosingPrice = 4.5;
        stock.currentPercent = 4.35;
        System.out.println( stock.getChangePercent());
    }
}


class Stock{
    String symbol;
    String name;
    double previousClosingPrice;
    double currentPercent;
    public Stock(String symbol , String name){
        this.symbol = symbol;
        this.name = name;
    }
    public String getChangePercent(){
        DecimalFormat decimalFormat = new DecimalFormat("0.##");
        return decimalFormat.format((currentPercent - previousClosingPrice)/previousClosingPrice *100 ) + "%";
    }
}