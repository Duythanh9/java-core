package Giao_lang.Live.Session07_Conllections.StudentManagement.studentmanagement;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import Giao_lang.Live.Session07_Conllections.StudentManagement.data.Student;

public class StudentManagement {
    // public static void main(String[] args) {
    // // playWithArrayList();
    // // sortArrayListManually();
    // // playWithSet();
    // // Student xxx = getAStudent("hh234");
    // // if (xxx != null) { // ko trỏ null tức là trỏ vùng tìm thấy thì in
    // // xxx.showProfie();
    // // } else {
    // // System.out.println("Not found!!!");
    // // }

    // // sortStudentList();
    // List<Student> result = initData();
    // System.out.println("The student list");
    // for (Student x : initData()) {
    // x.showProfie();
    // }
    // // for (Student x : result) {
    // // x.showProfie();
    // // }
    // }

    public static void main(String[] args) {
        List<Student> arr = initData();
        // gọi hàm search với 4 bạn sv đã có trong arr, thực ra do hàm initData() tạo
        Student xxx = searchAStudent(arr, "2222");
        if (xxx == null) {
            System.out.println("Not found!!!");
        } else {
            // lỡ tìm thấy thì update lại điểm số
            xxx.showProfie(); //  xxx đang trỏ vùng new bạn 2222 6.7
            xxx.setGpa(6868);
        }
        // ra hẳn ngoài if kiểm tra điểm có 6868 hay chưa
        System.out.println("Check student list after updating info of duythanh Student");
        for (Student x : arr) {
            x.showProfie();
        }
    }

    // -----------------------
    // Tử tế hàm Search và Sort, và Update luôn
    // -----------------------

    public static List<Student> initData() {
        // hàm trả về 1 cái Túi có sẵn bên trong 1 nhóm SV
        // trả về tọa độ 1 cái túi, vẫn new Túi mà, trong Túi có chứa thẻ bài sv
        // là chuyện khác nữa

        List<Student> arr = new ArrayList<>();
        Student duythanh = new Student("1122", "duythanh", 2004, 9.6);
        arr.add(new Student("2222", "nhuquynh", 2004, 6.7));
        arr.add(duythanh);
        // arr.add(duythanh); // ds thống kê bị trùng, 2 thẻ bài , 2 con trỏ

        arr.add(new Student("333", "thuylinh", 2004, 7.8));
        arr.add(new Student("4444", "kimanh", 2003, 9.9));

        return arr; // initData() = arr; arr ơi mày đnag trỏ new Bự nào ho tên hàm tao trỏ với
    }

    // Ta search/tìm kiếm 1 hồ sơ sv dựa theo mã số. Có nhận vào ds luôn cx đc
    public static Student searchAStudent(List<Student> arr, String id) {
        // arr là cái túi new đâu đó, tên biến là Con trỏ mà
        // trong cái túi này có 1 nhóm sv sẵn rồi, add sẵn rồi
        if (arr.isEmpty()) { // Túi ko có thẻ bài, tức à size() trả về 0 có sv nào đc tìm thấy đâu,
                             // trả về tọa độ đáy Ram
            return null;
            // CPU chạy xuống đây, Túi có thẻ bài rồi, ds có người điền tên rồi
            // For hỏi từng thẻ 1, ê ku (i) id mày là gì??? coi bằng id cần tìm hok
        }
        for (int i = 0; i < arr.size(); i++) {
            Student tmp = arr.get(i);
            if (tmp.getId().equalsIgnoreCase(id)) {
                return tmp; // return thẻ bài thứ i có trỏ vùng id tìm thấy
                            // thẻ bài, con trỏ lưu tọa độ, tao retuen tọa độ
            }
        }
        // đi hết for mà ko return đc, sure cũng éo thấy luôn, null đáy ram
        return null; // Hàm yêu cầu trả tọa độ vùng new, éo thấy thì vùng Null
    }

