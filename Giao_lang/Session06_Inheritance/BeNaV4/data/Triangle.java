package Giao_lang.Session06_Inheritance.BeNaV4.data;

public class Triangle extends Shape {
    // hoàn toàn dị biệt với Shape
    private double a;
    private double b;
    private double c;

    public Triangle(String owner, String color, String borderColor, double a, double b, double c) {
        super(owner, color, borderColor);
        this.a = a;
        this.b = b;
        this.c = c;
    }

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

    @Override
    public double getArea() {
        double p = getPrimetive() / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    @Override
    public double getPrimetive() {
        return (a + b + c);

    }

    @Override
    public void paint() {
        System.out.printf("|Triangle  |%-15s|%-10s|%-10s|%-4.1f|%-4.1f|%-4.1f   |%-7.2f|\n",
                owner, color, borderColor, a, b, c, getArea());
    }

}
