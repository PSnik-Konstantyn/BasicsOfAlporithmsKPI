package dz;

import java.util.Arrays;
import java.util.Scanner;

public class pz_3_6 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {


        System.out.println("Please enter matrix size");
        int n = scanner.nextInt();
        if (n <= 0) {
            n = checkN();
        }

        int[] answer;
        answer = squareUp(n);


        System.out.println("Our matrix");
        System.out.println(Arrays.toString(answer));

    }

    private static int[] squareUp(int n) {
        int[] a = new int[n * n];
        int lastIndex = 0;

        int[] prev = new int[n];
        for (int i = 0; i < n; i++) {
            prev[i] = 0;
        }
        int ad = 1;
        for (int i = 0; i < n; i++) {

            prev[n - ad] = (prev[n - ad] + ad);
            ad++;
            for (int j = 0; j <= n - 1; j++) {
                a[j + lastIndex] = prev[j];
            }

            lastIndex = lastIndex + n;

        }

        return a;
    }

    private static int checkN() {
        System.out.println("Please enter n>0");
        int newN = scanner.nextInt();
        if (newN >= 0) {
            return newN;
        } else {
            checkN();
        }
        return newN;
    }
}
