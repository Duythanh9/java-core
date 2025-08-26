package Giao_lang.Session03_Class.DogManagement.dogmanagement;

import Giao_lang.Session03_Class.DogManagement.data.Dog;
// đi mượn cái khuôn Dog ở ngăn data về đúc
// ~ #include <stdio.h> bên C


public class DogManagement {
    public static void main(String[] args) {
        int         yob    =                2004;
        // data type tên gọi/biến         value, single, đơn, primitive

        Dog chiHu = new Dog("Chi hu hu", 2025, 0.5);
        chiHu.bark();

        Dog ngaoDa = new Dog("NGAO DA", 2020, 50.0);
                    // malloc() calloc()
                    // memory allocation
        // data type tên biến object     phức tạp, object
         
        // Có bao nhiêu data types: 2 

        ngaoDa.bark();

        // kiểm tra coi khi đổ vào khuôn, đứa sau đè đưa trước hay ko?
        System.out.println("CH barks again");
        chiHu.bark();

        // Một biến tại 1 thời điểm lưu 1 value
        int x = 68;
        System.out.println("x: " + x);
        x = 79;
        System.out.println("x again: " + x);

        // Ăn nhiều thì mập ú
        chiHu.updateWeight(5.0);
        System.out.println("After online courses");
        chiHu.bark();
        ngaoDa.bark();

        System.out.println("CH YOB: " + chiHu.getYob());
        System.out.println("ND YOB: " + ngaoDa.getYob());
        
        
    }
}
