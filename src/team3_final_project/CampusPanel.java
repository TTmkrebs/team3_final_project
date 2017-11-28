package team3_final_project;

import java.awt.*;
import java.awt.event.*;
import java.util.HashSet;
import java.util.Set;
import javax.swing.*;
import javax.swing.border.*;
import javax.swing.BorderFactory;

public class CampusPanel extends JPanel implements ActionListener
{
    /* create campus attributes */
    private String campusName;
    private int campusColor;
    private ImageIcon campusLogo;
    private ImageIcon campusImage;
    private JButton backMap;
    private JButton bBackMainMenu;
    
    /* create inner panels */
    private JPanel gameInstructions;
    private JPanel miniGame;
    private JPanel playerStats;
    private JPanel logoTheme;
    private JPanel imageCharacter;
    private JPanel logoCampus;
    
    /* create campus complete toggle */
    private boolean campusComplete;
    
    /* variables for player stats */
    Player player1;
    JButton bTimer;
    JButton bScore;
    private int playerTime;
    
    /* variables for player stats */
    JButton ttt1;
    JButton ttt2;
    JButton ttt3;
    JButton ttt4;
    JButton ttt5;
    JButton ttt6;
    JButton ttt7;
    JButton ttt8;
    JButton ttt9;
    JButton[] buttonList = new JButton[9];
    
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
        miniGame.setLayout(new GridLayout(3,3));
        miniGame.setBounds(new Rectangle(20,100,545,550));
        miniGame.setBorder(whiteLine);
        miniGame.setBackground(new Color(0,0,0,65));
        
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
        add(logoTheme);
        logoTheme.setLayout(new BorderLayout());
        logoTheme.setBounds(new Rectangle(585,125,190,172));
        logoTheme.setBorder(themeLogoBorder);
        logoTheme.setBackground(new Color(0,0,0,65));
        
        /* add imageCharacter JPanel for character image */
        imageCharacter = new JPanel();
        imageCharacter.setLayout(new BorderLayout());
        add(imageCharacter);
        imageCharacter.setBounds(new Rectangle(585,303,190,172));
        imageCharacter.setBorder(characterImageBorder);
        imageCharacter.setBackground(new Color(0,0,0,65));
        
