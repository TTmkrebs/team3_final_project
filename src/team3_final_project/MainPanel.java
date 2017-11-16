package team3_final_project;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MainPanel extends JPanel
{
    /* instructions button */
    JButton bInstruction;
    /* developers button */
    JButton bDevs;
    /* enter game button */
    JButton bEnterGame;
    
    public MainPanel()
    {
        /* setup new panel type */
        super();
        setBackground(Color.gray);
        setLayout(null);
        
        /* create and add game logo */
        ImageIcon gameLogo = new ImageIcon("images/text_graphics/gamelogo.png");
        JLabel gameLogoImage = new JLabel(gameLogo);
        add(gameLogoImage); 
        gameLogoImage.setBounds(130, 50, 550, 350);
        
        /* create and add instructions button */
        bInstruction = new JButton("Instructions");
        add(bInstruction);
        bInstruction.setBounds(new Rectangle(240,625,150,25));
        
        /* create and add developers button */
        bDevs = new JButton("Developers");
        add(bDevs);
        bDevs.setBounds(new Rectangle(410,625,150,25));
        
        /* create and add play game button */
        bEnterGame = new JButton("Go to Game");
        add(bEnterGame);
        bEnterGame.setBounds(new Rectangle(240,550,320,50));        
    }
}
