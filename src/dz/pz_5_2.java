package dz;

public class pz_5_2 {
    public static void main(String[] args) {
        Triangle pryam = new Triangle(3,4,5);
        Triangle typ = new Triangle(3,9,3);
        Triangle gos = new Triangle(3,3,3);
        double res = pryam.square(3,4,5);
        System.out.println(res);
        double par = parametr(pryam);
        System.out.println(par);
    }

    private static double parametr(Triangle pryam) {
        double res = pryam.getA() + pryam.getB() + pryam.getC();
        return res;
    }
}