    // Có thể đưa giỏ từ ngoài vào ok
    public static void sortStudentList() {
        List<Student> arr = new ArrayList<>();
        Student duythanh = new Student("1122", "duythanh", 2004, 9.6);
        arr.add(new Student("2222", "nhuquynh", 2004, 6.7));
        arr.add(duythanh);
        // arr.add(duythanh); // ds thống kê bị trùng, 2 thẻ bài , 2 con trỏ

        arr.add(new Student("333", "thuylinh", 2004, 7.8));
        arr.add(new Student("4444", "kimanh", 2003, 9.9));

        System.out.println("The student list");
        for (Student x : arr) {
            x.showProfie();
        }

        for (int i = 0; i < arr.size() - 1; i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                // if (arr.get(i).getName().compareTo(arr.get(j).getName()) > 0) { so sánh theo
                // tên
                if (arr.get(i).getGpa() > arr.get(j).getGpa()) {
                    Student tmp = arr.get(i);
                    arr.set(i, arr.get(j));
                    arr.set(j, tmp);
                    // set() là thay đổi info của con trỏ, trỏ chỗ khác
                    // lấy thẻ bài khắc lại thông tin đó
                }
            }
        }

        System.out.println("The student list after sorting ascending by gpa");
        for (int i = 0; i < arr.size(); i++) {
            Student xxx = arr.get(i);
            xxx.showProfie();
        }

    }

    // Thử nghiệm hàm trả về 1 object, thực chất là trả về tọa độ vùng new - xem lại
    // bài object inside-out trên yt
    // đưa vào mà số sv muốn tìm
    // ta sẽ tìm trong giỏ/ túi thẻ bài, coi có ai mà có trùng mã
    // thì trả về thẻ bài, hồ sơ bạn sv đó, trả về tọa độ hồ sơ sv đó
    public static Student getAStudent(String id) {
        List<Student> arr = new ArrayList<>();// đi mua cái túi Doraemon
        Student duythanh = new Student("123", "duythanh", 2004, 7.9);
        arr.add(new Student("H234", "nhuquynh", 2004, 9.0));
        arr.add(duythanh);
        Student tmpStudent = arr.get(0); // lấy được tọa độ sv 0, thẻ bài 0
        // hỏi xem bạn í id là gì
        String tmId = tmpStudent.getId(); // arr.get(0).getId()

        // if (tmId == id)
        // return tmpStudent; // arr.get(0)
        // trả về tọa độ trong thẻ
        // trả về thẻ bài 0
        if (tmId.equalsIgnoreCase(id)) {
            return tmpStudent; // arr.get(0)
            // hoàn toàn ko có sv mới xuất hiện, chỉ tham chiếu tọa độ vùng new
            // Return Get(0) thẻ bài 0, thẻ bài 0 trỏ vùng new duythanh
        }
        return null;

    }

    // Set: là 1 loại giỏ, túi, mà ko cho phép đựng trùng món
    // tức là ko có món nào xuất hiện quá 1 lần
    // ko cho phép trỏ cùng 1 vùng new
    // Đếm số người xem phim, lễ hội, tiệc, đếm mỗi người 1 lần
    // List: cứ có vào là đếm, về rồi, quay lại vẫn đếm - số lượt người ..
    public static void playWithSet() {
        Set<Student> arr = new HashSet<>(); // Mua cái túi Doraemon
                                            // mở khóa để hao tác, .hàm()
        Student an = new Student("333", "thuylinh", 2004, 7.6);
        arr.add(an);
        arr.add(an);
        arr.add(new Student("123", "kimanh", 2004, 6.6));
        arr.add(new Student("123", "kimanh", 2004, 6.6));
        // có new có vùng ram mới, object mới, trùng info bên trong new ko phải trùng
        // Set là ko phải chấm nhận con trỏ trùng vùng new

        // ko có hàm get() vì giỏ này đưa đồ vào, thẻ bài vào
        // Thẻ bài đưa vô ko giữ nguyên thứ tự như đưa vô
        // lấy thì For Each, quét hết giỏ
        // thì có 2 tình huống xảy ra: HashSet: để "lộn xộn" thẻ bài
        // để thẻ bài "có thứ tự" theo cách riêng
        // Khác hoàn toàn thứ kiểu ARRAYLIST
        // Array List là vào trước, add ngồi trước, vào sau ngồi sau

        // Giỏ chứa mấy thẻ bài? Add 3 lần đấy. ArrayList add bao nhiêu chứa bấy nhiêu
        System.out.println("The student list");
        for (Student x : arr) { // duyệt qua từng con trỏ, lấy tọa độ
                                // từng thẻ bài gán vào con trỏ x
            x.showProfie();
        }
    }

    // ta tự sort bằng ds sinh viên làm bằng tay
    // còn 1 cơ chế ta ko cần dùng vòng for tự viết
    // hàm static: Collection.sort() // dùng interface mới được - giảng static
    public static void sortArrayListManually() {
        List<Student> arr = new ArrayList<>();// đi mua cái túi Doraemon
        Student nhuquynh = new Student("22222", "nhuquynh", 2004, 4.9);

        arr.add(new Student("1111", "duythanh", 2004, 6.5));
        arr.add(nhuquynh); // mày đưa tao tọa độ của vùng new
        arr.add(nhuquynh); // add trùng vùng new
        // có 2 tọa độ trong túi, 2 thẻ bài trong túi
        // get() từng thẻ bài thì được tọa độ vùng new
        // [i] đc tọa đọ vùng new , y chang mảng, mỗi phần tử mảng là 1 tọa độ
        System.out.println("The student list");
        // mảng đang giảm dần về điểm, túi giảm dần về điểm
        // thể bài 1 trỏ vùng điểm cao, thẻ bài 2 vùng con trỏ
        for (Student x : arr) {
            x.showProfie();
        }
        System.out.println("The student list (printed using for i)");
        for (int i = 0; i < arr.size(); i++) {
            Student x = arr.get(i); // lấy tọa độ đang nằm trỏ thứ i
            x.showProfie();
        } // Nhớ câu: có tọa độ thì chấm luôn

        // Mảng chơi [i] sờ ngay con trỏ thứ I
        // túi phải mở ra, để lấy, gọi hàm .hàm()

        // Đổi đc 2 thằng thì đổi được cả giỏ, 2 vòng for
        Student tmp = arr.get(0); // tmp trỏ cùng duythanh 6.5
        arr.set(0, arr.get(1)); // con trỏ thứ 0 trong giỏ, thẻ bài thứ 0
                                // phải trỏ nhuquynh 4.9

        arr.set(1, tmp);
        // con trỏ 1 thay cách trỏ, trỏ vào vùng tmp đang trỏ
        // tmp đang trỏ duythanh6.5
        // vùng new Student() vẫn nằm im, chỉ có thẻ bài trong giỏ
        // trỏ lại vùng new

        System.out.println("The student list after sorting asceding by gpa");
        for (Student x : arr) {
            x.showProfie();
        }
    }

    public static void playWithArrayList() {
        // Student[] arr = new Student[500];
        // arr là 1 cái túi chứa sẵn 500 chỗ, 500 món đồ có thể bỏ vô
        // món đồ phải đi mua, new , thảy vào
        // tên mảng chính là má mì, quản lí nhiều đồ, tên túi luôn

        List<Student> arr = new ArrayList<>();// đựng lộn xộn đủ loại con trỏ
        // đúng nghĩa túi Doremon, món gì cũng đựng, đựng tham chiếu hoy nha
        // nhét đc NhanVien, GiangVien, Animal, Dog,...

        // túi đồng nhất chỉ lưu con trỏ Student
        // List<Student> arr = new ArrayList<Student>();
        // List<Student> arr = new ArrayList<>();
        // arr là 1 cái túi chứa vô hạn chỗ, vô hạn con trỏ
        // nhét đồng nhất món đồ dễ chấm chung được, đa hình được

        // Mở ngăn tủ, túi, nhét đồ vô
        // arr[i] = new Student(...); // mảng
        // arr.add(new Student(....)); // lưu con trỏ hoy, new Student() thoải mái
        // bên ngoài, vùng heap

        Student s1 = new Student("SV001", "AN NGUYEN", 2000, 8.5);
        Student s2 = new Student("SV002", "BINH LE", 2003, 9.0);
        arr.add(s1); // Giỏ vùng new ArrayList, tủ có thêm 1 con trỏ, sinh ra 1 con trỏ
        // 2 chàng 1 nàng
        arr.add(s2); // sinh ra thêm con trỏ nữa [1]
                     // add() vô tận, mảng [length - 1] hết mức
                     // new cứ nằm HEAP, SV cứ ở nhà, CN cứ ở xưởng, BN cứ ở phòng bệnh
        // add() mở khóa kéo, khóa dây, nhét đồ vô, nhét tham chiếu, thẻ bài
        // sinh ra con trỏ
        arr.add(s1); // add trùng nè 1 tên người vào ds,
        // Set ko báo lỗi, chỉ lấy 1... đừng đi vào chi tiết vội vã!!!

        arr.add(new Student("PH123", "NHU QUYNH", 2004, 9.0));
        // new cứ lên HEAP mà nằm, Bệnh nhân cứ về phòng, tớ nằm thẻ bài
        // 1 con trỏ nữa lại đc add vào

        // Hỏi xem túi đang có bao nhiêu đồ
        // arr.length hỏi túi mà, hỏi má mì mà, tên mảng mà
        System.out.println("The bag has: " + arr.size() + " món đồ");
        // 4sv in ra, nhưng thực ra chỉ có 3 sv, do có người đếm trùng

        // in mọi người ra
        // tủ có gì, chứa bên trong 1 đống con trỏ
        // mảng: [i].showProfile()
        // Tủ ArrayList[con trorr1, con tror2, con tror3, con trỏ4, ... nếu add() thêm]
        // add() đẩy vào 1 con trỏ, tọa độ, thẻ bài
        // get(vị trí thẻ bài muốn lấy), trả về tọa độ con trỏ thứ i
        // trả về địa chị vùng new đang trỏ
        // [i] lấy đc tham chiếu bạn thứ i
        // get(i) lấy đc chỗ ngồi tham chiếu con trỏ thẻ bài thứ i
        // a, thẻ này trỏ bạn sv kia kìa

        // in bạn đầu tiên
        // arr[i].showProfile() phần tử đầu tiên của mảng

        Student x = arr.get(0);// trả về tọa độ con trỏ thẻ bài bạn thứ 0
        // Trả về tọa độ gán vào biến Student khác nắm cùng tọa độ ok
        System.out.println("The student the list");
        x.showProfie();
        s2.showProfie();

        // bạn 1 get(1), có tọa độ chấm luôn cho rồi, thêm biến con trỏ trỏ cùng làm gì?
        arr.get(1).showProfie();// á đù trả về con trỏ, học rồi 7 viên ngọc rồi
        System.out.println("In xịn sò");
        for (Student x1 : arr) { // éo sợ Null Pointer add() đến đâu thêm con trỏ tới đó
            // x = arr.get(i) = arr[i]
            x1.showProfie();
        }
        System.out.println("In xịn sò for truyền thống");
        for (int i = 0; i < arr.size(); i++) {
            // arr[i].showProfile();
            arr.get(i).showProfie();
        }
        // có hành động xóa 1 con trỏ, loại bỏ 1 thẻ bài, món đồ, gạch tên 1 người khỏi
        // ds
        // vùng new Student() bị mất hay ko tùy vào mấy con trỏ trỏ nó, học rồi
        // size() giảm liền, mảng éo có, fix cứng số con trỏ=
        // set() đảo con trỏ, trỏ sang vùng khác (get() hàm set() xưa nay của các
        // object)

    }
}
