package team3_final_project;

import java.awt.*;
import javax.swing.*;


public class MapPanel extends JPanel
{
    /* initialize campus map image */
    private Image img;
    /* initialize back button */
    private JButton bBackMainMenu;
    /* initialize pause button */
    private JButton bPause;
    /* initialize player */
    private Player currentPlayer;
    /* initialize character label */
    private JLabel charLabel = new JLabel();
    /* initialize score button */
    private JButton bScore;
    /* initialize timer button */
    private int time;
    private JButton bTimer;
    /* initialize player icon */
    private Rectangle playerIconXY = new Rectangle(200,200,50,50);
    private JLabel playerIcon = new JLabel();
    
    public MapPanel()
    {
        /* create game board */
        setLayout(null);
        setBackground(Color.black);
        
        /* create campus map image */
        ImageIcon icon = new ImageIcon("images/general/campus_map_2.png");
        img = icon.getImage();
        
        /* create back button */
        bBackMainMenu = new JButton("Main Menu");
        add(bBackMainMenu);
        bBackMainMenu.setBounds(new Rectangle(635,15,150,25));
        
        /* create pause button */
        bPause = new JButton("Pause Game");
        add(bPause);
        bPause.setBounds(new Rectangle(635,55,150,25));
    }
    
    public void assignPlayer(Player inPlayer)
    {
        /* assign player */
        currentPlayer = inPlayer;
        
        /* create character label */
        charLabel.setText("Playing as: " + currentPlayer.getCharacter());
        add(charLabel);
        charLabel.setBounds(15,15,200,25);
        
        /* create character image */
        JLabel charImage = new JLabel();
        charImage.setIcon(currentPlayer.getCharacterIcon());
        
        /* create score button */
        bScore = new JButton("Score: " + currentPlayer.getScore());
        add(bScore);
        bScore.setBounds(new Rectangle(15,630,200,25));
        
        /* create timer button */
        bTimer = new JButton("Time: " + time);
        add(bTimer);
        bTimer.setBounds(new Rectangle(585,630,200,25));
        
        /* create player icon */
        playerIcon.setLayout(new BorderLayout());
        playerIcon.setIcon(currentPlayer.getMapIcon());
        add(playerIcon);
        playerIcon.setBounds(playerIconXY);
    }
    
    public JButton getBackButton()
    {
        return bBackMainMenu;
    }
    
    public JButton getPauseButton()
    {
        return bPause;
    }
    
    public void setPauseButtonText(String text)
    {
        bPause.setText(text);
    }
    
    public JLabel getPlayerIcon()
    {
        return playerIcon;
    }
    
    public void setPlayerX(int inX)
    {
        playerIconXY.x += inX;
        playerIcon.setBounds(playerIconXY);
    }
    
    public void setPlayerY(int inY)
    {
        playerIconXY.y += inY;
        playerIcon.setBounds(playerIconXY);
    }
    
    public int getPlayerX()
    {
        return playerIconXY.x;
    }
    
    public int getPlayerY()
    {
        return playerIconXY.y;
    }
    
    public void setFocus()
    {
        requestFocus();
    }
    
    public void setTimer(int inTime)
    {
        bTimer.setText("Time: " + inTime);
    }
    
    @Override
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        g.drawImage(img,0,102,this);
    }
}
