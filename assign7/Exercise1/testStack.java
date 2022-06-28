package Exercise1;

public class testStack {
    public static void main(String[] args) {
        Stack stack = new Stack();

        // test push (1, 2, and 3)
        System.out.println("Testing push() with 1, 2, and 3: ");
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(stack.print());

        // test pop
        System.out.println("Testing pop(): " + stack.pop());
        System.out.println(stack.print());

        // test peak
        System.out.println("Testing peak(): " + stack.peak());

        // test print
        System.out.println("Testing print(): " + stack.print());
    }
}
