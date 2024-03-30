import java.util.Stack;

public class StackManager {
    private Stack<Double> stack;
    private String curNumber = "0";
    private PerformOperations oper;

    public StackManager() {
        stack = new Stack<>();
        oper = new PerformOperations(stack);
        stack.push(null);
    }

    public void processInput(String input) {
        // Implement the logic to process input and perform calculations
        System.out.println("Input: " + input);
        switch (input) {
            case "Enter":
                stack.push(Double.parseDouble(curNumber));
                curNumber = "0";
                break;
            case "+":
            case "-":
            case "*":
            case "/":
                if (stack.size() > 2) {
                    oper.performOperation(input);
                } else {
                    System.out.println("Insufficient operands for operation " + input);
                }
                break;
            case "C":
                stack.clear();
                break;
            case "OFF":
                System.exit(0);
            default:
                curNumber += input;
                break;
            }
    }

    public Stack<Double> getStack() {
        return stack;
    }
}