package Giao_lang.Session04_Essentials.MyToys.sadich_com;

import java.util.Scanner;

// Class này, chứa các đồ chơi chung cho họ MyToys, còn cho các nơi khác
// Vì MyToys ko có ý địn lưu lại cái gì của riêng nó, ta chơi toàn là static
// hàm ý 1 vùng ram: thường nó sẽ là những hàm trả về giá trị, không cần nhớ riêng data làm gì
//Nên nhớ, ngoài đời, tì 1 class có quyền vừa static  vừa non-static, tùy mục đích
// Math. hầu hết static
// String: vừa static vừa non, chấm 2 cách luôn
// String. format() ->
// String name = "HoangNT"; name. -> non à nhen
public class MyToys {

    public static final double PI = 3.1415;
    public static final int MAX_ELEMENTS = 500;
    // Const bên C, biến chỉ được gán giá trị 1 lần duy nhất lúc ban đầu
    // Không cho thay đổi về sau

    // hàm nhập số nguyên từ bàn phím, nhập số thực (hàm khác)
    // HCN: 2 cạnh, int: trôi lệnh, cà chớn, nhập lại
    // TG: 3 cạnh, Tròn: BK,
    // Điểm thi: R, L, H,... cột điểm... trôi lệnh cà chớn, nhập lại
    // Menu: nhập vào lựa chọn 1 2 3 4 5 6, gõ Ahihi, gõ 7 (if)
    // Nhập số lặp đi lặp lại ở mọi APP, sao ta không tách hàm nhập số ói về cái số
    // ta cần???
    // Gói n thứ phức tạp vào trong, hứng return only

                                            // tham số câu chửi,
                                            // lower, upper
                                            // 1        6
                                            // 1990     2004
    public static int getAnInteger(String inputMsg) {
        Scanner scanner = new Scanner(System.in);
        int n; // Chứa data từ bàn phím
        // quen thuộc tuần trước
        do {
            try {
                System.out.println(inputMsg);
                n = Integer.parseInt(scanner.nextLine());
                // if kiểm tra ngoài biên here
                return n;// break;
            } catch (Exception e) {
                System.out.println("Do ku know how to input an integer");
            }

        } while (true);// điều gì đúng thì vòng lên đo đi
    }

    public static int getAnInteger() {
        Scanner scanner = new Scanner(System.in);
        int n; // Chứa data từ bàn phím
        // quen thuộc tuần trước
        do {
            try {
                System.out.println("Input an integer: ");
                n = Integer.parseInt(scanner.nextLine());
                return n;// break;
            } catch (Exception e) {
                System.out.println("Do ku know how to input an integer");
            }

        } while (true);// điều gì đúng thì vòng lên đo đi
    }

    
}
