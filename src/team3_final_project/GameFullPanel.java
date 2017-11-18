
package team3_final_project;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
import javax.swing.BorderFactory; 

public class GameFullPanel extends JPanel
{
    /* create campus attributes */
    String campusName;
    ImageIcon characterImage;
    ImageIcon campusImage;
    ImageIcon campusLogo;
    int currentPoints;
    JButton backMap;
    JButton bBackMainMenu;
    /* create inner panels */
    JPanel gameInstructions;
    JPanel miniGame;
    JPanel characterStats;
    JPanel imageCharacter;
    JPanel logoCampus;
    
    TitledBorder instructionsBorder;
    Border whiteLine;
    
    public GameFullPanel(String inCampusName)
    {
        /* setup GameFullPanel */
        super();
        setBackground(Color.cyan);
        setLayout(null);
        
        whiteLine = BorderFactory.createLineBorder(Color.white);
        instructionsBorder = BorderFactory.createTitledBorder(whiteLine, "Instructions");
        
        campusName = inCampusName;
        
        /* create and add backMap button */
        backMap = new JButton("Back to Map");
        add(backMap);
        backMap.setBounds(new Rectangle(585,590,190,25));
        
        /* create and add bBackMainMenu button */
        bBackMainMenu = new JButton("Main Menu");
        add(bBackMainMenu);
        bBackMainMenu.setBounds(new Rectangle(585,625,190,25));
        
        /* add gameInstructions JPanel for mini game instructions */
        gameInstructions = new JPanel();
        add(gameInstructions);
        gameInstructions.setBounds(new Rectangle(20,20,545,75));
        gameInstructions.setBorder(instructionsBorder);
        gameInstructions.setBackground(new Color(0,0,0,65));
        
        /* add miniGame JPanel for mini game */
        miniGame = new JPanel();
        add(miniGame);
        miniGame.setBounds(new Rectangle(20,100,545,550));
        miniGame.setBorder(whiteLine);
        miniGame.setBackground(new Color(0,0,0,65));
        
        /* add characterStats JPanel for character stats and timer */
        characterStats = new JPanel();
        add(characterStats);
        characterStats.setBounds(new Rectangle(585,20,190,125));
        characterStats.setBorder(whiteLine);
        characterStats.setBackground(new Color(0,0,0,65));
        
        /* add imageCharacter JPanel for character image */
        imageCharacter = new JPanel();
        add(imageCharacter);
        imageCharacter.setBounds(new Rectangle(585,155,190,265));
        imageCharacter.setBorder(whiteLine);
        imageCharacter.setBackground(new Color(0,0,0,65));
        
        /* add logoCampus JPanel for character image */
        logoCampus = new JPanel();
        add(logoCampus);
        logoCampus.setBounds(new Rectangle(585,430,190,150));
        logoCampus.setBorder(whiteLine);
        logoCampus.setBackground(new Color(0,0,0,65));
        
    }
}
