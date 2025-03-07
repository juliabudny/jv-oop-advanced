package core.basesyntax;

public class Circle implements Figure {

    private double radius;
    private String color;

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void draw() {
        System.out.println("Circle [Color: " + color
                + ", Radius: " + radius
                + "\n Area: " + getArea() + "]");
    }
}
