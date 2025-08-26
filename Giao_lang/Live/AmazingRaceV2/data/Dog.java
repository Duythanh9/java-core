package Giao_lang.Live.AmazingRaceV2.data;

import java.util.Random;

// Dog ngoan ngoãn ban ngày, tối chủ đi ngủ, nó trốn nhà đi hoang
// Đi đua thì nó phải chạy vượt tốc độ bth, runToDead() như mọi đua thủ
// Mình vẫn là con Cháu dòng họ Lê, Phạm, Nguyễn, học như bth SV
// nhưng còn tham gia CLB đua thủ, phượt, CLB gì đó, thì phải có hành động của clb đó
// IMPLEMENTS all Abstract methods, nội quy CLB, @OVerride
public class Dog extends Pet implements DeathRacer {
    public static final double MAX_SPEED = 40;

    public Dog(String name, int yob, double weight) {
        super(name, yob, weight);
    }

    @Override
    public double run() {
        return new Random().nextDouble() * Dog.MAX_SPEED;
    }

    @Override
    public void showRecord() {
        System.out.printf("|%-10s|%-10s|%-4d|%-4.1f|%-7.1f|\n",
                "DOG", name, yob, weight, run());
    }

    // Phần hoang dã trong ta, bộc lộ khi đi đua
    // Tụi mày, SV, ngoan ngoãn ở nhà giãn cách
    // Ra HN, chắc chắn thêm phần bộ lộ khác: nhậu nhẹt, game, cá độ, .....

    @Override
    public double runToDead() {
        return run() * 5; // chạy hơn 5 lần so với bth
    }

    @Override
    public void showHowToDead() {
        System.out.printf("|%-15s|%-10s|%-9d|%-4.1f|%-7.1f|\n",
                "DOG-RECER", name, yob, weight, runToDead());
    }

}
