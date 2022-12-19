/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sirkequestion;

import java.util.Scanner;

public class sum {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 
 int num1 = 0, num2 = 0, bigger = 0; // initialize variables

        System.out.printf("Enter First Number: ");
        num1 = input.nextInt(); // store next integer in num1

        System.out.printf("Enter Second Number: ");
        num2 = input.nextInt(); // store next integer in num2

        if (num1 > num2) { // checks which number is larger
            bigger = num1;
            System.out.printf("%d Is Larger", bigger);
        } else if (num1 < num2) {
            bigger = num2;
            System.out.printf("%d Is Larger", bigger);
        } else { //if both numbers are equal 
            System.out.printf("The numbers are equal");
        }
    }
}

