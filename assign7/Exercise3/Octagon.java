package Exercise3;

public class Octagon extends SimpleGeometricObject {

    private double side;

    public Octagon() {
    }

    public Octagon(double newSide) {
        side = newSide;
    }

    public Octagon(double newSide, String newColor, boolean newFilled) {
        side = newSide;
        super.setColor(newColor);
        super.setFilled(newFilled);
    }

    public double getSide() {
        return side;
    }

    public void setSide(double newSide) {
        side = newSide;
    }

    public double getArea() {
        return 2 * Math.pow(side, 2) * (1 + Math.sqrt(2));
    }

    public double getPerimeter() {
        return 8 * side;
    }

    public String toString() {
        return super.toString() + "\nside: " + side + "\narea: " + getArea();
    }
}
