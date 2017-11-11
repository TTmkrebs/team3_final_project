package team3_final_project;

import java.awt.*;
import javax.swing.*;

public class DevelopersPanel extends JPanel
{
    JButton back;
    
    public DevelopersPanel()
    {
        super();
        setBackground(Color.lightGray);
        setLayout(new BorderLayout());
        
        JLabel line1 = new JLabel("Testing Developers Panel",SwingConstants.CENTER);
        add(line1,BorderLayout.CENTER);
        
        back = new JButton("Main Menu");
        add(back,BorderLayout.NORTH);
    }
}
