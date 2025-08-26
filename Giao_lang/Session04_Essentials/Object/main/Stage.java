package Giao_lang.Session04_Essentials.Object.main;

import Giao_lang.Session04_Essentials.Object.object.Student;

public class Stage {
    public static void main(String[] args) {
        Student x = checkObjectV7(); // x = tọa độ của ai đó new, ai đó new đã được return qua
                                    // tên hàm
        x.showProfile();
        x.setName("Em ko doi nganh");
        x.showProfile();


        // Vi Diệu TT
        checkObjectV7().showProfile();

    }

    // Hàm trả về Object, không trả Primitive
    // đọc đúng phải thế này: hàm này trả về tọa độ của 1 object đã new đâu đó
    // Student x = ....
    // Student s1 = .....
    // int a;
    // int f(); <-sqrt() /// tên hàm là 1 biến vì nó ~~~~ 1 giá trị
    public static Student checkObjectV7() { // tên hàm cũng là 1 biến/biến object
        // giá trị của hàm này, biến này là tọa độ new
        // nào đó
        Student s1 = new Student("Ph2204", "AHIHI", 2004, 6.9);
        // s1 em nắm tọa độ vùng new clone trong HEAP đó anh
        return s1;// em ném cái tọa độ đó vào tên hàm
                  // tên hàm là tọa độ, Student f() mà, f() là tọa độ mà
                  // 2 chàng trỏ 1 nàng new f() và s1 cùng trỏ new
        // Từ trong hàm ném được tọa độ vùng new clone HEAP ra ngoài
        // Lát hồi hàm chạy xong, mất mẹ nó biến s1 vì s1 nằm trong Stack
    }

    // Khai báo biến rồi gán sau
    public static void checkObjectV6() {
        int a;
        a = 10;
        System.out.println(a);
        Student s1; // Tớ với cậu sẽ nói xấu dìm hàng 1 thằng bạn heng
                    // s1 là đứa tao với mày sẽ chơi nó, troll, lên confession
                    // s1 cần lắm luôn trỏ vùng new, sẵn sàng để trỏ
        // thằng đó đây
        // giờ để trỏ
        s1 = new Student("Ph2204", "AHIHI", 2004, 6.9);
        s1.showProfile();
    }
    
    public static void checkObjectV5() {
        // Student s1 = new Student("Ph2204", "AHIHI", 2004, 6.9);

        // Object vô danh, sinh ra mà ko thèm đặt tên, chỉ khóc 1 tiếng rồi pass away
        // s1.showProfile();
        // s1 chấm tức là vào vùng tọa độ chấm làm gì đó
        // new .... cũng chính là tọa độ, đẩy cho s1, s1 và new ... là như nhau
        new Student("Ph2204", "AHIHI", 2004, 6.9).showProfile();
        // cờ hó chạy ra đường ko có ông chủ cầm xích, Exciter hốt luôn
        // ko con trỏ, éo lên 1 lần, rồi chết bởi CT MTĐT
        // Object vô danh, anonymous object
        // Muốn Re-Use Objet, chấm nhiều lần thì phải có tên gọi

    }

    // Hai chàng trỏ 1 nàng
    public static void checkObjectV4() {
        Student s1 = new Student("Ph2204", "Duy Thanh", 2004, 6.9);
        Student s2 = s1; // 2 thằng cùng nhòm 1 hướng tọa độ, 2 chàng trỏ 1 nàng
        // s1 s2 cùng lưu 1 tọa độ, cùng trỏ vùng new clone Duy Thanh
        s1.setName("Anh cuc suc");

        s2.showProfile();
        s1.showProfile();
    }

    // BACKUP Object, tức là giữ lại tọa độ
    public static void checkObjectV3() {
        Student s1 = new Student("Ph2204", "Duy Thanh", 2004, 6.9);

        // trước khi s1 chơi với Nhu Quynh, không muốn mất Duy Thanh
        // Vậy cần ghi ra đâu đó cái tọa độ vùng new của Duy Thanh
        // Trước khi đăng trí quên tên, thì ghi ra giấy, danh bạ
        Student x = s1; // Ăn đòn new Student("Ph2204", "Nhu Quynh", 2004, 6.9);

        s1.setName("Em eo tin Thay");

        // x tao là biến object, tao rất rất cần tọa độ 1 vùng new
        // tự new okie, có thằng nào new trước rồi chưa, cho tao cùng chơi với
        // cho tao tọa độ đi, tao éo new
        // x trỏ đến Duy Thanh ở trên
        int a = 10;
        int b = a; // gán giá trị 2 biến cho nhau a ơi cho tao giá trị của mày

        s1 = new Student("Ph2204", "Nhu Quynh", 2004, 7.0);
        // s1 đã bỏ Duy Thanh, đi với Nhu Quynh
        // x đang là Nhu Quynh của ngày hôm qua, xưa cũ bị S1 ruồng bỏ
        s1.showProfile();
        x.showProfile();// Duy Thanh nhưng bị thay thành em eo tin Thay
        System.out.println("------");
        s1.setName("AHUHU");
        x.showProfile(); //
        s1.showProfile();

    }

