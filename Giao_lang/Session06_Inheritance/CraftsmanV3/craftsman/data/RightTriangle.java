package Giao_lang.Session06_Inheritance.CraftsmanV3.craftsman.data;

// 1. Phát hiện được IS A đọc 1 chiều, lập tức tiếp cận làm Khuôn mới kiểu mới
//  gõ extends Class Cha,

// 2. Khai báo các đặc tính cho Con, nếu trùng lại với Cha, tương đồng Cha, để Cha lo
// ko cần khai báo lại đặc tính Con nếu Cha có tương đương

// 2.1

// 3. Làm phễu cho Con, giữ bản sắc cho Con, tôn trọng phễu đầu vào của Con
//  sự khác biệt góc nhìn Cha và Con, Cha cần 3 cạnh, Con chỉ cần 2 cạnh vuông
public class RightTriangle extends Triangle {

    public RightTriangle(String owner, String color, double a, double b) {
        super(owner, color, a, b, Math.sqrt(a * a + b * b));
        // new con chính là new Cha, cắt tam giác vuonon chính là cắt 1 tam giác
        // new Con chính là new 1 phiên bản Cha
    }

    // public double getPerimeter() {
    //     return a * b;
    // }

    // public double getArea() {
    //     double p = getPerimeter() / 2;
    //     return p;
    // }

    // Con muốn qua mặt khi hắn có hàm trùng tên 100% với Cha
    @Override
    public void paint() {
        System.out.printf("|R_Triangle |%-15s|%-10s|%-4.1f|%-4.1f|  - |%-7.2f|\n", owner, color, a, b, getArea());
    }
}

// Khi liên quan đến kế thừa, có 2 điều
// Di truyền: Cha có gì con xài lấy, Cha thêm, con có thêm, cha bớt, con bị bớt
// Biến dị: Con khác Cha à nha, điều gì xảy ra - Kĩ thuật Drief, rê bánh