package Giao_lang.Session06_Inheritance.BeNaV4.benav4;

import Giao_lang.Session06_Inheritance.BeNaV4.data.Dick;
import Giao_lang.Session06_Inheritance.BeNaV4.data.Rectangle;
import Giao_lang.Session06_Inheritance.BeNaV4.data.Shape;
import Giao_lang.Session06_Inheritance.BeNaV4.data.Square;
import Giao_lang.Session06_Inheritance.BeNaV4.data.Triangle;

public class BeNaV4 {

    public static void main(String[] args) {

        // playWithRectangle();
        sortShapes();
    }

    public static void sortShapes() {
        // sắp xếp các hinh giống Na
        Rectangle r1 = new Rectangle("duythanh", "Pink", "white", 5, 6);
        Shape r2 = new Rectangle("duythanh1", "Pink", "white", 6, 5);

        Square s1 = new Square("huonggiang", "pink", "green", 7);
        
        Shape s2 = new Square("huonggiang1", "pink", "green", 7);
        
        Rectangle s3 = new Square("huonggiang2", "pink", "green", 7);
        // Shape hết cũng ok

        // c1 drift
        Square b = (Square) s2;
        b.sayHi();

        //  c2
        ((Square)s2).sayHi();

        Dick d1 = new Dick("nhuquynh", "Pink", "Pink", "<3", 6);
        Shape d2 = new Dick("nhuquynh1", "Pink", "Pink", "<3", 6);

        Triangle t1 = new Triangle("Hi", "Pink", "Pink", 3, 4, 5);
        Shape t2 = new Triangle("hi1", "Pink", "Pink", 6, 8, 10);

        // in thoi

        // paint() của ai, chạy thế nào
        r1.paint();// Con, new Con, chạy rect Recatangle
        r2.paint();// paint() của shape, chạy của Rect, qua mặt Shape
        s1.paint();// paint() của cháu, chạy của Square
        s2.paint();// paint() của Shape, chạy của Square, qua mặt ông
        s3.paint();// paint() của Rect, chạy của Square, qua mặt chá
        d1.paint();// paint() của Dick, chạy của Dick
        d2.paint();
        t1.paint();
        t2.paint();
        // Chấp Cha, Ông nội thế nào, luôn luôn chạy paint() đúng ngữ cảnh

        // Tui sắp xếp luôn
        // Shape arr [] = new Shape[9];
        // // Có 9 biến Shape đặt tên là arr[0], arr[1], arr[2]...
        // // mới có 9 con trỏ, chưa có object nào
        // // arr[0] arr[1] arr[i] = cần lắm luôn bằng, trỏ, tọa độ của vùng
        // // new Rectangle() new Disk() new Triangle() new Con mẹ nào đó mà
        // // là một Shape, IS A Shape, cùng họ, cùng kiểu mới chung mảng
        // // cần tọa độ new nào đó thả vào arr[i]
        // arr[0] = new Rectangle("", null, null, 0, 0);
        // arr[1] = new Dick(null, null, null, null, 0);
        // arr[2] = r1;// 2 chàng trỏ 1 nàng
        // arr[3] = r1;
        // arr[4] = arr[0];
        // arr[5] = t1;

        // Đã học rồi ko thèm làm
        // Shape arr[] = new Shape[] {new Rectangle(null, null, null, 0, 0),
        // new Dick(null, null, null, null, 0)};// value đc gán vào
        // // vùng new đc gán vào học rồi

        Shape arr[] = new Shape[] { r1, r2, s1, s2, s3, d1, d2, t1, t2 };
        // arr[0]

        System.out.println("The list of shapes");
        for (Shape x : arr) {
            x.paint();
        } // GỌi ông nột, Abstract đó nha, nhưng ko sợ
          // Vì tùy con là ai, thì Override, học ở ngay trên rồi
          // Gọi ông nội, nhưng con cháu qua mặt tùy tình huống
          // Hiện tượng từ 1 hàm paint() nhưng có N cách viết code khác nhau
          // ở mức con cháu, có N cách chạy khác nhau lúc run-time
          // Từ 1 hàm paint() mà có đến rất nhiều cách cài đặt/ và thực thi
          // Từ 1 biến hình, đa hình dạng, đa dạng, đa cách thức, đa nhân cách, 50 sắc
          // thái
          // biến hóa khôn lường, tranformer,
          // Từ 1 biến hóa ra nhiều qua hình dạng Override
          // Hiện tượng này, kĩ thuật thuật gọi là tính đa xạ, đa hình dạng
          // đa sắc thái, Polymorphism
          // 1 hàm cha (Tổ) có N hàm con @Override, hiện tượng đa hình dạng

        // Cha lên tiếng paint() đám con hưởng ứng liền
        // Đại ca lên tiếng, dàn em xách mã tấu, hàng

        // Câu bác hồ: AI có súng dùng súng...
        // đa dạng cách thức giết giặc của nhân dân
        // hiện tượng đa hình, việc giết giặc rất đa dạng, nhưng gọi chung
        // là giết giặc


        // OOP: ABSTRACTION, ENCAPSULATION, INHERITANCE, POLYMORPHISM
        //          x               x            x            x

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if(arr[i].getArea() > arr[j].getArea()){
                    Shape tmp = arr[i]; // đa hình tiếp nè, gọi hàm Cha, éo có code
                    arr[i] = arr[j];    // chạy hàm Con nè, qua mặt Cha tính S()
                    arr[j] = tmp;
                }
            }
        }
        System.out.println("The list of shapes after sorting ascending by area");
        for (int i = 0; i < arr.length; i++) {
            arr[i].paint();
        }
    }

    public static void playWithRectangle() {
        Rectangle r1 = new Rectangle("duythanh", "Pink", "white", 5, 6);
        Shape r2 = new Rectangle("duythanh1", "Pink", "white", 6, 5);

        Dick d1 = new Dick("nhuquynh", "Pink", "Pink", "<3", 6);
        Shape d2 = new Dick("nhuquynh1", "Pink", "Pink", "<3", 6);

        r1.paint(); // của ai??? Con, chạy của Con
        r2.paint(); // của ai??? Cha, chạy của Con Con qua mặt
        d1.paint(); // của ai??? Con, chạy của Con
        d1.paint(); // của ai??? Cha, chạy Con, Con qua mặt
                    // Cha éo có code, ko lo, vì Con qua mặt
                    // Chơi trò Khai Con new Con
                    // Cha new COn

        // Ko lo lắng Cha ko hoàn hảo, con cân hết
        // paint() ở trên chính là hiện tượng đa hình - Polymorphism

        // Khai cha new Cha, chuyện mới hoàn toàn (Level 3)

        Triangle t1 = new Triangle("thuylinh", "green", "Pink", 3, 4, 5);
        Shape t2 = new Triangle("thuylinh", "green", "Pink", 3, 4, 5);

        Square s1 = new Square("huonggiang", "Pink", "Pink", 4);
        Shape s2 = new Square("huonggiang1", "Pink", "Pink", 4);
    }
}
