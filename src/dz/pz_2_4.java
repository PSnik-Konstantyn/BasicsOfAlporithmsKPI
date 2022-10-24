package dz;

import java.util.Scanner;

public class pz_2_4 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть будь-яке перше, друге та третє число");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        System.out.println((hasTeen(a,b,c)));
    }

    private static boolean hasTeen(int a, int b, int c) {
        boolean answer = false;
        if ( (13 <= a && a <= 19) || (13 <= b && b <= 19) || (13 <= c && c <= 19)){
            answer = true;
        }
        return answer;
    }
}
