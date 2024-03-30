import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JPanel;
// import javax.swing.JTextArea;

public class ResultDisplay {
    private JPanel resultDisplay;
    // private JTextArea textArea;

    public ResultDisplay(){
        //Create and customize panel
        resultDisplay = new JPanel();
        resultDisplay.setMaximumSize(new Dimension(420, 140));
        resultDisplay.setMinimumSize(new Dimension(420, 140));
        resultDisplay.setPreferredSize(new Dimension(420, 140));
        resultDisplay.setBackground(Color.RED);
    }

    public JPanel getPanel(){
        return resultDisplay;
    }
}
