
package team3_final_project;

import java.awt.*;
import javax.swing.*;


public class CampusPanel extends JPanel
{
    String theme;
    ImageIcon characterImage;
    int currentPoints;
    ImageIcon campusLogo;
    JButton backMap;
    JButton backMainMenu;
    
    public CampusPanel(String inTheme)
    {
        super();
        theme = inTheme;
        
        setBackground(Color.gray);
        setLayout(null);
        
    }
}
