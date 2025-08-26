package Java.bai003;

public interface SampleInterface {

    // declare constant fields
    String name = "Sa Dich";

    // declare methods that abstract
    void getName();

    // default method
    default void printName() {
        System.out.println(name);
    }

}
