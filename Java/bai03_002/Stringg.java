package Java.bai03_002;

import javax.print.DocFlavor.STRING;

public class Stringg {
    public static void main(String[] args) {
        String s1 = "Welcome to Tay java";
        String s7 = new String("Welcome to Tay java");
        // char charAt(int index): Trả về giá trị char cho index cụ thể
        System.out.println(s1.charAt(3));

        // int length() trả về độ dài của String
        System.out.println(s1.length());

        // format(String format, Object... args) Trả về một String đã được định dạng

        // Welcome to Tay java, I am 18 years old
        // String s2 = s1 + ", I am 18 years old";
        String s2 = s1 + ", I am 18 year old";
        System.out.println(s2);

        String name = "Messi";
        int age = 37;
        String s3 = String.format("Hello, my name is %s, I am %d years old", name, age);
        System.out.println(s3);

        // String substring(int beginIndex) Trả về substring từ vị trí index cho trước
        String substring = s3.substring(1, 5);
        String substring1 = s3.substring(6);
        System.out.println(substring);
        System.out.println(substring1);

        // constains(CharSequence s) Nó trả về giá trị đúng hoặc sai sau khi khớp với
        // string giá trị char
        if (s3.contains("Hello")) {
            System.out.println("Hello, Messi");
        } else {
            System.out.println("GoodBye, Messi");
        }

        // String join(CharSequence delimiter, CharSequence... element)
        String s4 = String.join("-", "A", "B", "C", "D", "E", "F");
        System.out.println(s4);

        // equals
        if (s1.equals(s7)) {
            System.out.println("Hello Tay Java");
        } else {
            System.out.println("Goodbye Tay Java");
        }

        // So sánh không phân biệt hoa thường
        String f = "Hello";
        String ss = "hello";
        if (f.equalsIgnoreCase(ss)) {
            System.out.println("Giong nhau");
        } else {
            System.out.println("Khac nhau");
        }

        // isEmpty() Kiểm tra string có bị rỗng không (null hoặc blank) không ?
        String email = "";
        if (email.isEmpty()) {
            System.out.println("Email is empty");
        } else {
            System.out.println("email is " + email);
        }

        // strimg() loại bỏ khoảng trắng ở đầu và cuối ký tự
        String email1 = " a ";
        System.out.println(email1);
        if (email1.trim().isEmpty()) {
            System.out.println("Email is empty");
        } else {
            System.out.println(email1.trim());
        }

        // concat
        String k1 = "Hello";
        String k2 = " Duy Thanh";
        String k3 = k1.concat(k2);
        System.out.println(k3);

        // String replace(char old, char new) Thay thế tất cả các lần xuất hiện của giá
        // trị char được chỉ định
        String b1 = k3.replace("Duy Thanh", "sadich");
        String b2 = k3.replace("l", " @");

        System.out.println(b1);
        System.out.println(b2);

        // String[] split(String regex) Trả về một String phân tách khớp với regex
        String[] split = b1.split(" ");
        for (int i = 0; i < split.length; i++) {
            System.out.println(split[i]);
        }

        // String intern() Trả về một string đã được đồng bộ trong String constant
        // pool(Chuỗi không đổi)
        System.out.println("-------------------------> inter");
        String intern = s1.intern();
        System.out.println(intern);

        // int indexOf(int ch) Trả về giá trị char được chỉ định
        System.out.println("------------->indexOf");
        System.out.println(intern.indexOf("t"));

        // String toLowerCase() Trả về một string thường
        System.out.println(intern.toUpperCase());
        System.out.println(intern.toLowerCase());

        // valueOf(int value) Chuyển đổi kiểu từ dữ liệu đã cho thành strinh.
        // Đây là overloading method
        float pi = 3.1415925f;
        String i = String.valueOf(pi);
        System.out.println(i);
        String l1 = i.replace("3", "1");
        System.out.println(l1);

        // non-synchronize
        StringBuilder builder = new StringBuilder("Hic");
        builder.append(", ");
        builder.append("Thanh");
        System.out.println(builder.toString());

        // synchronize
        StringBuffer buffer = new StringBuffer("Hic");
        buffer.append(", ");
        buffer.append("Thanh");
        System.out.println(buffer.toString());

    }
}
