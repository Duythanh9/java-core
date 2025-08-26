package Giao_lang.Live.AmazingRace.data;

import java.util.Random;

public class Hamster extends Pet {
    public static final double MAX_SPEED = 10;

    public Hamster(String name, int yob, double weight) {
        super(name, yob, weight);
    }

    // @Override
    // public double run() {
    //     // return new Random().nextDouble() * Hamster.MAX_SPEED;
    //     speed = Math.random() * Hamster.MAX_SPEED;
    //     return speed;
    // }

       @Override
    public double run() {
        // return new Random().nextDouble() * Hamster.MAX_SPEED;
        return Math.random() * Hamster.MAX_SPEED;
    }

    // @Override
    // public void showRecord() {
    //     System.out.printf("|%-10s|%-10s|%-4d|%-4.1f|%-7.2f|\n", "Hamster",
    //             name, yob, weight, getSpeed());
    // }

      @Override
    public void showRecord() {
        System.out.printf("|%-10s|%-10s|%-4d|%-4.1f|%-7.2f|\n", "Hamster",
                name, yob, weight, run());
    }

}
