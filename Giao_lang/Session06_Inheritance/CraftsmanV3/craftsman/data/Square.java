package Giao_lang.Session06_Inheritance.CraftsmanV3.craftsman.data;

// phát hiện 1 điều thú vị: HV is a (kind of), a special case, a version
//                                  HCN
// nói ngắn gọn: HV là HCN, luôn đúng, đọc 1 chiều thôi hen
//                 dư sức tham dự vào mảng HCN
// độ lại 1 Khuôn mới từ Khuôn cũ, mới có được câu HV là phiên bản mới
//                                  từ HCN
// HV là HCN, Khuôn HV rõ ràng là 1 dạng Khuôn HCN
// V, CN cùng nhà, chung mảng, for sắp xếp được
// cách tiếp cận sự tương đồng giữa các khuôn, kế thừa dùng lại
//                                              Inheritance
// viết theo cách cũ: 2 khuôn độc lập, ko chung mảng
//                 kế thừa: 2 anh em chung 1 nhà
// kế thừa chỉ dành cho gần gũi người nhà, series phiên bản
// HCN gọi tên là class Cha, parent, super, base, phiên bản gốc
// HV                   Con, child, sub,   derived
// HV là HCN, cho nên HV sẽ có tất cả mọi thứ mà HCN có, ko cần viết lại code
// HV là HCN, nó phải hành xử như HCN, hàm xài lại luôn
// Kế thừa ko phải là Copy/Paste như hồi này, đây là cách lười gõ
// Kế thừa là xài lại 100% ko cần gõ lại code - đúng ngoài đời luôn

// KHi chơi với kế thừa, phải tôn trọng phễu của con
// Vuông trước khi chơi vs Rectangle, V vẫn là V, phễu có 3 tham số
// để đúc 1 V: owner, color, edge
// phễu V vẫn cần, Khuôn cần có phễu nhân vật liệu
//                   phễu chảy thẳng lên CNm vì V là CN
//                   dữ liệu của V chính là dữ liệu của CN
// Tôn  trọng CST của con, độ lại 1 HCN
// 
//!2!!!!! Nhân tử chung

//!3!!!!


public class Square extends Rectangle{
    // HV là HCN, 0 cần làm lại những gì CN đã làm, o cần field, HCN có rồi

    public Square(String owner, String color, double edge) {
        super(owner, color, edge, edge);
        // Dung hòa cha con, đọc hay lắm luôn
        // HV có cạnh Edge chính là HCN có cạnh Edge, Edge


    } // super chính là ~~~~ new Rectangle(o, c, w, l);
    // đẩy/ đổ vật liệu cho Cha giữ giùm, vì ko cần làm lại
    // new Square() -> cắt Hv, tạo Hv
    //                              chính là cắt HCN
    // new Square() chính là new HCN(), cắt HV, chính là cắt HCN

    // Con có hàm trùng tên 100% với hàm cha
    // Con qua mặt Cha, phủ quyết, vờ như ko thấy hàm Cha
    // đặc trưng cho 1 thứ gọi là tính đa hình đa xạ đa ánh xa đa nhân cách
    // 50 sắc thái, transformer, Polymorphism
    @Override
    public void paint() {
        System.out.printf("|Square    |%-15s|%-10s|%-4.1f|  - |%-7.2f|\n", owner, color, width, getArea());
    }

}
