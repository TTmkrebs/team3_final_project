package team3_final_project;

import java.awt.*;
import javax.swing.*;

public class DevelopersPanel extends JPanel
{
    /* declare bBackMainMenu button to display MainPanel */
    private JButton bBackMainMenu;
    /*declare panels */
    private JPanel allDevelopers;
    private JPanel alyPanel;
    private JPanel mattPanel;
    private JPanel valeriPanel;
    
    /*declare labels */
    private JLabel alyNameLabel;
    private JLabel alyImage;
    private JLabel alyBioLabel;
    private JLabel mattNameLabel;
    private JLabel mattImage;
    private JLabel mattBioLabel;
    private JLabel valeriNameLabel;
    private JLabel valeriImage;
    private JLabel valeriBioLabel;
    
    /*declare ImageIcons */
    ImageIcon alyIcon;
    ImageIcon mattIcon;
    ImageIcon valeriIcon;
    
    public DevelopersPanel()
    {
        /* setup DevelopersPanel */
        super();
        setBackground(Color.black);
        setLayout(new BorderLayout());
        
        /* create and setup panel for developer Aly */
        alyPanel = new JPanel();
        alyPanel.setLayout(null);
        alyPanel.setBackground (new Color(255,163,199));
        alyPanel.setPreferredSize (new Dimension(250, 600));
        alyNameLabel = new JLabel ("Aly");
        alyNameLabel.setFont(new Font("Arial", Font.BOLD, 48));
        alyNameLabel.setForeground(Color.white);
        alyNameLabel.setBounds(0,0,250,100);
        alyNameLabel.setHorizontalAlignment(JLabel.CENTER);
        alyPanel.add (alyNameLabel);
    
        alyBioLabel = new JLabel("<html>Aly is majoring in Information Science "
                + "and Technology, graduating in Fall 2018 with her second bachelors "
                + "degree. <br><br> Fun Fact: She loves to bake cupcakes.</html>");
        alyBioLabel.setFont(new Font("Arial", Font.BOLD, 16));
        alyBioLabel.setForeground(Color.white);
        alyBioLabel.setBounds(25, 30, 200, 300);
        alyPanel.add(alyBioLabel);
        
        alyIcon = new ImageIcon("images/developers/aly.jpg");
        alyImage = new JLabel(alyIcon);
        alyImage.setBounds(25, 350, 200, 200);
        alyPanel.add(alyImage);
        
        /* create and setup panel for developer Matt */
        mattPanel = new JPanel();
        mattPanel.setLayout(null);
        mattPanel.setBackground (new Color(106,152,226));
        mattPanel.setPreferredSize (new Dimension(250, 600));
        mattNameLabel = new JLabel ("Matt");
        mattNameLabel.setFont(new Font("Arial", Font.BOLD, 48));
        mattNameLabel.setForeground(Color.white);
        mattNameLabel.setBounds(0,0,250,100);
        mattNameLabel.setHorizontalAlignment(JLabel.CENTER);
        mattPanel.add (mattNameLabel);
        
        mattBioLabel = new JLabel("<html>Matt is also majoring in IST, with a focus on "
                + "Organizational Leadership. As a part-time student and full-time employee, "
                + "he has no idea when he will graduate.<br><br> Fun Fact: He is "
                + "neither grumpy, nor a cat.</html>");
        mattBioLabel.setFont(new Font("Arial",Font.BOLD,16));
        mattBioLabel.setForeground(Color.white);
        mattBioLabel.setBounds(25,30,200,300);
        mattPanel.add(mattBioLabel);
        
        mattIcon = new ImageIcon("images/developers/gc-resized.jpg");
        mattImage = new JLabel(mattIcon);
        mattImage.setBounds(25,350,200,200);
        mattPanel.add(mattImage);
        
        /* create and setup panel for developer Valeri */
        valeriPanel = new JPanel();
        valeriPanel.setLayout(null);
        valeriPanel.setBackground (new Color(122,226,141));
        valeriPanel.setPreferredSize (new Dimension(250, 600));
        valeriNameLabel = new JLabel ("Valeri");
        valeriNameLabel.setFont(new Font("Arial", Font.BOLD, 48));
        valeriNameLabel.setForeground(Color.white);
        valeriNameLabel.setBounds(0,0,250,100);
        valeriNameLabel.setHorizontalAlignment(JLabel.CENTER);
        valeriPanel.add (valeriNameLabel);
        
        valeriBioLabel = new JLabel("<html>Valeri is majoring in Security and "
                + "Risk Analysis, graduating someday in the hazy future. "
                + "<br><br> Fun Fact: She has the world's best dog, a puggle "
                + "named Pumpernickel.</html>");
        valeriBioLabel.setFont(new Font("Arial",Font.BOLD,16));
        valeriBioLabel.setForeground(Color.white);
        valeriBioLabel.setBounds(25,30,200,300);
        valeriPanel.add(valeriBioLabel);
        
        valeriIcon = new ImageIcon("images/developers/valeri.png");
        valeriImage = new JLabel(valeriIcon);
        valeriImage.setBounds(25,350,200,200);
        valeriPanel.add(valeriImage);
        
        /* create setup and add allDevelopers panel to contain individual developer panels */
        allDevelopers = new JPanel();
        allDevelopers.setBackground(Color.black);
        allDevelopers.setVisible(true);
        add(allDevelopers,BorderLayout.CENTER);
        
        /* add all developer panels */
        allDevelopers.add(alyPanel);
        allDevelopers.add(mattPanel);
        allDevelopers.add(valeriPanel);
        
        /* create and add bBackMainMenu button */
        bBackMainMenu = new JButton("Main Menu");
        add(bBackMainMenu,BorderLayout.NORTH);
    }
    
    public JButton getBackButton()
    {
        return bBackMainMenu;
    }
}
