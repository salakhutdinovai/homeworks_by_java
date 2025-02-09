import java.util.Random;

/**
 * Lesson_2
 *
 * @author Marsel Sidikov (AIT TR)
 */
public class Main {
    public static void main(String[] args) {
        // Создаем массив из 100 человек
        Person[] people = new Person[100];
        Random random = new Random();
        
        // Заполняем массив
        for (int i = 0; i < people.length; i++) {
            String name = "user" + (i + 1);
            int age = random.nextInt(80) + 1; // Возраст от 1 до 80
            people[i] = new Person(name, age);
        }

        // Создаем массив для подсчета частоты возрастов (индекс = возраст)
        int[] ageFrequency = new int[81]; // 0-80 лет
        
        // Подсчитываем частоту каждого возраста
        for (Person person : people) {
            ageFrequency[person.getAge()]++;
        }

        // Находим возраст с максимальной частотой
        int mostFrequentAge = 0;
        int maxFrequency = 0;
        
        for (int i = 1; i < ageFrequency.length; i++) {
            if (ageFrequency[i] > maxFrequency) {
                maxFrequency = ageFrequency[i];
                mostFrequentAge = i;
            }
        }

        System.out.println("Чаще всего встречается возраст: " + mostFrequentAge + 
                         " (встречается " + maxFrequency + " раз)");
    }
}
