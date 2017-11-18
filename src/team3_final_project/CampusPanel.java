package team3_final_project;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
import javax.swing.BorderFactory;

public class CampusPanel extends JPanel
{
    /* create campus attributes */
    private String campusName;
    private int campusColor;
    private ImageIcon campusLogo;
    private ImageIcon campusImage;
    private int currentPoints;
    private JButton backMap;
    private JButton bBackMainMenu;
    
    /* create inner panels */
    private JPanel gameInstructions;
    private JPanel miniGame;
    private JPanel playerStats;
    private JPanel logoTheme;
    private JPanel imageCharacter;
    private JPanel logoCampus;
    
    private boolean campusComplete;
    
    public CampusPanel(String inName, int inColor, ImageIcon inLogo, ImageIcon inImage)
    {
        /* setup CampusPanel */
        super();
        setBackground(Color.cyan);
        setLayout(null);
        
        campusName = inName;
        campusColor = inColor;
        campusLogo = inLogo;
        campusImage = inImage;
        campusComplete = false;
        
        Border whiteLine = BorderFactory.createLineBorder(Color.white);
        TitledBorder instructionsBorder = BorderFactory.createTitledBorder(whiteLine, "Instructions");
        TitledBorder playerStatsBorder = BorderFactory.createTitledBorder(whiteLine, "Player Stats");
        TitledBorder characterImageBorder = BorderFactory.createTitledBorder(whiteLine, "Playing As");
        TitledBorder campusLogoBorder = BorderFactory.createTitledBorder(whiteLine, "Campus");
        TitledBorder themeLogoBorder = BorderFactory.createTitledBorder(whiteLine, "Chosen Theme");
        
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
        
        /* add playerStats JPanel for character stats and timer */
        playerStats = new JPanel();
        add(playerStats);
        playerStats.setBounds(new Rectangle(585,20,190,100));
        playerStats.setBorder(playerStatsBorder);
        playerStats.setBackground(new Color(0,0,0,65));
        
        /* add logoTheme JPanel for theme logo */
        logoTheme = new JPanel();
        add(logoTheme);
        logoTheme.setBounds(new Rectangle(585,125,190,172));
        logoTheme.setBorder(themeLogoBorder);
        logoTheme.setBackground(new Color(0,0,0,65));
        
        /* add imageCharacter JPanel for character image */
        imageCharacter = new JPanel();
        add(imageCharacter);
        imageCharacter.setBounds(new Rectangle(585,303,190,172));
        imageCharacter.setBorder(characterImageBorder);
        imageCharacter.setBackground(new Color(0,0,0,65));
        
        /* add logoCampus JPanel for character image */
        logoCampus = new JPanel();
        add(logoCampus);
        logoCampus.setBounds(new Rectangle(585,480,190,100));
        logoCampus.setBorder(campusLogoBorder);
        logoCampus.setBackground(new Color(0,0,0,65));
        JLabel campusLogoLabel = new JLabel(campusLogo);
        logoCampus.add(campusLogoLabel);
        
        setVisible(false);
    }
    
    public void setName(String name)
    {
        campusName = name;
    }
    
    public void setColor(int color)
    {
        campusColor = color;
    }
    
    public void setIcon(ImageIcon icon)
    {
        campusLogo = icon;
    }
    
    public void setCompleted(boolean tf)
    {
        campusComplete = tf;
    }
    
    public String getName()
    {
        return campusName;
    }
    
    public int getColor()
    {
        return campusColor;
    }
    
    public ImageIcon getLogo()
    {
        return campusLogo;
    }
    
    public boolean getCompleted()
    {
        return campusComplete;
    }
    
}
