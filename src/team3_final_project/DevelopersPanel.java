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
    private JLabel mattBioLabel;
    private JLabel valeriNameLabel;
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
        alyPanel.setLayout(new BorderLayout());
        alyPanel.setBackground (Color.black);
        alyPanel.setPreferredSize (new Dimension(250, 600));
        alyNameLabel = new JLabel ("Aly", SwingConstants.CENTER);
        alyNameLabel.setFont(new Font("Arial", Font.BOLD, 48));
        alyNameLabel.setForeground(Color.white);
        alyPanel.add (alyNameLabel,BorderLayout.NORTH);
        alyIcon = new ImageIcon("images/developers/aly.jpg");
        alyBioLabel = new JLabel("Aly Bio",alyIcon,JLabel.CENTER);
        alyBioLabel.setFont(new Font("Arial", Font.BOLD, 32));
        alyBioLabel.setForeground(Color.white);
        alyBioLabel.setVerticalTextPosition(JLabel.BOTTOM);
        alyBioLabel.setVerticalTextPosition(JLabel.CENTER);
        alyPanel.add(alyBioLabel);
        
        /* create and setup panel for developer Matt */
        mattPanel = new JPanel();
        mattPanel.setLayout(new BorderLayout());
        mattPanel.setBackground (Color.black);
        mattPanel.setPreferredSize (new Dimension(250, 600));
        mattNameLabel = new JLabel ("Matt", SwingConstants.CENTER);
        mattNameLabel.setFont(new Font("Arial", Font.BOLD, 48));
        mattNameLabel.setForeground(Color.white);
        mattPanel.add (mattNameLabel,BorderLayout.NORTH);
        mattIcon = new ImageIcon("images/developers/gc.jpg");
        mattBioLabel = new JLabel("Matt Bio",mattIcon,JLabel.CENTER);
        mattBioLabel.setFont(new Font("Arial",Font.BOLD,32));
        mattBioLabel.setForeground(Color.white);
        mattBioLabel.setVerticalTextPosition(JLabel.BOTTOM);
        mattBioLabel.setVerticalTextPosition(JLabel.CENTER);
        mattPanel.add(mattBioLabel);
        
        /* create and setup panel for developer Valeri */
        valeriPanel = new JPanel();
        valeriPanel.setLayout(new BorderLayout());
        valeriPanel.setBackground (Color.black);
        valeriPanel.setPreferredSize (new Dimension(250, 600));
        valeriNameLabel = new JLabel ("Valeri", SwingConstants.CENTER);
        valeriNameLabel.setFont(new Font("Arial", Font.BOLD, 48));
        valeriNameLabel.setForeground(Color.white);
        valeriPanel.add (valeriNameLabel,BorderLayout.NORTH);
        valeriIcon = new ImageIcon("images/developers/valeri.png");
        valeriBioLabel = new JLabel("Valeri Bio",valeriIcon,JLabel.CENTER);
        valeriBioLabel.setFont(new Font("Arial",Font.BOLD,32));
        valeriBioLabel.setForeground(Color.white);
        valeriBioLabel.setVerticalTextPosition(JLabel.BOTTOM);
        valeriBioLabel.setVerticalTextPosition(JLabel.CENTER);
        valeriPanel.add(valeriBioLabel);
        
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
