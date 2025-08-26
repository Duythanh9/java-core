package Java;

import java.util.ArrayList;
import java.util.List;

public class Bai1 {
    public static void main(String[] args) {
        // int age = 25;
        // if (age >=18) {
        // System.out.println("Da du tuoi");
        // }else{
        // System.out.println("Chua du tuoi");
        // }

        // Switch Case
        // int expression = 692;
        // switch (expression) {
        // case 123:
        // System.out.println("Ban da nhan duoc khoan tien thuong 100k");
        // break;
        // case 874:
        // System.out.println("Ban da nhan duoc khoan tien thuong 200k");
        // break;
        // case 692:
        // System.out.println("Ban da nhan duoc khoan tien thuong 500k");
        // break;
        // default:
        // System.out.println("Chuc ban may man lan sau");
        // break;
        // }

        // Lặp chồng lặp
        // for(int i = 1; i <= 10; i++){
        // for(int j = 1; j <= i; j++){
        // System.out.print("* ");
        // }
        // System.out.println();
        // }

        // Lặp chồng lặp lùi
        // for (int i = 1; i <= 10; i++) {
        // for (int j = 10; j >= i; j--) {
        // System.out.print("* ");
        // }
        // System.out.println();
        // }


        // forEach()
        // List<String> list = new ArrayList<>();
        // list.add("1");
        // list.add("2");
        // list.add("3");
        // list.add("4");
        // list.add("5");
        // list.add("6");
        // for (String string : list) {
        // if(string == "2")
        // System.out.println(string);

        // }

        // while
        // int a = 10;
        // while (a <= 15) {
        // System.out.println("yes" + a);
        // a++;
        // }

        // do while
        // int a = 15;
        // do{
        // System.out.println(a);
        // a--;

        // }while(a >= 10);


        
        for (int i = 1; i <= 10; i++) {
            if(i == 5){
                break;
            }
            System.out.println("Hello" + i);
        }
    }

}
