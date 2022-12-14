package dz;

import org.junit.Test;

public class pz_7_3 {
    public static void main(String[] args) {
        int [] array = {1, 2, 2, 3, 4, 4, 7, 9, 9, 9, 9};
        int c = countClumps(array);
        System.out.println(c);
    }

    static int countClumps(int[] array) {
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            if(i != array.length-1 && array[i] == array[i+1]){

                int h = 1;
                    while (array[i+h-1] == array[i+h]){
                        h++;
                        if(i+h+1 >= array.length){
                            break;
                        }
                    }
                counter++;
                    i = i + h-1;
                }
            }
        return counter;
    }
}
