import javax.swing.JPanel;
import java.awt.GridLayout;
import java.awt.Dimension;

public class CalcButtonPanel {
    private JPanel panel;
    private StackManager stackManager;
    private Display display;

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
            CalcButton button = new CalcButton(label, stackManager);
            button.getButton().addActionListener(e -> {
                stackManager.processInput(label);
                display.updateDisplay();
                System.out.println("Button clicked: " + label);
            });
            panel.add(button.getButton());
        }
    }

    public void setDisplay(Display display) {
        this.display = display;
    }

    public JPanel getPanel() {
        return panel;
    }
}