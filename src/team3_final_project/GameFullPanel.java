
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
    JPanel logoTheme;
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
        
        if (campusName == "WorldCampus") 
        {
            campusImage = new ImageIcon("images/campuses/world_campus.png");
            campusLogo = new ImageIcon("images/campuses/logos/world_campus.png");
        }
        if (campusName == "Shenango") 
        {
            campusImage = new ImageIcon("images/campuses/shenango.png");
            campusLogo = new ImageIcon("images/campuses/logos/shenango.png");
        }
        if (campusName == "Greater Allegheny") 
        {
            campusImage = new ImageIcon("images/campuses/greater_allegheny.png");
            campusLogo = new ImageIcon("images/campuses/logos/greater_allegheny.png");
        }
        if (campusName == "Great Valley") 
        {
            campusImage = new ImageIcon("images/campuses/great_valley.png");
            campusLogo = new ImageIcon("images/campuses/logos/great_valley.png");
        }
        if (campusName == "Worthington Scranton") 
        {
            campusImage = new ImageIcon("images/campuses/worthington_scranton.png");
            campusLogo = new ImageIcon("images/campuses/logos/worthington_scranton.png");
        }
        if (campusName == "University Park") 
        {
            campusImage = new ImageIcon("images/campuses/university_park.png");
            campusLogo = new ImageIcon("images/campuses/logos/university_park.png");
        }
        
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
        characterStats.setBounds(new Rectangle(585,20,190,100));
        characterStats.setBorder(whiteLine);
        characterStats.setBackground(new Color(0,0,0,65));
        
        /* add logoTheme JPanel for theme logo */
        logoTheme = new JPanel();
        add(logoTheme);
        logoTheme.setBounds(new Rectangle(585,125,190,172));
        logoTheme.setBorder(whiteLine);
        logoTheme.setBackground(new Color(0,0,0,65));
        
        /* add imageCharacter JPanel for character image */
        imageCharacter = new JPanel();
        add(imageCharacter);
        imageCharacter.setBounds(new Rectangle(585,303,190,172));
        imageCharacter.setBorder(whiteLine);
        imageCharacter.setBackground(new Color(0,0,0,65));
        
        /* add logoCampus JPanel for character image */
        logoCampus = new JPanel();
        add(logoCampus);
        logoCampus.setBounds(new Rectangle(585,480,190,100));
        logoCampus.setBorder(whiteLine);
        logoCampus.setBackground(new Color(0,0,0,65));
        JLabel campusLogoLabel = new JLabel(campusLogo);
        logoCampus.add(campusLogoLabel);
        
        
    }
}
