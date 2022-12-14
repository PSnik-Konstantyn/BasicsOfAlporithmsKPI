package dz;

public class Circle {

    double x;
    double y;
    double r;

    public Circle(double x, double y, double r) {
        this.x = x;
        this.y = y;
        if (r>0) {
            this.r = r;
        } else {
            throw new RuntimeException("radius must be more than 0");
        }
    }
}
