package team3_final_project;

import java.awt.*;
import javax.swing.*;

public class MapCampusesPanel extends JPanel
{
    Image background;
    int x = 0;
    int y = 0;
    
    public MapCampusesPanel(Image image)
    {       
        setBackground(Color.black);
        setLayout(null);
        background = image;
    }
    
    public void focus()
    {
        requestFocus();
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
        g.drawImage(background,x,y,this);
    }
}      