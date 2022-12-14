package dz;

public class pz_6_4 {
    public static void main(String[] args) {
        boolean fin = endOther("HiabC", "aBc");
        System.out.println(fin);
    }

    static boolean endOther(String str1, String str2) {
        boolean answer = false;
        String gh = "";

        for (int i =  str1.length() - str2.length() ; i <= str1.length()-1; i++) {
            gh = gh + str1.charAt(i);
        }

        if(str2.compareToIgnoreCase(gh) == 0){
            answer = true;
        }
        return answer;
    }
}
