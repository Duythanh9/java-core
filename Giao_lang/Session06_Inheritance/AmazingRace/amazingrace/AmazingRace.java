package Giao_lang.Session06_Inheritance.AmazingRace.amazingrace;

import Giao_lang.Session06_Inheritance.AmazingRace.data.Cat;
import Giao_lang.Session06_Inheritance.AmazingRace.data.Dog;
import Giao_lang.Session06_Inheritance.AmazingRace.data.Hamster;
import Giao_lang.Session06_Inheritance.AmazingRace.data.Pet;

public class AmazingRace {

    public static void main(String[] args) {
        register();
    }

    public static void register() {
        Cat cat = new Cat("Kity", 2004, 20.1, "<3");
        cat.showRecord();

        Pet kitty = new Cat("Kitty", 2004, 5.0, "><");
        kitty.showRecord();

        Dog dog = new Dog("Xu", 2003, 20.5);
        dog.showRecord();

        Hamster hamster = new Hamster("Chuot", 2004, 10.5);
        hamster.showRecord();

        Pet arrPet[] = new Pet[4];

        arrPet[0] = cat;
        arrPet[1] = kitty;
        arrPet[2] = dog;
        arrPet[3] = hamster;
        System.out.println("-----------------------");
        for (int i = 0; i < arrPet.length; i++) {
            arrPet[i].showRecord();
        }
        System.out.println("-----");
        for (int i = 0; i < arrPet.length; i++) {
            arrPet[i].run();
        }

        // System.out.println("The list sorting after pet");
        // for (int i = 0; i < arrPet.length - 1; i++) {
        //     for (int j = i + 1; j < arrPet.length; j++) {
        //         if (arrPet[i]. > arrPet[j]) {
        //             Pet tmp = arrPet[i];
        //             arrPet[i] = arrPet[j];
        //             arrPet[j] = tmp;
        //         }
        //     }
        // }

        // for (int i = 0; i < arrPet.length; i++) {
        //     arrPet[i].showRecord();
        // }
    }

}
