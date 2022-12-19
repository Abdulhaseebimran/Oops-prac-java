package sirkequestion;

import java.util.*;

public class third {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double celcius;
        double tempInFahrenhiet = 0.0;

        celcius = (tempInFahrenhiet - 32.0) * 5.0 / 9.0;
        System.out.println("Enter the Fahrenhiet Values : ");
        tempInFahrenhiet = sc.nextDouble();
       
        System.out.println("The celcius value is 10.2f is %2.2f  " + " " + tempInFahrenhiet + celcius);
    }
}
