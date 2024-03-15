package geometricShapes;

public class Cube extends Square {
    public Cube(int side) {
        super(side);
    }

    @Override
    public double getArea() {
        return Math.pow(side, 3);
    }
}
