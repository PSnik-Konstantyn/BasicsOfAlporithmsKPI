package dz;

public class pz_4_5 {
    public static void main(String[] args) {

        int n = 5;
        int m = 6;
        int[][] a = strangeMatrix(n, m);
        for (int j = 0; j < n; j++) {
            System.out.print("[");
            for (int i = 0; i < m; i++) {
                System.out.printf("%4d", a[j][i]);
            }
            System.out.println("]");
        }
    }


    private static int[][] strangeMatrix(int n, int m) {
        int[][] c = new int[n][m];
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                c[i-1][j-1]=i*j;
            }
        }
        return c;
    }
}
