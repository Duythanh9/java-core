package Giao_lang.Live.Shapes.data;

public class NoName extends Shape {

    public NoName(String owner, String color, String borderColor) {
        super(owner, color, borderColor);
    }

    @Override
    public double getArea() {
        // hình cắt bên Word là hình duy nhất, S ko thể có công thức, mà
        // là con số đo đc = thước + tích phân
        // đảm bảo S là con số, còn tính theo công thức hay đo đạc ko ảnh hưởng
        // nếu bạn chế tạo Khuôn, sẽ là công thức nhân bản
        // hình mình đang cắt là unique
        return 50; // giả bộ cho hình bên
    }

    @Override
    public double getPrimeter() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getPrimeter'");
    }

    @Override
    public void paint() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'paint'");
    }

}
// Nếu ta làm riêng 1 cái khuôn cho 1 hình cụ thể ko hình dạng
// sau này ta nhân bản hình nào cũng 50 vô lí, cắt ngẫu nhiên diện tích ngẫu
// nhiên
// nếu chủ động làm class con thế này, thì nó lặp lại giống V, Tr, CN
// cần có công thức chung S, P, Để còn Clone các hình

// Bên word hình độc đáo, duy nhất, ko thẻ dùng khuôn rời noname đnag làm đc
// ta sẽ chế nhanh tho Shape, ăn ké Shape mà new trực tiếp hoy
// Trả ra S, P Hard - Code đúng nghĩa là 1 hình duy nhất
// chế khuôn class dành cho nhân bản
