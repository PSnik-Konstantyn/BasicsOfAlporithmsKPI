package dz;

import java.util.Arrays;

public class pz_4_2 {

    public static void main(String[] args) {

        int n = 4;
        int m = 4;
        int min = -5;
        int max = 5;

        int[][] a = randomMatrix(n, m, min, max);
        int[][] b = randomMatrix(n, m, min, max);
        int[][] k = multMatrix(a,b);
        System.out.println("Our matrix");
        print3Matrix(a,b,k);
    }

    private static void print3Matrix(int[][] a, int[][] b, int[][] k) {
        String space = "";
        for (int j = 0; j <= a.length - 1; j++) {
            System.out.print(space + "[");
            for (int i = 0; i < a.length; i++) {
                System.out.printf("%4d", a[j][i]);
            }
            System.out.println("]");
        }
        for (int i = 0; i < a.length*4+2; i++) {
            space = space +" ";
        }
        for (int j = 0; j <= b.length - 1; j++) {
            System.out.print(space+"[");
            for (int i = 0; i < b.length; i++) {
                System.out.printf("%4d", b[j][i]);
            }
            System.out.println("]");
        }
        for (int i = 0; i < b.length*4+2; i++) {
            space = space +" ";
        }
        for (int j = 0; j <= k.length - 1; j++) {
            System.out.print(space + "[");
            for (int i = 0; i < k.length; i++) {
                System.out.printf("%4d", k[j][i]);
            }
            System.out.println("]");
        }
    }

    private static int[][] multMatrix(int[][] a, int[][] b) {
        int[][] c = randomMatrix(a.length, b.length, 0, 0);
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                for (int k = 0; k < a.length; k++) {
                    c[i][j] = c[i][j] + a[i][k]*b[k][j];
                }
            }
        }
        return c;
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


