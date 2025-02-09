package example01;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        MyLinkedList<String> list = new MyLinkedList<>();
        list.add("Hello");
        list.add("World");
        
        // Использование for-each
        for (String item : list) {
            System.out.println(item);
        }
        
        // Или напрямую через итератор
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
