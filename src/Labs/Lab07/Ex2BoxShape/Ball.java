package Labs.Lab07.Ex2BoxShape;

public class Ball extends SolidOfRevolution{
    public Ball(double volume, double radius) {
        super(volume, radius);
    }

    @Override
    public String toString() {
        return "Круг{" +
                "radius=" + radius +
                ", объем=" + volume +
                '}';
    }
}