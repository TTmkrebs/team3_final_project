
package team3_final_project;

import java.awt.*;
import javax.swing.*;


public class CampusPanel extends JPanel
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
    
    public CampusPanel(String inCampusName)
    {
        /* setup CampusPanel */
        super();
        setBackground(Color.black);
        setLayout(null);
        
        campusName = inCampusName;
        
        /* create and add backMap button */
        backMap = new JButton("Back to Map");
        add(backMap);
        backMap.setBounds(new Rectangle(590,600,190,25));
        
        /* create and add bBackMainMenu button */
        bBackMainMenu = new JButton("Main Menu");
        add(bBackMainMenu);
        bBackMainMenu.setBounds(new Rectangle(590,650,190,25));
        
        /* add gameInstructions JPanel for mini game instructions */
        gameInstructions = new JPanel();
        add(gameInstructions);
        gameInstructions.setBounds(new Rectangle(25,30,525,70));
        
        /* add miniGame JPanel for mini game */
        miniGame = new JPanel();
        add(miniGame);
        miniGame.setBounds(new Rectangle(25,125,525,550));
        
        /* add characterStats JPanel for character stats and timer */
        characterStats = new JPanel();
        add(characterStats);
        characterStats.setBounds(new Rectangle(590,30,190,70));
        
        /* add imageCharacter JPanel for character image */
        imageCharacter = new JPanel();
        add(imageCharacter);
        imageCharacter.setBounds(new Rectangle(590,125,190,265));
        
        /* add logoCampus JPanel for character image */
        logoCampus = new JPanel();
        add(logoCampus);
        logoCampus.setBounds(new Rectangle(590,415,190,150));
        
        
    }
}
