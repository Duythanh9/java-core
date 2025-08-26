package Giao_lang.Session04_Essentials.Warapper.warpper;

public class Warpper {
    public static void main(String[] args) {
        // playWithIntegers();
        // playWithPointers();
        playWithPool();
    }

    // Pool là 1 vùng ram chứa các vùng new của Warpper, String
    // giống như hồ bơi ngoài đời, nhiều object tắm chung
    // chỉ áp dụng kĩ thuật hồ bơi trong 1 số tình huống đặc biệt ko nhầm static
    public static void playWithPool() {
        Integer n1 = new Integer("2000");
        Integer n2 = new Integer(2000); // ít dùng, từ jdk 10 trở đi ko nên
        Integer n3 = 2000; // cả 2 boxing
        Integer n4 = 2000;

        // n3 có bằng n4 hay không?? hỏi con trỏ hoy, so sánh địa chỉ hoy
        // boolean result = n3 == n4;
        // if (n3 == n4)
        System.out.println("n3 == n4: " + (n3 == n4)); // 2 vùng new khác nhau

        // Ko bằng về con trỏ, nhưng bằng về value bên trong, vào trong mà so sánh
        System.out.println("n3 == n4 (core)? " + n3.equals(n4));// 2 vùng new khác nhau
        // value lõi = nhau -> true

        // n2 vs. n3: n2 có bằng n3 ko, n1 với n2 có bằng nhau hem?
        // 4 thằng ko bằng nhau về con trỏ, value của card, thẻ bài, mỗi thằng là 1 thẻ
        // bài, ghi địa chỉ vùng new,
        // trỏ new khác nhau mà
        // éo bằng về con trỏ, éo trỏ chung
        // chỉ bằng bên trong lõi!!!

        System.out.println("n1 == n2: " + (n1 == n2)); // éo
        System.out.println("n2 == n3: " + (n2 == n3));// éo

        // Gán mới trỏ mới vì Read-Only, Immutable class

        // vi diệu:
        Integer n5 = 127;
        Integer n6 = 127;
        // n5 bằng n6 không? so con trỏ hoy, lõi thì = nhau rồi

        // System.out.println("n5 == n6 (equals) -> " + n5.equals(n6));

        // 127-true 128-false
        // Chơi new ngầm trong đoạn -128 127 thì xài Pool

        // n5 = 127 -> ~~~ new ngầm Integer(127)
        // n6 = 127 -> ko new ngầm, xài ké 127 ở trên: 2 chàng 1 nàng
        // n7 = 127 -> mình tắm chung luôn 3 chàng 1 nàng
        System.out.println("n5 == n6 (==) ->  " + (n5 == n6)); // true
        Integer n7 = 127;
        System.out.println("n5 == n7? " + (n5 == n7)); // true

        // có 256 vùng new [-128 - +127] dùng chung cho n biến Integer
        // nếu xài kiểu boxing new ngầm

        Integer n8 = new Integer(127); // tọa độ khác
        // hỏi n7 và n8 có bằng nhau hem??
        System.out.println("n7 == n8? " + (n7 == n8));

        Integer n9 = new Integer("127");
        System.out.println("n8 == n9? " + (n8 == n9)); // false
        // éo xài pool, tọa độ khác òi

        // Chốt hạ: cấm tuyệt đối so sánh 2 biến object qua toán tử == vì đi so sánh 2 địa chỉ, lúc bằng lúc không do có 
        // Pool hay ko chính xác phải so sánh 2 object qua dấu chấm vào trong lấy data mà so chấm để so sánh object!!!
        

    }

