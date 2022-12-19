package sirkequestion;

import java.util.Scanner;

public class remainder {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 
        int num1 = 0, num2 = 0, k; 

        System.out.printf("Enter First Number: ");
        num1 = input.nextInt(); 

        System.out.printf("Enter Second Number: ");
        num2 = input.nextInt();

        k = num2 % num1; // assign the remainder ofnum2 divided by num1 to the integer k

        if (k == 0) { // check if k is 0. remainder k will be 0 if num1 is a multiple of num2, 
            System.out.printf("%d is a multiple of %d", num1, num2);
        } else {
            System.out.printf("%d is not a multiple of %d", num1, num2);
        }
    }
}


