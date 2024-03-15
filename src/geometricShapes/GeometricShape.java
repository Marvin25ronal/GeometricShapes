package geometricShapes;

public abstract class GeometricShape {
    protected double value;

    public GeometricShape(double value) {
        this.value = value;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public abstract double getArea();

    public abstract double getPerimeter();
}
