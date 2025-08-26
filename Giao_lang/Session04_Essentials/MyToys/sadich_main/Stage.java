package Giao_lang.Session04_Essentials.MyToys.sadich_main;

import Giao_lang.Session04_Essentials.MyToys.sadich_com.MyToys;

public class Stage {
    
    public static void main(String[] args) {
        // MyToys myToys = new MyToys();
        System.out.println("PI: " + Math.PI);
        // MyToys.PI = 4.0;
        System.out.println("PI: " + Math.PI);
        // Nhập từ bàn phím
        // int width = MyToys.getAnInteger();
        // int length = MyToys.getAnInteger();
        int width = MyToys.getAnInteger("Input enter width HCN:");
        int length = MyToys.getAnInteger("Input enter length HCN:");
        System.out.println("Width: " + width);
        System.out.println("Length: " + length);
    }
}
