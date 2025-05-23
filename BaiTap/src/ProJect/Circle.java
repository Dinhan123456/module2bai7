package ProJect;

public class Circle implements Resizeable{
    private double radius;

    public Circle () {
        this.radius = 1.0;
    }
    public Circle(double radius){
        this.radius = radius;
    }
    public double getArea(){
        return Math.PI * radius * radius;
    }
    public void resize(double percent){
        radius += radius * percent / 100;
    }
    @Override
    public String toString() {
        return "Circle with radius = " + radius + ", area = " + getArea();
    }
}
