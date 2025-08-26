package Java.bai003;

import java.util.ArrayList;
import java.util.List;

public class ArrayListt {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add(0, "duythanh");
        list.add(1, "duythanh1");
        list.add(2, "duythanh2");

        for (String s : list) {
            System.out.println(s);
        }

        // System.out.println("--------------");
        // System.out.println("Sau khi remove");
        // list.remove("duythanh");
        // for(String s : list){
        // System.out.println(s);
        // }

        System.out.println("--------------");
        System.out.println("Get Set");
        String s1 = list.get(1);
        System.out.println(s1);

        String s2 = list.set(0, "duythanh");
        System.out.println(s2);

        if(list.size() > 0){
            System.out.println("Not empty");
        }

         if(list.isEmpty()){
            System.out.println("Is empty");
        }

        list.clear();
        System.out.println("After clearn");
        if (list.isEmpty()) {
            System.out.println("empty");
        }

        List<String> list2 = new ArrayList<>();
        list2.add("1");
        list2.add("8");
        list2.add("3");
        list2.add("4");
        list2.add("3");
        list2.add("2");

        list.addAll(list2);
        System.out.println("After addAll List");
        for(String s : list){
            System.out.println(s);
        }

        System.out.println("1 = " + list.indexOf("1"));

        list.sort(String::compareTo);

        System.out.println(list);

        List<String> list3 = list.subList(1, 4);
        System.out.println(list3);
    }

}
