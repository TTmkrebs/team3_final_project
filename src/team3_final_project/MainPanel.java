package team3_final_project;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MainPanel extends JPanel
{
    JButton bInstruction;
    JButton bDevs;
    JButton bEnterGame;
    
    public MainPanel()
    {
        super();
        setBackground(Color.gray);
        setLayout(null);
        
        bInstruction = new JButton("Instructions");
        add(bInstruction);
        bInstruction.setBounds(new Rectangle(240,625,150,25));
        
        bDevs = new JButton("Developers");
        add(bDevs);
        bDevs.setBounds(new Rectangle(410,625,150,25));
        
        bEnterGame = new JButton("Go to Game");
        add(bEnterGame);
        bEnterGame.setBounds(new Rectangle(240,550,320,50));        
    }
}
