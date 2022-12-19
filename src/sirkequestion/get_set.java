package sirkequestion;

import java.util.Scanner;

public class get_set {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        pen p1 = new pen();
        System.out.println("Enter color");
        String color = sc.nextLine();

        System.out.println("Enter tip : ");
        int tip = sc.nextInt();

        p1.setpen(color, tip);
        System.out.println("Colors " + p1.getcolor());
        System.out.println("Tip is " + p1.gettip());

    }
}

class pen {

    String color;
    int tip;

    public void setpen(String color, int tip) {
        this.color = color;
        this.tip = tip;
    }

    public String getcolor() {
        return color;
    }

    public int gettip() {
        return tip;
    }
}
