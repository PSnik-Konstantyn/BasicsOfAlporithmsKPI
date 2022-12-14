package dz;

public class pz_6_1 {
    public static void main(String[] args) {
       String fin = doubleChar("The");
        System.out.println(fin);
    }

    private static String doubleChar(String str) {
        String answer = "";
        for (int i = 0; i < str.length(); i++) {
            answer = answer + str.charAt(i) + str.charAt(i);
        }
        return answer;
    }
}
