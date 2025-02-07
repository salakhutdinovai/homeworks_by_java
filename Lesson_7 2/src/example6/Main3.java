package example6;

public class Main3 {
    public static void main(String[] args) {
        MyArrayList<String> list = new MyArrayList<>();

        // Добавляем элементы
        list.add("One");
        list.add("Two");
        list.add("Three");
        list.add("Four");
        list.add("Five");

        System.out.println("List after adding elements: " + list);

        // Получаем элемент
        System.out.println("Element at index 2: " + list.get(2));

        // Удаляем элемент
        list.remove(1);
        System.out.println("List after removing element at index 1: " + list);

        // Добавляем больше элементов, чтобы проверить расширение массива
        list.add("Six");
        list.add("Seven");
        list.add("Eight");
        list.add("Nine");
        list.add("Ten");
        list.add("Eleven");

        System.out.println("List after adding more elements: " + list);
        System.out.println("Size of the list: " + list.size());
    }
}
