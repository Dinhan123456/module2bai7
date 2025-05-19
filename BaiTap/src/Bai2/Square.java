package Bai2;

public class Square implements Colorsble{

    private double side;
    public Square(double side){
        this.side = side;
    }
    public double getArea(){
        return side*side;
    }
    @Override
    public void howToColor(){
        System.out.println("Color all four sides.");
    }
    @Override
    public String toString() {
        return "Square with side = " + side + ", area = " + getArea();
    }
}
