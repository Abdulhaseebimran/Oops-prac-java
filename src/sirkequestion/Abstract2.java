package sirkequestion;

import java.util.Scanner;

//public class Abstract2 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter Your Name : ");
//        String name = sc.nextLine();
//        
//        System.out.println("Enter Your phone Number : ");
//        String phone = sc.nextLine();
//        
//        System.out.println("Enter your Amount to Deposit : ");
//        int amountDepo = sc.nextInt();
//        
//        System.out.println("Enter Your Amount to WithDraw : ");
//        int amountWd = sc.nextInt();
//        
//        HBl H1 = new HBL();
//        
//    }
//    
//}
//
//abstract class Atm {
//     abstract public void getDetails();
//     abstract public void withDraw();
//     abstract public void deposit();
//}
//
//class HBL extends Atm{
//     String name;   //  for details 
//     String phone;  
//     int amountDepo;  // for deposit 
//     int amountWd;  // for withdraw
//     
//     public void setDetails(String name, String phone, int amountDepo, int amountWd){
//        this.name = name;
//        this.phone = phone;
//        this.amountDepo = amountDepo;
//        this.amountWd = amountWd;
//         
//        void getDetails (){
//            System.out.println("Name : " + name);
//            System.out.println("Phone : " + phone);
//        }
//        
//         public void withDraw (){
//         System.out.println("Amount WithDraw : " + amountWd);
//       }
//        
//        public void deposit(){
//         System.out.println("Amount Deposit : " + amountDepo);
//      }
//     }
abstract class Parent {

    public Parent() {
        System.out.println("Me ek constructor hu parent ka");
    }

    abstract public void greet1();

    abstract public void greet2();
}

class child extends Parent {

    @Override
    public void greet1() {
        System.out.println("Me ek override method hu abstract parent ka 1");
    }

    public void greet2() {
        System.out.println("Me ek override method hu abstract parent ka 2");
    }
}

class child1 extends child {

    public void th() {
        System.out.println("I Am th");
    }
}

public class Abstract2 {

    public static void main(String[] args) {
        child1 c = new child1();
        c.th();
        c.greet1();
        c.greet2();

    }
}
