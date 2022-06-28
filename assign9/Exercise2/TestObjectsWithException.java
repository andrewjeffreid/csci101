package Exercise2;

public class TestObjectsWithException {
    public static void main(String[] args) {
        try {
            // circles
            new Circle(-1, "Red", true);
            new Circle(5, "Red", true);
            new Circle(-5, "black", true);

            // rectangles
            new Rectangle(4,5, "Green", true);
            new Rectangle(3,5, "Red", true);
        }
        catch (InvalidRadiusException ex) {
            System.out.println(ex);
        }
        catch (InvalidColorException ex) {
            System.out.println(ex);
        }
    }

}
