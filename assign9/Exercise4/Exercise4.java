import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Exercise4 {
    public static void main(String[] args) throws FileNotFoundException {

        // setup IO
        File file = new File("NameList.txt");
        Scanner input = new Scanner(file.getAbsoluteFile());

            int N = 0;
            int M = 0;
            String temp;

            while (input.hasNext()) {
                temp = input.next();
                if (temp.equals("Bob"))
                    N += 1;
                else if (temp.equals("Alice"))
                    M += 1;
            }
            System.out.println("There are " + N + " Bob and " + M + " Alice in file NameList.txt");
            input.close();

    }
}
