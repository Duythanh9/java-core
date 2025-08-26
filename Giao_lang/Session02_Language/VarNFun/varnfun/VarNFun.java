package Giao_lang.Session02_Language.VarNFun.varnfun;

import java.util.Scanner; // ~~ #include <stdio.io>

public class VarNFun {
    public static void main(String[] args) {
        // exercise start
        boolean result = isPrime(0);
        System.out.println("0? " + result);
        System.out.println("10? " + isPrime(10));
        System.out.println("11? " + isPrime(11));
        System.out.println("17? " + isPrime(17));

        printPrimeList();
        // end

        // testMathFunctions();

        // int x = getAnInteger();
        // System.out.println("x from keyboard: " + x);

        // // tui sẽ in từ 1 ...x nè
        // printIntegerList(x); // pass by value, tham trị, tao chỉ lấy value có trong
        // X thảy xuống hàm gốc ở dưới, đưa 79 giả bộ nhập cho x, x thảy cho n hàm
        // n trong hàm là 79

        // inputFromKeyboard();
        // printIntegerList(100); // hard - code, code cứng cái giá trị
        // printIntegerList();
        // playWithBooleans();
        // playWithCharacters();
        // playWithDoubles();
        // playWithIntegers();
        // playWithVariables();
    }

    // Bài tập về nhà Start

    // Viết hàm kiểu tra 1 số có phải nguyên tố hay không
    // n là nguyên tố: 1 2, 3, 4 .... n - 1 n
    public static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        if (n == 2) {
            return true;
            // nếu CPU chạy đến lệnh phía dưới câu ghi chú, sure, n > 2
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true; // đi hết cả for mà không chịu chia hết cho ai cả
                     // sure mày nguyên tố
    }

    // In các số nguyên tố từ 1 > 1000 - result hàm check nguyên tố()
    public static void printPrimeList() {
        System.out.println("The list of prime numbers from 1 ...1000");
        for (int i = 0; i <= 1000; i++) {
            if (isPrime(i)) { // viết tắt == true
                System.out.printf(i + " ");
            }
        }
        // if (cái gì đúng, mệnh đề đúng, true) thì làm gì
    }

    // End

    public static void testMathFunctions() {
        // sqrt(4)
        double result = Math.sqrt(25);
        System.out.println("Result: " + result);
        System.out.println("Result: " + Math.sqrt(2));
    }

    public static int getAnInteger() {
        int n; // C gán rác, on-off hiện nay của ram

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input a positive integer: ");
        n = scanner.nextInt();

        return n;
    }

    //
    public static void inputFromKeyboard() {
        int yob; // C gán rác, on-off hiện nay của ram

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input your year of birth: ");
        yob = scanner.nextInt();
        System.out.println("yob: " + yob);
    }

    // Các loại hàm khác bắt đầu
    // Tui muốn in các số tự nhiên từ 1 -> n
    // Hiện tượng trong 1 class bất kì mà có 2 hàm trùng tên nhau
    // Nhưng khác phần tham số truyền vào, khác trên data type, ko quan tâm tên biến
    // Hiện tượng này được gọi là OVERLOAD/ OVERLOADING, quá tải hàm
    // 1 đám giống nhau ở cùng 2 chỗ - quá tải -
    public static void printIntegerList(int n) {
        // Chỉ có thằng ngáo mới scanf(&n) here, coi như đã có đầu vào trái cây
        System.out.println("The list of " + n + " first integers");
        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }
        System.out.println("");
    }

    // In ra các số nguyên từ 1 > 100
    public static void printIntegerList() {
        System.out.println("The list of 100 first integers: ");
        for (int i = 0; i <= 100; i++)
            System.out.print(i + " ");

    }

    // Một biểu thức so sánh, một mệnh đề, câu phát biểu sẽ rơi vào 2 trạng thái
    // đúng - sai
    // C: đúng quy ước là 1 > 0, sai quy ước là 0 -> int
    // Java: đúng là true, sai là false -> boolean (1 bit, 1 byte)
    public static void playWithBooleans() {
        boolean marriedStatus = false;
        if (marriedStatus == true)
            System.out.println("Danh dong co gi vui");
        else
            System.out.println("Vuon hong co loi nhung chua ai vao");

        System.out.println("Luon co hy vong");
    }

    // Java kiểu char dùng 2 byte, cài '' kí hiệu 1 kí tự đơn
    public static void playWithCharacters() {
        char unit = '$';
        System.out.println("unit: " + unit);

        // Lưu tên, lưu 1 câu văn, đoạn văn, chuỗi, gồm nhiều kí tự ghép lại
        // C: char name[] = "Ahii do ngok";
        // Xử lí trên chuỗi là phải xài hàm, tên mảng ko phải là primitive

        // Java cung cấp 1 kiểu data type mới hoàn toàn, dùng để lưu trữ chuỗi
        // String chữ hoa à nhen, nó dùng để lưu trữ, tên cho gọi cho những thứ phức tạp
        // Đống các kí tự ở với nhau, kiểu oject (học sau, dính OOP)
        String name = "Hoang Ngoc Trinh";
        System.out.println("name: " + name);

        System.out.println("1st letter in my name: " + name.charAt(4));
        System.out.println("My name as in a lowercase: " + name.toUpperCase());
    }

    // mặc định Java ưu tiên chơi double hơn là chơi với float
    // Mọi số thực trong code được xem là double
    public static void playWithDoubles() {
        double pi = 3.14; // 8 bytes
        System.out.println("pi: " + pi);
        System.out.printf("pi: %.2f\n", pi); // %lf ko hỗ trợ, xài chung %f

        float vat = 0.1F;
        System.out.printf("vat: %.1f\n", vat);

    }

    // Mọi giá trị/ value xuất hiện trong code, số nào đó, chữ nào đó, chuỗi nào đó
    // 3.14 xh trong code, 0.1 xh trong code, "age" xh trong code
    // được gọi là literal value
    // mọi literal value của số nguyên trong code
    // mọi số nguyên xuất hiện trong code được xem là 4 byte int
    public static void playWithIntegers() {
        int n = 2_100_000_000;
        System.out.println("n: " + n);

        long money = 15_000_000_000L;
        System.out.println("money: " + money);

        int status = 0xFA;
        int phone = 070;

        System.out.println("status: " + status);
        System.out.println("phone: " + phone);
    }

    // Static chỉ chơi với static - học sau
    public static void playWithVariables() {
        // biến là 1 vùng ram được đặt tên/ định danh/identifier dùng để chiếm 1 số byte
        // nhất định tùy hình thái dữ liệu mà nó sẽ chứa, dùng để chứa 1
        // value nào đó
        // hình thái dữ liệu được gọi là data type: 2 hình thái: primitive, object
        // int, long, float, double

        // biến là cách đặt tên cho 1 đại lượng, 1 giá trị
        int yob = 2004;
        int a = 79, b;
        b = 39;

        System.out.println("yob: " + yob);

        int age = 2025 - yob;
        System.out.println("age: " + age + " years old");
        System.out.println("age: " + (2025 - yob) + " years old");
        System.out.printf("age: %d\n", age);
    }

}
