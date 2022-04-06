package Labs.Lab07.Ex2BoxShape;

public abstract class SolidOfRevolution extends Shape {
    protected double radius;

    public double getRadius() {
        return radius;
    }

    public SolidOfRevolution(double volume, double radius) {
        super(volume);
        this.radius = radius;
    }
}
