package Giao_lang.Live.Session07_Conllections.StudentManagementV2.data;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Cabinet {
    // Tủ sẽ có nhiều ngăn chứa nhiều món đồ. Ta xài mảng, ArrayList, Collection để
    // lưu trữ nhiều đồ
    // từ từ các bạn sv đến nhập học, nộp hồ sơ, và ta cất vào tủ arr

    private List<Student> arr = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    // default/empty constructor. Ko làm gì cả
    public Cabinet() {
    }

    // làm biếng làm phễu luôn, mọi thứ sẽ là default, Túi từ từ đc add() vô
    // mình ko chơi trò mua Tủ có sẵn luôn cái Túi, trong Túi có sẵn hồ sơ!!
    // nếu muốn làm, thì new sẵ túi bên ngoài, có sv sẵn đưa vào trong tủ, ok

    // hành động của cái Tủ là: thêm hồ sơ, tìm hs, sort hs, xóa hs, update hs
    public void addAStudent() {

        String id, name;
        int yob;
        double gpa;

        System.out.println("Input student profile #" + (arr.size() + 1));

        while (true) {
            System.out.println("Input id:");
            id = scanner.nextLine();
            // vừa gõ id xong, check liền coi có trùng id ko, có, chửi, bắt nhập lại
            // còn sai còn ăn chửi, còn nhập lại
            Student xxx = searchAStudent(id);
            if (xxx == null) {
                break; // ko thấy có sv nào ứng với id vừa gõ này, ko trùng
                       // Break để nhập tiếp info còn lại
                       // Ko trùng id chính là khái niệm Primary Key bên database

            } else {
                System.out.println("Duplicated ID. Try with another one");
            }
        }

        System.out.println("Inut name:");
        name = scanner.nextLine();

        System.out.println("Input yob:");
        yob = Integer.parseInt(scanner.nextLine());
        // MyToys

        System.out.println("Input gpa:");
        gpa = Double.parseDouble(scanner.nextLine());

        arr.add(new Student(id, name, yob, gpa));
        System.out.println("The new student has been added successfully");

        // arr.add(new ArrayList(....));
    }

    public void printStudent() {
        if (arr.isEmpty()) {
            System.out.println("The student list is empty. Nothing to print");
            return;
        }

        System.out.println("There is/are " + arr.size() + " student(s)");
        for (Student x : arr) {
            x.showProfile();
        }
    }

    // CRUD: Create/ Retrieve(Read)/Update/Delete
    // Viets hàm search là hàm quan trọng, vì nó ko chỉ là search cho nhu cầu
    // tìm hồ sơ, mà còn giúp cho các hành động khác: xóa, sửa hồ sơ
    // giúp việc tạo mới hoàn hảo
    // tìm xem mã số sv vừa tạo mới có trùng không
    // tương đương đăng kí 1 member, gõ acc báo trùng rồi, còn trùng còn éo cho đi
    // tiếp
    // ta sẽ viết hàm search giải quyết đc khá nhiều chuyện thì tốt hơn

    public Student searchAStudent(String id) {
        if (arr.isEmpty()) {
            return null;
        }

        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i).getId().equalsIgnoreCase(id)) {
                return arr.get(i);
            }
        }
        return null;
    }

    // overloading xảy ra
    // hàm này bao hàm trên lại - dùng lại, cung cấp id. Nhìn ra ngoài tủ
    // thấy có 2 cách search, bạn đưa id trực tiếp, hoặc bạn nhập id
    public void searchAStudent() {
        String id;
        System.out.println("Input a student id that you want to search: ");
        id = scanner.nextLine().trim();
        Student xxx = searchAStudent(id);
        if (xxx == null) {
            System.out.println("Not found!!!");
            return;
        }
        System.out.println("Student found! Here she/he is");
        xxx.showProfile();

    }

    public void updateAStudent() {
        String id;
        double newGPA; // có ai đó làm price kiểu int -> ăn đòn
        System.out.println("Input the student id that you want to update profile");
        id = scanner.nextLine().trim();
        Student xxx = searchAStudent(id);
        // có tham chiếu trỏ đến vùng new Student() có id cần tìm
        if (xxx == null) {
            System.out.println("Student not found! Nothing to update");
        } else {
            System.out.println("Before updating");
            xxx.showProfile();

            // mời nhập điểm số mới/giá tiền mới
            System.out.println("Input new gpa");
            newGPA = Double.parseDouble(scanner.nextLine());

            xxx.setGpa(newGPA);

            System.out.println("Before updating");
            xxx.showProfile();
        }
    }

    public void updateAStudent(Student x, double newGPA) {
        // đã đưa tao tham chiếu đến sv x, tao set luôn
        if (x != null) {
            x.setGpa(newGPA);
        }
    }

    public void updateASudent(String id, double newGPA) {
        System.out.println("Input id");
        id = scanner.nextLine();
        System.out.println("Input gpa");
        newGPA = Double.parseDouble(scanner.nextLine());
        Student xxx = searchAStudent(id);
        if (xxx == null) {
            System.out.println("Student not found! Nothing to update");
        } else {
            System.out.println("Before updating");
            xxx.showProfile();

            xxx.setGpa(newGPA);

            System.out.println("After updating");
            xxx.showProfile();
        }
    }
}
