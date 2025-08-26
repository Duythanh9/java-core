package Giao_lang.Session03_Class.DogManagementV2.dogmanagement;

import Giao_lang.Session03_Class.DogManagementV2.data.Dog;
// đi mượn cái khuôn Dog ở ngăn data về đúc
// ~ #include <stdio.h> bên C

public class DogManagement {
    public static void main(String[] args) {
        int yob = 2004;

        Dog chiHu = new Dog("Chi hu hu", 2025, 0.5);
        chiHu.bark();

        Dog ngaoDa = new Dog("NGAO DA", 2020, 50.0);

        System.out.println("Show all of info by using toString() method");
        System.out.println(ngaoDa.toString());


        System.out.println("Goi tham ten em");
        System.out.println("NĐ Details: " + ngaoDa); // Điều gì xảy ra khi ta sout (Biến Object)
        // Khi in biến con trỏ/ biến object/ biến tham chiếu reference
        // Tì thay vì in ra địa chị như C, Java ngầm đi tìm hàm toString() mà gọi
        // Hàm ý đi đến tọa độ đang trỏ in hết thông tin

        // Nếu ko có TOSTRING() mà ngoan cố gọi nó để in ra
        // Java sẽ in ra con số HEXA, mà băm vùng ram, Hash Number, gom Data thành 1 con số
        // Đại diện vùng ram
        // Hash Number, thuật toán MD5, SHA-1, SHA-256

        System.out.println("ND age: " + ngaoDa.getAge());
    }
}
