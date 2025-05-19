package ProJect;

import java.util.Random;

import ProJect.Circle;
import ProJect.Rectangle;
import ProJect.Resizeable;
import ProJect.Square;

public class Main {
    public static void main(String[] args) {
        Resizeable[] shapes = new Resizeable[3];
        shapes[0] = new Circle(5.0);
        shapes[1] = new Rectangle(4.0, 6.0);
        shapes[2] = new Square(3.0);

        Random rand = new Random();

        for (Resizeable shape : shapes) {
            System.out.println("Before resize: " + shape);
            double percent = rand.nextInt(100) + 1;
            shape.resize(percent);
            System.out.println("Resized by " + percent + "%");
            System.out.println("After resize: " + shape);
            System.out.println("------------------------------");
        }
    }
}
