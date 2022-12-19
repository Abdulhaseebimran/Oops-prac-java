package sirkequestion;

import java.util.Scanner;

public class counter {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int counter = 0, number = 0, largest = 0;

        for (counter = 0; counter < 10; counter++) {
            System.out.printf("Enter Number [%d]: ", counter + 1);
            number = input.nextInt();
            largest = largest > number ? largest : number;
        }

        System.out.printf("Largest = %d", largest);
    }

}
