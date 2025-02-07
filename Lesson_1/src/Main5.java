import java.util.Scanner;

/**
 * Lesson_1
 *
 * @author Marsel Sidikov (AIT TR)
 */
public class Main5 {
    public static void main(String[] args) {
        // как считывать данные с консоли?

        // создаем объект типа Scanner, и называем его scanner
        Scanner scanner = new Scanner(System.in);

        // как считать целое число?
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        System.out.println(a + b);
    }
}
