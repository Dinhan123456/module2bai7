package Bai2;

import ProJect.Circle;

public class Main {
    public static void main(String[] args) {
        Object[] shapes = new Object[3];
        shapes[0] = new Square(3);
        shapes[1] = "not a shape";
        shapes[2] = new Square(5);
        for (Object obj : shapes) {
            if (obj instanceof Square) {
                Square square = (Square) obj;
                System.out.println(square.toString());

                if (square instanceof Colorsble)
                    ((Colorsble) square).howToColor();
            }
        }
    }
}
