import javax.swing.JTextArea;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import java.awt.BorderLayout;
import java.util.Stack;
import java.awt.Font;

public class Display {
    private JPanel panel;
    private JTextArea textArea;
    private StackManager stackManager;

    public Display(StackManager stackManager) {
        this.stackManager = stackManager;
        panel = new JPanel(new BorderLayout());
        textArea = new JTextArea();
        textArea.setEditable(false);
        textArea.setFont(new Font("Arial", Font.PLAIN, 16));
        JScrollPane scrollPane = new JScrollPane(textArea);
        panel.add(scrollPane, BorderLayout.CENTER);
        updateDisplay();
    }

    public void updateDisplay() {
        Stack<Double> stack = stackManager.getStack();
        StringBuilder sb = new StringBuilder();
        for (Double element : stack) {
            sb.append(element).append("\n");
        }
        textArea.setText(sb.toString());
    }

    public JPanel getPanel() {
        return panel;
    }
}
