package example01.app;

import example01.models.Car;
import example01.models.SportCar;

/**
 * Lesson_3
 *
 * @author Marsel Sidikov (AIT TR)
 */
public class Main {
    public static void main(String[] args) {
        Car car = new Car("BMW", 100, 50.0);

        car.go();

        SportCar sportCar = new SportCar("Bugatti", 420, 80.0, "V8");

        sportCar.go();
    }
}
