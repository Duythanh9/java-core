package Giao_lang.Session05_Array.StudentManagement.studentmanagement;

import java.util.Scanner;

import Giao_lang.Session04_Essentials.MyToys.sadich_com.MyToys;

public class StudentManagement {
    public static void main(String[] args) {
        // chơi menu:1. Add ...; 2.Print ...; 3. Search...; 4....6. Quit
        // chờ người chơi chọn món 1 2 3 4 5 6 Ahihi -try-catch-do-while MyToys
        // if chọn 1 thì tu.add() 2 thì tu.print() 3 thì ....
        // chưa xỉn chưa về, chưa muốn dừng cuộc chơi, éo cho thoát - do-while/while
        Scanner scanner = new Scanner(System.in);
        int choice; // lưu option lựa chọn menu gõ từ bàn phím
        Shelf tuSE = new Shelf("Pink", "SE");
        do {

            printMenu();

            System.out.println("Input your choice (1...6): ");
            // choice = MyToys.getAnInteger();
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    tuSE.inputStudentList();
                    break;

                case 2:
                    tuSE.printStudentList();
                    break;

                case 3:
                    tuSE.searchAStudent();
                    break;

                case 4:
                    tuSE.updateAStudent();
                    break;

                case 5:

                    break;

                case 6:
                    System.out.println("Bye Bye, see you next time");
                    break;
                default:
                    System.out.println("Please choose 1 to 6, please!!!!");
                    break;
            }

        } while (choice != 6);// còn chưa chọn 6 còn lặp lại
                              // còn đúng thì còn làm

    }

    public static void printMenu() {
        System.out.println("Welcome to FAP - FPT Academic Portal");
        System.out.println("Choose the following functions to play with");
        System.out.println("1. Add a student profile");
        System.out.println("2. Print student list");
        System.out.println("3. Search a student by id");
        System.out.println("4. Update a student profile");
        System.out.println("5. Remove a student"); // Remove hết sức cẩn thận
        // Xóa không hẳn là xóa, mà xóa là ẩn
        // Cất chỗ khác dành nhu cầu thống kê
        // Đánh dấu (Marker/flag/status) éo xóa thật
        System.out.println("6. Quit");
    }

    public static void testTu() {
        Shelf tuSE = new Shelf("Pink", "SE");
        Shelf tuGD = new Shelf("Rainbow", "GD Majob"); // 2 cái tủ độc lập
                                                       // 2 tủ 2 góc phòng
        tuSE.inputStudentList();
        tuSE.inputStudentList();

        tuGD.inputStudentList();

        tuSE.printStudentList();
        tuGD.printStudentList();
    }
}
