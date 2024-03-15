package geometricShapes;

public class Triangle extends GeometricShape{
    public double getValue2() {
        return value2;
    }

    public void setValue2(double value2) {
        this.value2 = value2;
    }

    private double value2;
     public Triangle(double value, double value2) {
         super(value);
         this.value2 = value2;
     }


    @Override
    public double getArea() {
        return (this.value * this.value2) / 2;
    }

    @Override
    public double getPerimeter() {
      return 2 * this.value + this.value2;
    }
}
