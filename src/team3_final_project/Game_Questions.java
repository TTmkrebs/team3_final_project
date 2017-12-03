package team3_final_project;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Game_Questions extends JPanel implements ActionListener 
{
    JButton answer1, answer2, answer3, answer4;
    JLabel chosenQuestion;
    int questionNum;
    String chosenTheme;
    private Boolean gameWon = false; 
    
    public Game_Questions(String theme, Boolean rightWrong, String question,
            String answerA, String answerB, String answerC, String answerD,
            String trueAnswer) 
    {
       super();
       setBackground(Color.gray);
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
           
       chosenTheme = "theme1";
       
       /*
       if (chosenTheme.equals("theme1"))
       {
           questionNum = randomNum();
           sportsQuestions(randomNum());
       } 
       */
    }
    
    public int randomNum() 
    {
        int num = 0;

        double r = Math.random();                                           //declaring variable for random number
        num = (int) (r * 1);
        
        return num;
    }
    
        public Game_Questions[] createQuestions()
    {
        XML_240 xml = new XML_240();
        xml.openReaderXML("questions.xml");
        
        Game_Questions[] questions = new Game_Questions[15];
        
        for(int i = 0; i < 15; i++)
        {          
            questions[i] = new Game_Questions((String)xml.ReadObject(), 
                    (Boolean)xml.ReadObject(),(String)xml.ReadObject(),
                    (String)xml.ReadObject(),(String)xml.ReadObject(),
                    (String)xml.ReadObject(), (String)xml.ReadObject(),
                    (String)xml.ReadObject());            
        }
        xml.closeReaderXML();
        
               
        return questions;
   
    /*
    public void sportsQuestions(int questionNum)
    {
        if (questionNum == 0) 
        {
            question.setText("Who is the head coach of Penn State's Men's Basketball Team?");
            answer1.setText("Chris Holtmann");
            answer2.setText("Tom Izzo");
            answer3.setText("John Beilein");
            answer4.setText("Pat Chambers"); 
        }
        
    }
    */
    
    }
        
    @Override
    public void actionPerformed(ActionEvent e) {
        Object obj = e.getSource();
        
        if (chosenTheme.equals("theme1") && questionNum == 0) 
        {
            if (obj == answer1)
            {
                answer1.setText("Incorrect");
            }
            if (obj == answer2)
            {
                answer2.setText("Incorrect");
            }
            if (obj == answer3)
            {
                answer3.setText("Incorrect");
            }
            if (obj == answer4)
            {
                answer4.setText("Correct");
            }
        }
    }
    
    
    
}