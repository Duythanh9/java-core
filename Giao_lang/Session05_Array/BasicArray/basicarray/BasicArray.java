package Giao_lang.Session05_Array.BasicArray.basicarray;

public class BasicArray {
    public static void main(String[] args) {
        // playWithPrimitiveArrayV3();
        // playWitAnObject();
        // playWithObjectArray();
        // playWithObjectArrayV2();
        // sortPrimitiveArray();
        // sortObjectArray();
        // sortPrimitiveArrayV2();
        sortObjectArrayV2();
    }

    public static void sortObjectArrayV2() {

        Student arr[] = new Student[2];
        arr[0] = new Student("id1", "Hii1", 2001, 4.0);
        arr[1] = new Student("id2", "Hii2", 2001, 8.0);
        System.out.println("The student list before sorting");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        Student t = arr[0]; // arr[0] cho bọn tao tạo độ Hii1 9, trỏ cùng , backup
        arr[0] = arr[1]; // [1] trỏ Hii2 5.0, ngồi sau trỏ nhỏ
                         // đua nhỏ cho 0
        arr[1] = t; // trỏ vào Hii1 9
        System.out.println("The student list after sorting ascending by gpa");
        for (Student student : arr) {
            student.showProfile();
        }

        // arr[0] = arr[1];
        // System.out.println("The student list after sorting ascending by gpa");
        // for (Student x : arr) {
        // x.showProfile();
        // }

    }

    

    public static void sortPrimitiveArrayV2() {
        int a = 9, b = 8;
        System.out.println("Before sorting: a: " + a + " | b: " + b);
        // nếu có trục trặc thứ tự thì mới đổi
        // trong sắp sếp tăng dần, thì thằng trước phải bé hơn thằng sau
        // nếu đứng trước mà lớn hơn đứng sau, 9 5 | 8 | 4
        // Sure phải đổi value, hoán đổi
        // Chỉ hoán đổi khi có trục trặc, thằng trước lớn hơn thắng sau
        // if thằng trước > thằng sau, đổi ngay và luôn
        if (a > b) { // do ta quy ước a trước b
            int t = a;
            a = b;
            b = t;
        }
            System.out.println("Before sorting: a: " + a + " | b: " + b);


    }

    public static void sortObjectArray() {

        Student arr[] = new Student[2];
        arr[0] = new Student("id1", "Hii1", 2001, 4.0);
        arr[1] = new Student("id2", "Hii2", 2001, 8.0);
        System.out.println("The student list before sorting");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        Student t = arr[0]; // arr[0] cho bọn tao tạo độ Hii1 9, trỏ cùng , backup
        arr[0] = arr[1]; // [1] trỏ Hii2 5.0, ngồi sau trỏ nhỏ
                         // đua nhỏ cho 0
        arr[1] = t; // trỏ vào Hii1 9
        System.out.println("The student list after sorting ascending by gpa");
        for (Student student : arr) {
            student.showProfile();
        }

        // arr[0] = arr[1];
        // System.out.println("The student list after sorting ascending by gpa");
        // for (Student x : arr) {
        // x.showProfile();
        // }

    }

    
    public static void sortPrimitiveArray() {
        int a = 9, b = 5;
        // Quy ước a đứng trước b khi in ra kết quả
        System.out.println("Before sorting: a: " + a + " | b: " + b);
        // tui muốn in giá trị a b tăng dần
        // đổi giá trị cho nhau, là xong
        // a = b; // a lấy giá trị b, đang 5, do đó a đã 5
        // b = a; // b lấy giá trị a, đang 5 luôn rồi (1 giá trị tại 1 thời điểm)
        // đúng ra phỉa là b = a cũ xưa xưa, 9 đó
        // đúng chuẩn phải backup a trước khi a chơi với giá trị mới
        // biến trung gian, tờ giấy nháp ghi lại cái sắp bị quyên 9 trong a
        int t = a; // a 9 cất vào t // gán value của a cho t /// t = 9 Temporary, temp, tmp, t
        a = b; // a lấy 5 của b // gán value của b cho a /// a = 5
        b = t; // b lấy a cũ đang trong t 9 // gán value của t cho b /// b = 9
        System.out.println("Before sorting: a: " + a + " | b: " + b + " t: " + t);

    }

