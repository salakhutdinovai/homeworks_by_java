package example02.models;

/**
 * Lesson_3
 *
 * @author Marsel Sidikov (AIT TR)
 */
public class Sportsmen extends Human {

    private int speed;


    public Sportsmen(String name, int age, int speed) {
        super(name, age);
        this.speed = speed;
    }

    public void work() {
        System.out.println("Спортсмен " + name + " уже убежал с работы со скоростью " + speed);
    }
}