    // Học về so sánh 2 object, học về vùng new
    public static void playWithPointers() {
        int n0 = 2003;
        int n00 = 2003;
        // hỏi: n0 có bằng n00 hem? primitive
        if (n0 == n00) {
            System.out.println("2 thằng này n0 và n00 = nhau");
        } else {
            System.out.println("2 thằng này n0 và n00 không = nhau");

        }
        Integer n1 = new Integer("2003");
        Integer n2 = new Integer(2003);// ko khuyến khích
        Integer n3 = 2003; // khuyến khích
        Integer n4 = 2003;

        // hỏi
        // n3 có bằng n4 không?
        if (n3 == n4) { // so sánh 2 tọa độ, 2 địa chỉ vùng new khác nhau
                        // đi so sánh 2 biến object, biến con trỏ
                        // điên à, đi so sánh số nhà làm éo gì
            System.out.println("2 thằng này n3 và n4 = nhau");
        } else {
            System.out.println("2 thằng này n3 và n4 không = nhau");
        } // nhưng bản chất lõi là bằng nhau vì cùng là 2003
          // chốt hạ: cấm tuyệt đối ko dùng toán tử so sánh truyền thống
          // > >= < <= == khi đem đi so sánh 2 biến object/ biến tham chiếu/ con trỏ
          // muốn so sánh 2 biến, ko nên, mà phải vào bên trong vùng trỏ đó coi có value
          // gì thì hợp lí hơn

        // n3 ơi mày có value gì vậy, tao muốn so sánh với value của n4 đi vào vùng new
        // mà so sánh
        // so bên trong vùng new mới là đúng, vì so sánh đặc điểm

        // Đi vào vùng new tức là chấm . lấy value lõi, câu hỏi Equals() CompareTo()
        // n3. n4.
        // Việc so sánh diễn ra ở đâu - hàm so sánh() đặt ở đâu???

        System.out.println("n3 vs. n4 (core): " + n3.equals(n4));
        System.out.println("n3 vs. n4 (core): " + n3.compareTo(n4));

    }

    public static void playWithIntegers() {
        int n1 = 2003; // 4 byte
        Integer n2 = new Integer("2003"); // 2 vùng ram đó heng
        Integer n3 = new Integer(2003); // 2 vùng ram
        Integer n4 = 2003; // new ngầm, vẫn là
        // tự nhiên hơn, vẫn phải new ngầm
        // n2, n3, n4 trỏ 3 vùng ram new Integer, lõi vùng new là int 2003

        // in thì sao?
        System.out.println("n1: " + n1); // primitive, xài luôn
        System.out.println("n2: " + n2);// gọi thầm tên em
        System.out.println("n3: " + n3.toString());
        System.out.println("n4: " + n4.intValue());// getAnInteger() getADouble()

        // Integer n4 = 2003;
        Integer n5 = n1; // CPU xử lí giống nhau, new ngầm Integer()
                         // Nhét vào trong lõi Integer vùng new á, con số
                         // int 2003 core/lõi
        // Cơ chế boxing/ đóng hộp/ Wrapper: khi ta gói cái primitve -> Object
        System.out.println("n5: " + n5);// gọi thầm tên em

        // int n6 = 2001; // pri, quen quá
        int n6 = n5; // á đù, chuyện gì mở hộp quà
                     // Unboxing: khi ta mở hộp, lấy value lõi -> gán ra Primitive
                     // Vẫn tương thích, phù hợp
                     // Unboxing: Object -> Primitive
        System.out.println("n6: " + n6);

        // Integer n5 = n1; // Trỏ vùng new 2003 riêng của nó

        n5 = 2000; // Điều gì diễn ra trong ram?
        // Vùng new mới Integer(lõi là 2k)
        // éo quan tâm vùng new Cũ (2003)
        // Vậy thì Integer ko có khái niệm set(), tức là mỗi lần gán value là 1 lần new
        // mới, ko xài vùng new cũ
        // Ko có cơ chế set() lại cái gì đã đỏ lúc new. Ko cho phép thay đổi value lõi,
        // tức là Read-Only, chỉ đọc, ko cho chỉnh sửa
        // Integer chỉ có hàm Get() ko có hàm set()
        // Một class bất kì nào khác, kể cả Integer, mà chỉ có hàm get() ko có hàm
        // set(), ko hàm cho thay đổi bên
        // trong, ngoại trừ lúc đúc
        // Class Read-Only đặc điểm
        // Thì class này được gọi là Immutable class

        // Class nào mà cho phép thay đổi Value đã đc đúc, gọi là Mutable class

        // int yob = 2003; yob = 2000; // vẫn vùng ram cũ, On-Off lại

        // Có tổng cộng 8 cái Warpper/ trai bao class ứng với 8 thằng Primitive
        // Byte Short Integer Long Float Double Boolean Character
        // byter short int long float double boolean char
    }

}
