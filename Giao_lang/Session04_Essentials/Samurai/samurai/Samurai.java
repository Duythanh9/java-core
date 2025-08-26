package Giao_lang.Session04_Essentials.Samurai.samurai;

import java.util.Scanner;

public class Samurai {
    public static void main(String[] args) {
        // inputProfile();
        inputProfileXinSo();
    }

    // Đẹp trai
    public static void inputProfile() {

        // Nhập vào thông tin sv, gồm tên, năm sinh, địa chỉ, và in ra

        String name;
        String address;
        int yob;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input name: ");
        name = scanner.nextLine().toUpperCase();
        try {
            // lệnh văng miểng nằm ở đây
            System.out.println("Input yob: ");
            yob = Integer.parseInt(scanner.nextLine());
        } catch (Exception e) {
            // e chính là tin nhắn báo lỗi JVM gửi mình lưu ý rằng có cà chớn, ngoại lệ, bất
            // thường
            // nhen, xử lí đi, tao không giết app đâu
            // ngắm phía sau JVM Exception e = new Exception("Câu chửi bới, lưu ý gì đó")
            // Thường ta quan tâm có cà chớn, lúc này ta tự xử lí, JVM ko giết, ko can thiệp

            // C2: default, bắt vòng lên nhập lại
            yob = 69;
        }

        // hàm static, chấm mà xài, éo cần new, éo cần nhớ lại data đã xử lí

        // nextInt() để lại rác trong buffer, ít nhất là enter, cách dư enter
        // xóa bộ đệm trước khi vào chuỗi fflush(standard input stdin)
        // ADP solution, lợi dụng lệnh nextLine() hốt sạch buffer kể cả enter
        // yob = scanner.nextInt();
        // scanner.nextLine();
        System.out.println("Input address: ");
        address = scanner.nextLine().toLowerCase();

        // In ra màn hình
        System.out.println("Your profile");
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Yob: " + yob);
        System.out.println("----end of profile-----");
    }

    public static void inputProfileXinSo() {

        String name;
        String address;
        int yob;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input name: ");
        name = scanner.nextLine().toUpperCase();
        do { // lặp vô tận

            try {
                System.out.println("Input yob: ");
                yob = Integer.parseInt(scanner.nextLine());
                break; // đúng thì thoát lặp
            } catch (Exception e) { // sai thì văng miếng ăn chửi, chửi xong, nhập lại
                // yob = 69;
                System.out.println("Do ku know how to input a positive integer?");
            }
        }while(true);

        System.out.println("Input address: ");
        address = scanner.nextLine().toLowerCase();

        System.out.println("Your profile");
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Yob: " + yob);
        System.out.println("----end of profile-----");
    }

}

// Mặc định Data đưa vào cà chớn, JAVA (JVM - máy ảo java) sẽ giết APP ngay tại
// chỗ cà chớn
// Khi Java phát hiện có cà chớn, nó sẽ gửi cho APP 1 tin nhắn/1 Object thông
// báo bằng Data
// Vớ vẩn, Data bị exception, Data dị quá, bất thường quá, ngoại lệ, số là Ahihi
// kì quá
// Gửi tin nhắn cho APP xong (Màu đỏ EXCEPTION) giết APP luôn

// Nói lại: Nếu người dùng lỡ tay, ko lỡ tay, cũng nên cho cơ hội sửa sai
// Sửa sai thì tức là đừng giết APP khi có cà chớn EXCEPTION
// Chỗ nào có thể có cà chớn??? Chỗ đó có nguy cơ APP bị giết
// Java đừng giết APP, Để em tự lo, Code sẽ cần điều chỉnh nếu có cà chớn
// Xin APP đừng bị giết để em tự xử - SAMURAI

// Ko viết tự do nếu ko bị giết
// Báo JVM đoạn code này có nguy cơ cà chớn, nếu có cà chớn, báo APP biết
// Ko giết APP, để APP xử lí nốt
// Nhốt câu lệnh cà chớn vào trong 1 hộp cát/ SandBox để xứ lí bom mìn nổ trong
// đây cho an toàn
// Nhốt trong cụm try - catch
// try { lện văng miếng nằm here}
// catch (JVM báo hiệu cho biết có cà chớn này, sửa sai đi)
