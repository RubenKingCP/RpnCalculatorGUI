import javax.swing.*;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalcButton {
    private JButton button;
    private String label;

    public CalcButton(String label, StackManager stackManager) {
        //Set variables
        this.label = label;

        //Make button
        button = new JButton(this.label);

        //Customize Button
        button.setPreferredSize(new Dimension(60, 60));
        button.setMaximumSize(new Dimension(60, 60));
        button.setMinimumSize(new Dimension(60, 60));
        button.setBackground(Color.RED);
        button.setForeground(Color.BLACK);

        //Add event listener
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                stackManager.processInput(label);
                if(!stackManager.getStack().isEmpty()){
                    System.out.println("Current top of stack : " + stackManager.getStack().peek());
                } else {
                    System.out.println("Stack is empty");
                }
            }
        });
    }

    public JButton getButton() {
        return button;
    }
}
