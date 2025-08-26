package Giao_lang.Session03_Class.DogManagementV2.data;

public class Dog {
    public String name; // ________
    private int yob; // ______
    private double weight; // ______

    public Dog(String name, int yob, double weight) {
        this.name = name;
        this.yob = yob;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYob() {
        return yob;
    }

    public void setYob(int yob) {
        this.yob = yob;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    // Sủa, tức là show ra cảnh báo chính chủ nhà mình
    public void bark() {
        System.out.println("GOGO: " + name + " | " + yob + " | " + weight);
    }

    // Khi mua đt mở đập hộp có sổ ghi thông số máy: mở máy vào Setting -> thông số
    // máy
    // Mọi Object quanh ta tiềm ẩn 1 hành động cơ bản: show toàn bộ info chi tiết/
    // mức cơ bản
    // ~ Hành động gặp chú CA, show CCCD, gặp cô ngân hàng, show CCCD
    // Mặc định Java cung cấp 1 hàm tự sinh code sẵn show ra toàn bộ info mà đã được
    // đổ, đang có
    // Hành động này gọi là hàm toString(), biến mọi thứ info thành chuỗi

    @Override // chữ này không nhầm với OVERLOAD
    // Cả 2 keyword dính dáng đến tính 50 sắc thái, POLYMOSPHISM, đa xạ đa hình, học
    // sau

    public String toString() {
        return String.format("%-10s|%4d|%4.1f|", name, yob, weight);
        // String tmpMsg = String.format("%-10s|%4d|%4.1f|", name, yob, weight);
        // return tmpMsg;
        // return "Ahihi";
        // return "Dog [name=" + name + ", yob=" + yob + ", weight=" + weight + "]";
    }

    // toString() là một hàm rất rất đặc biệt

    public int getAge() {
        return 2021 - yob;
    }// viết hard - code, mỗi năm cập nhật code 1 lần
    // ngon: lấy được giờ Windows - yob;
    // 

}
