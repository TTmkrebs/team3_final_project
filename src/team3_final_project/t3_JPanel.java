package team3_final_project;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class t3_JPanel extends JPanel implements ActionListener
{
    JButton bInstruction;
    JButton bDevs;
    JButton bPlay;
    
    public t3_JPanel()
    {
        super();
        setBackground(Color.gray);
        setLayout(null);
        
        bInstruction = new JButton("Instructions");
        bInstruction.addActionListener(this);
        add(bInstruction);
        bInstruction.setBounds(new Rectangle(240,625,150,25));
        
        bDevs = new JButton("Developers");
        bDevs.addActionListener(this);
        add(bDevs);
        bDevs.setBounds(new Rectangle(410,625,150,25));
        
        bPlay = new JButton("Start Game");
        bPlay.addActionListener(this);
        add(bPlay);
        bPlay.setBounds(new Rectangle(240,550,320,50));
        
        
    }
    
    @Override
    public void actionPerformed(ActionEvent e)
    {
        Object obj = e.getSource();
        if(obj == bInstruction)
        {
        }
    }
}
