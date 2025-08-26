package Giao_lang.Session06_Inheritance.AmazingRace.data;

import java.util.Random;

public class Cat extends Pet {
    public static final double MAX_SPEED = 50;

    private String ribbon; // ruy-băng

    public Cat(String name, int yob, double weight, String ribbon) {
        super(name, yob, weight); // Mèo chính là 1 thú cưng (Pet)
        this.ribbon = ribbon; // đưa Con bay thật xa
    }

    public static double getMaxSpeed() {
        return MAX_SPEED;
    }

    public String getRibbon() {
        return ribbon;
    }

    public void setRibbon(String ribbon) {
        this.ribbon = ribbon;
    }

    @Override
    public double run() {
        // Trong cuộc sống có những "thứ-object" sin ra cho mình mấy cái trò
        // ngẫu nhiên, như vậy chúng thuộc Nhóm/Khuôn ngẫu nhiên, class ngẫu nhiên
        // JDK có sẵn cái khuôn này rồi, tên là Random
        // ~~~~ Scanner ~~~~~ Math
        Random mayNgauNhien = new Random();
        double speed = mayNgauNhien.nextDouble() * MAX_SPEED; // Trả cho mình con số
        // trong khoảng (0...1)
        return speed; // Trả về tốc dộ gần 50, hen xui random
    }

    @Override
    public void showRecord() {
        System.out.printf("|Cat    |%-10s|%-4d|%-4.1f|%-5s|%4.2f|\n", name, yob, weight, ribbon, run());
    }

}
