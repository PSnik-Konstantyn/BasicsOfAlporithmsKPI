package dz;

import java.util.Scanner;

public class pz_2_1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введіть будь-яке значення");

        int n = scanner.nextInt();


        if ( 21 <= n ) {
            System.out.println(2*diff21(n));
        }else {
            System.out.println(diff21(n));
        }
    }

    private static int diff21(int n) {
        return 21-n;
    }

}
