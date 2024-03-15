package geometricShapes;

public class Rectangle  extends GeometricShape{
    private double value2;

    public Rectangle(double value, double value2) {
        super(value);
        this.value2 = value2;
    }

    @Override
    public double getArea() {
        return this.value * this.value2;
    }

    @Override
    public double getPerimeter() {
        return (this.value * 2) + (this.value2 * 2);
    }
}
