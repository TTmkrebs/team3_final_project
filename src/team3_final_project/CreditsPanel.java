package team3_final_project;

import java.awt.*;
import javax.swing.*;

public class CreditsPanel extends JPanel
{
    /* declare bBackMainMenu button to display MainPanel */
    private JButton bBackMainMenu;
   
    /*declare panels */
    private JPanel containerPanel;
    private JPanel highScoresPanel;
    private JPanel creditsPanel;
    
    /*declare labels */
    private JLabel highScoresLabel;
    private JLabel creditsLabel;
    public JLabel winLoseLabel;
    
    public CreditsPanel()
    {
        /* setup DevelopersPanel */
        super();
        setBackground(Color.black);
        setLayout(new BorderLayout());
        
        /* create and setup panel for developer Aly */
        highScoresPanel = new JPanel();
        highScoresPanel.setBackground (Color.black);
        highScoresLabel = new JLabel ("High Scores: ");
        highScoresLabel.setHorizontalAlignment(JLabel.CENTER);
        highScoresLabel.setFont(new Font("Arial", Font.BOLD, 40));
        highScoresLabel.setForeground(Color.white);
        highScoresPanel.add (highScoresLabel);
        
        creditsPanel = new JPanel();
        creditsPanel.setBackground(Color.cyan);
        creditsLabel = new JLabel ("Credits: ");
        creditsLabel.setHorizontalAlignment(JLabel.CENTER);
        creditsLabel.setFont(new Font("Arial", Font.BOLD, 40));
        creditsLabel.setForeground(Color.white);
        creditsPanel.add (creditsLabel);
        
        /* create setup and add containerPanel panel to contain individual developer panels */
        containerPanel = new JPanel();
        containerPanel.setLayout(new GridLayout());
        containerPanel.setVisible(true);
        add(containerPanel,BorderLayout.CENTER);
        
        /* add all developer panels */
        containerPanel.add(highScoresPanel);
        containerPanel.add(creditsPanel);
        
        winLoseLabel = new JLabel("");
        winLoseLabel.setHorizontalAlignment(JLabel.CENTER);
        winLoseLabel.setFont(new Font("Arial", Font.BOLD, 40));
        winLoseLabel.setForeground(Color.yellow);
        add(winLoseLabel,BorderLayout.NORTH);
        
        /* create and add bBackMainMenu button */
        bBackMainMenu = new JButton("Main Menu");
        add(bBackMainMenu,BorderLayout.SOUTH);
    }

    public JButton getBackButton()
    {
        return bBackMainMenu;
    }
}
