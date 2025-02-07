/**
 * Lesson_1
 *
 * @author Marsel Sidikov (AIT TR)
 */
public class Main10 {
    public static void main(String[] args) {
        int a[] = {5, -1, 10, 777, 2}; // явная инициализация массива

        int[] b;

        b = a;

        b[1] = 888;

        System.out.println(a[1]);
    }
}
