package Exercise3;

import java.util.ArrayList;
import java.util.Collections;

public class Test {
    public static void main(String[] args) throws InvalidRadiusException, InvalidColorException {
        Circle circle = new Circle(1, "blue", true);
        Rectangle rectangle = new Rectangle(1, 2, "green", false);
        Octagon octagon = new Octagon(1, "yellow", true);

        ArrayList<GeometricObject> list = new ArrayList<GeometricObject>();

        list.add(circle);
        list.add(rectangle);
        list.add(octagon);

        printSorted(list);
        System.out.println("total area of list: " + sumArea(list));
    }

    public static double sumArea(ArrayList<GeometricObject> list) {
        double sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i).getArea();
        }
        return sum;
    }

    public static void printSorted(ArrayList<GeometricObject> list) {

        Collections.sort(list);

        for(int i=0;i<list.size();i++) {
            System.out.println(list.get(i).toString());
        }

    }
}
