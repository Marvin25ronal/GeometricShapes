package geometricShapes;

public class Circle extends GeometricShape {
    public Circle(double radius) {
        super(radius);
    }
    @Override
    public double getArea() {
        return Math.PI * Math.pow(this.value, 2);
    }

    @Override
    public double getPerimeter() {
        return Math.PI * this.value;
    }
}
