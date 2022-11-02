package labs;

import java.util.Date;
import java.util.Scanner;

public class Lr1 {

    public static void main(String[] args) {

        double m = 2;
        double c = -1;
        double t = 1.2;
        double b = 0.7;

        Double R = calcR(m, t, c);
        Double S = calcS(m, b, t, c);

        System.out.printf("Значення R =  %5.4f \nЗначення S =  %5.4f \n", R, S);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введіть нові значення для розрахунків");
        System.out.println("Для m");
        m = scanner.nextDouble();
        System.out.println("Для c");
        c = scanner.nextDouble();
        System.out.println("Для t");
        t = scanner.nextDouble();
        System.out.println("Для b");
        b = scanner.nextDouble();

        R = calcR(m, t, c);
        S = calcS(m, b, t, c);

        System.out.printf("Значення R =  %5.4f \nЗначення S =  %5.4s \n", R, S);

        outputDate();

    }

    private static void outputDate() {
        Date date = new Date();
        System.out.printf( "Сьогодні %1$td.%1$tm.%1$tY %1$tk:%1$tM:%1$tS:%1$tM за київським часом", date);

    }

    private static Double calcS(double m, double b, double t, double c) {
        Double answerS = (m * Math.cos(b * t * Math.sin(t))) + c;
        return answerS;
    }

    private static Double calcR(double m, double t, double c) {
        Double answerR = Math.cbrt((m * Math.tan(t)) + Math.abs(c * Math.sin(t)));
        return answerR;
    }

}