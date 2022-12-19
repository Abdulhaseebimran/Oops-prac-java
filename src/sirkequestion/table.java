package sirkequestion;

public class table {

    public static void main(String[] args) {
        int counter = 1;
        System.out.printf("N\t10*N\t100*N\t1000*N\n\n", counter, counter * 10, counter * 100, counter * 1000);
        for (counter = 1; counter < 5; counter++) {
            System.out.printf("%d\t%d\t%d\t%d\n", counter, counter * 10, counter * 100, counter * 1000);
        }
    }

}
