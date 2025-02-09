package example02.models;

/**
 * Lesson_3
 *
 * @author Marsel Sidikov (AIT TR)
 */
public class Student extends Human {

    private double averageMark;

    public Student(String name, int age, double averageMark) {
        super(name, age);
        this.averageMark = averageMark;
    }

    public void work() {
        System.out.println("Студент " + name + " не будет работать, он учится");
    }
}
