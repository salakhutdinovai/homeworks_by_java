package example02.models;

/**
 * Lesson_3
 *
 * @author Marsel Sidikov (AIT TR)
 */
public class Programmer extends Human {

    private int salary;

    public Programmer(String name, int age, int salary) {
        super(name, age);
        this.salary = salary;
    }

    public void work() {
        System.out.println("Программист " + name + " уже заработал " + salary + " $");
    }
}
