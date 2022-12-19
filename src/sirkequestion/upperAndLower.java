package sirkequestion;

import java.util.Scanner;

public class upperAndLower {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 
        String str;
        System.out.printf("Enter String: ");
        str = input.nextLine();
        System.out.printf("%s\n%s", str.toUpperCase(), str.toLowerCase());
    }

}

