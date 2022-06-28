package Exercise3;

public class Rectangle extends GeometricObject {
    private double width;
    private double height;

    public Rectangle() {
    }

    public Rectangle(double newWidth, double newHeight) {
        width = newWidth;
        height = newHeight;
    }

    public Rectangle(double newWidth, double newHeight, String newColor, boolean newFilled) throws InvalidColorException {
        width = newWidth;
        height = newHeight;
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

    public double getWidth() {
        return width;
    }

    public void setWidth(double newWidth) {
        width = newWidth;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double newHeight) {
        height = newHeight;
    }

    public double getArea() {
        return width * height;
    }

    public double getPerimeter() {
        return width + width + height + height;
    }

    public String toString() {
        return super.toString() + "\nheight: " + height + "\nwidth: " + width + "\narea: " + getArea();
    }
}
