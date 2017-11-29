package team3_final_project;

import java.awt.*;
import javax.swing.*;

public class Player 
{
    /* player information */
    private String character;
    private String bonus;
    private ImageIcon characterIcon;
    private Image image;
    private ImageIcon mapIcon;
    private Image mapImage;
    private String theme;
    
    /* game information */
    private int score = 0; 
    
    public Player(String inChar)
    {
        character = inChar;
        if(character == "Football Player")
        {
            bonus = "Sports";
            characterIcon = new ImageIcon("images/characters/footballplayer.png");
            image = characterIcon.getImage();
            
            mapIcon = new ImageIcon("images/icons/football.png");
            mapImage = mapIcon.getImage();
            
        }
        if(character == "Mascot")
        {
            bonus = "History";
            characterIcon = new ImageIcon("images/characters/mascot.jpg");
            image = characterIcon.getImage();
            
            mapIcon = new ImageIcon("images/icons/pawprint.png");
            mapImage = mapIcon.getImage();
            
        }
        if(character == "Student")
        {
            bonus = "Academics";
            characterIcon = new ImageIcon("images/characters/student.png");
            image = characterIcon.getImage();
            
            mapIcon = new ImageIcon("images/icons/book.png");
            mapImage = mapIcon.getImage();
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
    
    public ImageIcon getMapIcon()
    {
        return mapIcon;
    }
    
    public ImageIcon getCharacterIcon()
    {
        return characterIcon;
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
