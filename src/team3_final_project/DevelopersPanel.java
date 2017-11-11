package team3_final_project;

import java.awt.*;
import javax.swing.*;

public class DevelopersPanel extends JPanel
{
    JButton back;
    
    public DevelopersPanel()
    {
        super();
        setBackground(Color.white);
        setLayout(new BorderLayout());
        
        JPanel aly = new JPanel();
        aly.setLayout(new BorderLayout());
        aly.setBackground (Color.black);
        aly.setPreferredSize (new Dimension(250, 600));
        JLabel label1 = new JLabel ("Aly", SwingConstants.CENTER);
        aly.add (label1,BorderLayout.CENTER);
        
        JPanel matt = new JPanel();
        matt.setLayout(new BorderLayout());
        matt.setBackground (Color.black);
        matt.setPreferredSize (new Dimension(250, 600));
        JLabel label2 = new JLabel ("Matt", SwingConstants.CENTER);
        matt.add (label2,BorderLayout.CENTER);
        
        JPanel valeri = new JPanel();
        valeri.setLayout(new BorderLayout());
        valeri.setBackground (Color.black);
        valeri.setPreferredSize (new Dimension(250, 600));
        JLabel label3 = new JLabel ("Valeri", SwingConstants.CENTER);
        valeri.add (label3,BorderLayout.CENTER);
        
        JPanel developers = new JPanel();
        developers.setVisible(true);
        add(developers,BorderLayout.CENTER);
        
        developers.add(aly);
        developers.add(matt);
        developers.add(valeri);
        
        back = new JButton("Main Menu");
        add(back,BorderLayout.NORTH);
    }
}
