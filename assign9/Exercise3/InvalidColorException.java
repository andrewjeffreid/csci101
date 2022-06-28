package Exercise3;

public class InvalidColorException extends Exception{

    private String color;

    public InvalidColorException(String color) {
        super("Color can't be Red");
        this.color = color;
    }

    public String getColor() {
        return color;
    }
    
}
