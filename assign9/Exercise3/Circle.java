package Exercise3;

public class Circle extends GeometricObject {
    double radius = 1.0;

    Circle() {
    }

    Circle(double newRadius) throws InvalidRadiusException {
        setRadius(newRadius);
    }

    Circle(double newRadius, String newColor, boolean newFilled) throws InvalidRadiusException, InvalidColorException {
        setRadius(newRadius);
        super.setColor(newColor);
        super.setFilled(newFilled);
    }

    @Override
    public int compareTo(GeometricObject o) {
        if (getArea() > o.getArea()) 
            return 1;
        else if (getArea() < o.getArea())
            return -1;
        else
            return 0;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double newRadius) throws InvalidRadiusException {
        if (newRadius >= 0) {
            radius = newRadius;
        } else {
            throw new InvalidRadiusException(newRadius);
        }
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
