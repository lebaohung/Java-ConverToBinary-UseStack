import java.util.Stack;

public class Controller {
    private int number;

    public Controller(int number) {
        this.number = number;
    }

    public String change() {
        Stack<Integer> stack = new Stack<Integer>();
        while (number != 0) {
            stack.push(number % 2);
            number /= 2;
        }
        String result = "";
        while (!stack.empty()) {
            result = result + stack.pop() ;
        }
        return result;
    }
}
