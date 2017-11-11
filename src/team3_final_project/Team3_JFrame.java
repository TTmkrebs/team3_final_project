package team3_final_project;

import java.awt.event.*;
import javax.swing.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Team3_JFrame extends JFrame implements ActionListener
{
    MainPanel main;
    InstructionsPanel instr;
    ChoicesPanel choices;
    GamePanel game;
    DevelopersPanel developers;
            
    JButton bInstr;
    JButton bGoToGame; 
    JButton bDevs;
    JButton bBackToMain;
    JButton bBeginGame;

    
    public Team3_JFrame()
    {
        super("Team 3 - Penn State Adventure");

        main = new MainPanel();
        add(main, "Center");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(800, 700);
        setVisible(true);
        setResizable(false);
        
        instr = new InstructionsPanel();
        choices = new ChoicesPanel();
        game = new GamePanel();
        developers = new DevelopersPanel();
        
        bInstr = main.bInstruction;
        bInstr.addActionListener(this);
        bGoToGame = main.bEnterGame;
        bGoToGame.addActionListener(this);
        bDevs = main.bDevs;
        bDevs.addActionListener(this);
        bBeginGame = choices.bPlayGame;
        bBeginGame.addActionListener(this);
        
        
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
            setSize(800,700);
            setVisible(true);
            setResizable(false);
            bBackToMain = instr.back;
            bBackToMain.addActionListener(this);
        }
        
        if(obj == bDevs)
        {
            main.setVisible(false);
            developers = new DevelopersPanel();
            add(developers, "Center");
            setDefaultCloseOperation(EXIT_ON_CLOSE);
            setSize(800,700);
            setVisible(true);
            setResizable(false);
            bBackToMain = developers.back;
            bBackToMain.addActionListener(this);
        }
        
        if(obj == bGoToGame)
        {
            main.setVisible(false);
            choices = new ChoicesPanel();
            add(choices, "Center");
            setDefaultCloseOperation(EXIT_ON_CLOSE);
            setSize(800,700);
            setVisible(true);
            setResizable(false);
            bBeginGame = choices.bPlayGame;
            bBeginGame.addActionListener(this);
            bBackToMain = choices.back;
            bBackToMain.addActionListener(this);
        }
        
        if(obj == bBeginGame)
        {
            main.setVisible(false);
            choices.setVisible(false);
            game = new GamePanel();
            add(game, "Center");
            setDefaultCloseOperation(EXIT_ON_CLOSE);
            setSize(800,700);
            setVisible(true);
            setResizable(false);
            bBackToMain = game.back;
            bBackToMain.addActionListener(this);
        }
        
        if(obj == bBackToMain)
        {
            instr.setVisible(false);
            game.setVisible(false);
            choices.setVisible(false);
            developers.setVisible(false);
            main.setVisible(true);

        } 
        
    }
}
