package team3_final_project;

import java.awt.*;
import javax.swing.*;

public class DevelopersPanel extends JPanel
{
    JButton back;
    
    public DevelopersPanel()
    {
        super();
        setBackground(Color.black);
        setLayout(new BorderLayout());
        
        JPanel aly = new JPanel();
        JPanel matt = new JPanel();
        JPanel valeri = new JPanel();
        
        JPanel developers = new JPanel();
        add(developers,BorderLayout.CENTER);
        developers.add(aly);
        developers.add(matt);
        developers.add(valeri);
        
        JLabel line1 = new JLabel("Testing Developer's Panel",SwingConstants.CENTER);
        add(line1,BorderLayout.CENTER);
        
        back = new JButton("Main Menu");
        add(back,BorderLayout.NORTH);
    }
}
