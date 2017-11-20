package team3_final_project;

import java.awt.*;
import javax.swing.*;

public class ControlPanel extends JPanel
{
    /* create and initialize score variable to store score value */
    int score = 0;
    int timer = 0;
    /* declare character variable to store selected character value */
    String character;
    /* declare theme variable to store selected theme value */
    String theme;
    
    /* declare bBackMainMenu button */
    JButton bBackMainMenu;
    
    public ControlPanel(String charName,String inTheme)
    {
        super();
        setLayout(null);
        setBackground(Color.black);
                
        character = charName;
        theme = inTheme;
        
        /* create and add new bBackMainMenu button */
        bBackMainMenu = new JButton("Main Menu");
        add(bBackMainMenu);
        bBackMainMenu.setBounds(new Rectangle(10,10,126,25));

        /* setup and add control panel items */
        JTextField charDisplay = new JTextField(30);
        charDisplay.setEnabled(false);
        charDisplay.setText("Character: " + character);
        charDisplay.setBounds(new Rectangle(147,10,176,25));
        add(charDisplay);
        
        JTextField themeDisplay = new JTextField(30);
        themeDisplay.setEnabled(false);
        themeDisplay.setText("Game Theme: " + theme);
        themeDisplay.setBounds(new Rectangle(333,10,176,25));
        add(themeDisplay);
        
        JTextField timerField = new JTextField(11);
        timerField.setEnabled(false);
        timerField.setText("Timer: " + timer);
        timerField.setBounds(new Rectangle(519,10,126,25));
        add(timerField);
        
        JTextField scoreField = new JTextField(11);
        scoreField.setEnabled(false);
        scoreField.setText("Score: " + score);
        scoreField.setBounds(new Rectangle(655,10,126,25));
        add(scoreField);
        
        
    }
}
