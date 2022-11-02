package dz;

import java.util.Arrays;

public class pz_3_4 {
    public static void main(String[] args) {


        int a = checkA();
        System.out.println(a + " array size");
        int[] nums = new int[a];
        int[] test = new int[]{3, 4, 3, 3, 4};
        int[] test1 = new int[]{3, 1, 3, 1, 3};
        for (int i = 0; i < a; i++) {
            nums[i] = (int) (Math.random()*4+1);
        }

        System.out.println("Our matrix");
        System.out.println(Arrays.toString(nums));

        boolean answer = haveThree(nums);
        System.out.println("Result "+answer);
        System.out.println("Result "+ haveThree(test));
        System.out.println("Result "+ haveThree(test1));
    }

    private static boolean haveThree(int[] nums) {
        boolean result = false;
        int counter = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 3){
                if (i != 0){
                    if (nums[i-1] == 3){
                       return false;
                    } else {
                        counter++;
                    }
                }
                if (i != nums.length-1){
                    if (nums[i+1] == 3){
                        return false;
                    } else {
                        counter++;
                    }
                }
            }
        }
        if (counter >= 3){
            result = true;
        }

        return result;
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
