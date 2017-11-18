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
    MapCampusesPanel mapCampuses;
    DevelopersPanel developers;
    ControlPanel control;
    GameFullPanel game;
    CreditsPanel credits;
    
    /* create buttons with listeners */
    JButton bInstr;
    JButton bGoToGame; 
    JButton bDevs;
    JButton bBackMainMenu;
    JButton bBeginGame;
    JButton bBackToMap;
    
    
    /* store value for selected character */
    String character;
    /* store value for selected selectedCampus */
    String selectedCampus;
    ImageIcon charIcon = new ImageIcon("images/characters/footballplayer.png");
    Image charImage = charIcon.getImage();
    
    /* map image on MapCampusesPanel*/
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
        mapCampuses = new MapCampusesPanel(mapImage);
        control = new ControlPanel("");
        developers = new DevelopersPanel();
        credits = new CreditsPanel();
        
        /* assign instructions button and add listener */
        bInstr = main.bInstruction;
        bInstr.addActionListener(this);
        /* assign go to mapCampuses button and add listener */
        bGoToGame = main.bEnterGame;
        bGoToGame.addActionListener(this);
        /* assign developers button and add listener */
        bDevs = main.bDevs;
        bDevs.addActionListener(this);
        /* assign play mapCampuses button in choices panel and add listener */
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
            /* hide main and choices panel */
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
              
            /* setup MapCampusesPanel */
            mapCampuses = new MapCampusesPanel(mapImage);
            mapCampuses.setX(0);
            mapCampuses.setY(100);
            mapCampuses.addKeyListener(this);
            add(mapCampuses);
            mapCampuses.setBounds(new Rectangle(0,50,800,650));
            
            /* setup PlayerIcon */
            p1X = 150;
            p1Y = 150;
            player = new PlayerIcon();
            mapCampuses.add(player);
            player.setBounds(new Rectangle(p1X,p1Y,50,50));
            
            mapCampuses.focus();
            
        }
        /* if bBackMainMenu button pressed... */
        if(obj == bBackMainMenu)
        {
            /* hide all panels except main panel */
            instr.setVisible(false);
            mapCampuses.setVisible(false);
            choices.setVisible(false);
            developers.setVisible(false);
            control.setVisible(false);
            game.setVisible(false);
            main.setVisible(true);
        } 
        
        /* if bBackToMap button pressed... */
        if(obj == bBackToMap)
        {
            /* hide all panels except MapCampuses and Control panel */
            instr.setVisible(false);
            main.setVisible(false);
            choices.setVisible(false);
            developers.setVisible(false);
            game.setVisible(false);
            control.setVisible(true);
            mapCampuses.setVisible(true);
            mapCampuses.focus();
        } 
    }
    
    @Override
    public void keyPressed(KeyEvent e)
    {
        int i = e.getKeyCode();
        
         /* setup GameFullPanel */
        game = new GameFullPanel(selectedCampus);            
        add(game);
        bBackMainMenu = game.bBackMainMenu;
        bBackMainMenu.addActionListener(this);
        bBackToMap = game.backMap;
        bBackToMap.addActionListener(this);
        
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
        
        /* if paw icon is over Shenango, enter selectedCampus */
        if(p1X > 7 && p1X < 40 && p1Y > 270 && p1Y < 291)
        {
            selectedCampus  = "Shenango";
            mapCampuses.setVisible(false);
            control.setVisible(false);
            game.setVisible(true);
        }
        /* if paw icon is over World Campus, enter selectedCampus */
        if(p1X > 300 && p1X < 330 && p1Y > 160 && p1Y < 190)
        {
            selectedCampus  = "World Campus";
            mapCampuses.setVisible(false);
            control.setVisible(false);
            game.setVisible(true);
        }
        /* if paw icon is over Greater Allegheny, enter selectedCampus */
        if(p1X > 92 && p1X < 120 && p1Y > 440 && p1Y < 462)
        {
            selectedCampus  = "Greater Allegheny";
            mapCampuses.setVisible(false);
            control.setVisible(false);
            game.setVisible(true);
        }
        /* if paw icon is over University Park, enter selectedCampus */
        if(p1X > 352 && p1X < 381 && p1Y > 346 && p1Y < 369)
        {
            selectedCampus  = "University Park";
            mapCampuses.setVisible(false);
            control.setVisible(false);
            game.setVisible(true);
        }
        /* if paw icon is over Worthington Scranton, enter selectedCampus */
        if(p1X > 672 && p1X < 696 && p1Y > 245 && p1Y < 270)
        {
            selectedCampus  = "Worthington Scranton";
            mapCampuses.setVisible(false);
            control.setVisible(false);
            game.setVisible(true);
        }
        /* if paw icon is over Shenango, enter selectedCampus */
        if(p1X > 670 && p1X < 690 && p1Y > 499 && p1Y < 521)
        {
            selectedCampus  = "Great Valley";
            mapCampuses.setVisible(false);
            control.setVisible(false);
            game.setVisible(true);
        }
    }
    
    @Override
    public void keyReleased(KeyEvent e){}
    
    @Override
    public void keyTyped(KeyEvent e){}
}