    public static void playWithObjectArrayV2() {

        Student arr[] = new Student[2];
        arr[0] = new Student("id1", "Hii1", 2001, 9.0);
        arr[1] = new Student("id2", "Hii2", 2001, 5.0);
        // in mảng
        System.out.println("The student list before sorting");
        // for (int i = 0; i < 2; i++) {
        // // arr[i].showProfile();
        // System.out.println(arr[i]);// gọi thầm tên em toString();
        // }

        for (Student x : arr) {
            // x = từng phần tử của mảng, tập hợp, vào từng phần tử lấy value
            // với mỗi, duyệt qua toàn bộ mảng
            // x = arr[0]; x = arr[1]; a= arr[i] cho tao cùng nhìn cái coi
            // arr[i].showPf() ~~~~ x.showProfile();
            // 2 chàng 1 nàng
            System.out.println(x); // gọi thầm tên em

        }

        // tui muốn in mảng tăng dần ascending về điểm, về lí Hii1 | 5.0 | Hii2 | 5.0
        // arr[0] đang trỏ sai mày đầu mảng thì pải trỏ new Hii1 5.0
        // arr[1] đang trỏ sai, đang trỏ 5.0 sai rồi, nhìn mảng, pải trỏ new Hii2 9.0
        // cần hoán đổi việc trỏ
        // arr[0] trỏ Hii2 5.0 đang giữ bởi arr[1]
        // arr[1] ơi cho tao arr[0] xin vùng ram Hii2 5.0 đi
        arr[0] = arr[1]; // trỏ Hii2 5.0
        System.out.println(" The student list after sorting ascending by gpa");
        for (Student x : arr) {
            x.showProfile();
        }

    }

    public static void playWithObjectArray() {
        // Tui muốn lưu hồ sô 50 sinh viên
        // Tui cần chuẩn bị những gì ? 2 thứ
        // 50 biến/ tên tắt,
        // 50 value - 50 vùng new
        int a1, a2, a3, a4, a5, a6; // .....50 số
        a1 = 5; // value 5
        int arr[] = new int[50];// 50 biến heng, éo có, chưa có value nha
        Student s1, s2, s3, s4, s5, s6, s7, s8, s9, s10; // .....
        // s1 = new Student(null, null, a5, a6);

        // 50 biến cái đã, mảng các biến SV
        Student[] s = new Student[3]; // 13 biến sv, chưa có object thực, value
                                      // s[0], s[1], s[2] ~~~~~
                                      // s1 s2 s3 ở khai báo lẻ

        s[0] = new Student("id1", "Hii1", 2001, 9.0);
        s[1] = new Student("id2", "Hii2", 2001, 9.0);
        s[2] = new Student("id3", "Hii3", 2001, 9.0);

        System.out.println("The student list");
        s[0].showProfile();
        s[1].showProfile();
        s[2].showProfile();

        System.out.println(s[0].getName().toUpperCase().toLowerCase().charAt(1));

        System.out.println("-------------------");

        for (int i = 0; i < s.length; i++) {
            s[i].showProfile();
        }

        // Biến SV còn lại từ s[3] ....s[12] giá trị default gì ???
        // DEFAULT NULL hạ cánh đáy ram
        // Nguyên tắc chơi với mảng Object cấm tuyệt đối FOR hết nếu mảng chưa
        // Gán Full vì phần còn lại trỏ đáy ram mặc định, địa chỉ 0 mặc định
        // Phần gán rồi gán vào new clone thì chạy bth
        // Mảng Object bắt buộc pải for đến count là số phần tử đã gán
        // Mảng primitive default 0, boolean, value int bth
        // Đáy ram của [i]. showPf() có value gì mà show, toàn 0 hà

        // s.length chấm xổ ra gì
        // s[0]. xổ ra gì info sv, tao là biến object
        // s[0] = 100; tao là biến Student, tao cần vùng new

        // arr.length chấm xổ ra gì
        // arr[0] = 100; // chấm xổ ra gì

    }

    public static void playWitAnObject() {
        // Muốn lưu hồ sơ 1 sv, ta cần 2 thứ: biến, tene tắt, con trỏ, reference
        // vùng new clone đổ phễu
        // muốn lưu 1 giá trị bth, ta cần 2 thứ: biến primitive
        // value đơn
        int a = 100;
        Student x;// em với thầy cùng nói xấy đứa x đi
        // Đã là sv, thì chắc chắn showProfile() công dân thì phải có CCCD
        x = new Student("1", "Nhu Quinh", 2004, 8.9);
        Student s = x;

        // hạ cánh nơi anh - cho con trỏ xuống 1 chỗ cực kì cool
        x = null; // trỏ vùng mới, hạ cánh đáy của ram
                  // gasb địa chỉ 0, con số 0 vào trong biến con trỏ
                  // biến con trỏ lưu tọa độ đáy ram, chứa toàn bộ số 0, byte null
                  // nhà đầu phố (số nhà 0) tối thui, 0 có gì
                  // nhà null
        x.showProfile();

    }

