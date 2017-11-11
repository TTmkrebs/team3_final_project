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
        label1.setFont(new Font("Arial", Font.BOLD, 48));
        label1.setForeground(Color.white);
        aly.add (label1,BorderLayout.NORTH);
        ImageIcon alyIcon = new ImageIcon("images/aly.jpg");
        JLabel alyImage = new JLabel(alyIcon);
        aly.add(alyImage);
        
        JPanel matt = new JPanel();
        matt.setLayout(new BorderLayout());
        matt.setBackground (Color.black);
        matt.setPreferredSize (new Dimension(250, 600));
        JLabel label2 = new JLabel ("Matt", SwingConstants.CENTER);
        label2.setFont(new Font("Arial", Font.BOLD, 48));
        label2.setForeground(Color.white);
        matt.add (label2,BorderLayout.NORTH);
        
        JPanel valeri = new JPanel();
        valeri.setLayout(new BorderLayout());
        valeri.setBackground (Color.black);
        valeri.setPreferredSize (new Dimension(250, 600));
        JLabel label3 = new JLabel ("Valeri", SwingConstants.CENTER);
        label3.setFont(new Font("Arial", Font.BOLD, 48));
        label3.setForeground(Color.white);
        valeri.add (label3,BorderLayout.NORTH);
        ImageIcon valeriIcon = new ImageIcon("images/valeri.png");
        JLabel valeriImage = new JLabel(valeriIcon);
        valeri.add(valeriImage);
        
         
//        valeriImage.setBounds(130, 50, 550, 350);
        
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
