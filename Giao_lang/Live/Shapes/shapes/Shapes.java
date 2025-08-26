package Giao_lang.Live.Shapes.shapes;

import Giao_lang.Live.Shapes.data.*; // .* tức là import hết tất cả các khuôn trong ngăn tủ đó

public class Shapes {
    public static void main(String[] args) {
        // sortShapes();
        // playWithAnonymousClass();
        // sortShapesWithAnonymous();
        
    }

    public static void sortShapesWithAnonymous() {

        // Anonymous here!!!
        Shape onTheGo = new Shape("This-Tui", "Ranom", "RanDom") {
            // Cắt hình ngẫu nhiên, ko đc gọi là hình gì, S phải tự lo

            @Override
            public double getArea() {
                return 10;
            }

            @Override
            public double getPrimeter() {
                return 40;
            }

            @Override
            public void paint() {
                System.out.printf("|%-10s|%-10s|%-10s|%-10s|%4s|%4s|%-7.2f|\n", "Take-Away",
                        owner, color, borderColor, "- ", "- ", getArea());
            }

        };

        Rectangle r1 = new Rectangle("Duy Thanh", "Green", "blue", 5.0, 6.0);
        Shape r2 = new Rectangle("Duy thanh1", "green1", "blue1", 6.0, 5.0);

        Square s1 = new Square("Nhu Quynh1", "Pink", "Pink", 7.0);
        Rectangle s2 = new Square("Nhu Quynh", "Pink", "Pink", 3);
        Shape s3 = new Square("Thuy Linh", "Pink", "Pink", 4);

        Disk d1 = new Disk("Be Na", "RainBow", "RainBow", 2.0);
        Disk d2 = new Disk("Be Na iu", "RainBow", "RainBow", 2.0);

        Shape arr[] = new Shape[] { r1, r2, s1, s2, s3, d1, d2, onTheGo };// hình ngẫu nhiên vẫn là hình

        System.out.println("The list of shapes");
        for (Shape x : arr) {
            x.paint();

        }

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i].getArea() > arr[j].getArea()) {
                    Shape tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }

        System.out.println("The list of shapes sorting ascending by area");
        for (Shape xx : arr) {
            xx.paint();
        }

    }

    // Kĩ thuật tạo object/ vùng new mà ko cần khuôn cụ thể
    // dành cho những object vô định hình, ko có công thức để tính toán và
    // nhân bản, ko có khuôn cố định, cắt hình ngẫu nhiên, éo biết nhóm con
    // nhưng vẫn chắc chắn là hình: có nét, màu, cạnh, bề mặt
    // éo có công thức tính chung, nhân bản lại đươc nhanh chóng
    // HCN cắt nhanh chóng, hình elipse nhanh, HBH nhanh,
    // hình cắt gấp khúc, mỗi hình duy nhất, ko nhanh đc, ko có khuôn
    // Object vãng lai, ko thường quen sử dụng/làm/gặp
    // dù là hình kiểu gì, công thức chung: new Cha/super cha + @Override
    public static void playWithAnonymousClass() {
        // Shape vangLai = new NoName(...); // bên trong phải full code cho Cha
        // Shape x = new HCN(...); //
        // cắt ngẫu nhiên làm sao biết bao nhiêu cạnh đưa vào??
        // chỉ đưa đc màu, tặng ai
        // Nếu muốn rõ ràng thì cắt V, TR, CN, TG, HBH, Mũi tên, ....
        Shape vangLai = new Shape("Chinh minh", "Green", "Blue") {

            @Override
            public double getArea() {
                return 50;// vì hình cụ thể, ko theo hình dạng nào, ta tự do
            }

            @Override
            public double getPrimeter() {
                return 40;
            }

            @Override
            public void paint() {
                // Khai báo là Con Shape vẫn kế thừa như bt
                System.out.printf("|Ngau Nhien|%-10s|%-10s|%-10s|%-7.2f|\n", owner, color, borderColor, getArea());
            }
        }; // .paint(); // Vip
           // mày là 1 hình, thoải mái vào mảng Shape sort nếu muốn
           // mày vẫn là Shape, kiểu Shape, có đủ code cho hàm Cha
           // Kĩ thuật mượn gió bẻ măng, mượn Cha tạo Con, mượn Shape new Con
           // New Abstract class sẽ bung rộng màn hình gõ code Override
           // Thỏa công thức Con = New Cha + @Override
           // Chỉ xài cách này nếu chỉ cần làm 1 Object On The Go, mà làm biếng
           // Làm khuôn con riêng lẻ, theo công thức nhân bản
        vangLai.paint();
    }

    public static void sortShapes() {
        // sort cần mảng, mảng chỉ chơi cùng kiểu
        Rectangle r1 = new Rectangle("Duy Thanh", "Green", "blue", 5.0, 6.0);
        Shape r2 = new Rectangle("Duy thanh1", "green1", "blue1", 6.0, 5.0);

        Square s1 = new Square("Nhu Quynh1", "Pink", "Pink", 7.0);
        Rectangle s2 = new Square("Nhu Quynh", "Pink", "Pink", 3);
        Shape s3 = new Square("Thuy Linh", "Pink", "Pink", 4);

        Disk d1 = new Disk("Be Na", "RainBow", "RainBow", 2.0);
        Disk d2 = new Disk("Be Na iu", "RainBow", "RainBow", 2.0);

        // arr[0] = new HÌnh cụ thể nào đó, new Ractangle(....), new Disk(...)
        // cần lắm luôn [i] lưu tọa độ vùng new()
        // [i] tham chiếu vùng new, trỏ vùng new, lưu địa chỉ vùng new()
        // // vùng new() nằm đâu trong HEAP kệ nó
        // arr[0] = r1; // 2 chàng 1 nằng
        // // arr[0].paint();
        // arr[1] = arr[0];// 3 chàng 1 nàng
        // arr[2] = d2; // tao cần tọa độ vùng new Hình nào đó()

        // Shape arr[] = new Shape[] {Tọa độ vùng new() đưa vô};
        // [i] =
        Shape arr[] = new Shape[] { r1, r2, s1, s2, s3, d1, d2 };
        // arr[0]

        // Shape arr1[] = new Shape[] { new Rectangle("Duy Thanh", "Green", "blue", 5.0,
        // 6.0),
        // new Disk("Be Na iu", "RainBow", "RainBow", 2.0) };

        System.out.println("The list of shapes");
        for (Shape x : arr) {
            // x = arr[0], x = arr[1], x = arr[2]
            x.paint(); // tính đa hình
            // Gọi hàm paint() của cha, nhưng 3 con tự động qua mặt
            // chút lo lắng : paint() của cha éo có code, abstract
            // đừng lo, vì lát hồi mấy con tự lo, do mình new con ko hà
            // new con con đã viết code rồi, cha ngồi im con lo cho
            // con sẽ giải quyết chuyện hoàn hảo cho cha,
            // từ hàm cha gọi, con hưởng ứng, N con hưởng ứng
            // từ 1 ánh xạ ra nhiều cách thức, tính đa xạ đa hình POLYMORPHISM
        }

        // sắp xếp tăng dần theo diện tích

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i].getArea() > arr[j].getArea()) {
                    Shape tmp = arr[i]; // đa hình nè: getArea() của Cha
                    arr[i] = arr[j]; // abstract, đừng lo, Con sẽ lo
                    arr[j] = tmp; // vì [i] luôn trỏ 1 hình cụ thể
                } // getArea() là cụ thể Con
            }
            // tao arr[i] đang trỏ 1 hình có S là ?
            // tao arr[j] đang trỏ 2 hình có S là ?
            // so sánh 2 S có ổn ko, ko ổn thì đổi việc trỏ
            // thằng arr[i] phải trỏ vào thằng hình mà arr[j] đang trỏ
            // mày trỏ vào S mà ko đúng thứ tự, thì phải đổi trỏ
        }

        System.out.println("The list of shapes sorting ascending by area");
        for (Shape x : arr) {
            // x = arr[0], x = arr[1], x = arr[2]
            x.paint();// Tính đa hình
        }

    }

}
