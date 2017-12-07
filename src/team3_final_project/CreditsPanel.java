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
    private JPanel recentScoresPanel;
    private JPanel creditsPanel;
    
    /*declare labels and text areas */
    private JTextArea recentScoresArea1;
    private JTextArea creditsArea1;
    public JLabel winLoseLabel;
    
    /*declare current player */
    private Player currentPlayer;
    
    /*declare high score list */
    private ArrayList<String> recentScores;
    
    public CreditsPanel()
    {
        /* setup CreditsPanel */
        super();
        setBackground(Color.black);
        setLayout(new BorderLayout());
        
        Font borderFont = new Font("SansSerif", Font.BOLD, 30);
        Border whiteLine = BorderFactory.createLineBorder(Color.white);
        Border whiteLineTitle = BorderFactory.createTitledBorder(whiteLine, "");
        
        Border recentScoresBorder = new TitledBorder(whiteLineTitle, "Recent Scores",TitledBorder.LEFT, TitledBorder.TOP, borderFont, Color.white);
        Border creditsBorder = new TitledBorder(whiteLineTitle, "Credits",TitledBorder.LEFT, TitledBorder.TOP, borderFont, Color.white);
        
        /* create and setup panel for high scores */
        recentScoresPanel = new JPanel();
        recentScoresPanel.setLayout(null);
        recentScoresPanel.setBackground (Color.green);
        recentScoresPanel.setBorder(recentScoresBorder);
        
        recentScoresArea1 = new JTextArea ("testingtestingtesting testing testingtestingtesting testing testing testing testing testing testing testing testing");
        recentScoresArea1.setBounds(25,50,250,600);
        recentScoresArea1.setFont(new Font("Arial", Font.BOLD, 30));
        recentScoresArea1.setForeground(Color.white);
        recentScoresArea1.setWrapStyleWord(true);
        recentScoresArea1.setLineWrap(true);
        recentScoresArea1.setOpaque(false);
        recentScoresArea1.setEditable(false);
        recentScoresArea1.setFocusable(false);
        
        recentScoresPanel.add (recentScoresArea1);
        
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
        
        /* create, setup, and add containerPanel panel to contain individual panels */
        containerPanel = new JPanel();
        containerPanel.setLayout(new GridLayout());
        containerPanel.setVisible(true);
        add(containerPanel,BorderLayout.CENTER);
        
        /* add all panels */
        containerPanel.add(recentScoresPanel);
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
    
    public void recordScore(ArrayList inRecentScores)
    {
        int recentScoreCount = inRecentScores.size();
        int score = currentPlayer.getScore();
        int time = currentPlayer.getTime();
        String character = currentPlayer.getCharacter();
        String theme = currentPlayer.getTheme();
        
        for(int i=recentScoreCount; i<0; i--)
        {
            String rScore = inRecentScores.get(i-1).toString();
            rScore = rScore.replace("SCORE:", "");
            int rScoreInt = Integer.valueOf(rScore.substring(0,rScore.indexOf("-")));
            rScore = rScore.replace(rScoreInt + "-", "");
            int rTimeInt = Integer.valueOf(rScore.substring(0,rScore.indexOf("-")));
//            missing something here?
        }
    }
    
    public void getRecentScores()
    {
        XML_240 reader = new XML_240();
        reader.openReaderXML("recentScore.xml");
        
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
        
        recentScores = scores;
        
        recordScore(recentScores);
    }
    
    public void showScores()
    {
        
    }
}
