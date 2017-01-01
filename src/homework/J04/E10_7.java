package homework.J04;

import java.util.Scanner;

/**
 * Created by 鏉ㄥ竼 on 2016/9/22.
 */
public class E10_7 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int[] idList = {1 , 2 ,3 ,4 ,5, 6, 7, 8, 9, 10};
        double[] balanceList = {100 ,100, 100, 100, 100, 100, 100 ,100,100 ,100};
        ATM atm = new ATM(idList,balanceList);
        System.out.print("Enter a id:");
        atm.signIn(scanner.nextInt());
    }
}

class ATM{
    private int[] idList;  //鍒濆鍖�    
    private double[] balanceList;  //鍒濆鍖�
    public ATM(int[] idList , double[] balanceList){
        this.idList = idList;
        this.balanceList = balanceList;
    }

    public ATM(){

    }

    private boolean checkID(int id){
        for (int i = 0 ; i < idList.length ; i++){
            if (idList[i] == id) return true;
        }
        return false;
    }

    private void showMenu(int id){
        Scanner scanner = new Scanner(System.in);
        System.out.println("     Main Menu");
        System.out.println("1: check balance");
        System.out.println("2: withdraw");
        System.out.println("3: deposit");
        System.out.println("4: exit");
        int choose = scanner.nextInt();
        checkOperate(choose,id);
    }

    public void signIn(int id){
        if (checkID(id)) showMenu(id);
        else System.out.print("ID error");
    }

    private void withdraw(int id){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an amount to withdraw:");
        double amount = scanner.nextDouble();
        if (amount > 0 && amount <= this.balanceList[id]) this.balanceList[id] -= amount;
        else System.out.println("Balance error");
        System.out.println("The balance is " + balanceList[id]);
        showMenu(id);
    }

    private void deposit(int id){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an amount to deposit:");
        double amount = scanner.nextDouble();
        if (amount > 0 ) this.balanceList[id] += amount;
        else System.out.println("Balance error");
        System.out.println("The balance is " + balanceList[id]);
        showMenu(id);
    }

    private void checkOperate(int choose , int id){
        switch (choose){
            case 1:System.out.println("The balance is " + balanceList[id]); showMenu(id); break;
            case 2:withdraw(id); break;
            case 3:deposit(id); break;
            case 4:System.exit(1); break;
        }
    }
}