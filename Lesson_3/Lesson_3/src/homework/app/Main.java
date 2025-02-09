package homework.app;

import homework.models.*;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = {
            new Circle(5),
            new Square(4),
            new Rectangle(5, 3),
            new Ellipse(6, 4)
        };

        for (Shape shape : shapes) {
            System.out.println("Фигура: " + shape.getClass().getSimpleName());
            System.out.println("Площадь: " + shape.getArea());
            System.out.println("Периметр: " + shape.getPerimeter());
            System.out.println();
        }
    }
} 