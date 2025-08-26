package Giao_lang.Session06_Inheritance.BeNaV4.data;

// Ta phát hiện mối quan hệ đặc biệt: giữa nhiều khuôn "khác biệt" nhưng lại tương đồng
// VD: anh em trong nhà: trai gái, cao thấp, ngăm ngăm, ít ngăm ngăm
// tương đồng: Con của Ba Má
// Ta đang nói về cái khuôn Tổ mà sinh ra nhiều khuôn khác
//Shape đại diện, cha của đám V, Tr, CN, TG, ....
// đọc 1 chiều thôi heng 
// Một class chứa hàm ABSTRACT tức là hàm ko có code, tức là ý tưởng cần có
// Thì bản thân chưa hoàn hảo, chưa hành xử được, giống như bản Concept
// Nó chỉ mới là ý tưởng mà thôi, do đó nễu class chứa hàm abstract
// class cũng phải là abstract
public abstract class Shape {
    // đặc tính của Cha, HH là gì ??
    protected String owner;
    protected String color;
    protected String borderColor; // màu đường bo cạnh, biên

    public Shape(String owner, String color, String borderColor) {
        this.owner = owner;
        this.color = color;
        this.borderColor = borderColor;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBorderColor() {
        return borderColor;
    }

    public void setBorderColor(String borderColor) {
        this.borderColor = borderColor;
    }

    // protected double a, b, c, d, f, radius; // ....
    // giả sử thằng con htr kế thừa Shape, thế thì nó có cạnh
    // lúc get() set() xổ ra 1 đống cạnh
    // phía khác HCN lần đầu tiên có bán kính
    // Cha có nhiều Con, Cha là nhân tử chung của các Con
    // Chung cho các con kế thừa, phần dị biệt mỗi đứa mỗi đứa giữ
    // Tuyệt đối ko để dị biệt lên Cha, dị biệt của từng đứa con

    // hành động tiếp theo, hàm của tui???
    // tính diện tích, chu vi???
    // hàm xử lí data!!, ai có nhiều info kẻ đó phải xử lí!!!
    // ở đây ko có data nhiều để tính toán, data thuộc về dị biệt
    // ko cần hàm getS() getP() đc ko thầy?
    // Cấm bỏ hàm tính S(), P() Vì logic về hình học
    // hình học có đường nét, có bề mặt, rõ ràng là tính được, S, P (Tích phân hình
    // phức tạp)
    // Hành động/hành vi của 1 Hình học nói chung chắc chắn là có P, S, nó là
    // bao nhiêu, tính sao, từ từ, nhưng chắc chắn phải có khái niệm này

    public abstract double getArea(); // diện tích là k/n heng

    public abstract double getPrimetive(); // ý tưởng đo cạnh hen, từ từ tính
    // hình mẹ nào chả có

    public abstract void paint();

    // vì các thao tác vẽ hình là khác nhau, chưa kể in ra là khác nhau
    // Chuỗi in ra khác nhau Rectangle, Square, Triangle, R.TRG...
    // Diện tích tính toán khác nhau
    // Cãi/ Phản biện: Viết paint() Here Shape và em if(tg) in TG
    // if(hình tròn) in DISK, if...
    // Được nhưng mất đi tính linh hoạt dễ mở rông, thích ứng với mọi loại
    // Hình còn tiếp tục đc sinh ra sau này ...
    // Nguyên lí Solid

    // public double getArea() {
    // // return ???; // éo tính được vì thiếu cạnh, kích thước
    // return 0; // sai nhen, ko có hình nào mà S = 0
    // // new Shape() chấm getArea() là toang
    // // éo cho bỏ cái hàm đi vì nó là thứ đi kèm HH
    // }

    // public double getPerimeter() { // Xin lỗi, em chỉ là khái niệm, ý tưởng
    // return; // đố tính đc, vì éo có cạnh
    // }

}
// Chốt hạ: việc tính S P là gắn kèm khái niệm hình học, nói ý tưởng rằng
// sẽ đo được đường bo, biên, tính đc độ rộng bề mặt
// Chỉ nói đó là ý tưởng, khái niệm HH thì có S, P, cụ thể ra sao, thì tùy hình
// mà tính

// S P của HH chỉ là khái niệm nói về 1 con số đại diện cho đường biên, bề mặt
// tùy mỗi hình sẽ tính đo khác nhau
// HH cũng là 2 khái niệm chung chung, chung chung thì sao mà tính đc
// cái chung chung vẫn ở đó, nhưng ko cụ thể, chúng tôi gọi là trừu tượng
// ABSTRACT
// Cái gì tồn tại nhưng ko chạm năm đc, chỉ mang ý nghĩa khái niệm, nói về 1 ý
// tưởng, cái đó nhưng mà vô, có thấy nhưng ko chạm đc, - ABSTRACT - Trừu tượng
// Ma quỷ, môn học khó nắm bắt, tình yêu

// Như vậy S P của Shape là trừu tượng, tồn tại để nói về thứ cần đo đạc, chưa
// cụ thể
// vì ngay cả H cũng là 1 khái niệm chưa cụ thể, biết hình gì đâu???

// Vẽ tao 1 cái hình, hỏi lại liền, hình gì???
// Chúng là những khái niệm sẽ đc nạp vào đầu mình để biết rằng sẽ có gì đó
// diễn ra tiếp theo
// Khái niệm - ABSTRACT - Tính trừu tượng chính là nói về 1 ý tưởng
