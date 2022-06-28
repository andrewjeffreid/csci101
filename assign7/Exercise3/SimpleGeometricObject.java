package Exercise3;

public class SimpleGeometricObject {
    
    private String color;
    private boolean filled;
    private java.util.Date dateCreated = new java.util.Date();    

    public SimpleGeometricObject() {
    }

    public SimpleGeometricObject(String newColor, boolean newFilled) {
        color = newColor;
        filled = newFilled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String newColor) {
        color = newColor;
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

    public double getArea() {
        return 0;
    }
}

