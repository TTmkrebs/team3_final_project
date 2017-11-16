package team3_final_project;

import java.awt.*;
import javax.swing.*;

public class DevelopersPanel extends JPanel
{
       /* declare bBackMainMenu button to display MainPanel */
    JButton bBackMainMenu;
    JPanel allDevelopers;
    
    public DevelopersPanel()
    {
        /* setup DevelopersPanel */
        super();
        setBackground(Color.white);
        setLayout(new BorderLayout());
        
        /* create and setup panel for developer Aly */
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
        
        /* create and setup panel for developer Matt */
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
        
        /* create and setup panel for developer Valeri */
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
        
        /* create setup and add allDevelopers panel to contain individual developer panels */
        allDevelopers = new JPanel();
        allDevelopers.setVisible(true);
        add(allDevelopers,BorderLayout.CENTER);
        
        /* add all developer panels */
        allDevelopers.add(aly);
        allDevelopers.add(matt);
        allDevelopers.add(valeri);
        
        /* create and add bBackMainMenu button */
        bBackMainMenu = new JButton("Main Menu");
        add(bBackMainMenu,BorderLayout.NORTH);
    }
}
