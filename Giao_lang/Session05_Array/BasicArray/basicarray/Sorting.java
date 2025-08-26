package Giao_lang.Session05_Array.BasicArray.basicarray;

import java.util.Scanner;

public class Sorting {
    // Một Project có nhiều main(), thì main() tạo ban đầu ứng với F6, đứng ở đâu
    // cũng F6 được, main() default
    // main() còn lại, bắt buộc phải mở lên để chạy nếu muốn chạy, Shift F6
    // ta có thể đổi main() default, ....
    public static void main(String[] args) {
        System.out.println("Ahihi");
        // sortIntegerList();
        // sortIntegerListV2();
        // sortStudentList();
        inputStudentList();
    }

    //Static, hàm, biến, nhưng bản chất là đồ xài chung
    // bài này, hàm INPUTSTUDENTLIST() làm việc gi???
    // nhập dữ liệu sv từ bàn phím, tạo hồ sơ sv
    //                              lưu lại hồ sơ (mảng)
    // hàm này là hàm xử lí data, tức là các hồ sơ sv
    //hồ sơ sv nó là của riêng ai đó, data là của ai??
    // việc nhập hồ sơ là việc của ai???
    // lưu data, nhập hồ sơ phải là việc của object nào đó?? OOP dựa trên object

    // Tư duy OOP là pải tìm ra object chức đặc điểm và hành vi
    //                                        tập hồ sơ sv, nhập, xóa, update, sort

    // ds sv ko phải là của chung: DHFPT, HS, RMIT
    //                              nhập    nhập
    // data sv + nhập xử lí nói chung thuộc về chủ thể/ object

    // nhập ds sv từ bàn phím: mảng sv, Scanner, biến trung gian id, yob...
    // new Student(...) -> gán vào [i] mảng
    // mảng [bao nhiêu sv thì vừa]
    // nhiều cách tiếp cận:
    // [fix kích thước 500]
    // [hỏi muốn bao nhiêu thì nhập vào]
    // for để nhập đến ... bạn muốn
    // loại "mảng" đặc biệt, ko yêu cầu khai báo bao nhiêu con trỏ/biến/ phần tử
    // mày cứ new Student() thảy vào "mảng", thảy con trỏ tao cất giữ
    // nhiêu con trỏ tao nhận hết, bắt đầu từ số 0 - mảng rỗng rồi đầy từ từ
    // mảng co giãn - COLLECTIONS FRAMEWORK

    public static void inputStudentList() {
        Scanner sc = new Scanner(System.in);
        int yob, count; // hỏi người dùng muốn nhập bao nhiêu sv
        String id;
        String name;
        double gpa;
        System.out.println("How many students do you want to input? ");
        count = Integer.valueOf(sc.nextLine()); // MyToys.get...()
        Student arr[] = new Student[count];
        for (int i = 0; i < count; i++) {
            System.out.println("Input student profile #" + (i + 1) + "/" + count);
            // lừa đảo số đếm, đời đếm 1, mảng đếm 0
            // #1/5 2/5 3/5 4/5 5/5
            System.out.println("Input id: ");
            id = sc.nextLine();// MyToys chặn rỗng, nhập sai định dạng Regular Expression

            System.out.println("Input name: ");
            name = sc.nextLine();
            // check bắt nhập lại nếu sai
            do {
                try {
                    System.out.println("Input yob: ");
                    yob = Integer.parseInt(sc.nextLine());
                    break;
                } catch (Exception e) {
                    System.out.println("Please input:");
                }

            } while (true);

            System.out.println("Input gpa: ");
            gpa = Double.parseDouble(sc.nextLine()); 

            arr[i] = new Student(id, name, yob, gpa);
        }
        System.out.println("The student list");
        for (Student x : arr) {
            x.showProfile();
        }

    }

    public static void sortStudentList() {
        // Student [] array = new Student[5];
        // array[0] = new Student("SE9", "Chin", 19, 9);
        // array[1] = new Student("SE6", "Sau", 19, 6);
        // array[2] = new Student("SE8", "Tam", 19, 8);
        // array[3] = new Student("SE2", "hai", 19, 2);
        // array[4] = new Student("SE7", "Bay", 19, 7);

        Student[] array = new Student[] {
                new Student("SE9", "Chin", 19, 9),
                new Student("SE6", "Sau", 16, 6),
                new Student("SE8", "Tam", 18, 8),
                new Student("SE2", "hai", 12, 2),
                new Student("SE7", "Bay", 17, 7)
        };
        System.out.println("The student list before sorting");
        for (Student x : array) {
            x.showProfile();
        }

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i].getGpa() < array[j].getGpa()) {
                    Student t = array[i];
                    array[i] = array[j];
                    array[j] = t;
                }
            }
        }

        System.out.println("The student list after sorting ascending by gpa");
        for (int i = 0; i < array.length; i++) {
            array[i].showProfile();

        }
    }

    public static void sortIntegerListV2() {
        int arr[] = new int[] { 1000, -1000, 50, 30, -20, 3, -3000 };

        System.out.println("The array before sorting");
        for (int x : arr) {
            System.out.print(x + " ");
        }

        for (int i = 0; i < arr.length - 1; i++) // For ngoài là for chốt []
            for (int j = i + 1; j < arr.length; j++) // for trong là for quét .. cuối
                if (arr[i] > arr[j]) {
                    int t = arr[i];
                    arr[i] = arr[j];
                    arr[j] = t;
                }

        // System.out.println("The array before sorting");
        // for (int i : arr) {
        // System.out.println(i);
        // }

        System.out.println("\nThe array after sorting");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");

        }

    }

    public static void sortIntegerList() {
        int arr[] = new int[] { 1000, -1000, 50, 30, -20, 3, -3000 };
        // arr[0] [1] [2] [3] [4] . . ..
        // [0] đi so sánh [0] vs [i] còn lại, i = 1...
        // -1000 1000 , 50, 30, -20, 3, 3000
        // [0] ổn ổn
        // -3000 1000 50 30 -20 3 -1000
        // done [1] -> 2 3 4 5 6
        //
        System.out.println("The array before sorting");
        for (int x : arr) {
            System.out.print(x + " ");
        }
        // chốt [0] so với còn lại, so với [1....]
        for (int i = 0; i < arr.length; i++) {
            if (arr[0] > arr[i]) {
                int t = arr[0];
                arr[0] = arr[i];
                arr[i] = t;
            }

        }

        // chốt [1] so với còn lại, so với [2....], nếu ko ổn thì đổi

        for (int i = 2; i < arr.length; i++) {
            if (arr[1] > arr[i]) {
                int t = arr[1];
                arr[1] = arr[i];
                arr[i] = t;
            }

        }

        // tổng quát:
        // chốt [0] quét từ 1 ... cuối đổi
        // chốt [1] quét từ 2...
        // chốt [2] quét từ 3...
        // chốt [3] quét từ 4...
        // chốt [4] quét từ 5..6
        // chốt [5] quét từ 6 end
        // For
        // chốt [6] quét 7 tràn mảng và
        // For ngoài để chốt, for trong để quét

        System.out.println("\nThe array After sorting");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        // quét/rà/duyệt mảng, đi từ đầu đến cuối
        // Chọn thằng nhỏ nhất cho lên đầu, chốt [0] xong
        // chọn thằng nhỏ nhất trong bọn còn lại, cho lên đầu còn lại, chốt [1]
        // ... thu hẹp dần, sau khi loại thằng nhỏ nhất

    }

}
