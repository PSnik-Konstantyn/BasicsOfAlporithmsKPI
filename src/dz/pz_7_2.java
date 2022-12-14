package dz;

import static java.lang.Character.isDigit;
import static java.lang.Character.isSpaceChar;

public class pz_7_2 {
    public static void main(String[] args) {
        String fin = notReplace("is is okay is");
        System.out.println(fin);
    }

    static String notReplace(String str) {
        String right = str;
        String left = "";
        for (int i = 0; i < right.length() ; i++) {
            int ind = right.indexOf("is");
            if(ind == -1){
                return left+right;
            } else {

                if (ind == 0 && isSpaceChar(right.charAt(2))) {
                    right = right.replaceFirst("is", "is not");
                } else if (ind == right.length() - 2 && isSpaceChar(right.charAt(right.length() - 3))) {
                    right = right.replaceFirst("is", "is not");
                } else if (isSpaceChar(right.charAt(ind - 1)) && isSpaceChar(right.charAt(ind + 2))) {
                    right = right.replaceFirst("is", "is not");
                }
                left = left + right.substring(0, ind + 6);
                right = right.substring(ind+6, right.length());
                str = str.replaceFirst("is", "");
            }
        }
        return left;
    }
}
