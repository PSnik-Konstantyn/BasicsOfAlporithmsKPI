package dz;

import java.util.Arrays;
import java.util.Scanner;

public class pz_3_2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int a = (int) (Math.random()*10+1);
        if (a % 2 == 0 && a != 0) {
            a = checkA();
        }
        System.out.println(a + " array size");
        int[] nums = new int[a];

        for (int i = 0; i < a; i++) {
            nums[i] = (int) (Math.random()*10+1);
        }

        System.out.println("Our matrix");
        System.out.println(Arrays.toString(nums));

        int answer = maxTripl(nums);
        System.out.println("Result "+answer);
    }

    private static int maxTripl(int[] nums) {
        int size = nums.length;
        int answer;
        int first = nums[0];
        int middle = nums[(size-1)/2];
        int last = nums[size-1];
        if (first >= middle && first >= last) {
            answer = first;
        } else if (middle >= first && middle >= last) {
            answer = middle;
        } else {
            answer = last;
        }
        return answer;
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
