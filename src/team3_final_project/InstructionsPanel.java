package team3_final_project;

import java.awt.*;
import javax.swing.*;

public class InstructionsPanel extends JPanel
{
    /* declare bBackMainMenu button to display MainPanel */
    JButton bBackMainMenu;
    /* create goToGame button */
    JButton goToGame;
    
    public InstructionsPanel()
    {
        /* setup InstructionsPanel */
        super();
        setBackground(Color.lightGray);
        setLayout(new BorderLayout());
        
        /* create and add new testing label */
        JLabel testing = new JLabel("Testing Instructions Panel",SwingConstants.CENTER);
        add(testing,BorderLayout.CENTER);
        
        /* create and add bBackMainMenu button */
        bBackMainMenu = new JButton("Main Menu");
        add(bBackMainMenu,BorderLayout.NORTH);
    }
}
