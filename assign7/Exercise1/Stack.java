package Exercise1;
import java.util.ArrayList;

public class Stack {
    private ArrayList<Object> stack = new ArrayList<Object>();

    public void push(Object o) {
        stack.add(o);
    }

    public Object pop() {
        Object o = stack.get(stack.size() - 1);
        stack.remove(stack.size() - 1);
        return o; 
    }

    public Object peak() {
        return stack.get(stack.size() - 1);
    }

    public String print() {
        return stack.toString();
    }
}
