package Giao_lang.Session04_Essentials.StringClass.stringclass;

public class StringClass {
    public static void main(String[] args) {
        playWithString();
    }

    public static void playWithString() {
        String s1 = new String("Hello"); // ~~~ new Integer(2003)
        String s2 = new String("Hello");
        String s3 = "Hello"; // Khuyến khích viết cách này, tự nhiên
        String s4 = "Hello"; // new String ngầm
        String s5 = "HELLO";

        // hỏi:
        // s1 có bằng s2 ko
        boolean r = s1 == s2;
        System.out.println("s1 vs. s2? " + (s1 == s2));
        // s2 có bằng s3 ko
        System.out.println("s2 có = s3 ko " + (s2 == s3));
        // s3 có bằng s4 ko
        System.out.println("s3 có = s4 ko " + (s3 == s4));

        // Chuỗi new ngầm là Pool

        // s4 có bằng s5 ko?
        System.out.println("s4 có = s5 ko? " + (s4 == s5));

        // Cho nên cùng 1 kết: éo so sánh 2 chuỗi qua toán tử ==
        // vì lúc đúng lúc sai do chug Pool hay ko
        // So sánh 2 biến Obejct là vô nghĩa
        // Bắt buộc vào vùng new mà so sánh, . để mà so sánh
        // .comparaTo() .equals()
        
        // Mọi Object mình tạo ra hay người ta tạo ra thì luôn nên có 2 hàm ứng với 2 loại câu hỏi: tao bằng mày ko?
        // Tao so với mày thế nào? Tao .equals(Mày)  Tao .CompareTo(mày)  
        // Chấm để so sánh bên trong
        // Hàm ở chỗ có data thì tiện xử lí

       System.out.println("s4 vs . s5 (core)? " +  s4.equalsIgnoreCase(s5));

    }

}
