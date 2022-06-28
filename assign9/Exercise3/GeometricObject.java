package Exercise3;

public abstract class GeometricObject implements Comparable<GeometricObject> {
    private String color;
    private boolean filled;
    private java.util.Date dateCreated = new java.util.Date();    

    public GeometricObject() {
    }

    public GeometricObject(String newColor, boolean newFilled) {
        color = newColor;
        filled = newFilled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String newColor) throws InvalidColorException {
        if (newColor.equals("Red")) {
            throw new InvalidColorException(newColor);
        } else {
            color = newColor;
        }
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean newFilled) {
        filled = newFilled;
    }

    public java.util.Date getDateCreated() {
        return dateCreated;
    }

    public String toString() {
        return "date created: " + dateCreated + "\ncolor: " + color + "\nfilled: " + filled;
    }

    public abstract double getArea();


}
