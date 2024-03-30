import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JFrame;

public class Display {
    public JFrame frame;
    
    public Display(){
        //Make jframe
        frame = new JFrame();

        //Customize Frame
        frame.setTitle("Rpn Calc");
        frame.setPreferredSize(new Dimension(500, 600));
        frame.setMinimumSize(new Dimension(500, 600));
        frame.setMaximumSize(new Dimension(500, 600));
        frame.setResizable(false);
        frame.getContentPane().setLayout(new BorderLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //Add button Panel
        frame.getContentPane().add(new CalcButtonPanel().getPanel(), BorderLayout.SOUTH);

        //Add display Panel
        frame.getContentPane().add(new ResultDisplay().getPanel(), BorderLayout.NORTH);

        //Shwo frame
        frame.setVisible(true);
    }
}
