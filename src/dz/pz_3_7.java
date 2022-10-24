package dz;

import java.util.Arrays;
import java.util.Scanner;

public class pz_3_7 {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("Please enter matrix size");
        int n = scanner.nextInt();
        if (n <= 0) {
            n = checkN();
        }
        int[] a = new int[n];
        System.out.println("Please enter the numbers for array");
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }

        System.out.println("Our array");
        System.out.println(Arrays.toString(a));


        int answer = maxSpan(a);
        System.out.println("The longest span is " + answer);

    }

    private static int maxSpan(int[] a) {
        
        return 0;
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
