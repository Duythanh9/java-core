package Giao_lang.Live.AmazingRace.data;

import java.util.Random;

public class Dog extends Pet {

    public static final double MAX_SPEED = 40;

    public Dog(String name, int yob, double weight) {
        super(name, yob, weight);
    }

    // @Override
    // public double run() {
    // speed = Math.random() * Dog.MAX_SPEED;
    // return speed;
    // }

    @Override
    public double run() {
        return Math.random() * Dog.MAX_SPEED;
    }

    // @Override
    // public void showRecord() {
    //     System.out.printf("|Dog       |%-10s|%-4d|%-4.1f|%-7.2f|\n", name, yob, weight, getSpeed());
    // }

     @Override
    public void showRecord() {
        System.out.printf("|Dog       |%-10s|%-4d|%-4.1f|%-7.2f|\n", name, yob, weight, run());
    }

}
