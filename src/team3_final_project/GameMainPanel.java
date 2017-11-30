package team3_final_project;

import java.awt.*;
import java.awt.event.*;
import java.util.HashSet;
import java.util.Set;
import javax.swing.*;
import javax.swing.border.*;
import javax.swing.BorderFactory;

public class GameMainPanel extends JPanel
{
    /* create campus attributes */
    private String campusName;
    private ImageIcon campusLogo;
    private ImageIcon campusBackgroundIcon;
    private Image campusBackgroundImage;
    private JButton backMap;
    private JButton bBackMainMenu;
    private JLabel instructionsLabel;
    
    /* create inner panels */
    private JPanel gameInstructions;
    private JPanel miniGame;
    private JPanel playerStats;
    private JPanel logoTheme;
    private JPanel imageCharacter;
    private JLabel charIcon;
    private JPanel logoCampus;
    private JLabel themeIcon;
    
    /* create campus complete toggle */
    private boolean campusComplete;
    
    /* variables for player stats */
    private Player currentPlayer;
    private JButton bTimer;
    private JButton bScore;

    /* background image coordinates */
    private int x = 0;
    private int y = 0;
    
    public GameMainPanel(String inName, ImageIcon inLogo, ImageIcon inBackground)
    {
        /* setup GameMainPanel */
        super();
        setBackground(Color.black);
        setLayout(null);
        
        campusName = inName;
        campusLogo = inLogo;
        campusBackgroundIcon = inBackground;
        campusComplete = false;
        
        Font borderFont = new Font("SansSerif", Font.BOLD, 15);
        Border whiteLine = BorderFactory.createLineBorder(Color.white);
        Border whiteLineTitle = BorderFactory.createTitledBorder(whiteLine, "");
                
        Border instructionsBorder = new TitledBorder(whiteLineTitle, "Instructions",TitledBorder.LEFT, TitledBorder.TOP, borderFont, Color.white);
        Border playerStatsBorder = new TitledBorder(whiteLineTitle, "Player Stats",TitledBorder.LEFT, TitledBorder.TOP, borderFont, Color.white);
        Border characterImageBorder = new TitledBorder(whiteLineTitle, "Character",TitledBorder.LEFT, TitledBorder.TOP, borderFont, Color.white);
        Border campusLogoBorder = new TitledBorder(whiteLineTitle, "Campus",TitledBorder.LEFT, TitledBorder.TOP, borderFont, Color.white);
        Border themeLogoBorder = new TitledBorder(whiteLineTitle, "Theme",TitledBorder.LEFT, TitledBorder.TOP, borderFont, Color.white);
        
        
        /* create and add backMap button */
        backMap = new JButton("Back to Map");
        add(backMap);
        backMap.setBounds(new Rectangle(585,590,190,25));
        
        /* create and add bBackMainMenu button */
        bBackMainMenu = new JButton("Main Menu");
        add(bBackMainMenu);
        bBackMainMenu.setBounds(new Rectangle(585,625,190,25));
        
        /* add campus background */
        campusBackgroundImage = campusBackgroundIcon.getImage();
        
        /* add gameInstructions JPanel for mini game instructions */
        gameInstructions = new JPanel();
        gameInstructions.setBounds(new Rectangle(20,20,545,75));
        gameInstructions.setBorder(instructionsBorder);
        gameInstructions.setBackground(new Color(0,0,0,65));
        instructionsLabel = new JLabel("Connect three X's in a row to win!");
        instructionsLabel.setFont(new Font("SansSerif", Font.BOLD, 20));
        instructionsLabel.setForeground(Color.white);
        gameInstructions.add(instructionsLabel, BorderLayout.CENTER);
        add(gameInstructions);
        
        /* add miniGame JPanel for mini game */
        miniGame = new JPanel();
        miniGame.setLayout(null);
        miniGame.setBounds(new Rectangle(20,100,545,550));
        miniGame.setBorder(whiteLine);
        miniGame.setBackground(new Color(0,0,0,65));
        add(miniGame);
        
        /* add playerStats JPanel for character stats and timer */
        playerStats = new JPanel();
        add(playerStats);
        playerStats.setLayout(null);
        playerStats.setBounds(new Rectangle(585,20,190,100));
        playerStats.setBorder(playerStatsBorder);
        playerStats.setBackground(new Color(0,0,0,65));
        
        /* add timer button */
        bTimer = new JButton("Time: ");
        playerStats.add(bTimer);
        bTimer.setBounds(new Rectangle(5,20,180,25));
        
        /* add score button */
        bScore = new JButton("Score: ");
        playerStats.add(bScore);
        bScore.setBounds(new Rectangle(5,60,180,25));
        
        /* add logoTheme JPanel for theme logo */
        logoTheme = new JPanel();
        logoTheme.setLayout(new BorderLayout());
        logoTheme.setBounds(new Rectangle(585,125,190,172));
        logoTheme.setBorder(themeLogoBorder);
        logoTheme.setBackground(new Color(0,0,0,65));
        themeIcon = new JLabel();
        logoTheme.add(themeIcon, BorderLayout.CENTER);
        add(logoTheme);
        
        
        /* add imageCharacter JPanel for character image */
        imageCharacter = new JPanel();
        imageCharacter.setLayout(new BorderLayout());
        imageCharacter.setBounds(new Rectangle(585,303,190,172));
        imageCharacter.setBorder(characterImageBorder);
        imageCharacter.setBackground(new Color(0,0,0,65));
        charIcon = new JLabel();
        imageCharacter.add(charIcon, BorderLayout.CENTER);
        add(imageCharacter);
        
        
        /* add logoCampus JPanel for campus image */
        logoCampus = new JPanel();
        logoCampus.setBounds(new Rectangle(585,480,190,100));
        logoCampus.setBorder(campusLogoBorder);
        logoCampus.setBackground(new Color(0,0,0,65));
        JLabel campusLogoLabel = new JLabel(campusLogo);
        logoCampus.add(campusLogoLabel);
        add(logoCampus);
        
        game_selection(1);
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
    
    @Override
    public void setName(String name)
    {
        campusName = name;
    }
       
    public void setLogo(ImageIcon icon)
    {
        campusLogo = icon;
    }
    
    public void setCompleted(boolean tf)
    {
        campusComplete = tf;
    }
    
    @Override
    public String getName()
    {
        return campusName;
    }
    
    public ImageIcon getLogo()
    {
        return campusLogo;
    }
    
    public boolean getCompleted()
    {
        return campusComplete;
    }
    
    public JButton getBackButton()
    {
        return backMap;
    }
    
    public JButton getMainMenuButton()
    {
        return bBackMainMenu;
    }
    
    public void setTimer(int currentTime)
    {
        
    }
    
    public void setPlayer(Player inPlayer)
    {
        currentPlayer = inPlayer;
        
        charIcon.setIcon(currentPlayer.getCharacterIcon());
        
        themeIcon.setIcon(currentPlayer.getThemeIcon());
        
        bScore.setText("Score: " + currentPlayer.getScore());
        bTimer.setText("Time: " + currentPlayer.getTime());
    }

    
    public void game_selection(int number)
    {
        if(number == 1)
        {
            Game_TicTacToe ticTacToe = new Game_TicTacToe();
            miniGame.add(ticTacToe);
            ticTacToe.setBounds(new Rectangle(0,0,545,550));
        }
    }
}
