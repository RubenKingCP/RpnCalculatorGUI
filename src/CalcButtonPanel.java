import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JPanel;

public class CalcButtonPanel {
    private JPanel buttons;

    public CalcButtonPanel(){
        buttons = new JPanel(new GridLayout(5, 4));
        //Customize Panel
        buttons.setPreferredSize(new Dimension(360, 400));
        initButtons();
    }

    private void initButtons(){
        //First Line
        buttons.add(new CalcButton("%").getButton());
        buttons.add(new CalcButton("C").getButton());
        buttons.add(new CalcButton("ON").getButton());
        buttons.add(new CalcButton("OFF").getButton());

        //Second Line 
        buttons.add(new CalcButton("Res").getButton());
        buttons.add(new CalcButton("SQR").getButton());
        buttons.add(new CalcButton("+/-").getButton());
        buttons.add(new CalcButton("/").getButton());

        //Third line
        buttons.add(new CalcButton("7").getButton());
        buttons.add(new CalcButton("8").getButton());
        buttons.add(new CalcButton("9").getButton());
        buttons.add(new CalcButton("*").getButton());

        //Fourth Line
        buttons.add(new CalcButton("4").getButton());
        buttons.add(new CalcButton("5").getButton());
        buttons.add(new CalcButton("6").getButton());
        buttons.add(new CalcButton("-").getButton());

        //Fifth Line
        buttons.add(new CalcButton("1").getButton());
        buttons.add(new CalcButton("2").getButton());
        buttons.add(new CalcButton("3").getButton());
        buttons.add(new CalcButton("+").getButton());
    }

    public JPanel getPanel(){
        return buttons;
    }
}
