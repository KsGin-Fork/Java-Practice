package PTA;

import java.util.Scanner;

/**
 * Created by KsGin on 2017/1/4.
 */
class Stock{
    //表示股票代码
    String symbol;
    //表示股表名称
    String name;
    //前一日的股票交易价格
    double previousClosingPrice;
    //当前股票交易价格
    double currentPrice;
    //构造方法
    public Stock(String symbol , String name){
        this.symbol = symbol;
        this.name = name;
    }
    //从前一日股票交易价格变为当日价格百分比
    public double getChangePercent(){
        return (currentPrice - previousClosingPrice) / previousClosingPrice;
    }
}


public class StockTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String symbol=input.next();
        String name=input.next();
        Stock stock = new Stock(symbol, name);

        stock.previousClosingPrice = input.nextDouble();

        // Input current price
        stock.currentPrice = input.nextDouble();

        // Display stock info
        System.out.println(stock.name+"price changed: " + stock.getChangePercent() * 100 + "%");
        input.close();
    }
}