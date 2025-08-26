package Giao_lang.Live.AmazingRace.data;

import java.util.Random;

public class Cat extends Pet {
    public static final double MAX_SPEED = 50;

    public Cat(String name, int yob, double weight) {
        super(name, yob, weight);
    }

    // @Override
    // public double run() {
       
    //     speed = Math.random() * Cat.MAX_SPEED;
    //     return speed;
        
    // }

     @Override
    public double run() {
        // Random random = new Random(); // random nắm tọa độ vùng new
        // trong vùng new có hàm .nextDouble() quan trọng
        // return new Random().nextDouble() * Cat.MAX_SPEED;
        return Math.random() * Cat.MAX_SPEED;
        // object ko thèm đặt tên, xài vùng new 1 lần bỏ luôn
        // CT MTĐT, Garbage Collecter, System.gc()

        // (0...1) * 50 coi như đc con số sát 50
    }

    // @Override
    // public void showRecord() {
    //     System.out.printf("|%-10s|%-10s|%-4d|%-4.1f|%-7.2f|\n", "Cat", name, yob, weight, getSpeed());
    // }

     @Override
    public void showRecord() {
        System.out.printf("|%-10s|%-10s|%-4d|%-4.1f|%-7.2f|\n", "Cat", name, yob, weight, run());
    }
}
