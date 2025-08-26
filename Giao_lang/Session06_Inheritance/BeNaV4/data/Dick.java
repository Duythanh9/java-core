package Giao_lang.Session06_Inheritance.BeNaV4.data;

public class Dick extends Shape {
    private String smile;
    private double radius;
    private static final double PI = 3.14;

    public Dick(String owner, String color, String borderColor, String smile, double radius) {
        super(owner, color, borderColor);
        this.smile = smile;
        this.radius = radius;
    }

    public String getSmile() {
        return smile;
    }

    public void setSmile(String smile) {
        this.smile = smile;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {

        return Dick.PI * Math.pow(radius, 2);
    }

    @Override
    public double getPrimetive() {

        return 2 * Math.PI * radius;
    }

    @Override
    public void paint() {
        System.out.printf("|Dick      |%-15s|%-10s|%-10s|%-4s|%-4.1f|%-7.2f|\n",
                owner, color, borderColor, smile, radius, getArea());
    }

}
