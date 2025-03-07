package core.basesyntax;

public class Square implements Figure {

    private double side;
    private String color;

    public Square(double side, String color) {
        this.side = side;
        this.color = color;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public void draw() {
        System.out.println("Square [Color: " + color
                + "\nSide: " + side + ", Area: " + getArea() + "]");
    }
}
