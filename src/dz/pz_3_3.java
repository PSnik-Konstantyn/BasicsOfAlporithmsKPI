package dz;

import java.util.Arrays;
import java.util.Scanner;

public class pz_3_3 {

    public static void main(String[] args) {


        int a = checkA();
        System.out.println(a + " array size");
        int[] nums = new int[a];

        for (int i = 0; i < a; i++) {
            nums[i] = (int) (Math.random()*10+1);
        }

        System.out.println("Our matrix");
        System.out.println(Arrays.toString(nums));

        int answer = countEvens(nums);
        System.out.println("Result "+answer);
    }

    private static int countEvens(int[] nums) {
        int counter = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0){
                counter++;
            }
        }
        return counter;
    }

    private static int checkA() {
        int newA = (int) (Math.random()*10+1);
        if (newA %2 == 0 && newA != 0) {
            return newA;
        } else {
            checkA();
        }

        return newA;
    }

}
