
package team3_final_project;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
import javax.swing.BorderFactory; 

public class GameFullPanel extends JPanel
{
    /* create GameFullPanel entities */
    String campusName;
    int currentPoints;
    ImageIcon characterImageIcon;
    ImageIcon campusBackgroundIcon;
    ImageIcon campusLogoIcon;
    Image campusBackgroundImage;
    
    int x = 0;
    int y = 0;
    
    JButton backMap;
    JButton bBackMainMenu;
    /* create inner panels */
    JPanel gameInstructionsPanel;
    JPanel miniGamePanel;
    JPanel playerStatsPanel;
    JPanel logoThemePanel;
    JPanel imageCharacterPanel;
    JPanel logoCampusPanel;
    
    public GameFullPanel(String inCampusName)
    {
        /* setup GameFullPanel */
        super();
        setBackground(Color.black);
        setLayout(null);
        
        Border whiteLine = BorderFactory.createLineBorder(Color.white);
        TitledBorder instructionsBorder = BorderFactory.createTitledBorder(whiteLine, "Instructions");
        TitledBorder playerStatsBorder = BorderFactory.createTitledBorder(whiteLine, "Player Stats");
        TitledBorder characterImageBorder = BorderFactory.createTitledBorder(whiteLine, "Playing As");
        TitledBorder campusLogoBorder = BorderFactory.createTitledBorder(whiteLine, "Campus");
        TitledBorder themeLogoBorder = BorderFactory.createTitledBorder(whiteLine, "Chosen Theme");
        
        campusName = inCampusName;
        
        
        if (campusName == "World Campus") 
        {
            campusBackgroundIcon = new ImageIcon("images/campuses/world_campus.png");
            campusBackgroundImage = campusBackgroundIcon.getImage();
            campusLogoIcon = new ImageIcon("images/campuses/logos/world_campus.png");
        }
        if (campusName == "Shenango") 
        {
            campusBackgroundIcon = new ImageIcon("images/campuses/shenango.png");
            campusBackgroundImage = campusBackgroundIcon.getImage();
            campusLogoIcon = new ImageIcon("images/campuses/logos/shenango.png");
        }
        if (campusName == "Greater Allegheny") 
        {
            campusBackgroundIcon = new ImageIcon("images/campuses/greater_allegheny.png");
            campusBackgroundImage = campusBackgroundIcon.getImage();
            campusLogoIcon = new ImageIcon("images/campuses/logos/greater_allegheny.png");
        }
        if (campusName == "Great Valley") 
        {
            campusBackgroundIcon = new ImageIcon("images/campuses/great_valley.png");
            campusBackgroundImage = campusBackgroundIcon.getImage();
            campusLogoIcon = new ImageIcon("images/campuses/logos/great_valley.png");
        }
        if (campusName == "Worthington Scranton") 
        {
            campusBackgroundIcon = new ImageIcon("images/campuses/worthington_scranton.png");
            campusBackgroundImage = campusBackgroundIcon.getImage();
            campusLogoIcon = new ImageIcon("images/campuses/logos/worthington_scranton.png");
        }
        if (campusName == "University Park") 
        {
            campusBackgroundIcon = new ImageIcon("images/campuses/university_park.png");
            campusBackgroundImage = campusBackgroundIcon.getImage();
            campusLogoIcon = new ImageIcon("images/campuses/logos/university_park.png");
        }
        
        /* create and add backMap button */
        backMap = new JButton("Back to Map");
        add(backMap);
        backMap.setBounds(new Rectangle(585,590,190,25));
        
        /* create and add bBackMainMenu button */
        bBackMainMenu = new JButton("Main Menu");
        add(bBackMainMenu);
        bBackMainMenu.setBounds(new Rectangle(585,625,190,25));
        
        /* add gameInstructionsPanel JPanel for mini game instructions */
        gameInstructionsPanel = new JPanel();
        add(gameInstructionsPanel);
        gameInstructionsPanel.setBounds(new Rectangle(20,20,545,75));
        gameInstructionsPanel.setBorder(instructionsBorder);
        gameInstructionsPanel.setBackground(new Color(0,0,0,65));
        
        /* add miniGamePanel JPanel for mini game */
        miniGamePanel = new JPanel();
        add(miniGamePanel);
        miniGamePanel.setBounds(new Rectangle(20,100,545,550));
        miniGamePanel.setBorder(whiteLine);
        miniGamePanel.setBackground(new Color(0,0,0,65));
        
        /* add playerStatsPanel JPanel for character stats and timer */
        playerStatsPanel = new JPanel();
        add(playerStatsPanel);
        playerStatsPanel.setBounds(new Rectangle(585,20,190,100));
        playerStatsPanel.setBorder(playerStatsBorder);
        playerStatsPanel.setBackground(new Color(0,0,0,65));
        
        /* add logoThemePanel JPanel for theme logo */
        logoThemePanel = new JPanel();
        add(logoThemePanel);
        logoThemePanel.setBounds(new Rectangle(585,125,190,172));
        logoThemePanel.setBorder(themeLogoBorder);
        logoThemePanel.setBackground(new Color(0,0,0,65));
        
        /* add imageCharacterPanel JPanel for character image */
        imageCharacterPanel = new JPanel();
        add(imageCharacterPanel);
        imageCharacterPanel.setBounds(new Rectangle(585,303,190,172));
        imageCharacterPanel.setBorder(characterImageBorder);
        imageCharacterPanel.setBackground(new Color(0,0,0,65));
        
        /* add logoCampusPanel JPanel for character image */
        logoCampusPanel = new JPanel();
        add(logoCampusPanel);
        logoCampusPanel.setBounds(new Rectangle(585,480,190,100));
        logoCampusPanel.setBorder(campusLogoBorder);
        logoCampusPanel.setBackground(new Color(0,0,0,65));
        JLabel campusLogoLabel = new JLabel(campusLogoIcon);
        logoCampusPanel.add(campusLogoLabel);
    }
    
    public void setX(int inX)
    {
        x = inX;
    }
    
    public void setY(int inY)
    {
        y = inY;
    }
    
@Override
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        g.drawImage(campusBackgroundImage,x,y,this);
    }
}
