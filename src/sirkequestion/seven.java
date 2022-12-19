package sirkequestion;

import java.util.Scanner;

public class seven {

    public static void main(String[] args) {
        laptop l1 = new laptop();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Your Name : ");
        String name = sc.nextLine();

        System.out.println("Enter Your Ram : ");
        int ram = sc.nextInt();

        System.out.println("Enter your price : ");
        int price = sc.nextInt();

        l1.setDetails(name, ram, price);

        System.out.println("Your Laptop name is : " + l1.Name);
        System.out.println("Your Ram is : " + l1.ram);
        System.out.println("Your laptop price is : " + l1.price());
    }

}

class laptop {

    String Name;
    int ram;
    private int price;

    public void setDetails(String name, int ram, int price) {
        this.Name = name;
        this.ram = ram;
        this.price = price;
    }

    public String getName() {
        return Name;
    }

    public int getram() {
        return ram;
    }

    public int price() {
        return price;
    }
}
