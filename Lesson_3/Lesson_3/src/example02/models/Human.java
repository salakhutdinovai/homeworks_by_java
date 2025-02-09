package example02.models;

/**
 * Lesson_3
 *
 * @author Marsel Sidikov (AIT TR)
 */
public class Human {

    protected String name;
    protected int age;

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void work() {
        System.out.println("Человек " + name + " пошел работать");
    }
}
