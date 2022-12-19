package sirkequestion;

import java.util.*;

public class secQuestion {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number1, number2, number3;

        System.out.println("Enter Number 1 : ");
        number1 = sc.nextInt();

        System.out.println("Enter Number 2 : ");
        number2 = sc.nextInt();

        System.out.println("Enter Number 3 : ");
        number3 = sc.nextInt();

        System.out.println("The Product of three number is : " + number1 * number2 * number3);
    }
}