        /* add logoCampus JPanel for campus image */
        logoCampus = new JPanel();
        add(logoCampus);
        logoCampus.setBounds(new Rectangle(585,480,190,100));
        logoCampus.setBorder(campusLogoBorder);
        logoCampus.setBackground(new Color(0,0,0,65));
        JLabel campusLogoLabel = new JLabel(campusLogo);
        logoCampus.add(campusLogoLabel);
    }
    
    @Override
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
    
    @Override
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
        playerTime = currentTime;
        bTimer.setText("Time: " + playerTime);
    }
    
    public void setPlayer(Player p1)
    {
        player1 = p1;
        
        JLabel charIcon = new JLabel(player1.getImageIcon());
        imageCharacter.add(charIcon, BorderLayout.CENTER);
        
        JLabel theme = new JLabel(player1.getTheme());
        logoTheme.add(theme, BorderLayout.CENTER);
        
        bScore.setText("Score: " + player1.getScore());
    }
    
    public void game_TicTacToe()
    {
        ttt1 = new JButton("-");
        miniGame.add(ttt1);
        ttt1.addActionListener(this); 
        
        ttt2 = new JButton("-");
        miniGame.add(ttt2);
        ttt2.addActionListener(this);
        
        ttt3 = new JButton("-");
        miniGame.add(ttt3);
        ttt3.addActionListener(this);
        
        ttt4 = new JButton("-");
        miniGame.add(ttt4);
        ttt4.addActionListener(this);
        
        ttt5 = new JButton("-");
        miniGame.add(ttt5);
        ttt5.addActionListener(this);
        
        ttt6 = new JButton("-");
        miniGame.add(ttt6);
        ttt6.addActionListener(this);
        
        ttt7 = new JButton("-");
        miniGame.add(ttt7);
        ttt7.addActionListener(this);
        
        ttt8 = new JButton("-");
        miniGame.add(ttt8);
        ttt8.addActionListener(this);
        
        ttt9 = new JButton("-");
        miniGame.add(ttt9);
        ttt9.addActionListener(this);
        
        /* set up tic tac toe buttons */
        buttonList[0] = ttt1;
        buttonList[1] = ttt2;
        buttonList[2] = ttt3;
        buttonList[3] = ttt4;
        buttonList[4] = ttt5;
        buttonList[5] = ttt6;
        buttonList[6] = ttt7;
        buttonList[7] = ttt8;
        buttonList[8] = ttt9;
    }
    
    public Boolean ttt_playerChoice(JButton obj)
    {
        Boolean gameOver = false;
        
        obj.setText("X");
        obj.setEnabled(false);
        
        if(ttt_winCheck())
        {
            for(int i=0;i<buttonList.length;i++)
                {
                    buttonList[i].setText("WINNER");
                    buttonList[i].setEnabled(false);
                    gameOver = true;
                    player1.setScore(1);
                    campusComplete = true;
                }
        }
        else
        {
            int randomInt = ((int)(Math.random() * 9)) - 1;
        
            while(buttonList[randomInt].isEnabled() == false)
            {
                randomInt = ((int)(Math.random() * 9)) - 1;
            }
            buttonList[randomInt].setText("O");
            buttonList[randomInt].setEnabled(false);
        }
        if(ttt_lossCheck())
        {
            for(int i=0;i<buttonList.length;i++)
            {
                buttonList[i].setText("BOOO");
                buttonList[i].setEnabled(false);
                campusComplete = true;
                gameOver = true;
            }
        }
        
        return gameOver;
    }
    
    public Boolean ttt_winCheck()
    {
        Boolean win = false;
        
        /* check rows for win */
        if(ttt1.getText().equals("X") && ttt2.getText().equals("X") && ttt3.getText().equals("X"))
        {
            win = true;
        }
        if(ttt4.getText().equals("X") && ttt5.getText().equals("X") && ttt6.getText().equals("X"))
        {
            win = true;
        }
        if(ttt7.getText().equals("X") && ttt8.getText().equals("X") && ttt9.getText().equals("X"))
        {
            win = true;
        }
        
        /* check columns for win */
        if(ttt1.getText().equals("X") && ttt4.getText().equals("X") && ttt7.getText().equals("X"))
        {
            win = true;
        }
        if(ttt2.getText().equals("X") && ttt5.getText().equals("X") && ttt8.getText().equals("X"))
        {
            win = true;
        }
        if(ttt3.getText().equals("X") && ttt6.getText().equals("X") && ttt9.getText().equals("X"))
        {
            win = true;
        }
        /* check diagonals for win */
        if(ttt1.getText().equals("X") && ttt5.getText().equals("X") && ttt9.getText().equals("X"))
        {
            win = true;
        }
        if(ttt3.getText().equals("X") && ttt5.getText().equals("X") && ttt7.getText().equals("X"))
        {
            win = true;
        }
        
        return win;
    }
    
    public Boolean ttt_lossCheck()
    {
        Boolean loss = false;
        
        /* check rows for loss */
        if(ttt1.getText().equals("O") && ttt2.getText().equals("O") && ttt3.getText().equals("O"))
        {
            loss = true;
        }
        if(ttt4.getText().equals("O") && ttt5.getText().equals("O") && ttt6.getText().equals("O"))
        {
            loss = true;
        }
        if(ttt7.getText().equals("O") && ttt8.getText().equals("O") && ttt9.getText().equals("O"))
        {
            loss = true;
        }
        
        /* check columns for loss */
        if(ttt1.getText().equals("O") && ttt4.getText().equals("O") && ttt7.getText().equals("O"))
        {
            loss = true;
        }
        if(ttt2.getText().equals("O") && ttt5.getText().equals("O") && ttt8.getText().equals("O"))
        {
            loss = true;
        }
        if(ttt3.getText().equals("O") && ttt6.getText().equals("O") && ttt9.getText().equals("O"))
        {
            loss = true;
        }
        /* check diagonals for loss */
        if(ttt1.getText().equals("O") && ttt5.getText().equals("O") && ttt9.getText().equals("O"))
        {
            loss = true;
        }
        if(ttt3.getText().equals("O") && ttt5.getText().equals("O") && ttt7.getText().equals("O"))
        {
            loss = true;
        }
        
        return loss;
    }
    
    public void game_selection(int number)
    {
        if(number == 1) { game_TicTacToe(); }
    }
    
    @Override
    public void actionPerformed(ActionEvent e)
    {
        Object obj = e.getSource();
        if(obj == ttt1)
        {
            ttt_playerChoice(ttt1);
        }
        if(obj == ttt2)
        {
            ttt_playerChoice(ttt2);
        }
        if(obj == ttt3)
        {
            ttt_playerChoice(ttt3);
        }
        if(obj == ttt4)
        {
            ttt_playerChoice(ttt4);
        }
        if(obj == ttt5)
        {
            ttt_playerChoice(ttt5);
        }
        if(obj == ttt6)
        {
            ttt_playerChoice(ttt6);
        }
        if(obj == ttt7)
        {
            ttt_playerChoice(ttt7);
        }
        if(obj == ttt8)
        {
            ttt_playerChoice(ttt8);
        }
        if(obj == ttt9)
        {
            ttt_playerChoice(ttt9);
        }
    }
}
