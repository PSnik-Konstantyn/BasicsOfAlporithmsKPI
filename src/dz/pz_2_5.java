package dz;


public class pz_2_5 {

    public static void main(String[] args) {
        int a = (int) (Math.random()*20);
        int b = (int) (Math.random()*20);
        System.out.println("Our numbers  " + a + "  "+b);
        System.out.println("The most closest number to 10 is  " + close10(a,b));
    }

    private static int close10(int a, int b) {
        int answer = 0;

        if ( Math.abs(10-a) < Math.abs(10-b)){
            answer = a;
        } else if (Math.abs(10-a) > Math.abs(10-b)){
            answer = b;
        }

        return answer;
    }
}
