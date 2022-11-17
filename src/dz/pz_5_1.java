package dz;

public class pz_5_1 {
    public static void main(String[] args) {
        Circle firstCircle = new Circle(0,0, 12);
        Circle secondCircle = new Circle(3,5,-2);
        checkCircles(firstCircle,secondCircle);
    }

    private static void checkCircles(Circle firstCircle, Circle secondCircle) {
        if (firstCircle.r == secondCircle.r){
            System.out.println("\nCircles square are the same");
        } else {
            System.out.println("\nThis two circles not the same");
        }
    }
}
