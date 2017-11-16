package team3_final_project;

import java.awt.*;
import javax.swing.*;

public class DevelopersPanel extends JPanel
{
    JButton back;
    
    public DevelopersPanel()
    {
        //setup new panel type
        super();
        setBackground(Color.white);
        setLayout(new BorderLayout());
        
        //dev 1 info panel
        JPanel aly = new JPanel();
        aly.setLayout(new BorderLayout());
        aly.setBackground (Color.black);
        aly.setPreferredSize (new Dimension(250, 600));
        JLabel label1 = new JLabel ("Aly", SwingConstants.CENTER);
        label1.setFont(new Font("Arial", Font.BOLD, 48));
        label1.setForeground(Color.white);
        aly.add (label1,BorderLayout.NORTH);
        ImageIcon alyIcon = new ImageIcon("images/developers/aly.jpg");
        JLabel alyImage = new JLabel(alyIcon);
        aly.add(alyImage);
        
        //dev 2 info panel
        JPanel matt = new JPanel();
        matt.setLayout(new BorderLayout());
        matt.setBackground (Color.black);
        matt.setPreferredSize (new Dimension(250, 600));
        JLabel label2 = new JLabel ("Matt", SwingConstants.CENTER);
        label2.setFont(new Font("Arial", Font.BOLD, 48));
        label2.setForeground(Color.white);
        matt.add (label2,BorderLayout.NORTH);
        ImageIcon mattIcon = new ImageIcon("images/developers/gc.jpg");
        JLabel mattImage = new JLabel(mattIcon);
        matt.add(mattImage);
        
        //dev 3 info panel
        JPanel valeri = new JPanel();
        valeri.setLayout(new BorderLayout());
        valeri.setBackground (Color.black);
        valeri.setPreferredSize (new Dimension(250, 600));
        JLabel label3 = new JLabel ("Valeri", SwingConstants.CENTER);
        label3.setFont(new Font("Arial", Font.BOLD, 48));
        label3.setForeground(Color.white);
        valeri.add (label3,BorderLayout.NORTH);
        ImageIcon valeriIcon = new ImageIcon("images/developers/valeri.png");
        JLabel valeriImage = new JLabel(valeriIcon);
        valeri.add(valeriImage);
        
        //setaup and add dev panel
        JPanel developers = new JPanel();
        developers.setVisible(true);
        add(developers,BorderLayout.CENTER);
        
        developers.add(aly);
        developers.add(matt);
        developers.add(valeri);
        
        //create and add back button
        back = new JButton("Main Menu");
        add(back,BorderLayout.NORTH);
    }
}
