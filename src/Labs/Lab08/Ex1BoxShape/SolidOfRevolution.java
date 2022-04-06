package Labs.Lab08.Ex1BoxShape;

public abstract class SolidOfRevolution implements IShape{
    protected double radius;
    protected double volume;
    public double getRadius() {
        return radius;
    }
    public double getVolume() {
        return volume;
    }
    public SolidOfRevolution(double volume, double radius) {
        this.radius = radius;
        this.volume = volume;
    }
}
