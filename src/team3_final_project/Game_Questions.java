package team3_final_project;

import java.awt.*;
import java.awt.event.*;
import java.util.HashSet;
import java.util.Set;
import javax.swing.*;

public class Game_Questions extends JPanel implements ActionListener 
{
    private JButton answer1, answer2, answer3, answer4;
    private JLabel chosenQuestion;
    private Boolean gameWon = false;
    private Player currentPlayer;
    private TriviaQuestion[] questionList;
    private String answer;
    private String choice;
    
    public Game_Questions() 
    {
       super();
       setBackground(Color.black);
       setLayout(null);

       
       chosenQuestion = new JLabel();
       chosenQuestion.setBounds(75, 100, 400, 75);
       chosenQuestion.setForeground(Color.white);
       add(chosenQuestion);
       
       answer1 = new JButton();
       answer1.setBounds(100, 200, 150, 75);
       answer1.addActionListener(this);
       add(answer1);
       
       answer2 = new JButton();
       answer2.setBounds(300, 200, 150, 75);
       answer2.addActionListener(this);
       add(answer2);
       
       answer3 = new JButton();
       answer3.setBounds(100, 300, 150, 75);
       answer3.addActionListener(this);
       add(answer3);
       
       answer4 = new JButton();
       answer4.setBounds(300, 300, 150, 75); 
       answer4.addActionListener(this);
       add(answer4);
    }
    
    public void setQuestions(TriviaQuestion[] inQuestions)
    {
        questionList = inQuestions;
    }
    
    public void filterQuestions(TriviaQuestion[] inQuestions)
    {
        int themeQuestions = 0;
        for(int i=0; i<inQuestions.length; i++)
        {
            String inQTheme = inQuestions[i].getTheme().replace("Theme:", "");
            String inPlayerTheme = currentPlayer.getTheme().replace("PSU ", "");
            
            if(inQTheme.equals(inPlayerTheme))
            {
                themeQuestions += 1;
            }
        }
        
        questionList = new TriviaQuestion[themeQuestions];
        int qCount = 0;
        
        for(int i=0; i<inQuestions.length; i++)
        {
            String inQTheme = inQuestions[i].getTheme().replace("Theme:", "");
            String inPlayerTheme = currentPlayer.getTheme().replace("PSU ", "");
            
            if(inQTheme.equals(inPlayerTheme))
            {
                questionList[qCount] = inQuestions[i];
                qCount += 1;
            }
        }
    }
    
    public void selectQuestion()
    {
        int qNum = (int)(Math.random() * questionList.length);
        
        TriviaQuestion question = questionList[qNum];
        
        chosenQuestion.setText(question.getQuestion().replace("Question: ", ""));
        answer1.setText(question.getA());
        answer2.setText(question.getB());
        answer3.setText(question.getC());
        answer4.setText(question.getD());
        
        answer = question.getAnswer().replace("Answer: ", "");
    }
    
    public void setPlayer(Player inPlayer)
    {
        currentPlayer = inPlayer;
    }
    
    public TriviaQuestion getQuestion(int qNumber)
    {
        return questionList[qNumber];
    }
    
    public void answerCheck()
    {
        if(choice.equals(answer))
        {
            answer1.setText("CORRECT");
            answer1.setEnabled(false);
            answer2.setText("CORRECT");
            answer2.setEnabled(false);
            answer3.setText("CORRECT");
            answer3.setEnabled(false);
            answer4.setText("CORRECT");
            answer4.setEnabled(false);
            
            gameWon = true;
        }
        else
        {
            answer1.setText("INCORRECT");
            answer1.setEnabled(false);
            answer2.setText("INCORRECT");
            answer2.setEnabled(false);
            answer3.setText("INCORRECT");
            answer3.setEnabled(false);
            answer4.setText("INCORRECT");
            answer4.setEnabled(false);
            
            gameWon = false;
        }
    }
     
    @Override
    public void actionPerformed(ActionEvent e) {
        Object obj = e.getSource();
        if(obj == answer1)
        {
            choice = "A";
        }
        if(obj == answer2)
        {
            choice = "B";
        }
        if(obj == answer3)
        {
            choice = "C";
        }
        if(obj == answer4)
        {
            choice = "D";
        }
        answerCheck();
    }  
}