package geometricShapes;

public class Main {
    public static void main(String[] args) {
        Square square = new Square(5);
        System.out.println("Square area: " + square.getArea());
        System.out.println("Square perimeter: " + square.getArea());

        Cube cube = new Cube(5);
        System.out.println("Cube area: " + cube.getArea());
        System.out.println("Cube perimeter: " + cube.getArea());

        System.out.println(cube instanceof Square);
        System.out.println(square instanceof Cube);
    }
}