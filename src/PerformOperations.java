import java.util.Stack;

public class PerformOperations {
    private Stack<Double> st;

    public PerformOperations(Stack<Double> st) {
        this.st = st;
    }

    public void performOperation(String input) {
        switch (input) {
            case "+":
                add();
                break;
            case "-":
                sub();
                break;
            case "*":
                mul();
                break;
            case "/":
                div();
                break;
            default:
                break;
        }
    }

    public void add() {
        st.push(st.pop() + st.pop());
    }

    public void sub() {
        double num2 = st.pop();
        double num1 = st.pop();
        st.push(num1 - num2); // Corrected the order of subtraction
    }

    public void mul() {
        st.push(st.pop() * st.pop());
    }

    public void div() {
        double num2 = st.pop();
        double num1 = st.pop();
        if (num2 == 0) {
            st.push(num2);
            st.push(num1);
            System.out.println("Division by 0 error!");
            return;
        }
        st.push(num1 / num2);
    }
}
