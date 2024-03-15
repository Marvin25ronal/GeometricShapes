package geometricShapes;

public class Square extends GeometricShape{
    protected int side;

    public  Square(int side) {
        super(side);
        this.side = side;
    }

    @Override
    public double getPerimeter() {
        return this.value * 4;
    }

    @Override
    public double getArea(){
        return Math.pow(this.value, 2);
    }
}
