package Giao_lang.Session06_Inheritance.CraftsmanV3.craftsman;

import Giao_lang.Session06_Inheritance.CraftsmanV3.craftsman.data.Dick;
import Giao_lang.Session06_Inheritance.CraftsmanV3.craftsman.data.Rectangle;
import Giao_lang.Session06_Inheritance.CraftsmanV3.craftsman.data.RightTriangle;
import Giao_lang.Session06_Inheritance.CraftsmanV3.craftsman.data.Square;
import Giao_lang.Session06_Inheritance.CraftsmanV3.craftsman.data.Triangle;

public class Craftsman {
    public static void main(String[] args) {
        // cutShapes();
        // sortShapes();
        // playWithSquare();
        playWithTriangle();
    }

    public static void playWithTriangle() {
        // Khai Cha new Cha (cụ thể - concrete class) // abstract class
        // gọi đúng chuẩn tên: TG là TG
        Triangle triangle = new Triangle("Duythanh", "Black", 3.0, 4.0, 5.0);
        triangle.paint();// của cha

        // Con new Con, gọi tên object đúng là nó, TGV là TGV
        RightTriangle rt1 = new RightTriangle("Nhuquynh", "Pink", 6, 8);
        rt1.paint();// của con

        // Khai Cha new Con, đọc kiểu IS-A, dùng 2 danh nghĩa, Con, phiên bản Cha
        Triangle rt2 = new RightTriangle("Children", "Rainbow", 6, 8);
        // TG <- một là TGV, nó vẫn Vuông như câu lệnh ngay trên
        rt2.paint();// của Cha
        // lúc chạy thì... hành xử như con, nếu con trùng tên hàm của CHA
        // CHA ngồi im để con lo, OVERRIDE qua mặt Cha

        // Khai báo gì thì phải hành xử như thế, Vì mình sẽ đặt tên cho Object theo data type Object sẽ new 
        // thuộc nhóm gì/khuôn, theo khuôn, theo khuôn nhìn hành xử
        // nhìn hàm

    }

    public static void playWithSquare() {
        Square s1 = new Square("Tia", "Pink", 6.0);
        // V là V, còn là HCN ngầm hiểu
        s1.paint();

        // vi diệu tập 1

        Rectangle r1 = new Rectangle("Ma", "Pink", 7.0, 8.0);
        // CN là Chữ nhật
        r1.paint();

        // vi diệu tập 2
        Rectangle s2 = new Square("Be Na", "Pink", 5.0);
        // V là hình CN, hù theo kế thừa dòng họ
        s2.paint(); // con qua mặt cha, đa hình xh
        // hàm paint() của cha, xem lúc chạy
 
        // in ra HCN, 5 5 25 hoàn toàn đúng do xài ké Cha
        // phải theo quy tắc của Ba đặt ra, tao in HCN, xài ké thì là HCN
        // mượn xe của Ba theo lời Ba dặn
    }

    public static void sortShapes() {
        Rectangle r1 = new Rectangle("Duythanh", "Black", 7.0, 2.0);

        Rectangle rectArr[] = new Rectangle[9];
        // có 9 biến, bàn có 9 chỗ ngồi, nhưng chưa có ai ghé/ chưa có object cụ thể
        // reactArr[0], [i] là những biến Rectangle, con trỏ
        // = trỏ vào vùng new Rectangle(), tọa độ vùng new clone
        // chỉ cần có vùng new Rect() là đc
        rectArr[0] = r1; // 2 chàng 1 nàng
        // rectArr[0].paint(); // tía

        // rectArr[0].setOwner("Tia yeu");
        // r1.paint();// Tia yeu

        rectArr[1] = new Rectangle("Nhuquynh", "Pink", 2.0, 1.0);
        rectArr[2] = new Rectangle("Children", "RainBow", 5.0, 2.0);

        rectArr[3] = new Square("Ghe be na", "Pink", 4.0);

        // Mảng là khai báo các biến cùng kiểu, V, CN khác kiểu, ko có cửa nào vào
        // chung 1 mảng, V chơi mảng V, CN chơi mảng CN, Tr chơi mảng Tr
        // về lí thuyết: chỉ sort CN, V, Tr riêng, ko sort chung đc
        // vì khác data type, ko chung mảng, ko for chung đc

        // ??? arr[] new ???[9];
        // arr[0] = new Square(null, null, 0);
        // arr[1] = new Rectangle(null, null, 0, 0);
        // dư sức for ???
        // V CN chung mảng của ai ???
        

        System.out.println("Before sorting");
        // for (Rectangle x : rectArr) {
        // // x = rectArr[i] 0...length
        // x.paint();
        // } // null pointer, for đên count thôi
        for (int i = 0; i < 3; i++) {
            rectArr[i].paint();
        }

        for (int i = 0; i < 3 - 1; i++) {
            for (int j = i + 1; j < 3; j++) {
                if (rectArr[i].getArea() > rectArr[j].getArea()) {
                    Rectangle tmp = rectArr[i];
                    rectArr[i] = rectArr[j];
                    rectArr[j] = tmp;
                }

            }
        }

        System.out.println("After sorting ascending rectArr by area");
        for (int i = 0; i < 3; i++) {
            rectArr[i].paint();
        }

        for (int i = 0; i < 3 - 1; i++) {
            for (int j = i + 1; j < 3; j++) {
                if (rectArr[i].getArea() < rectArr[j].getArea()) {
                    Rectangle tmp = rectArr[i];
                    rectArr[i] = rectArr[j];
                    rectArr[j] = tmp;
                }
            }
        }
        System.out.println("After sorting descending rectArr by area");
        for (int i = 0; i < 3; i++) {
            rectArr[i].paint();
        }
    }

    public static void cutShapes() {
        Rectangle rectangle = new Rectangle("Duythanh", "Black", 2.0, 2.0);
        rectangle.paint();

        Square square = new Square("Nhuquynh", "Pink", 4.0);
        square.paint();

        Dick dick = new Dick("Thuylinh", "White", "Hicc", 2.0);
        dick.paint();
    }

}
