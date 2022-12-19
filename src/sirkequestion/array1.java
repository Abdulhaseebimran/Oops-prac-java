package sirkequestion;

public class array1 {

    public static void main(String[] args) {
        int array[] = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

        int bouns[];
        bouns = new int[15];

        for (int i = 0; i < 15; i++) {
            bouns[i] += 1;
//            System.out.printf("%d\t", bouns[i]);
        }

        int bestScore[] = {10, 20, 30, 40, 50};
        for (int j = 0; j < 15; j++) {
            System.out.printf("%d\t", bestScore[j]);
        }
    }

}
