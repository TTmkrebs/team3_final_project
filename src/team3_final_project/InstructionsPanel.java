package team3_final_project;

import java.awt.*;
import javax.swing.*;

public class InstructionsPanel extends JPanel
{
    /* back button */
    JButton backMainMenu;
    /* go to game button */
    JButton goToGame;
    
    public InstructionsPanel()
    {
        /* setup new panel type */
        super();
        setBackground(Color.lightGray);
        setLayout(new BorderLayout());
        
        /* create and add new label */
        JLabel line1 = new JLabel("Testing Instructions Panel",SwingConstants.CENTER);
        add(line1,BorderLayout.CENTER);
        
        /* create and add backMainMenu button */
        backMainMenu = new JButton("Main Menu");
        add(backMainMenu,BorderLayout.NORTH);
    }
}
