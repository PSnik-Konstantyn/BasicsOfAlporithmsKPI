package dz;

import java.util.Arrays;

public class pz_4_1 {

        public static void main(String[] args) {

            int a = checkA();
            System.out.println(a + " array size");
            int[] nums = new int[a];
            int[] test1 = new int[]{1,2,3,4,5,6,7};
            for (int i = 0; i < a; i++) {
                nums[i] = (int) (Math.random()*1000);
            }

            System.out.println("Our matrix");
            System.out.println(Arrays.toString(nums));

            int [] answer = bubbleSort(nums);
            System.out.print("[");
            for (int j = 0; j <= answer.length - 1; j++ ) {
                System.out.print(answer[j]);
                if (j != answer.length - 1 ) {
                    System.out.print(", ");
                }
            }
            System.out.println("]");
            isProgress(answer);
            isProgress(test1);
        }

    private static void isProgress(int[] answer) {
            int arf = answer[1] - answer[0];
        for (int i = 0; i <= answer.length-1; i++) {
            if (i == answer.length-1){
                if (answer[i] - answer[i-1] != arf){
                    System.out.println("Не арифметична прогресія");
                    return;
                }
            }
            if (i != answer.length-1){
                if (answer[i+1] - answer[i] != arf){
                    System.out.println("Не арифметична прогресія");
                    return;
                }
            }
        }
        System.out.println("Арифметична прогресія");
    }

    private static int[] bubbleSort(int[] nums) {
            int a;
            int b;

            for (int i = 0; i <nums.length; i++) {
                if (nums[0] > nums[1]){
                    a = nums[0];
                    b= nums[1];
                    nums[0] = b;
                    nums[1] = a;
                }
                if (i != 0 && nums[i] < nums[i-1]){
                    a = nums[i];
                    b= nums[i-1];
                    nums[i] = b;
                    nums[i-1] = a;
                    bubbleSort(nums);
                }
            }

            return nums;
        }


        private static int checkA() {
            int newA = (int) (Math.random()*10+5);
            if (newA %2 == 0 && newA != 0) {
                return newA;
            } else {
                checkA();
            }

            return newA;
        }

}
