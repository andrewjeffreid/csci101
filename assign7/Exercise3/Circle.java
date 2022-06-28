package Exercise3;

public class Circle extends SimpleGeometricObject {

    double radius = 1.0;

    Circle() {
    }

    Circle(double newRadius) {
        radius = newRadius;
    }

    Circle(double newRadius, String newColor, boolean newFilled) {
        radius = newRadius;
        super.setColor(newColor);
        super.setFilled(newFilled);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double newRadius) {
        radius = newRadius;
    }

    public double getArea() {
        return radius * radius * 3.14159;
    }

    public double getPerimeter() {
        return radius * 2 * 3.14159;
    }

    public double getDiameter() {
        return radius * 2;
    }

    public String toString() {
        return super.toString() + "\nradius: " + radius + "\narea: " + getArea();
    }
}
