package Labs.Lab08.Ex1BoxShape;

public class Ball extends SolidOfRevolution implements IShape {
    public Ball(double volume, double radius) {
        super(volume, radius);
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "Круг{" +
                "radius=" + radius +
                ", объем=" + volume +
                '}';
    }

    @Override
    public void print() {
        System.out.println(this);
    }
}