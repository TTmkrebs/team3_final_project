package team3_final_project;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Game_TicTacToe extends JPanel implements ActionListener
{
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton button5;
    private JButton button6;
    private JButton button7;
    private JButton button8;
    private JButton button9;
    private JButton[] buttonList;
    
    private Boolean gameWon = false;
    
    public Game_TicTacToe()
    {
        super();
        setLayout(new GridLayout(3,3));
        setBackground(Color.BLACK);
        
        button1 = new JButton("--");
        button1.addActionListener(this);
        add(button1);
        
        button2 = new JButton("--");
        button2.addActionListener(this);
        add(button2);
        
        button3 = new JButton("--");
        button3.addActionListener(this);
        add(button3);
        
        button4 = new JButton("--");
        button4.addActionListener(this);
        add(button4);
        
        button5 = new JButton("--");
        button5.addActionListener(this);
        add(button5);
        
        button6 = new JButton("--");
        button6.addActionListener(this);
        add(button6);
        
        button7 = new JButton("--");
        button7.addActionListener(this);
        add(button7);
        
        button8 = new JButton("--");
        button8.addActionListener(this);
        add(button8);
        
        button9 = new JButton("--");
        button9.addActionListener(this);
        add(button9);
        
        buttonList = new JButton[9];
        buttonList[0] = button1;
        buttonList[1] = button2;
        buttonList[2] = button3;
        buttonList[3] = button4;
        buttonList[4] = button5;
        buttonList[5] = button6;
        buttonList[6] = button7;
        buttonList[7] = button8;
        buttonList[8] = button9;
    }
    
    public void playerTurn(int buttonNumber)
    {
        buttonList[buttonNumber].setText("X");
        buttonList[buttonNumber].setEnabled(false);
    }
    
    public void cpuTurn()
    {
        int rInt = (int)(Math.floor(Math.random()*8));
        while(buttonList[rInt].getText()=="X")
        {
            rInt = (int)(Math.floor(Math.random()*8));
        }
        buttonList[rInt].setText("O");
        buttonList[rInt].setEnabled(false);
    }
    
    public Boolean winCheck()
    {
        Boolean win = false;
        
        /* check rows for win */
        if(button1.getText().equals("X") && button2.getText().equals("X") && button3.getText().equals("X"))
        {
            win = true;
        }
        if(button4.getText().equals("X") && button5.getText().equals("X") && button6.getText().equals("X"))
        {
            win = true;
        }
        if(button7.getText().equals("X") && button8.getText().equals("X") && button9.getText().equals("X"))
        {
            win = true;
        }
        
        /* check columns for win */
        if(button1.getText().equals("X") && button4.getText().equals("X") && button7.getText().equals("X"))
        {
            win = true;
        }
        if(button2.getText().equals("X") && button5.getText().equals("X") && button8.getText().equals("X"))
        {
            win = true;
        }
        if(button3.getText().equals("X") && button6.getText().equals("X") && button9.getText().equals("X"))
        {
            win = true;
        }
        /* check diagonals for win */
        if(button1.getText().equals("X") && button5.getText().equals("X") && button9.getText().equals("X"))
        {
            win = true;
        }
        if(button3.getText().equals("X") && button5.getText().equals("X") && button7.getText().equals("X"))
        {
            win = true;
        }
        
        return win;
    }
    
    public Boolean lossCheck()
    {
        Boolean loss = false;
        
        /* check rows for loss */
        if(button1.getText().equals("O") && button2.getText().equals("O") && button3.getText().equals("O"))
        {
            loss = true;
        }
        if(button4.getText().equals("O") && button5.getText().equals("O") && button6.getText().equals("O"))
        {
            loss = true;
        }
        if(button7.getText().equals("O") && button8.getText().equals("O") && button9.getText().equals("O"))
        {
            loss = true;
        }
        
        /* check columns for loss */
        if(button1.getText().equals("O") && button4.getText().equals("O") && button7.getText().equals("O"))
        {
            loss = true;
        }
        if(button2.getText().equals("O") && button5.getText().equals("O") && button8.getText().equals("O"))
        {
            loss = true;
        }
        if(button3.getText().equals("O") && button6.getText().equals("O") && button9.getText().equals("O"))
        {
            loss = true;
        }
        /* check diagonals for loss */
        if(button1.getText().equals("O") && button5.getText().equals("O") && button9.getText().equals("O"))
        {
            loss = true;
        }
        if(button3.getText().equals("O") && button5.getText().equals("O") && button7.getText().equals("O"))
        {
            loss = true;
        }
        
        return loss;
    }
    
    public void winner()
    {
        for(int i=0; i<buttonList.length; i++)
        {
            buttonList[i].setText("WINNER!");
            buttonList[i].setEnabled(false);
        }
        gameWon = true;
    }
    
    public void loser()
    {
        for(int i=0; i<buttonList.length; i++)
        {
            buttonList[i].setText("BOOO!");
            buttonList[i].setEnabled(false);
        }
    }
    
    public Boolean getGameResult()
    {
        return gameWon;
    }
    
    @Override
    public void actionPerformed(ActionEvent e)
    {
        Object obj = e.getSource();
        
        if(obj == button1) {playerTurn(0);}
        if(obj == button2) {playerTurn(1);}
        if(obj == button3) {playerTurn(2);}
        if(obj == button4) {playerTurn(3);}
        if(obj == button5) {playerTurn(4);}
        if(obj == button6) {playerTurn(5);}
        if(obj == button7) {playerTurn(6);}
        if(obj == button8) {playerTurn(7);}
        if(obj == button9) {playerTurn(8);}
        
        if(winCheck()){winner();}
        else
        {
            cpuTurn();
            if(lossCheck()){loser();}
        }
    }
}
