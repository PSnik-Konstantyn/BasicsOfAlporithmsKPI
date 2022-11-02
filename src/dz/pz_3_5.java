package dz;

import java.util.Arrays;

public class pz_3_5 {
    public static void main(String[] args) {


        int a = checkA();
        System.out.println(a + " array size");
        int[] nums = new int[a];
        int[] test1 = new int[]{1,0,0,1,0,0,1,1,1,0};
        int[] test2 = new int[]{1,1,1,1,1,1,1,1,1,0};
        for (int i = 0; i < a; i++) {
            nums[i] = (int) (Math.random()*2);
        }

        System.out.println("Our matrix");
        System.out.println(Arrays.toString(nums));
        System.out.println(Arrays.toString(zeroFront(test2)));

       int [] answer = zeroFront(nums);
        System.out.println(Arrays.toString(zeroFront(test1)));
        System.out.print("[");
        for (int j = 0; j <= answer.length - 1; j++ ) {
            System.out.print(answer[j]);
            if (j != answer.length - 1 ) {
                System.out.print(", ");
            }
        }
        System.out.print("]");
    }

    private static int[] zeroFront(int[] nums) {
        int a;
        int b;

        for (int i = 0; i <nums.length; i++) {
            if (nums[0] != 0){
                a = nums[0];
                b= nums[1];
                nums[0] = b;
                nums[1] = a;
            }
            if (i != 0 && nums[i] == 0 && nums[i-1] != 0){
                a = nums[i];
                b= nums[i-1];
                nums[i] = b;
                nums[i-1] = a;
                zeroFront(nums);
            }
        }

        return nums;
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
