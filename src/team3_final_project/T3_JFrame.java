package team3_final_project;

import java.awt.event.*;
import javax.swing.*;

public class T3_JFrame extends JFrame implements ActionListener
{
    StartScreen startUp;
    InstructionsPanel instr;
    GamePanel game;
            
    JButton bInstr;
    JButton bStart; 
    JButton bDevs;
    JButton bMain;

    
    public T3_JFrame()
    {
        super("Team 3 - Final Project");

        startUp = new StartScreen();
        add(startUp, "Center");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(800, 800);
        setVisible(true);
        setResizable(false);
        
        bInstr = startUp.bInstruction;
        bInstr.addActionListener(this);
        bStart = startUp.bPlay;
        bStart.addActionListener(this);
        bDevs = startUp.bDevs;
        bDevs.addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e)
    {
        Object obj = e.getSource();
        if(obj == bInstr)
        {
            startUp.setVisible(false);
            instr = new InstructionsPanel();
            add(instr, "Center");
            setDefaultCloseOperation(EXIT_ON_CLOSE);
            setSize(800,800);
            setVisible(true);
            setResizable(false);
            bMain = instr.back;
            bMain.addActionListener(this);
        }
        if(obj == bMain)
        {
            instr.setVisible(false);
            startUp.setVisible(true);
        }
        
    }
}
