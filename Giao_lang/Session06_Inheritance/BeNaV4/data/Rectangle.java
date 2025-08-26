package Giao_lang.Session06_Inheritance.BeNaV4.data;

// 1. IS A
// 2. Đặc điểm: Con trùng hoàn toàn Cha, gửi Cha giữ hết khỏi làm gì
//              Con dị biệt , làm như bình thường
// 3. Phễu nhớ thỏa hiệp nếu cần, đổi thứ tự biến cho thuận chiều
// 4. Hàm của con có quyền làm dị biệt như bth (ảnh hưởng tổ lái con trỏ)
// Phiên bản kế thừa level 1 chưa xài abstract thì Con chỉ cần làm phễu là xong
// Xài 100% ở Cha, ngứa tay muốn qua mặt cứ làm @OVerride, dị biệt thích thì làm

// Class con thừa kế từ Cha, Cha này là Abstract, Cho nên con chỉ có 2
// lựa chọn duy nhất
//4.1. Con làm biếng ko thèm làm điều Cha nói, ko thèm viết code cho hàm
//      abstract của Cha, tức là Con lúc này chứa hàm abstract từ Cha
//      Nếu class chứa hàm abstract thì mày chỉ là khái niệm, mày ko hoàn hảo

// Nếu 1 class là abstract giống như Concept vậy ko thể vận hành 1 cách hoàn hảo được,
// do đó nó ko thể new để tạo Object
// Cha, ko thể new vì chưa hoàn hảo, Con cũng thế, ko new, dòng họ Vô Sinh
// Ko đúc đc Object

//4.2. Vì bài này HCN là rõ ràng có 2 cạnh rất cụ thể, tính đc ngay S, P
// sợ gì mà ko viết code
// Con phải có trách nhiệm hoàn tất điều Ba nói, viết code cho hàm Abstract
// vì nếu ko làm thì nó vô sinh, ko new đc do ko hoàn hảo
// new xong rồi chấm getS() làm gì có code mà chạy
// COn nếu ko muốn vô sinh, thì phải viết code cho tất cả hàm abstract của Cha
// IMplement All of Parent's Abstract Methods
// Implement the body of a function, the body of Parent's Abstract methods
// @Override

// Ta ko đem bán, sử dụng điều ko hoàn hảo

public class Rectangle extends Shape {

    protected double a, b; // width, length

    public Rectangle(String owner, String color, String borderColor, double a, double b) {
        super(owner, color, borderColor);
        this.a = a;
        this.b = b;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    // Phần dị biệt con phải làm
    // Các vua hùng đã có công ... bác cháu ta ... chỗ này đây
    // Ba: Tao chỉ nói vậy, mày muốn làm sao thì làm, đây, con làm nè
    @Override
    public double getArea() {
        return a * b;
    }

    @Override
    public double getPrimetive() {
        return (a + b) * 2;
    }

    @Override
    public void paint() {
        System.out.printf("|Rectangle |%-15s|%-10s|%-10s|%-4.1f|%-4.1f|%-7.2f|\n",
                owner, color, borderColor, a, b, getArea());
    }

}