    public static void playWithPrimitiveArrayV3() {
        int a = 10;
        // a chấm xổ cái đầu mày, a là 10 rõ ràng đòi gì nữa
        int a1 = 10, a2 = 11, a3, a4, a5, a6, a7, a8, a9, a10, a11;// lẻ
        System.out.println(a2 + " ");

        int arr1[] = { 5, 10, 15, 20, 25, 30 };// có nhiều biến chung arr
        // cụ thể là arr[0] [1] [2]... // implicit new
        int arr2[] = new int[] { 5, 10, 15, 20, 25, 30 }; // explicit new

        int[] arr3 = { 5, 10, 15, 20, 25, 30 };
        // đưa nhiều value thì phải có nhiều biến tương ứng
        // có nhiều biến lắm luôn và value tương ứng
        int[] arr; // arr là biến má mì, con trỏ, trỏ vùng new cực kì bự hơn C
        arr = new int[30]; // trỏ object chứa rất nhiều biến int khác

        arr[0] = 100;
        // arr[29] = 2;
        System.out.println("The array arr has");
        System.out.println(arr[0] + " ");
        System.out.println(arr[1] + " ");
        for (int x : arr) { // x = arr[0] tao xin value thằng đầu tiên
                            // x = arr[1] tao xin value thằng kế, [i]
            System.out.print(x + " ");
        }
        // arr[0] chấm xổ ra gì??? cái đầu mày, pri xài luôn, chấm gì nó là 100

        System.out.println("");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }

    public static void playWithPrimitiveArrayV2() {
        double arr[] = new double[11]; // ngoặc [] là mảng, xin số biến
                                       // () là gọi phễu của khuôn nhe
        // có new có vùng chà bá lửa, có ram bự chứa đến 365 biến double
        // default là 0
        // arr[0] là 1 biến double, arr[i] biến double, primitive
        // primitive giá trị đơn xài luôn, éo có chấm à nhen
        // double pi = 3.14;
        // pi. chấm cái đầu mày

        arr[0] = 68;
        arr[1] = 79;
        arr[2] = 100;

        // arr[0]. chấm cái đầu mày vì mày là 1 biến double thường thường thoy mày
        // primitive giá trị đơn xài luôn, éo có chấm à nhen

        // Quan trọng: tên mảng bản thân là 1 biến má mì, tú ông, tú bà, con trỏ,
        // reference
        // trỏ vào đầu 1 dãy rất nhiều biến khác
        // nó là biến má mì vì quản lí ở dưới rất nhiều em chân dài trai ngành...
        // hỏi má mì ơi bà có bao nhiêu lính, má mì trả lời rằng tao có 365
        // đây chín là đặc điểm của má mì, quản lí nhiều lính....
        // má mì ơi bà có bao nhiêu lính má mì chấm length

        // arr[0]. đầu mày primitive
        // arr.length okie
        // thứ 2: arr[0]. đc . đc . đc

        // in mảng bth
        System.out.println("The array arr has");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("\n\n");
        for (double x : arr) {
            System.out.print(x + " ");
        }

    }

    public static void playWithPrimitiveArray() {
        // double vol[365]; cấm tuyệt đối trong lệnh khai báo
        // float v[365] = {0, 5, 10, 15, 20, 25, 30};

        double v[] = { 0, 5, 10, 15, 20, 25, 30 }; // mảng 7 phần tử, 7 biến double
        // Có sẵn value v[0] = 0; v[1] = 5; ....
        // STACK // HEAP đó em
        System.out.println("v[0]: " + v[0] + " | v[1] = " + v[1]);
        System.out.printf("Element 0 ne: %f\n", v[0]);
        for (int i = 0; i < v.length; i++) {
            System.out.print(v[i] + " ");
        }

        System.out.println("\n\nThe array v has values of (using for each)");
        for (double x : v) {

            // với mọi biến double x nó sẽ càn quét qua toàn bộ phần tử của mảng
            // x thuộc : tập hợp v, x có quyền bằng phần tử v thứ 1, x = v[0]
            // x = v[1], x = v[2] .... x = v[i]
            // sout(x) ~~~~~~~~~~~~~~~~~ sout(v[i])
            // Phần tử thứ i của mảng double lầ 1 biến double v[i] -> x biến double có gì
            // sai
            System.out.print(x + " ");
        }

        // Toán tập hợp
        // N = {1, 2, 3, 4, 5, 6, 7, 8, 9, ...n};
        // V x e N, tức là x sẽ mấy, có value mấy, vì tập hợp toàn là số
        // x = -5 ko sai, e N kia mà
        // x = 0, x = 1, x = 2, x = 3, x = 4, ...
        // x sure phải là số tự nhiên đã, lấy value trong N
        // V x là integer e N
        // x = N[0], x có thể số tự nhiên đầu tiên
        // x = N[1], x có thể là số tự nhiên kế tiếp
        // chữ với mọi, với mỗi chính là kĩ thuật giúp ta
        // duyệt qua toàn bộ value của 1 tập hợp, rọi đèn pin
        // từ trái sang phải, lôi
    }

}
