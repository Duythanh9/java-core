package Giao_lang.Session06_Inheritance.AmazingRace.data;

import java.util.Random;

public class Dog extends Pet {
    public static final double MAX_SPEED = 40;

    public Dog(String name, int yob, double weight) {
        super(name, yob, weight);
    }

    @Override
    public double run() {
        // Random random = new Random();
        return new Random().nextDouble() * Dog.MAX_SPEED;
    }

    @Override
    public void showRecord() {
        System.out.printf("|%-7s|%-10s|%-4d|%-4.1f|%-4s|%-4.2f|\n","DOG    ", name, yob, weight, "  -  ", run());
    }

}
