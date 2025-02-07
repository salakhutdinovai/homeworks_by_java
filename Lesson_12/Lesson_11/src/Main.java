public class Main {
    public static void main(String[] args) {
        // Создаем хеш-таблицу для хранения роста людей
        HashTable<String, Integer> heights = new HashTable<>();

        // Добавляем данные
        heights.put("Марсель", 185);
        heights.put("Андрей", 182);
        heights.put("Гузель", 170);
        heights.put("Саша", 180);
        
        // Проверяем работу метода get
        System.out.println("Рост Марселя: " + heights.get("Марсель")); // Должно вывести 185
        System.out.println("Рост Андрея: " + heights.get("Андрей")); // Должно вывести 182
        System.out.println("Рост Гузель: " + heights.get("Гузель")); // Должно вывести 170
        System.out.println("Рост Саши: " + heights.get("Саша")); // Должно вывести 180
        
        // Проверяем несуществующий ключ
        System.out.println("Рост Ивана: " + heights.get("Иван")); // Должно вывести null
        
        // Проверяем обновление значения
        heights.put("Марсель", 186);
        System.out.println("Новый рост Марселя: " + heights.get("Марсель")); // Должно вывести 186
    }
}
