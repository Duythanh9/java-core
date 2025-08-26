package Giao_lang.Live.Session07_Conllections.StudentManagement.data;

// Nhắc đến sv, chỉ cần quan tâm mã số, tên, năm sinh, chuyên ngành, điểm tb
// Chính là ABSTRACTION
// Biểu diễn đc đối tượng này như ngoài đời thực, ta cần Khuôn + đặc điểm + hành vi
// Che giấu show ra khi cần thiết -> ENCAPSULATION, gói trọn trong 1 object
public class Student {
    private String id;
    private String name;
    private int yob;
    private double gpa;

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

    public Student(String id, String name, int yob, double gpa) {
        this.id = id;
        this.name = name;
        this.yob = yob;
        this.gpa = gpa;
    }

    @Override // Ông tổ Object bàn sau, ông tổ môn loài
    public String toString() {
        return "Student [id=" + id + ", name=" + name + ", yob=" + yob + ", gpa=" + gpa + "]";
    }

    public void showProfie() {
        System.out.printf("|STUDENT|%-10s|%-15s|%-4d|%-4.1f|\n", id, name, yob, gpa); 

    }

}
