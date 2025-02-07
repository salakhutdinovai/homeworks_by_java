import java.util.Scanner;

/**
 * Lesson_1
 *
 * @author Marsel Sidikov (AIT TR)
 */
public class Main6 {
    public static void main(String[] args) {

        // определить, какое число больше?
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        if (a > b) {
            System.out.println("Первое число больше, чем второе");
        } else if (a < b) {
            System.out.println("Второе число больше, чем первое");
        } else {
            System.out.println("Они равны");
        }
    }
}
