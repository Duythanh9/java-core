package Giao_lang.Session03_Class.StudentManagement.studentmanagement;

import java.util.Scanner;

import Giao_lang.Session03_Class.StudentManagement.data.Student;

public class StudentManagement {
    public static void main(String[] args) {
        saveAStudents();
        // inputAStudent();
    }

    // em muốn nhập từ bàn phím hồ sơ của ai đó, y chang như đăng ký member vào 1
    // website
    // cần có bàn phím để nhập, Scanner tiệm photo, Camera, WC, Bàn phím cơ,
    // Touchpad..
    // Cần có biến trung gian để hứng value từ bàn phím vào
    // Có vật liệu rồi, gọi phễu mà new của Student
    // Gáy
    public static void inputAStudent() {
        String id;
        String name;
        int yob;
        double gpa; // local variable, Stack Sure
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input id: ");
        id = scanner.nextLine();
        System.out.print("Input name: ");
        name = scanner.nextLine();
        System.out.print("Input yob: "); // java trôi lệnh y chang, lện nhập chuỗi sau số
        yob = scanner.nextInt();
        System.out.print("Input gpa: ");
        gpa = scanner.nextDouble();

        // đủ data vật liệu rồi, đúc sv, y chang nhấn nút Register sau khi đã fill vào
        // form
        Student student = new Student(id, name, yob, gpa);
        student.showProfile();
    }

    // hard - code như mọi khi, đổ sẵn value
    public static void saveAStudents() {
        Student student = new Student("PH6868", "duythanh", 2005, 6.8);
        Student student2 = new Student("PH2204", "nhuquynh", 2004, 9.0);
        student.showProfile();
        student2.showProfile();
        // xem chấm khi có public private
        int s = student.yob;
        System.out.println("s1 yob: " + s);
        System.out.println("s1 yob: " + student.yob);
        System.out.println("s1 yob: " + student.getYob());
        // khi sờ được trực tiếp đặc điểm, tức là ta chạm trực tiếp biến, chạm biến ~
        // get() set()

        // student.setName("Khong hoc bai");
        // student.name = "Co hoc bai";
        // System.out.println("After không học bài");
        Student.name = "hii";
        student.showProfile();
        student2.showProfile();

        // Static là vùng nhớ dùng chung co các object cùng loại
        // ai cũng nghĩ là của mình, nhưng thực tế là chung
        // nếu 1 ai đó tác động, thì tất cả bị ảnh hưởng

        System.out.println("s1 yob: " + student.yob);
        System.out.println("s2 yob: " + student2.yob);

        // Vùng static xài chung cho mọi object, cho nên giá trị của vùng này
        // Chung cho tất cả các SV hiện tại và tương lai, WC tập thể chung co cả dãy lầu
        // không nên tư hữu cái đồ xài chung
        // student.name ~ student2.name ~ student3.name ~~~ Student.name
        // sờ static đừng sờ qua kiểu tư hữu mà nên sờ theo kiểu Class chấm static
        System.out.println("Student name: " + Student.name);
        // có 2 loại chấm: chấm qua biến object hàm ý non-static, đồ thuộc từng object
        // tui.nam sinh khac ban.nam sinh khác bạn ay. nam sinh
        // Chấm thứ 2: đồ static xài chung, new cả tỉ lần cũng chỉ 1 vùng ram, chung đám
        // vậy chấm qua cả đám hợp lí hơn

    }

    

}
