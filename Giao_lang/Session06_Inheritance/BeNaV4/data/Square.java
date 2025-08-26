package Giao_lang.Session06_Inheritance.BeNaV4.data;

// Square kế thừa ai???
// Nếu kế thừa Shape? Mình phải làm những việc gì? extends Shape
//                                                  khai báo dị biệt, edge
//                                                  phễu, bản sắc, thỏa hiệp, đảo ngược
//                                                  implement all abstract method
//                                                  viết code cho 3 hàm

// Nếu kế thừa HCN? Ta phải làm những việc gì? extends HCN
//                                             ko biến dị so HCN ko cần làm đặc biệt
//                                             phễu thỏa hiệp, bản sắc, đảo thứ tự
// ko làm gì thêm vì Cha HCN quá ổn
// Done mẹ nó rồi
// Nếu muốn độ lại thì cứ làm   
// Shape ông nội, con HCN, cháu Square
//                                             
public class Square extends Rectangle {
    // Đoạn này học rồi
    // Không cần khai báo gì thêm: V là CN có 2 cạnh == nhau
    // nếu muốn biến dị cứ làm, đã học bài Parent Child

    public Square(String owner, String color, String borderColor, double edge) {
        super(owner, color, borderColor, edge, edge);
    } // HV là HCN có 2 cạnh = nhau

    @Override
    public void paint() {
        System.out.printf("|Square    |%-15s|%-10s|%-10s|%-4.1f|  - |%-7.2f|\n",
                owner, color, borderColor, a, getArea());
    }// lấy tất cả của Cha

    public void sayHi() {
        System.out.println("Xin Chào" + "ạ!");
    }

}