    // Biến có quyền thay đổi chỗ trỏ!!!
    // Mất tọa độ, mất dấu vùng new, có thể có điều này hay ko, nếu có thì hậu
    // trường diễn ra gì
    public static void checkObjectV2() {
        Student s1 = new Student("Ph2204", "Duy Thanh", 2004, 6.9);
        // Object instance/ đủ info ddc đổ, nằm vùng nào đó trong Heap
        // new trả về tọa độ vùng clone
        // cả nguyên dòng từ new...; được xem là tọa độ/ giá trị phức tạp

        // s1 là con trỏ, lưu tọa độ vùng new
        // biến object, lưu tọa độ vùng clone
        // reference variable, tao chiếu tọa độ chỗ khác nhe
        // Biến con trỏ /Obj/ Tham chiếu bản chất là con trỏ, cần lưu 1 tọa độ vùng new
        // Clone
        // vậy thì ko ai cấm mình trỏ vùng new mới

        s1 = new Student("Ph2204", "Nhu Quynh", 2004, 8.9);
        s1.showProfile();

        // em muốn lấy lại vùng clone Duy Thanh thì sao, mất dấu rồi??
        // s1 = new Student("Ph2204", "Duy Thanh", 2004, 6.9); // Duy Thanh khác Duy
        // Thanh trên nhen

        // Lưu ý - Source: khi 1 object/ vùng new clone không có ai trỏ tới, mất con trỏ
        // Do con trỏ gán qua new khác, thì ta mất dấu tọa độ, vùng new cũ
        // Java: JVM máy ảo java chạy bên Windows, giám sát vùng ram app viết = Java
        // cà chớn không, giết app, cảnh báo gửi báo tử
        // khi chơi try-catch
        // có vùng new mồ côi nào ko, vùng không con trỏ
        // Heap có object nào ko có con trỏ hay không
        // bộ phận giám sát này của máy ảo java gọi là Cty MTĐT
        // Garbage collector, clear, available cho new clone khác
        // free (con trỏ bên C - free vùng maloc() calloc())
        // HEAP
        //
        // việc clear ram HEAP của J diễn ra định kì, bào nhiêu giây, phút...
        // tuy nhiên mình có thể gọi ngay luôn
        System.gc();
        // s1 li dị Duy Thanh chơi với Nhu Quynh
        // sếp = cs st...;
        // sếp = là "gã" trả lương, đáng giá KPI làm việc của mình
        // Biến có quyền thay đổi value nó lưu trữ, vì thay đổi value nó mới là biến
        // variable - sự biến đổi, mày đang 10 rồi mày thành 100
        int a = 10;
        a = 100;
        System.out.println(a);

        Student s2 = new Student("Ph2204", "Duy Thanh", 2004, 6.9);

    }

    // kiểm tra việc new trùng thông tin xem sao???
    public static void checkObjectV1() {
        Student s1 = new Student("Ph2204", "Duy Thanh", 2004, 6.9);
        Student s2 = new Student("Ph2204", "Duy Thanh", 2004, 6.9);

        s1.showProfile();
        s2.showProfile();
        // Chứng minh 2 new là 2 object khác nhau, 2 vùng clone khác nhau, dù đổ infor
        // giống nhau
        // ở ngoài đời: vào tiệm sách, tô tượng, chọn 2 tượng "giống nhau", vẫn là 2
        s1.setName("Doi roi, khong hoc bai!!!");
        s1.showProfile();//
        s2.showProfile();
        System.out.println("Check duplication if any???");
        System.out.println(s1);// Gọi thầm tên em
        System.out.println(s2);// vẫn như tên cũ

    }

    public static void checkObject() {
        Student an = new Student("Ph2204", "Duy Thanh", 2004, 6.9);
        // biến object object, complex
        // biên tham chiếu instance, thể hiện, hiện thân...
        // reference variable
        // tao lưu tọa độ vùng new kế bên
        // new ... nghĩa là sao
        // 1. clone vùng ram từ khuôn, (Static riêng ra, 1 chỗ nhen)
        // 2. chốt lại tọa độ vùng new, lấy tọa độ đưa cho ai đó giữ
        // biến object giữ tọa độ
        an.showProfile();

        // biến có quyển thay đổi value
        // sếp -> Casi Sơn Tùng
        // sếp -> người trả lương, tác động lương mình
        int a = 10;
        a = 100;

        an = new Student("Ph000", "Nhu Quynh", 2005, 7.9);
        an.showProfile();

        // An đi đâu rồi ??? còn ở đó không
        // Cty môi trường đô thị Garbage collector, ~~~~ Free(con trỏ) bên C xóa vùng
        // nhớ Heap
        System.gc();

        // Hắc não
        new Student("Ph1111", "Nhu Quynh2", 2005, 7.9).showProfile();
    }
}
