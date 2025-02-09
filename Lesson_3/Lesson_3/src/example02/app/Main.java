package example02.app;

import example02.models.Human;
import example02.models.Programmer;
import example02.models.Sportsmen;
import example02.models.Student;

/**
 * Lesson_3
 *
 * @author Marsel Sidikov (AIT TR)
 */
public class Main {
    public static void main(String[] args) {
        Human human = new Human("Марсель", 30);
        Programmer programmer = new Programmer("Виктор", 26, 2000);
        Sportsmen sportsmen = new Sportsmen("Игорь", 33, 40);
        Student student = new Student("Максим", 19, 4.9);

//        Human h2 = programmer;
//        Human h3 = sportsmen;
//        Human h4 = student;

        Human[] humans = {human, programmer, sportsmen, student};

        for (int i = 0; i < humans.length; i++) {
            humans[i].work();
        }
    }
}
