package team3_final_project;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.imageio.*;
import javax.swing.*;

public class Team3_JFrame extends JFrame implements ActionListener, KeyListener
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
    ImageIcon charIcon = new ImageIcon("images/characters/footballplayer.png");
    Image charImage = charIcon.getImage();
    
    /* campus map image and icon */
    ImageIcon map = new ImageIcon("images/general/campus_map_2.png");
    Image mapImage = map.getImage();

    
    public Team3_JFrame() throws IOException
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
        game = new GameBoard(mapImage);
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
            
            JPanel gameFrame = new JPanel();
            gameFrame.setLayout(null);
            add(gameFrame);
            gameFrame.setBounds(new Rectangle(0,50,800,650));
            
            PlayerIcon player = new PlayerIcon(charImage);
            gameFrame.add(player);
            player.setBounds(new Rectangle(100,200,100,120));
            
            game = new GameBoard(mapImage);
            game.addKeyListener(this);
            gameFrame.add(game);
            game.setBounds(new Rectangle(0,100,800,650));
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
    
    @Override
    public void keyPressed(KeyEvent e)
    {
        int i = e.getKeyCode();
    }
    
    @Override
    public void keyReleased(KeyEvent e)
    {
        int i = e.getKeyCode();
    }
    
    @Override
    public void keyTyped(KeyEvent e)
    {
        int i = e.getKeyCode();
    }
}
