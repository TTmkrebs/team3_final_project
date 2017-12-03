package team3_final_project;

import java.awt.*;
import javax.swing.*;

public class Player 
{
    /* player information */
    private String character;
    private ImageIcon characterIcon;
    private ImageIcon mapIcon;
    private String theme;
    
    /* game information */
    private ImageIcon themeIcon;
    private int playerScore = 0; 
    private int playerTime = 0;
    
    public Player(String inChar)
    {
        character = inChar;
        if(character.equals("Football Player"))
        {
            characterIcon = new ImageIcon("images/characters/footballplayer.png");
            mapIcon = new ImageIcon("images/icons/football.png");
        }
        if(character.equals("Mascot"))
        {
            characterIcon = new ImageIcon("images/characters/mascot.jpg");
            mapIcon = new ImageIcon("images/icons/pawprint.png");
        }
        if(character.equals("Student"))
        {
            characterIcon = new ImageIcon("images/characters/student.png");   
            mapIcon = new ImageIcon("images/icons/book.png");
        }
    }
    
    public String getCharacter()
    {
        return character;
    }
    
    public ImageIcon getMapIcon()
    {
        return mapIcon;
    }
    
    public ImageIcon getCharacterIcon()
    {
        return characterIcon;
    }
    
    public int getScore()
    {
        return playerScore;
    }
    
    public void setScore(int inScore)
    {
        playerScore += inScore;
    }
    
    public String getTheme()
    {
        return theme;
    }
    
    public void setTheme(String inTheme)
    {
        theme = inTheme;
    }
    
    public ImageIcon getThemeIcon()
    {
        return themeIcon;
    }
    
    public void setThemeIcon(ImageIcon inThemeIcon)
    {
        themeIcon = inThemeIcon;
    }
    
    public int getTime()
    {
        return playerTime;
    }
    
    public void setTime(int inTime)
    {
        playerTime = inTime;
    }
}
