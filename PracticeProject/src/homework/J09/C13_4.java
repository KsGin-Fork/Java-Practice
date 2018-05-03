package homework.J09;

import java.util.Date;

/**
 * Created by YangFan on 2016/10/26.
 */
public class C13_4 {
    public static void main(String[] args){
        new Loan(22,12,100);
    }
}

class Loan{
    private double annulInterestRate;
    private int numberOfYears;
    private double loanAmount;
    private Date loanDate;
    public Loan(){
        this(2.5,1,1000);
    }
    public Loan(double annulInterestRate , int numberOfYears , double loanAmount){
        if (annulInterestRate < 0 || numberOfYears < 0 || loanAmount <0){
            throw new IllegalArgumentException();
        }
        this.annulInterestRate = annulInterestRate;
        this.numberOfYears = numberOfYears;
        this.loanAmount = loanAmount;
        loanDate = new Date();
    }
    public double getAnnulInterestRate() {
        return annulInterestRate;
    }

    public void setAnnulInterestRate(double annulInterestRate) {
        this.annulInterestRate = annulInterestRate;
    }

    public int getNumberOfYears() {
        return numberOfYears;
    }

    public void setNumberOfYears(int numberOfYears) {
        this.numberOfYears = numberOfYears;
    }

    public double getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(double loanAmount) {
        this.loanAmount = loanAmount;
    }
    public Date getLoanDate(){
        return loanDate;
    }
    public double getMonthlyPayment(){
        double monthlyInterestRate = annulInterestRate / 1200;
        double monthlyPayment = loanAmount * monthlyInterestRate
                / (1-(Math.pow(1/(1+monthlyInterestRate)
                ,numberOfYears*12)));
        return monthlyPayment;
    }

    public double getTotalPayment(){
        return getMonthlyPayment() * numberOfYears * 12;
    }
}