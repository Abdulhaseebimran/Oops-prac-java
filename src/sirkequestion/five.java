package sirkequestion;

import java.util.*;

public class five {

    public static void main(String[] args) {
        accountDetails Ad = new accountDetails();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your account Name");
        String an = sc.nextLine();

        System.out.println("Enter Your account Number");
        int An1 = sc.nextInt();

        System.out.println("Enter your User Name");
        String un = sc.next();

        System.out.println("Enter your Password");
        String pass = sc.next();

        Ad.setDetails(an, An1, un, pass);
        System.out.println("Account Name : " + Ad.getAccountName());
        System.out.println("Account Number : " + Ad.getaccountNumber());
        System.out.println("User Name : " + Ad.userName);
        System.out.println("Password : " + Ad.password);

    }
}

class accountDetails {

    private String accountName;
    private int accountNumber;
    String userName;
    String password;

    public void setDetails(String accountName, int accountNumber, String userName, String password) {
        this.accountName = accountName;
        this.accountNumber = accountNumber;
        this.userName = userName;
        this.password = password;
    }

    public String getAccountName() {
        return accountName;
    }

    public int getaccountNumber() {
        return accountNumber;
    }

    public String getuserName() {
        return userName;
    }

    public String getpassword() {
        return password;
    }
}
