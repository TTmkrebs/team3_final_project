package team3_final_project;

import java.awt.*;
import java.util.*;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;

public class CreditsPanel extends JPanel
{
    /*declare panels */
    private JPanel containerPanel;
    private JPanel highScoresPanel;
    private JPanel creditsPanel;
    
    /*declare labels and text areas */
    private JTextArea highScoresArea1;
    private JTextArea creditsArea1;
    public JLabel winLoseLabel;
    
    /*declare current player */
    private Player currentPlayer;
    
    /*declare high score list */
    private ArrayList<String> highScores;
    
    public CreditsPanel()
    {
        /* setup CreditsPanel */
        super();
        setBackground(Color.black);
        setLayout(new BorderLayout());
        
        Font borderFont = new Font("SansSerif", Font.BOLD, 30);
        Border whiteLine = BorderFactory.createLineBorder(Color.white);
        Border whiteLineTitle = BorderFactory.createTitledBorder(whiteLine, "");
        
        Border highScoresBorder = new TitledBorder(whiteLineTitle, "High Scores",TitledBorder.LEFT, TitledBorder.TOP, borderFont, Color.white);
        Border creditsBorder = new TitledBorder(whiteLineTitle, "Credits",TitledBorder.LEFT, TitledBorder.TOP, borderFont, Color.white);
        
        /* create and setup panel for high scores */
        highScoresPanel = new JPanel();
        highScoresPanel.setLayout(null);
        highScoresPanel.setBackground (Color.green);
        highScoresPanel.setBorder(highScoresBorder);
        
        highScoresArea1 = new JTextArea ("testingtestingtesting testing testingtestingtesting testing testing testing testing testing testing testing testing");
        highScoresArea1.setBounds(25,50,250,600);
        highScoresArea1.setFont(new Font("Arial", Font.BOLD, 30));
        highScoresArea1.setForeground(Color.white);
        highScoresArea1.setWrapStyleWord(true);
        highScoresArea1.setLineWrap(true);
        highScoresArea1.setOpaque(false);
        highScoresArea1.setEditable(false);
        highScoresArea1.setFocusable(false);
        
        highScoresPanel.add (highScoresArea1);
        
        /* create and setup panel for credits */
        creditsPanel = new JPanel();
        creditsPanel.setLayout(null);
        creditsPanel.setBackground(Color.cyan);
        creditsPanel.setBorder(creditsBorder);
        
        creditsArea1 = new JTextArea ("testing testingtestingtesting testing testingtestingtesting testing testing testing testing testing testing testing");
        creditsArea1.setBounds(25,50,250,600);
        creditsArea1.setFont(new Font("Arial", Font.BOLD, 30));
        creditsArea1.setForeground(Color.white);
        creditsArea1.setWrapStyleWord(true);
        creditsArea1.setLineWrap(true);
        creditsArea1.setOpaque(false);
        creditsArea1.setEditable(false);
        creditsArea1.setFocusable(false);
        
        creditsPanel.add (creditsArea1);
        
        /* create setup and add containerPanel panel to contain individual panels */
        containerPanel = new JPanel();
        containerPanel.setLayout(new GridLayout());
        containerPanel.setVisible(true);
        add(containerPanel,BorderLayout.CENTER);
        
        /* add all panels */
        containerPanel.add(highScoresPanel);
        containerPanel.add(creditsPanel);
        
        winLoseLabel = new JLabel("");
        winLoseLabel.setHorizontalAlignment(JLabel.CENTER);
        winLoseLabel.setFont(new Font("Arial", Font.BOLD, 40));
        winLoseLabel.setForeground(Color.yellow);
        add(winLoseLabel,BorderLayout.NORTH);
    }
    
    public void setPlayer(Player inPlayer)
    {
        currentPlayer = inPlayer;
    }
    
    public void recordScore(ArrayList inHighScores)
    {
        int highScoreCount = inHighScores.size();
        int score = currentPlayer.getScore();
        int time = currentPlayer.getTime();
        String character = currentPlayer.getCharacter();
        String theme = currentPlayer.getTheme();
        
        for(int i=highScoreCount; i<0; i--)
        {
            String hScore = inHighScores.get(i-1).toString();
            hScore = hScore.replace("SCORE:", "");
            int hScoreInt = Integer.valueOf(hScore.substring(0,hScore.indexOf("-")));
            hScore = hScore.replace(hScoreInt + "-", "");
            int hTimeInt = Integer.valueOf(hScore.substring(0,hScore.indexOf("-")));
            
        }
    }
    
    public void getHighScores()
    {
        XML_240 reader = new XML_240();
        reader.openReaderXML("highScore.xml");
        
        ArrayList<String> scores = new ArrayList<>();
        
        String line = reader.ReadObject().toString();
        while(line.startsWith("SCORE:"))
        {
            scores.add(line);
            if(reader.ReadObject().toString() != null)
            {
                line = reader.ReadObject().toString();
            }
            else {line = "";}
        }
        reader.closeReaderXML();
        
        Collections.sort(scores);
        
        highScores = scores;
        
        recordScore(highScores);
    }
    
    public void showScores()
    {
        
    }
}
