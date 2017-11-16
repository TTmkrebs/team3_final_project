package team3_final_project;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Team3_JFrame extends JFrame implements ActionListener
{
    /* create panels */
    MainPanel main;
    InstructionsPanel instr;
    ChoicesPanel choices;
    GameBoard game;
    DevelopersPanel developers;
    ControlPanel control;
    
    /* create buttons with listeners */
    JButton bInstr;
    JButton bGoToGame; 
    JButton bDevs;
    JButton bBackMainMenu;
    JButton bBeginGame;
    
    /* store value for selected character */
    String character;

    
    public Team3_JFrame()
    {
        /* setup new JFrame */
        super("Team 3 - Penn State Explorer");

        /* add main panel */
        main = new MainPanel();
        add(main, "Center");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(800, 700);
        setVisible(true);
        setResizable(false);
        
        /* create additional starting panels */
        instr = new InstructionsPanel();
        choices = new ChoicesPanel();
        game = new GameBoard("");
        control = new ControlPanel("");
        developers = new DevelopersPanel();
        
        /* assign instructions button and add listener */
        bInstr = main.bInstruction;
        bInstr.addActionListener(this);
        /* assign go to game button and add listener */
        bGoToGame = main.bEnterGame;
        bGoToGame.addActionListener(this);
        /* assign developers button and add listener */
        bDevs = main.bDevs;
        bDevs.addActionListener(this);
        /* assign play game button in choices panel and add listener */
        bBeginGame = choices.bPlayGame;
        bBeginGame.addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e)
    {
        Object obj = e.getSource();
        /* if bInstr button pressed... */
        if(obj == bInstr)
        {
            /* hide main panel */
            main.setVisible(false);
            /* setup and show instructions panel */
            instr = new InstructionsPanel();
            add(instr, "Center");
            setDefaultCloseOperation(EXIT_ON_CLOSE);
            setSize(800,700);
            setVisible(true);
            setResizable(false);
            /* assign and add listener to bBackMainMenu button */
            bBackMainMenu = instr.bBackMainMenu;
            bBackMainMenu.addActionListener(this);
        }
        /* if bDevs button pressed... */
        if(obj == bDevs)
        {
            /* hide main panel */
            main.setVisible(false);
            /* setup and show developers panel */
            developers = new DevelopersPanel();
            add(developers, "Center");
            setDefaultCloseOperation(EXIT_ON_CLOSE);
            setSize(800,700);
            setVisible(true);
            setResizable(false);
            /* assign and add listener to bBackMainMenu button */
            bBackMainMenu = developers.bBackMainMenu;
            bBackMainMenu.addActionListener(this);
        }
        /* if bGoToGame button pressed... */
        if(obj == bGoToGame)
        {
            /* hide main panel */
            main.setVisible(false);
            /* setup and show choices panel */
            choices = new ChoicesPanel();
            add(choices, "Center");
            setDefaultCloseOperation(EXIT_ON_CLOSE);
            setSize(800,700);
            setVisible(true);
            setResizable(false);
            /* assign and add listener to bBeginGame button */
            bBeginGame = choices.bPlayGame;
            bBeginGame.addActionListener(this);
            /* assign and add listener to bBackMainMenu button */
            bBackMainMenu = choices.bBackMainMenu;
            bBackMainMenu.addActionListener(this);
        }
        /* if bBeginGame button pressed... */
        if(obj == bBeginGame)
        {
            /* hide main & choices panel */
            main.setVisible(false);
            choices.setVisible(false);
            
            /* read chosen character */
            character = choices.character;
            
            /* setup ControlPanel */
            control = new ControlPanel(character);
            add(control);
            control.setBounds(new Rectangle(0,0,800,50));
            control.setVisible(true);
            bBackMainMenu = control.bBackMainMenu;
            bBackMainMenu.addActionListener(this);
            
            /* setup GameBoard */
            game = new GameBoard(character);
            add(game);
            game.setBounds(new Rectangle(0,50,800,650));
            game.setVisible(true);
            
        }
        /* if bBackMainMenu button pressed... */
        if(obj == bBackMainMenu)
        {
            /* hide all panels except main panel */
            instr.setVisible(false);
            game.setVisible(false);
            choices.setVisible(false);
            developers.setVisible(false);
            control.setVisible(false);
            main.setVisible(true);
        } 
    }
}
