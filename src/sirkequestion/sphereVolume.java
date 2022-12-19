package sirkequestion;

import java.util.Scanner;

public class sphereVolume {

    public static double sphereVolume(double radius) { // begin sphereVolume method
        return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3); // return the volume after calculation 
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 
        double radius = 0.0, volume = 0.0; 

        System.out.printf("Enter Radius: ");
        radius = input.nextInt();
        System.out.printf("Volume = %.3f", sphereVolume(radius));
    }
}
