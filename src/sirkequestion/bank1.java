package sirkequestion;

import java.util.Scanner;

public class bank1 {

    private int pwd;
    private double bal = 5000;

    public void Deposit1(Double money) {
        System.out.println("Enter password");
        Scanner r = new Scanner(System.in);
        pwd = r.nextInt();
        if (pwd == 123) {
            bal = bal + money;
            System.out.println("Deposit money" + money);
            System.out.println("Deposit balance" + bal);
        } else {
            System.out.println("invalid password");

        }
    }

    public void Withdraw2(Double money) {
        System.out.println("Enter password");
        Scanner r = new Scanner(System.in);
        pwd = r.nextInt();
        if (pwd == 123) {
            bal = bal - money;
            System.out.println("Withdraw money" + money);
            System.out.println("total balance" + bal);
        } else {
            System.out.println("invalid password");

        }
    }

    public void Checkbal(Double money) {
        System.out.println("Enter password");
        Scanner r = new Scanner(System.in);
        pwd = r.nextInt();
        if (pwd == 123) {

            System.out.println("total balance" + bal);
        } else {
            System.out.println("invalid password");

        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        bank1 b = new bank1();
        int ch;
        System.out.println("1:Deposit");
        System.out.println("2:Withdraw");
        System.out.println("3:Checkbal");
        System.out.println("enter your choice");
        Scanner r2 = new Scanner(System.in);
        ch = r2.nextInt();
        switch (ch) {
            case 1:
                b.Deposit1(100.0);
                break;
            case 2:
                b.Withdraw2(200.0);
                break;
            case 3:
                b.Checkbal(0.00);
                break;
            default:
                System.out.print("enter your choice");

        }
    }
}
