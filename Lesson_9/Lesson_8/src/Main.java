public class Main {
    public static void main(String[] args) {
        // Тестируем MyArrayList
        System.out.println("Testing MyArrayList:");
        MyArrayList<Human> arrayList = new MyArrayList<>();
        arrayList.add(new Human("Иван", 25));
        arrayList.add(new Human("Мария", 30));
        arrayList.add(new Human("Петр", 35));
        
        System.out.println("Initial ArrayList: " + arrayList);
        System.out.println("Size: " + arrayList.size());
        System.out.println("Element at index 1: " + arrayList.get(1));
        
        arrayList.removeAt(1);
        System.out.println("After removing at index 1: " + arrayList);
        
        arrayList.remove(new Human("Иван", 25));
        System.out.println("After removing Иван: " + arrayList);

        // Тестируем MyLinkedList
        System.out.println("\nTesting MyLinkedList:");
        MyLinkedList<Human> linkedList = new MyLinkedList<>();
        linkedList.add(new Human("Анна", 28));
        linkedList.add(new Human("Сергей", 33));
        linkedList.add(new Human("Елена", 29));
        
        System.out.println("Initial LinkedList: " + linkedList);
        System.out.println("Size: " + linkedList.size());
        System.out.println("Element at index 1: " + linkedList.get(1));
        
        linkedList.removeAt(1);
        System.out.println("After removing at index 1: " + linkedList);
        
        linkedList.remove(new Human("Анна", 28));
        System.out.println("After removing Анна: " + linkedList);
    }
}
