package homework.J02;

import java.text.DecimalFormat;
import java.util.Date;

/**
 * Created by imqqy on 2016/9/7.
 */
public class T06 {
    public static void main(String[] args){
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        Account account = new Account(1122,20000);
        account.setAnnualInterestRate(0.045);
        account.withDraw(2500);
        account.deposit(3000);
        System.out.println("Balance :" + account.getBalance());
        System.out.println("MonthlyInterestRate : " + decimalFormat.format(account.getMonthlyInterestRate() * 100)  + "%");
        System.out.println("Date : " + account.getDateCreate());
    }
}


class Account{
    private int id = 0;
    private double balance = 0;
    private double annualInterestRate = 0;
    private Date dateCreate;

    public Date getDateCreate() {
        return dateCreate;
    }

    public Account(){

    }
    public Account(int id, double balance){
        Date date = new Date();
        this.dateCreate = Date.from(date.toInstant());
        this.id = id;
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public double getMonthlyInterestRate(){
        return this.annualInterestRate / 12;
    }

    public void withDraw(double balance){
        this.balance -= balance;
    }

    public void deposit(double balance){
        this.balance += balance;
    }

}