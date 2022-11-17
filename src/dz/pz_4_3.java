package dz;

import java.util.Arrays;

public class pz_4_3 {
    public static void main(String[] args) {

        int n = 4;
        int m = 4;
        int min = -5;
        int max = 5;

        int[][] a = randomMatrix(n, m, min, max);
        System.out.println("Our matrix");
        for (int j = 0; j <= a.length - 1; j++) {
            System.out.print("[");
            for (int i = 0; i < a.length; i++) {
                System.out.printf("%4d", a[j][i]);
            }
            System.out.println("]");
        }
        int[] b = downMatrix(a);
        System.out.println("Under main diagonal");
        System.out.println(Arrays.toString(b));
        System.out.println("Matrix that need to be sorted");
        System.out.println(Arrays.toString(b));
        int[] h = sortMatrix(b);
        System.out.println("Sorted one");
        System.out.println(Arrays.toString(h));
    }

    private static int[] sortMatrix(int[] b) {
        for (int i = 1; i < b.length; i++) {
            if (b[i] < b[i - 1]) {
                int f = b[i-1];
                b[i-1] = b[i];
                b[i] = f;
                sortMatrix(b);
            }
        }
        return b;
    }

    private static int[] downMatrix(int[][] a) {
        int [] b = new int[a.length*3-2];
        int counter = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                if(j<=i){
                    b[counter] = a[i][j];
                    counter++;
                }
            }
        }
        return b;
    }


    private static int[][] randomMatrix(int n, int m, int min, int max) {
        int[][] c = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                c[i][j] = (int) (Math.random() * (max*2+2) + (min-1));
            }
        }
        return c;
    }
}
