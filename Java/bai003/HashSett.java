package Java.bai003;

import java.util.HashSet;
import java.util.Set;

public class HashSett {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();

        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("A");
        hashSet.add("B");
        hashSet.add("C");

        for (String s : hashSet) {
            System.out.println(s);
        }
        System.out.println("-----------------------");
        hashSet.remove(hashSet);
        for (String s : hashSet) {
            System.out.println(s);
        }
    }
    int a = 11;

    public static void hi() {
        System.out.println();
    }

}
