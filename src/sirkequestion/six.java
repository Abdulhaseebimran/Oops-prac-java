package sirkequestion;

import java.util.Scanner;

public class six {

    public static void main(String[] args) {
        Student S1 = new Student();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Your Name : ");
        String name = sc.nextLine();

        System.out.println("Enter Your Father Name : ");
        String FatherName = sc.nextLine();

        System.out.println("Enter Your ID : ");
        int Id = sc.nextInt();

        System.out.println("Enter Your Sections : ");
        String Sec = sc.next();

        S1.setStudent(name, FatherName, Id, Sec);
        System.out.println("Your name is : " + S1.name);
        System.out.println("Your Father Name is : " + S1.FatherName);
        System.out.println("Your ID Number is : " + S1.getId());
        System.out.println("Your Section is : " + S1.Sec);
    }

}

class Student {

    String name;
    String FatherName;
    private int Id;
    String Sec;

    public void setStudent(String name, String FatherName, int Id, String Sec) {
        this.name = name;
        this.FatherName = FatherName;
        this.Id = Id;
        this.Sec = Sec;
    }

    public String getname() {
        return name;
    }

    public String getFatherName() {
        return FatherName;
    }

    public int getId() {
        return Id;
    }

    public String getSec() {
        return Sec;
    }

}
