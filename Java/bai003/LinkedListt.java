package Java.bai003;

import java.util.LinkedList;

public class LinkedListt {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
    linkedList.add("Hello");
    linkedList.add("Hello1");
    linkedList.add("Hello2");
    linkedList.addFirst("First");
    linkedList.addLast("Last");

    System.out.println(linkedList);
    for(String s : linkedList){
        System.out.println(s);
    }

    // Xóa phần tử đầu và cuối
    System.out.println("Remove Frist and last");
    linkedList.removeFirst();
    linkedList.removeLast();
    // linkedList.removeAll(linkedList);
    for(String s : linkedList){
        System.out.println(s);
    }

    linkedList.add(2, "123");// chèn vào giữa
    System.out.println(linkedList);

    }
}
