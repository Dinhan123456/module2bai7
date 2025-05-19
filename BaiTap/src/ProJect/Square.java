package ProJect;
public class Square extends Rectangle {

    public Square(double side) {
        super(side, side);
    }

    @Override
    public void resize(double percent) {
        double newSide = getWidth() + getWidth() * percent / 100;
        setWidth(newSide);
        setHeight(newSide);
    }

    public double getSide() {
        return getWidth();
    }

    @Override
    public String toString() {
        return "Square with side = " + getSide() + ", area = " + getArea();
    }

    public void setWidth(double side) {
        super.width = side;
    }

    public void setHeight(double side) {
        super.height = side;
    }

    public double getWidth() {
        return super.width;
    }

    public double getHeight() {
        return super.height;
    }
}
