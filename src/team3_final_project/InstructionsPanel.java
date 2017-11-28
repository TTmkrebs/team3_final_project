package team3_final_project;

import java.awt.*;
import javax.swing.*;

public class InstructionsPanel extends JPanel
{
    /* declare bBackMainMenu button to display MainPanel */
    private JButton bBackMainMenu;
    
    public InstructionsPanel()
    {
        /* setup InstructionsPanel */
        super();
        setBackground(Color.GRAY);
        setLayout(new BorderLayout());
        
        /* create and add instructions image */
        ImageIcon instructionsImage = new ImageIcon("images/general/instructionspanel.png");
        JLabel instructions = new JLabel(instructionsImage);
        add(instructions); 
        instructions.setBounds(130, 50, 600, 400);
        
        /* create and add bBackMainMenu button */
        bBackMainMenu = new JButton("Main Menu");
        add(bBackMainMenu,BorderLayout.NORTH);
    }
    
    public JButton getBackButton()
    {
        return bBackMainMenu;
    }
}
