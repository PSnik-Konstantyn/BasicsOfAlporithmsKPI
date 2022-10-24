package dz;

import java.util.Scanner;

public class pz_2_2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введіть будь-яке значення");

        int n = scanner.nextInt();

        System.out.println(nearHundred(n));
    }

    private static Boolean nearHundred(int n) {

        Boolean answer = false;

        if ( 90 <= n && n <= 110) {
            answer = true;
        } else if (190 <= n && n <= 210){
            answer = true;
        }

        return answer;
    }

}
