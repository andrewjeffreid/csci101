package Exercise3;

import java.util.ArrayList;

public class GeometricObjects {
    public static void main(String[] args) {

        Circle circle = new Circle(1, "red", true);
        Rectangle rectangle = new Rectangle(1, 2, "green", false);
        Octagon octagon = new Octagon(1, "blue", true);

        ArrayList<SimpleGeometricObject> list = new ArrayList<SimpleGeometricObject>();

        list.add(circle);
        list.add(rectangle);
        list.add(octagon);

        printSorted(list);
        System.out.println("total area of list: " + sumArea(list));

    }

    public static double sumArea(ArrayList<SimpleGeometricObject> list) {

        double sum = 0;

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) instanceof Circle) {
                sum += ((Circle) list.get(i)).getArea();
            } else if (list.get(i) instanceof Rectangle) {
                sum += ((Rectangle) list.get(i)).getArea();
            } else if (list.get(i) instanceof Octagon) {
                sum += ((Octagon) list.get(i)).getArea();
            }
        }

        return sum;
    }

    public static void printSorted(ArrayList<SimpleGeometricObject> list) {

        int min;
        for(int i=0;i<list.size()-1;i++)
        {
            min = i;
            for(int j=i+1;j<list.size();j++)
            {
                if(list.get(j).getArea() < list.get(min).getArea())
                    min = j;
            }
           
            if(i != min)
            {
                SimpleGeometricObject temp = list.remove(min);
                list.add(i,temp);
                temp = list.remove(i+1);
                list.add(temp);
            }
        }
       
        for(int i=0;i<list.size();i++)
        {
            System.out.println(list.get(i).toString());
        }
            
    }
}
