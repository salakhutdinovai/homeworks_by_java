package cars;

/**
 * Lesson_2
 *
 * @author Marsel Sidikov (AIT TR)
 */
public class Car {

    // fields
    private int mileage; // сколько пробег

    private double fuel; // запас топлива

    // constructors
    public Car(int mileage, double fuel) {
        setMileage(mileage);
        this.fuel = fuel;
    }

    public Car(int mileage) {
        setMileage(mileage);
        this.fuel = 0.0;
    }

    public Car(double fuel) {
        this.fuel = fuel;
        this.mileage = 0;
    }

    public Car() {

    }


    // methods
    public void go(int km) {
        this.mileage = this.mileage + km;
    }

    // геттер, метод для получения значения поля
    public int getMileage() {
        return mileage;
    }

    // сеттер, метод для того, чтобы внести значение в поле
    public void setMileage(int mileage) {
        if (mileage >= 0) {
            this.mileage = mileage;
        } else {
            System.err.println("Пробег не может быть меньше 0");
        }
    }
}
