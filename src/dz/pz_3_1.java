package dz;

import java.util.Arrays;
import java.util.Scanner;

public class pz_3_1 {

    public static void main(String[] args) {
        int[] a = new int[3];
        int[] b = new int[3];
        String sd = "| Бали за 100-бальною шкалою    |  Оцінка за шкалою ЄКТС|Оцінка за національною шкалою|\n";
        System.out.println(sd.length());
        String m = "F";
        System.out.println(m.hashCode());
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the numbers for a array");
        for (int i = 0; i < 3; i++) {
            a[i] = scanner.nextInt();
        }
        System.out.println("Please enter the numbers for b array");
        for (int i = 0; i < 3; i++) {
            b[i] = scanner.nextInt();
        }

        System.out.println("Our arrays");
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));

        System.out.println("After middleWay method");
        System.out.println(Arrays.toString(middleWay(a, b)));
    }

    private static int[] middleWay(int[] a, int[] b) {
        int [] answer = new int[2];
        answer[0] = a[1];
        answer[1] = b[1];
        return answer;
    }
}
