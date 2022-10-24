package dz;

import java.util.Scanner;

public class pz_2_3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("У вас сьогодні робочий день?");

        boolean weekday = scanner.nextBoolean();

        System.out.println("У вас сьогодні відпустка?");

        boolean vacation = scanner.nextBoolean() ;

        Boolean sleep = sleepIn(weekday, vacation);

        if (sleep){
            System.out.println("Можешь ще поспати");
        }else {
            System.out.println("Ні, приступай до роботи");
        }
        System.out.println("Будн день + відпустка = Спати можна = "+sleepIn(true, true));
        System.out.println("Вихід день + відпустка = Спати можна = "+sleepIn(false, true));
        System.out.println("Будн день + немає відпустки = Спати не можна = "+sleepIn(true, false));
        System.out.println("Вихід день + немає відпустки = Спати можна = "+sleepIn(false, false));
    }

    private static Boolean sleepIn(boolean weekday, boolean vacation) {
        Boolean answer = false;
        if(!weekday) {
            answer = true;
        } if (vacation) {
            answer = true;
        }
        return answer;
    }
}
