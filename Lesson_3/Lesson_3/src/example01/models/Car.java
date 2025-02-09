package example01.models;

/**
 * Lesson_3
 *
 * @author Marsel Sidikov (AIT TR)
 */
public class Car {
    protected String model;
    private int speed;
    private double fuelAmount;

    public Car(String model, int speed, double fuelAmount) {
        this.model = model;
        this.speed = speed;
        this.fuelAmount = fuelAmount;
    }

    public String getModel() {
        return model;
    }

    public int getSpeed() {
        return speed;
    }

    public double getFuelAmount() {
        return fuelAmount;
    }

    public void go() {
        System.out.println(model + " поехала");
    }
}
