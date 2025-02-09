package example01.app;

import example01.models.Car;
import example01.models.SportCar;

/**
 * Lesson_3
 *
 * @author Marsel Sidikov (AIT TR)
 */
public class Main2 {
    public static void main(String[] args) {
        Car car;

        SportCar sportCar = new SportCar("Bugatti", 420, 80.0, "V8");

        car = sportCar; // восходящее преобразование

        car.go();
    }
}
