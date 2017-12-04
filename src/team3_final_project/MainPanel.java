package team3_final_project;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MainPanel extends JPanel
{
    /* declare bInstruction button to display InstructionsPanel */
    private JButton bInstruction;
    /* declare bDevs button to display DevelopersPanel */
    private JButton bDevs;
    /* declare bAdvance button to display ChoicesPanel */
    private JButton bChoices;
    
    public MainPanel()
    {
        /* setup MainPanel */
        super();
        setBackground(Color.black);
        setLayout(null);
        
        /* create and add gameLogo image */
        ImageIcon gameLogo = new ImageIcon("images/general/gamelogo.png");
        JLabel gameLogoImage = new JLabel(gameLogo);
        add(gameLogoImage); 
        gameLogoImage.setBounds(130, 50, 550, 350);
        
        /* create and add bInstruction button */
        bInstruction = new JButton("Instructions");
        add(bInstruction);
        bInstruction.setBounds(new Rectangle(240,625,150,25));
        
        /* create and add bDevs button */
        bDevs = new JButton("Developers");
        add(bDevs);
        bDevs.setBounds(new Rectangle(410,625,150,25));
        
        /* create and add bEnterGame button */
        bChoices = new JButton("New Game");
        add(bChoices);
        bChoices.setBounds(new Rectangle(240,550,320,50));
    }
    
    public JButton getChoicesButton()
    {
        return bChoices;
    }
    public JButton getDevelopersButton()
    {
        return bDevs;
    }
    public JButton getInstructionsButton()
    {
        return bInstruction;
    }
}
