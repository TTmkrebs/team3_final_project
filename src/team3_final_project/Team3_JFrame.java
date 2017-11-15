package team3_final_project;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Team3_JFrame extends JFrame implements ActionListener
{
    //panel types
    MainPanel main;
    InstructionsPanel instr;
    ChoicesPanel choices;
    GameBoard game;
    DevelopersPanel developers;
    ControlPanel control;
    
    //buttons with listeners
    JButton bInstr;
    JButton bGoToGame; 
    JButton bDevs;
    JButton bBackToMain;
    JButton bBeginGame;
    
    //chosen character
    String character;

    
    public Team3_JFrame()
    {
        //setup new frame
        super("Team 3 - Penn State Adventure");

        //add main panel
        main = new MainPanel();
        add(main, "Center");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(800, 700);
        setVisible(true);
        setResizable(false);
        
        //declare additional starting panels
        instr = new InstructionsPanel();
        choices = new ChoicesPanel();
        game = new GameBoard("");
        control = new ControlPanel("");
        developers = new DevelopersPanel();
        
        //assign instructions button and add listener
        bInstr = main.bInstruction;
        bInstr.addActionListener(this);
        //assign go to game button and add listener
        bGoToGame = main.bEnterGame;
        bGoToGame.addActionListener(this);
        //assign developers button and add listener
        bDevs = main.bDevs;
        bDevs.addActionListener(this);
        //assign play game button in choices panel and add listener
        bBeginGame = choices.bPlayGame;
        bBeginGame.addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e)
    {
        Object obj = e.getSource();
        //if instructions button pressed...
        if(obj == bInstr)
        {
            //hide main panel and setup-show instructions panel
            main.setVisible(false);
            instr = new InstructionsPanel();
            add(instr, "Center");
            setDefaultCloseOperation(EXIT_ON_CLOSE);
            setSize(800,700);
            setVisible(true);
            setResizable(false);
            //assign and add listener to back button
            bBackToMain = instr.back;
            bBackToMain.addActionListener(this);
        }
        //if developers button pressed...
        if(obj == bDevs)
        {
            //hide main panel and setup-show developers panel
            main.setVisible(false);
            developers = new DevelopersPanel();
            add(developers, "Center");
            setDefaultCloseOperation(EXIT_ON_CLOSE);
            setSize(800,700);
            setVisible(true);
            setResizable(false);
            //assign and add listener to back button
            bBackToMain = developers.back;
            bBackToMain.addActionListener(this);
        }
        //if go to game button pressed...
        if(obj == bGoToGame)
        {
            //hide main panel and setup-show choices panel
            main.setVisible(false);
            choices = new ChoicesPanel();
            add(choices, "Center");
            setDefaultCloseOperation(EXIT_ON_CLOSE);
            setSize(800,700);
            setVisible(true);
            setResizable(false);
            //assign and add listener to play button
            bBeginGame = choices.bPlayGame;
            bBeginGame.addActionListener(this);
            //assign and add listener to back button
            bBackToMain = choices.back;
            bBackToMain.addActionListener(this);
        }
        //if begin game button pressed...
        if(obj == bBeginGame)
        {
            //hide main & choices panel
            main.setVisible(false);
            choices.setVisible(false);
            
            //read chosen character
            character = choices.character;
            
            //setup control panel
            control = new ControlPanel(character);
            add(control);
            control.setBounds(new Rectangle(0,0,800,50));
            control.setVisible(true);
            bBackToMain = control.back;
            bBackToMain.addActionListener(this);
            
            //setup game panel
            game = new GameBoard(character);
            add(game);
            game.setBounds(new Rectangle(0,50,800,650));
            game.setVisible(true);
            
        }
        //if go to back button pressed...
        if(obj == bBackToMain)
        {
            //hide all panels except main panel
            instr.setVisible(false);
            game.setVisible(false);
            choices.setVisible(false);
            developers.setVisible(false);
            control.setVisible(false);
            main.setVisible(true);
        } 
    }
}
