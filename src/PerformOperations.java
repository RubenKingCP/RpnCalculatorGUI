import java.util.Stack;

public class PerformOperations {
    private Stack<Double> st;

    public PerformOperations(Stack<Double> st){
        this.st = st;
    }

    public void performOperation(String input){
        switch(input){
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

    public void add(){
        st.push(st.pop() + st.pop());
    }

    public void sub(){
        st.push(st.pop() - st.pop());
    }

    public void mul(){
        st.push(st.pop() * st.pop());
    }

    public void div(){
        var num1 = st.pop();
        var num2 = st.pop();

        if(num2 == 0){
            st.push(num2);
            st.push(num1);
            System.out.println("Division by 0 error!");
            return;
        }

        st.push(num1 / num2);
    }
}
