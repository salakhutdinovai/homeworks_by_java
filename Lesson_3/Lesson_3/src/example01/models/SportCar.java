package example01.models;

/**
 * Lesson_3
 *
 * @author Marsel Sidikov (AIT TR)
 */
public class SportCar extends Car {

    private String engineType;

    public SportCar(String model, int speed, double fuelAmount, String engineType) {
        super(model, speed, fuelAmount); // вызов конструктора класса-предка
        this.engineType = engineType;
    }

    public String getEngineType() {
        return engineType;
    }

    public void go() {
        System.out.println(model + " с типом двигателя " + engineType + " очень быстро поехала!");
    }
}
