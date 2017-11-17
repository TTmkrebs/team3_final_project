
package team3_final_project;

import java.awt.*;
import javax.swing.*;


public class CampusPanel extends JPanel
{
    /* create campus attributes */
    String campusName;
    ImageIcon characterImage;
    ImageIcon campusImage;
    ImageIcon campusLogo;
    int currentPoints;
    JButton backMap;
    JButton bBackMainMenu;
    
    public CampusPanel(String inCampusName)
    {
        /* setup CampusPanel */
        super();
        setBackground(Color.black);
        setLayout(null);
        
        campusName = inCampusName;
        
        
        
        
        
    }
}
