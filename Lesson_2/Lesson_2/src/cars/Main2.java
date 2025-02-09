package cars;

/**
 * Lesson_2
 *
 * @author Marsel Sidikov (AIT TR)
 */
public class Main2 {
    public static void main(String[] args) {
        Car polo = new Car(10, 45);
        Car camry = new Car(15, 70);
        Car bmw = new Car(100);
        Car audi = new Car(50.0);

//        polo.mileage = -100;

        polo.setMileage(5);
        polo.setMileage(-100);
        Car lada = new Car();

        polo.go(15);

        System.out.println(polo.getMileage());

        /*
        polo.mileage = 10;
        polo.fuel = 45;

        camry.mileage = 15;
        camry.fuel = 70;
        */
    }
}
