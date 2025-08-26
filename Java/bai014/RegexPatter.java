package Java.bai014;

import java.math.BigDecimal;
import java.text.DateFormat;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexPatter {
    public static void main(String[] args) {
        // bai1();
        // bai2();
        // bai3();
        // conversionJava();
        dateJava();
    }

    public static void bai1() {
        // Cách 1
        // Pattern pattern = Pattern.compile("^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$");
        // Matcher matcher = pattern.matcher("saiquasai9@gmail.com");
        // System.out.println(matcher.matches());

        String regex1 = "[amn]";
        System.out.println(Pattern.matches(regex1, "abcn")); // false (not a or a or n)
        System.out.println(Pattern.matches(regex1, "a")); // true (among a or a or n)
        System.out.println(Pattern.matches(regex1, "ammmn")); // false (m and a comes more than once)

        // // Cách 2
        // boolean result = Pattern.compile("Jav.").matcher("Java").matches();
        // System.out.println(result);

        // // Cách 3
        // boolean matches = Pattern.matches("Ja.*", "Java");
        // System.out.println(matches);

    }

    public static void bai2() {
        // Ứng dụng sử dụng
        String[] searchConditions = { "username:Tay", "gender:male", "city:Hanoi", "sort:asc" };
        for (String condition : searchConditions) {
            Pattern pattern = Pattern.compile("(\\w+?)(:)(.*)"); // (\w+?)(:|<|>)(.*)
            Matcher matcher = pattern.matcher(condition);
            if (matcher.find()) {
                System.out.println("condition = " + condition);
                if (matcher.group(1).equalsIgnoreCase("sort")) {
                    System.out.println("sort by " + matcher.group(3).toUpperCase());
                }
            }
        }
    }

    public static void bai3() {

        String regex = "\\s+";
        boolean matches = Pattern.matches(regex, "\n");
        System.out.println(matches);
    }

    public static void conversionJava() {
        String i = "1";
        String f = "1.2";
        String d = "2.3";
        String b = "5678678.6557567567568"; //

        int x = Integer.parseInt(i);
        System.out.println(x);

        float f1 = Float.parseFloat(f);
        System.out.println(f1);

        double d1 = Double.parseDouble(d);
        System.out.println(d1);

        BigDecimal bx = new BigDecimal(b);
        System.out.println(bx);

    }

    public static void dateJava() {
        Date currentDate = new Date();
        System.out.println("Current Date:" + currentDate);
        System.out.println("-------");

        String dateToStr = DateFormat.getInstance().format(currentDate);
        System.out.println("DateFormat.getInstance(): " + dateToStr);
        System.out.println("-------");

        dateToStr = DateFormat.getTimeInstance().format(currentDate);
        System.out.println("DateFormat.getTimeInstance(): " + dateToStr);

        System.out.println("-------");
        dateToStr = DateFormat.getDateInstance().format(currentDate);
        System.out.println("DateFormat.getDateInstance(): " + dateToStr);

        System.out.println("-------");
        dateToStr = DateFormat.getDateTimeInstance().format(currentDate);
        System.out.println("DateFormat.getDateTimeInstance(): " + dateToStr);

        System.out.println("-------");
        dateToStr = DateFormat.getTimeInstance().format(currentDate);
        System.out.println("DateFormat.getTimeInstance(): " + dateToStr);

        System.out.println("-------");
        dateToStr = DateFormat.getTimeInstance(DateFormat.SHORT).format(currentDate);
        System.out.println("DateFormat.getTimeInstance(DateFormat.SHORT): " + dateToStr);

        System.out.println("-------");
        dateToStr = DateFormat.getTimeInstance(DateFormat.MEDIUM).format(currentDate);
        System.out.println("DateFormat.getTimeInstance(DateFormat.MEDIUM): " + dateToStr);
    }
}
