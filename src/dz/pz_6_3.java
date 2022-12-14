package dz;

public class pz_6_3 {
    public static void main(String[] args) {
       boolean fin = catDog("catdogcatdog");
        System.out.println(fin);
    }

    private static boolean catDog(String str) {
        boolean answer = false;
        if(str.contains("cat") && str.contains("dog")){
            str = str.replaceFirst("cat","");
            str = str.replaceFirst("dog","");
            answer = true;
        }
        if ( (str.contains("cat") && !str.contains("dog")) ||  (!str.contains("cat") && str.contains("dog")) ){
            answer = false;
        }
        return answer;
    }
}
