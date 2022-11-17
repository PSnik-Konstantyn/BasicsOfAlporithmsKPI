package dz;

import java.util.Arrays;

public class pz_4_4 {
    public static void main(String[] args) {

     String[] names = new String[] {"a","b","q","e","w","r","t","y","u","i","o","p","s","d","f","g","h","j","k","l","z","x","c","v"};
     double[] time = new double[names.length];
        for (int i = 0; i < names.length-1 ; i++) {
            time[i] = 12 + Math.random()*3;
        }
        int[] fast = findTheFastest(time);
        System.out.println(Arrays.toString(names));
        System.out.println(Arrays.toString(time));
        System.out.println(Arrays.toString(fast));
        System.out.println("List of runners");
        for (int i = 1; i <= 4; i++) {
            System.out.println(i+"."+names[fast[i-1]] + " with speed " + time[fast[i-1]]);
        }

    }

    private static int[] findTheFastest(double[] time) {
        int[] t = new int[4];
        for (int i = 0; i < 24; i++) {
            putInList(i, time, t);
        }
        return t;
    }

    private static void putInList(int i, double[] time, int[] t) {
        for (int j = 0; j < 4; j++) {
            if(time[t[j]]<time[i]){
                t[j] = i;
                return;
            }
        }
    }

}
