import javax.swing.*;
import java.awt.*;

public class CalcButtonPanel {
    private JPanel panel;
    private StackManager stackManager;

    public CalcButtonPanel(StackManager stackManager) {
        this.stackManager = stackManager;
        panel = new JPanel(new GridLayout(5, 4));
        panel.setPreferredSize(new Dimension(300, 400));
        addButtons();
    }

    private void addButtons() {
        String[] buttonLabels = {"%", "C", "OFF", "Enter", "/",
                "7", "8", "9", "*", "4", "5", "6", "-", "1", "2", "3", "+",
                ".", "0", "="}; // Add more buttons as needed
        
        for (String label : buttonLabels) {
            panel.add(new CalcButton(label, stackManager).getButton());
        }
    }

    public JPanel getPanel() {
        return panel;
    }
}
