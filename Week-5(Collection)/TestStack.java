import java.util.Stack;
import java.util.Iterator;

public class TestStack {
    public static void main(String[] args) {
        Stack <String> stack=new Stack<>();
        stack.push("Shekhar");
        stack.push("Ram");
        stack.push("Sai");
        stack.push("Shiv");
        System.out.println("Peek "+stack.peek());
        System.out.println("Pop "+stack.pop());
        System.out.println(stack);
        System.out.println();
        Iterator<String> it=stack.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
