package Giao_lang.Session03_Class.StudentManagement.data;

public class Student {
    private static String id;
    public static String name;// ___
    
    public int yob; // __
    private double gpa; // grade point average__

    public Student(String id, String name, int yob, double gpa) {
        this.id = id;
        this.name = name;
        this.yob = yob;
        this.gpa = gpa;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYob() {
        return yob;
    }

    public void setYob(int yob) {
        this.yob = yob;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return String.format("|%8s|%-25s|%4d|%4.1f|", id, name, yob, gpa);
    }

    // gáy điểm
    public void showProfile() {
        System.out.printf("|%8s|%-25s|%4d|%4.1f|\n", id, name, yob, gpa);
        System.out.println("By the way, my yob is" + yob);

    }// non - static chơi vơi ai? chơi với non rõ ràng, vì cùng object, chơi name static
    // vì là 1 phần chung được tách ra

    // CHƠI  hàm static xem nào
    public static void sayHi(){
        System.out.println("Hi everyone, my name is " + name);
        // System.out.println("By the way, my yob is" + yob);
        // Éo biết yob nào để in vì clone nhiều yob quá, vì nhiều sv
        // Static chỉ chơi static vì cùng khu vực

    }

}
