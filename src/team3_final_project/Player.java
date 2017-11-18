package team3_final_project;

import java.awt.*;
import javax.swing.*;

public class Player 
{
    /* player information */
    private String character;
    private String bonus;
    private ImageIcon icon;
    private Image image;
    private String theme;
    
    /* game information */
    private int score = 0; 
    
    public Player(String inChar)
    {
        character = inChar;
        if(character == "Football Player")
        {
            bonus = "Sports";
            icon = new ImageIcon("images/characters/footballplayer.png");
            image = icon.getImage();
        }
        if(character == "Mascot")
        {
            bonus = "History";
            icon = new ImageIcon("images/characters/mascot.jpg");
            image = icon.getImage();
        }
        if(character == "Student")
        {
            bonus = "Academics";
            icon = new ImageIcon("images/characters/student.png");
            image = icon.getImage();
        }
    }
    
    public String getCharacter()
    {
        return character;
    }
    
    public String getBonus()
    {
        return bonus;
    }
    
    public ImageIcon getImageIcon()
    {
        return icon;
    }
    
    public Image getImage()
    {
        return image;
    }
    
    public int getScore()
    {
        return score;
    }
    
    public void setScore(int inScore)
    {
        score = inScore;
    }
    
    public String getTheme()
    {
        return theme;
    }
    public void setTheme(String inTheme)
    {
        theme = inTheme;
    }
}
