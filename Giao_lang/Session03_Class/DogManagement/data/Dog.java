package Giao_lang.Session03_Class.DogManagement.data;

public class Dog {
    public String name; // ________
    private int yob; // ______
    private double weight; // ______

    // Phễu dùng để rót/chế/đổ/fill vật liệu đưa vào
    // lấp đầy các chi tiết chừa sẵn chỗ. Khuôn rỗng ở các chi tiết
    public Dog(String iName, int iYob, double iWeight) {
        name = iName;
        yob = iYob;
        weight = iWeight;
    }

    // Sủa() là hành động của object Dog
    // speak() là hành động của Person
    // scanChannel() là hành động của Tivi, showMovie();
    public void bark() {
        // System.out.println("gogogogogogo.... my name is " + name);
        // System.out.println("gogogogogogo.... my yob is " + yob);

        System.out.printf("|GOGO|%-10s|%4d|%4.1f|\n", name, yob, weight);
    }

    public void updateWeight(double newWeigt) {
        weight = newWeigt;
    }

    // Giống câu chuyện hỏi ai đó info
    // Cho tao biết năm sinh của mày, mày.namSinh
    // mày.getNamSinh() mày lấy năm sinh của mày đưa cho tao
    public int getYob() {
        return yob;
    }
}
// Khuôn là hình dáng của 1 Object sẽ xuất hiện trong tương lai
// Chứa đựng đặc tính/đặc điểm và hành vi (xử lí info - Hàm)
// Khuôn thì phải kín, code phải viết trong Class
// Nhóm các bạn Dog chia sẻ chung nhiều đặc điểm: tên: ___; cân nặng: ___
// Template, Form,
// Trong khuôn chứa các chi tiết mô tả Object
// Tượng Trần Hưng Đạo có chiều cao, chiều cao đế...
// CCCD/CMND cũng là khuôn để chứa các info mô tả công dân
// Ca sĩ là khuôn chứa các info mô tả mọi Object đi hát

// Phễu là 1 hàm rất rất đặc biệt, nó có xử lí: ép dòng dữ liệu/vật liệu chảy
// vào
// đúng chỗ bên trong - xử lí - hàm quan điểm của lập trình
// Mỗi lần gọi phễu, sử dụng phễu tương đương việc đúc 1 bứ tượng mới, tạo 1
// Object
// mới, giống đi mua 1 em dog đem về bán, nuôi (cho tên, ghi cân nặng,
// vaccin...)
//

// Lưu í hàm này tên phải trùng 100% tên class. Chữ hoa từng đầu từ - quy ước
// Tên hàm phễu không có giá trị trả về, không được có void luôn
// Void sẽ nhầm lẫn với các hành động của object
// Hàm phễu nhận vật liệu vào chờ khô ra được chính object thuộc nhóm Dog đang
// đề cập
// Trả về trả về ngay object sẽ được tạo trong tương lai, đúng không gian mình
// đang
// Đứng đã là object, ko cần giá trị trả về, thậm chí ko được dùng void
// Trong khi đó nhờ phễu ra chính Object này

// Kĩ thuật đóng gói/gom đặc tính, và hành vi xử lí đặc tính đó để hình thành
// nên
// 1 Object riêng biệt
// Kĩ thuật cô lập hàm và biến vào 1 khu vực (Object, Class)
// Tạo thành 1 thực thể hoạt động riêng biệt, có đặc điểm luôn
// Kĩ thuật gói mọi thứ lại thành 1 đơn vị (Object) được gọi là Encapsulation

// Abstraction/Inheritance/Polymorphism