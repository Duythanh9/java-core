package Giao_lang.Live.AmazingRace.amazingrace;

import java.util.Random;

import Giao_lang.Live.AmazingRace.data.Cat;
import Giao_lang.Live.AmazingRace.data.Dog;
import Giao_lang.Live.AmazingRace.data.Hamster;
import Giao_lang.Live.AmazingRace.data.Pet;
import Giao_lang.Live.Shapes.data.Shape;

public class AmazingRace {
    public static void main(String[] args) {
        // showRecore();
        showRecordWithTakeAway();
    }

    public static void showRecordWithTakeAway() {

        // đường đua đông vui, có nhiều racer, và có một con gì đó ko nhìn rõ
        // bay theo, vật gì đó bay theo, tức là có tốc độ
        // mình ko biết, ko xác định đc nhóm của nó là gì, chưa biết class gì
        // vì mày muốn nhập hội, okie, chạy theo đi, chơi trò take-away
        // mượn gió bẻ măng, mượn Pet để new Object

        Pet ufo = new Pet("UFO", 2021, 0.3) {

            @Override
            public double run() {
                return new Random().nextDouble() * 30;
            }

            @Override
            public void showRecord() {
                System.out.printf("|%-10s|%-10s|%-4d|%-4.1f|%-7.2f|\n", "Take-Away",
                        name, yob, weight, run());
            }
        };

        Hamster xx = new Hamster("Nhat", 2004, 2.5);

        Pet racer[] = new Pet[] {
                new Dog("Chihihi", 2021, 0.5),
                new Dog("Vang oi", 1950, 10.0),
                new Cat("Tom", 1960, 15.0),
                new Cat("Kitty", 1990, 5.0),
                new Hamster("Jerry", 1950, 0.5),
                xx, ufo // object tạo từ ANONYMOUS vẫn là Pet, vào mảng
        };

        System.out.println("The records table");
        for (Pet x : racer) {
            x.showRecord();;
        }

        for (int i = 0; i < racer.length - 1; i++) {
            for (int j = i + 1; j < racer.length; j++) {
                if (racer[i].run() > racer[j].run()) {
                    // Tốc độ chạy sẽ bị thay đổi cho mỗi lần so sánh
                } // S, P, GPA cố định, thoải mái gọi getS() getSPA để
            } // so sánh và đổi chỗ
        }

        System.out.println("After sorting pet");
        for (Pet pet : racer) {
            pet.showRecord();
        }
    }

    // public static void showRecord() {
    // Hamster xx = new Hamster("Nhat", 2004, 2.5);
    // Pet racer[] = new Pet[] {
    // new Dog("Chihihi", 2021, 0.5),
    // new Dog("Vang oi", 1950, 10.0),
    // new Cat("Tom", 1960, 15.0),
    // new Cat("Kitty", 1990, 5.0),
    // new Hamster("Jerry", 1950, 0.5),
    // xx
    // };

    // // racer[0] = new Dog("", 0, 0);
    // // Phần tử mảng Pet thì phải là gán 1 con Pet nào đó, Cat, Dog, Ht
    // // Gán = new Dog(...); [i] = cần tọa độ vùng new Con nào đó()
    // // new Dog() ...: bố trí vùng Ram trong HEAP, gọi phễu đổ vào, lấy mốc
    // // tọa độ vùng new đưa cho ai đó
    // // đa hình quay trở lại
    // // vì mảng Pet, mọi việc chấm là của cha, của pet, cha toàn là ABSTRACT
    // // hoàn toàn ko đáng lo, vì con đã IMPLEMENT
    // // Cha quất roi chạy đi chúng mày, thế là 3 đứa con chạy theo
    // // tốc độ của riêng chúng, đa hình xuất hiện, OVeride qua mặt XH

    // System.out.println("The records table");
    // for (Pet x : racer) {
    // // x = racer[0], x = racer[i]
    // x.run();
    // }
    // // tại thời điểm viết code thế này, ko sort thành tích chạy đc
    // for (int i = 0; i < racer.length - 1; i++) {
    // for (int j = i + 1; j < racer.length; j++) {
    // if(racer[i].getSpeed() > racer[j].getSpeed()){
    // Pet tmp = racer[i];
    // racer[i] = racer[j];
    // racer[j] = tmp;
    // // đa hình, hàm Cha nhưng chạy Con tương ứng: HT, D, C, ...
    // }// mỗi lần gọi run() để so sánh thì sẽ tốc độ khác
    // }// bài SV, Hình học, S cố định cho n lần gọi
    // // điểm tb cố định cho đến khi cập nhật điểm mới
    // }// for hoài, getGPA(),getS() cố định nên ta đảo đc
    // // bài AmazingRace bắt tụi nhỏ chạy 1 lượt để ghi nhận thành tích
    // // ta so sánh trên thành tích chạy này

    // System.out.println("After sorting pet");
    // for (Pet pet : racer) {
    // pet.showRecord();
    // }
    // }

}
