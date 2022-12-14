package dz;

import static java.lang.Character.isDigit;

public class pz_6_2 {
    public static void main(String[] args) {
        int answer = sumDigits("aa1bc2d3");
        System.out.println(answer);
    }

    static int sumDigits(String str) {
        int answer = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = (str.charAt(i));
            if (isDigit(ch)){
                answer += Integer.parseInt(String.valueOf(str.charAt(i)));
            }
        }
        return answer;
    }
}
