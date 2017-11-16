
package team3_final_project;

import java.awt.*;
import javax.swing.*;


public class CampusPanel extends JPanel
{
    String campusName;
    ImageIcon characterImage;
    ImageIcon campusImage;
    ImageIcon campusLogo;
    int currentPoints;
    JButton backMap;
    JButton backMainMenu;
    
    public CampusPanel(String inCampusName)
    {
        super();
        campusName = inCampusName;
        
        setBackground(Color.gray);
        setLayout(null);
        
    }
}
