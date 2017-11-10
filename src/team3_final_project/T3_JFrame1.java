package team3_final_project;

import java.awt.event.*;
import javax.swing.*;

public class T3_JFrame1 extends JFrame implements ActionListener
{
    MainPanel main;
    InstructionsPanel instr;
    ChoicesPanel choices;
    GamePanel game;
//    DevelopersPanel developers;
            
    JButton bInstr;
    JButton bStart; 
    JButton bDevs;
    JButton bBackToMain;
    JButton bGame;

    
    public T3_JFrame1()
    {
        super("Team 3 - Penn State Adventure");

        main = new MainPanel();
        add(main, "Center");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(800, 800);
        setVisible(true);
        setResizable(false);
        
        bInstr = main.bInstruction;
            bInstr.addActionListener(this);
        bStart = main.bEnterGame;
            bStart.addActionListener(this);
        bDevs = main.bDevs;
            bDevs.addActionListener(this);
//        bGame = choices.bPlayGame;
//            bGame.addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e)
    {
        Object obj = e.getSource();
        if(obj == bInstr)
        {
            main.setVisible(false);
            instr = new InstructionsPanel();
            add(instr, "Center");
            setDefaultCloseOperation(EXIT_ON_CLOSE);
            setSize(800,800);
            setVisible(true);
            setResizable(false);
            bBackToMain = instr.back;
                bBackToMain.addActionListener(this);
        }
        
//        if(obj == bStart)
//        {
//            main.setVisible(false);
//            choices = new ChoicesPanel();
//            add(choices, "Center");
//            setDefaultCloseOperation(EXIT_ON_CLOSE);
//            setSize(800,800);
//            setVisible(true);
//            setResizable(false);
//            bBackToMain = choices.back;
//                bBackToMain.addActionListener(this);
//        }
        
        if(obj == bGame)
        {
            main.setVisible(false);
            game = new GamePanel();
            add(game, "Center");
            setDefaultCloseOperation(EXIT_ON_CLOSE);
            setSize(800,800);
            setVisible(true);
            setResizable(false);
            bBackToMain = game.back;
                bBackToMain.addActionListener(this);
        }
        
        if(obj == bBackToMain)
        {
            instr.setVisible(false);
//            choices.setVisible(false);
//            game.setVisible(false);
//            developers.setVisible(false);
            main.setVisible(true);
        }
        
    }
}
