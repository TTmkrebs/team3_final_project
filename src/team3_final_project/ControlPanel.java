package team3_final_project;

import java.awt.*;
import javax.swing.*;

public class ControlPanel extends JPanel
{
    /* Score Field */
    JTextField scoreField;
    /* Score */
    int score = 0;
    /* character */
    String character;
    /* back button */
    JButton back;
    
    public ControlPanel(String charName)
    {
        super();
        setLayout(null);
        setBackground(Color.black);
        
        character = charName;
        
        /* initialize control panel items */
        scoreField = new JTextField(11);
        scoreField.setEnabled(false);
        scoreField.setText("Score: " + score);
        
        back = new JButton("Main Menu");
        
        JTextField charDisplay = new JTextField(30);
        charDisplay.setEnabled(false);
        charDisplay.setText("Playing as " + character);
        
        /* add control panel items */
        add(scoreField);
        scoreField.setBounds(new Rectangle(10,10,100,25));
        add(back);
        back.setBounds(new Rectangle(300,10,200,25));
        add(charDisplay);
        charDisplay.setBounds(new Rectangle(610,10,175,25));
    }
}
