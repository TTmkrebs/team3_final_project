package team3_final_project;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class startScreen extends JPanel
{
    JButton bInstruction;
    JButton bDevs;
    JButton bPlay;
    
    public startScreen()
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
        
        bPlay = new JButton("Start Game");
        add(bPlay);
        bPlay.setBounds(new Rectangle(240,550,320,50));        
    }
}
