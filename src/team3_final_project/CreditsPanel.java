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
    private JLabel creditsLabel1;
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
        recentScoresPanel.setBackground (Color.black);
        recentScoresPanel.setBorder(recentScoresBorder);
        
        recentScoresArea1 = new JTextArea ("");
        recentScoresArea1.setBounds(25,50,350,600);
        recentScoresArea1.setFont(new Font("Arial", Font.BOLD, 13));
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
        creditsPanel.setBackground(Color.black);
        creditsPanel.setBorder(creditsBorder);
        
        creditsLabel1 = new JLabel ("<html>The Pennsylvania State University<br>" 
                + "World Campus<br>" + "IST 240 - Fall 2017<br>" + "Professor: Dr. Mark Choman<br><br>"
                + "Group 3 - Penn State Explorer<br>" + "Aly Bump<br>" + "Matt Krebs<br>" 
                + "Valeri Simmons</html>");
        creditsLabel1.setBounds(25,50,350,600);
        creditsLabel1.setFont(new Font("Arial", Font.BOLD, 20));
        creditsLabel1.setVerticalAlignment(JLabel.TOP);
        creditsLabel1.setForeground(Color.white);
        
        creditsPanel.add (creditsLabel1);
        
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
    
    public void recordScore(ArrayList<String> inRecentScores)
    {
        int recentScoreCount = inRecentScores.size();
        int score = currentPlayer.getScore();
        int time = currentPlayer.getTime();
        String character = currentPlayer.getCharacter();
        String theme = currentPlayer.getTheme();
        ArrayList<String> scoreList = new ArrayList<>();
        String currentScore = "SCORE:" + score + "-" + time + "-" + character + "-" + theme;
        
        scoreList.add(currentScore);
        
        for(int i=0; i<recentScoreCount; i++)
        {
            scoreList.add(inRecentScores.get(i));
        }
        
        XML_240 writer = new XML_240();
        writer.openWriterXML("recentScore.xml");
        
        for(int i=0; i<scoreList.size(); i++)
        {
            writer.writeObject(scoreList.get(i));
        }
        
        writer.closeWriterXML();
        
        showScores(scoreList);
    }
    
    public void getRecentScores()
    {
        XML_240 reader = new XML_240();
        reader.openReaderXML("recentScore.xml");
        
        ArrayList<String> scores = new ArrayList<>();
        
        for(int i=0; i<5; i++)
        {
            String line = reader.ReadObject().toString();
            if(line.startsWith("SCORE:"))
            {
                scores.add(line);
            }
            else
            {
                line = reader.ReadObject().toString();
                scores.add(line);
            }
        }
        reader.closeReaderXML();
        
        Collections.sort(scores);
        
        recentScores = scores;
        
        recordScore(recentScores);
    }
    
    public void showScores(ArrayList<String> inScores)
    {
        int score1 = 0;
        int time1 = 0;
        String char1 = "";
        String theme1 = "";
        
        int score2 = 0;
        int time2 = 0;
        String char2 = "";
        String theme2 = "";
        
        int score3 = 0;
        int time3 = 0;
        String char3 = "";
        String theme3 = "";
        
        int score4 = 0;
        int time4 = 0;
        String char4 = "";
        String theme4 = "";
        
        int score5 = 0;
        int time5 = 0;
        String char5 = "";
        String theme5 = "";
        
        for(int i=0; i<inScores.size(); i++)
        {
            String scoreLine = inScores.get(i).replace("SCORE:", "");
            int score = Integer.valueOf(scoreLine.substring(0,scoreLine.indexOf("-")));
            scoreLine = scoreLine.replace(score + "-", "");
            int time = Integer.valueOf(scoreLine.substring(0,scoreLine.indexOf("-")));
            scoreLine = scoreLine.replace(time + "-", "");
            String character = scoreLine.substring(0,scoreLine.indexOf("-"));
            String theme = scoreLine.replace(character + "-","");
            
            if(i==0)
            {
                score1 = score;
                time1 = time;
                char1 = character;
                theme1 = theme;
            }
            
            if(i==1)
            {
                score2 = score;
                time2 = time;
                char2 = character;
                theme2 = theme;
            }
            
            if(i==2)
            {
                score3 = score;
                time3 = time;
                char3 = character;
                theme3 = theme;
            }
            
            if(i==3)
            {
                score3 = score;
                time3 = time;
                char3 = character;
                theme3 = theme;
            }
            
            if(i==4)
            {
                score4 = score;
                time4 = time;
                char4 = character;
                theme4 = theme;
            }
            
            if(i==5)
            {
                score5 = score;
                time5 = time;
                char5 = character;
                theme5 = theme;
            }
        }
        
        String line1 = score1 + " points : " + time1 + " seconds : " + char1 + 
                ": " + theme1 + "\n";
        String line2 = score2 + " points : " + time2 + " seconds : " + char2 + 
                ": " + theme2 + "\n";
        String line3 = score3 + " points : " + time3 + " seconds : " + char3 + 
                ": " + theme3 + "\n";
        String line4 = score4 + " points : " + time4 + " seconds : " + char4 + 
                ": " + theme4 + "\n";
        String line5 = score5 + " points : " + time5 + " seconds : " + char5 + 
                ": " + theme5 + "\n";
        
        recentScoresArea1.setText(line1 + line2 + line3 + line4 + line5);
    }
}
