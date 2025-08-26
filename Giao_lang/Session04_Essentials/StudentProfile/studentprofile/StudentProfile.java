package Giao_lang.Session04_Essentials.StudentProfile.studentprofile;

import java.util.Scanner;

import Giao_lang.Session03_Class.StudentManagement.data.Student;

public class StudentProfile {
    public static void main(String[] args) {
        inputProfile();
    }

    // Bài thí nghiệm về việc nhập xuất, làm đơn giản, ko OOP, không class
    public static void inputProfile() {
        // Nhập vào thông tin sv, gồm tên, năm sinh, địa chỉ, và in ra

        String name;
        String address;
        int yob;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input name: ");
        name = scanner.nextLine().toUpperCase();
        System.out.println("Input yob: ");
        //QT Solution
        yob = Integer.parseInt(scanner.nextLine());
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
}
