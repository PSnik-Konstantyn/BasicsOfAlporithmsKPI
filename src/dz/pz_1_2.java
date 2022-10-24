package dz;

import java.util.Scanner;

public class pz_1_2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введіть Double значення, яке необіхдно округлити");
        double n = scanner.nextDouble();
        System.out.printf("Значення n %d ", Math.rint(n));

    }

}
