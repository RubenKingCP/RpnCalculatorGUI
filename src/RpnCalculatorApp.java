import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.*;

public class RpnCalculatorApp {
    public static void main(String[] args) {
        StackManager stackManager = new StackManager();
        CalcButtonPanel panel = new CalcButtonPanel(stackManager);
        Display display = new Display(stackManager);

        //Create frame
        JFrame frame = new JFrame("RPN Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(new BorderLayout());
        frame.setPreferredSize(new Dimension(500, 600));
        frame.setResizable(false);

        //Add keyboard on south
        frame.getContentPane().add(panel.getPanel(), BorderLayout.SOUTH);

        //Add display on calculator
        frame.getContentPane().add(display.getPanel(), BorderLayout.CENTER);
        frame.pack();
        frame.setVisible(true);
    }


}