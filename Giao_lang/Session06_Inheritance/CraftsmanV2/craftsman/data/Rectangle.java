package Giao_lang.Session06_Inheritance.CraftsmanV2.craftsman.data;

// OOP: Object Oriented Programming/Paradigm
public class Rectangle {
    protected String owner;
    protected String color;
    protected double width;
    private double length;
    // private double area;// width * length
    // area được tính toán bởi đặc tính khác, area-> derived(bắt nguồn) attribute/field
    //                                         đặc điểm/đặc tính dẫn xuất
    // sl * đg = tt
    // age = current year(2025) - yob
    // chơi với field dẫn xuất, coi chừng tính bất đồng bộ, inconsistency
    // dữ liệu không nhất quán: đổ qua phễu w 5, l 10, area = 300
    // ko chơi đổ từ phễu, ghi area = w * l, lúc khai báo, tự tin chưa
    // nhưng nếu tao setW(cạnh mới)
    // mà quên cập nhật lại S, toang

    // bản chất: area là liên quan tính toán, ko có sẵn
    // tức nó là hàm xử lí data, 

    // nếu ta xem S là đặc điểm của miếng đất HCN, ko sai nhưng ...

    public Rectangle(String owner, String color, double width, double length) { // area
                                                                                // kiểm tra tương thích 
        this.owner = owner;
        this.color = color;
        this.width = width;
        this.length = length;
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

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "Rectangle [owner=" + owner + ", color=" + color + ", width=" + width + ", length=" + length + "]";
    }

    // hàm soái ca loại 4, reuse ở các lệnh khác
    public double getArea() {
        return width * length;
    }

    public void paint() { // 90 * 90 = 8100.00
        System.out.printf("|Rectangle |%-15s|%-10s|%-4.1f|%-4.1f|%-7.2f|\n", owner, color, width, length, getArea());
    }

}
