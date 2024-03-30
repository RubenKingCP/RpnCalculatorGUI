import javax.swing.JButton;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CalcButton {
    private String name;
    private JButton button;

    public CalcButton(String name) {
        this.name = name;
        initiateButton();
    }

    private void initiateButton() {
        // Create button
        button = new JButton();

        // Customize Button
        button.setSize(new Dimension(60, 60));
        button.setText(this.name);
        button.setBackground(Color.YELLOW);

         // Add ActionListener
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Display a message when the button is clicked
                System.out.println("Button clicked: " + name);
            }
        });
    }

   

    // Getter method to access the button
    public JButton getButton() {
        return button;
    }
}