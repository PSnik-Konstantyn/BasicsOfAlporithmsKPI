package dz;

import java.util.Scanner;

public class pz_1_3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введіть трьохзначне число");
        int n = scanner.nextInt();
        int answer = n/100 + n/10%10 + n%10;
        System.out.printf("Сума цифр цього числа = %d ", answer);
//
//        System.out.println("Введіть число");
//        String number = scanner.nextLine();
//        int size = number.length();
//        int answer = 0;
//        for (int i = 1; i < size; i++) {
//            answer = answer/(Math.pow(10, i-1) + answer
//        }
    }

}
