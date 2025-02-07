import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        // Тестирование ArrayList
        System.out.println("=== ArrayList ===");
        ArrayList<String> arrayList = new ArrayList<>();
        
        // Добавление элементов
        arrayList.add("Первый");
        arrayList.add("Второй");
        arrayList.add("Третий");
        System.out.println("После добавления: " + arrayList);
        
        // Проверка методов
        System.out.println("Размер: " + arrayList.size());
        System.out.println("Пустой?: " + arrayList.isEmpty());
        System.out.println("Содержит 'Второй'?: " + arrayList.contains("Второй"));
        
        // Получение и установка элементов
        System.out.println("Элемент по индексу 1: " + arrayList.get(1));
        arrayList.set(1, "Новый второй");
        System.out.println("После замены: " + arrayList);
        
        // Добавление по индексу
        arrayList.add(1, "Вставленный");
        System.out.println("После вставки: " + arrayList);
        
        // Удаление
        arrayList.remove(0);
        System.out.println("После удаления первого: " + arrayList);
        
        // Индексы
        System.out.println("Индекс 'Новый второй': " + arrayList.indexOf("Новый второй"));
        
        // LinkedList
        System.out.println("\n=== LinkedList ===");
        LinkedList<String> linkedList = new LinkedList<>();
        
        // Специфичные методы LinkedList
        linkedList.addFirst("Первый");
        linkedList.addLast("Последний");
        linkedList.add("Обычный");
        System.out.println("После добавления: " + linkedList);
        
        System.out.println("Первый элемент: " + linkedList.getFirst());
        System.out.println("Последний элемент: " + linkedList.getLast());
        
        linkedList.removeFirst();
        linkedList.removeLast();
        System.out.println("После удаления первого и последнего: " + linkedList);
        
        // Общие методы List
        linkedList.add(0, "Новый первый");
        System.out.println("Размер: " + linkedList.size());
        System.out.println("Содержит 'Обычный'?: " + linkedList.contains("Обычный"));
        System.out.println("Финальный список: " + linkedList);
        
        // Очистка
        linkedList.clear();
        System.out.println("После очистки: " + linkedList);
    }
}
