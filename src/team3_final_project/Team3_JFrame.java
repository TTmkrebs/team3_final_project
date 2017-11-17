package team3_final_project;

import java.awt.*;
import java.awt.event.*;
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
    
    /* campus map image*/
    ImageIcon map = new ImageIcon("images/general/campus_map_2.png");
    Image mapImage = map.getImage();
    
    /* playerIcon */
    PlayerIcon player;
    int p1X;
    int p1Y;
    
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
              
            /* setup GameBoard */
            game = new GameBoard(mapImage);
            game.setX(0);
            game.setY(100);
            game.addKeyListener(this);
            add(game);
            game.setBounds(new Rectangle(0,50,800,650));
            
            /* setup PlayerIcon */
            p1X = 150;
            p1Y = 150;
            player = new PlayerIcon();
            game.add(player);
            player.setBounds(new Rectangle(p1X,p1Y,50,50));
            
            game.focus();
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
        
        if(i == e.VK_LEFT)
        {
            if(p1X > 0)
            {
                p1X += -1;
                player.setBounds(new Rectangle(p1X,p1Y,50,50));
            }
        }
        if(i == e.VK_RIGHT)
        {
            if(p1X < 750)
            {
                p1X += 1;
                player.setBounds(new Rectangle(p1X,p1Y,50,50));
            }
        }
        if(i == e.VK_UP)
        {
            if(p1Y > 100)
            {
                p1Y += -1;
                player.setBounds(new Rectangle(p1X,p1Y,50,50));
            }
        }
        if(i == e.VK_DOWN)
        {
            if(p1Y < 546)
            {
                p1Y += 1;
                player.setBounds(new Rectangle(p1X,p1Y,50,50));
            }
        }
        
        /* if paw icon is over Shenango, enter campus */
        if(p1X > 7 && p1X < 40 && p1Y > 270 && p1Y < 291)
        {
            String campus  = "Shenango";
        }
        /* if paw icon is over World Campus, enter campus */
        if(p1X > 300 && p1X < 465 && p1Y > 60 && p1Y < 120)
        {
            String campus  = "World Campus";
        }
        /* if paw icon is over Greater Allegheny, enter campus */
        if(p1X > 92 && p1X < 120 && p1Y > 440 && p1Y < 462)
        {
            String campus  = "Greater Allegheny";
        }
        /* if paw icon is over University Park, enter campus */
        if(p1X > 352 && p1X < 381 && p1Y > 346 && p1Y < 369)
        {
            String campus  = "University Park";
        }
        /* if paw icon is over Worthington Scranton, enter campus */
        if(p1X > 672 && p1X < 696 && p1Y > 245 && p1Y < 270)
        {
            String campus  = "Worthington Scranton";
        }
        /* if paw icon is over Shenango, enter campus */
        if(p1X > 670 && p1X < 690 && p1Y > 499 && p1Y < 521)
        {
            String campus  = "Great Valley";
        }
    }
    
    @Override
    public void keyReleased(KeyEvent e){}
    
    @Override
    public void keyTyped(KeyEvent e){}
}
