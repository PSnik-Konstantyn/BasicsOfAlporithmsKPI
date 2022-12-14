package dz;

public class Triangle {
    double a;
    double b;
    double c;

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double square (double a, double b, double c){
        double p = (a+b+c)/2;
        double square = Math.sqrt(p*(p-a)*(p-b)*(p-c));
        return square;
    }
}
