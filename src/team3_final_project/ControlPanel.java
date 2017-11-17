package team3_final_project;

import java.awt.*;
import javax.swing.*;

public class ControlPanel extends JPanel
{
    /* create scoreField */
    JTextField scoreField;
    /* create and initialize score variable to store score value */
    int score = 0;
    /* create and initialize character variable to store selected character value */
    String character;
    /* declare bBackMainMenu button */
    JButton bBackMainMenu;
    
    public ControlPanel(String charName)
    {
        super();
        setLayout(null);
        setBackground(Color.black);
        
        character = charName;
        
        /* initialize ControlPanel items */
        scoreField = new JTextField(11);
        scoreField.setEnabled(false);
        scoreField.setText("Score: " + score);
        
        /* create and add new bBackMainMenu button */
        bBackMainMenu = new JButton("Main Menu");
        add(bBackMainMenu);
        bBackMainMenu.setBounds(new Rectangle(300,10,200,25));
        
        /* setup and add control panel items */
        JTextField charDisplay = new JTextField(30);
        charDisplay.setEnabled(false);
        charDisplay.setText("Playing as " + character);
        add(scoreField);
        scoreField.setBounds(new Rectangle(10,10,100,25));
        
        add(charDisplay);
        charDisplay.setBounds(new Rectangle(610,10,175,25));
    }
}
