package dz;

public class pz_6_5 {
    public static void main(String[] args) {
        String fin = withoutString("Hello there", "llo");
        System.out.println(fin);
    }

    private static String withoutString(String base, String remove) {
        for (int i = 0; i < remove.length(); i++) {
            String reg = String.valueOf(remove.charAt(i));
            base = base.replaceFirst(reg.toUpperCase(), "");
            base = base.replaceFirst(reg.toLowerCase(), "");

        }
        return base;
    }
}
