package Giao_lang.Session05_Array.StudentManagement.studentmanagement;

import java.util.Scanner;

import Giao_lang.Session04_Essentials.MyToys.sadich_com.MyToys;

public class Shelf {
    
    // đặc điểm của 1 cái tủ bất kì là gì: màu sơn:___; giá tiền:___; nhà sx:___
    // số ngăn/ không gian chứa đồ:___các món đồ nhét vào, món đồ là object
    // chứa nhiều đồ, nhiều object rõ ràng đến thời điểm này là ta cần mảng object
    // tủ sẽ chứa 1 list/mảng/ds các đối tượng
    // ứng dụng của mảng, góp phần tạo dựng nên object khác
    // OOP: Tìm các object, chúng phối hợp, trộn nhau
    private String color; // = "Pink";
    private String label; // tủ chén, tủ hồ sơ SE, IA, GD

    // biến phải được đưa value, lúc nào???
    //                          qua phễu (default trong suy nghĩ)
    //                          gán trực tiếp trong khai báo
    //                          

    // chứa cái gì, chừa không gian để chứa đồ, thực ra đồ chưa có
    //              chưa có hồ sơ sv

    private Student[] ds = new Student[300]; // ds[0] = new Student();
                // ds là biến má mì = cần value
                //          new sẵn 300 tương đương mua tủ 3001
                //          đặt hàng kích thước, dung tích size 500, 1000, 2000
    private Scanner sc = new Scanner(System.in);

    private int count = 0; // mới mua tủ về, số hồ sơ = 0
                           // nhét thêm 1 hồ sơ thì count++
                           // chơi mảng chỉ for đến count
    // lưu trữ cách để đổ vào mảng, vào giỏ, để từ trái sang phải, tương đương
    // sắp xếp đồ vào tủ giỏ theo thứ tự gọn gàng
    // For đến count
    public Shelf(String color, String label) {// , int size kích thước của tủ
        this.color = color;
        this.label = label;
        //ds = new Student[size]; // linh hoạt trong kích thước thủ
    }
            
    // Data + Hàm xử lí của tủ nhân cách hóa, toàn bộ sẽ là non-static
    // Nếu ko các trường ĐH, bộ môn xài chung DSSV toang
    // Đồ đạc, 
    public void inputStudentList() {
        int yob;
        String id;
        String name;
        double gpa;
        System.out.println("Input student #" + (count + 1) + "/" + ds.length);
        System.out.println("Input id: ");
        id = sc.nextLine();     // Todo: kiểm tra id trùng
                                // MyToys.get...("SE xxxx")
                                // Regular Expression kiểm tra chuỗi nhập đúng định dạng

        System.out.println("Input name: ");
        name = sc.nextLine();

        System.out.println("Input yob: ");
        yob = MyToys.getAnInteger("Input lai");

        System.out.println("Input gpa: ");
        gpa = Double.parseDouble(sc.nextLine()); 

        ds[count] = new Student(id, name, yob, gpa);
        count++; // Siêu víp
        System.out.println("Add student successfully");

    }

    public void printStudentList() {
        System.out.println("The student list");
        for (int i = 0; i < count; i++) {
            ds[i].showProfile(); // For hết là toang
                                // Vì mẹ kiếp, mảng object default các phần tử là NULL
                                // hạ cánh nơi anh, trỏ đáy ram, mà ép đáy
                                // ram có code showProfile() quá đáng không?
                                // vùng new Student(...) thì mới có code chạy
        }
    }

    // Tui có không gian chứa info, tui sẽ giải quyết chuyện nhập xuất

    public void searchAStudent() {
        // search là quét/duyệt/đi từ trái sang phải lôi cổ từng sv[i] ra
        // hỏi hắn mã số mày là mấy???
        // so sánh với mã số muốn??? == mssv[i]  sv[i].getMS()
        // báo tìm thấy, tìm hết hok thấy == báo rằng not found
        // thuật toán trâu bò/vết cạn/ tát cạn
        System.out.println("Input the id that you want to search: ");
        String id;
        id = sc.nextLine();// hoa thường à nhen
        for (int i = 0; i < count; i++) { // đi đến chỗ đổ cuối cùng thôi nhen
            if(ds[i].getId().equalsIgnoreCase(id)){
                // tìm thấy tại vị trí [i]
                System.out.println("Student found!!! Here she/he is");
                ds[i].showProfile(); // in kết quả liền
                return;// tìm thấy dừng hàm luôn, ko for gì nữa
            }
        }
        // sống sot here, sure, éo có thấy id cần tìm, nếu thấy dừng sớm ở trên
        // đi hết for mà ko thoát đc, báo ko thấy
        System.out.println("Student not found!!!");
        // Dùng biến flag phất cờ nếu thấy và ko, if () in ra câu gì ?

    }

    public void updateAStudent() {
        System.out.println("Input the id that you want to update");
        String id;
        id = sc.nextLine();


        for (int i = 0; i < count; i++) {
            if(ds[i].getId().equalsIgnoreCase(id)) {
                System.out.println("Student found! Please enter new information");
                System.out.println("Input new name");
                String name = sc.nextLine();

                System.out.println("Input new yob");
                int yob = Integer.parseInt(sc.nextLine());

                System.out.println("Input new gpa");
                int gpa = Integer.parseInt(sc.nextLine());

                ds[i].setName(name);
                ds[i].setYob(yob);
                ds[i].setGpa(gpa);

                System.out.println("Update successful");
                ds[i].showProfile();
                return; 
            }
        }
        System.out.println("Not found a student");
    }

    public void deleteAStudent(){
        System.out.println("Delete a student");
        String id;
        id = sc.nextLine();

        for (int i = 0; i < count; i++) {
            if (ds[i].getId().equalsIgnoreCase(id)) {
                System.out.println("Student found! Please enter a student delete");
                return;
            }
        }
    }

}
