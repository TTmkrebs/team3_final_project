package team3_final_project;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Team3_JPanel extends JPanel implements ActionListener, KeyListener
{
    /* window sizes & shapes */
    private Rectangle win = new Rectangle(0,0,800,700);
    private Dimension dim = new Dimension(win.width,win.height);
    private Rectangle gameWin = new Rectangle(0,102,800,597);
    
    /* base panel initializations */
    private MainPanel main;
    private InstructionsPanel instr;
    private DevelopersPanel devs;
    private ChoicesPanel choice;
    private MapPanel game;
    private GameMainPanel campus;
    private CreditsPanel credits;
    
    /* button initializations */
    private JButton bNewGame;
    private JButton bDevelopers;
    private JButton bInstructions;
    private JButton bBack = null;
    private JButton bPlayGame;
    private JButton bPause;
    private JButton bMainMenu;
    private JButton bScore;
    
    /* character information */
    private Player currentPlayer;
    
    /* create questions */
    private TriviaQuestion[] questionList;
    
    /* campus information */
    private GameMainPanel[] campusList;
    
    /* game timer */
    private Timer time;
    private boolean gamePaused = false;
    
    public Team3_JPanel()
    {
        /* setup base panel */
        super();
        setLayout(null);
        setBackground(Color.green);
        setSize(dim);
        
        /* initialize & display main panel */
        main = new MainPanel();
        main.setSize(dim);
        add(main);
        main.setBounds(win);
        bNewGame = main.getChoicesButton();
        bNewGame.addActionListener(this);
        bDevelopers = main.getDevelopersButton();
        bDevelopers.addActionListener(this);
        bInstructions = main.getInstructionsButton();
        bInstructions.addActionListener(this);
        main.setVisible(true);
        
        /* initialize instructions panel */
        instr = new InstructionsPanel();
        instr.setSize(dim);
        add(instr);
        instr.setBounds(win);
        instr.setVisible(false);
        
        /* initialize developers panel */
        devs = new DevelopersPanel();
        instr.setSize(dim);
        add(devs);
        devs.setBounds(win);
        devs.setVisible(false);
        
        /* initialize choices panel */
        choice = new ChoicesPanel();
        choice.setSize(dim);
        add(choice);
        choice.setBounds(win);
        bPlayGame = choice.getPlayButton();
        bPlayGame.addActionListener(this);
        choice.setVisible(false);
        
        /* initialize game panel */
        game = new MapPanel();
        game.setSize(dim);
        add(game);
        game.setBounds(win);
        game.addKeyListener(this);
        game.setVisible(false);
        
        /* initialize credits panel */
        credits = new CreditsPanel();
        credits.setSize(dim);
        add(credits);
        credits.setBounds(win);
        credits.setVisible(false);
        
        /* create question objects */
        questionList = createQuestions();
        
        /* create campus objects */
        campusList = createCampuses();
        for(int i=0; i<campusList.length;i++)
        {
            campusList[i].setSize(dim);
            add(campusList[i]);
            campusList[i].setBounds(win);
            campusList[i].setVisible(false);
        }
        
        /* initialize timer */
        time = new Timer(1000,this);      
    }
    
    public GameMainPanel[] createCampuses()
    {
        XML_240 xml = new XML_240();
        xml.openReaderXML("campusList.xml");
        
        GameMainPanel[] campusList = new GameMainPanel[6];
        
        for(int i = 0; i < 6; i++)
        {          
            campusList[i] = new GameMainPanel((String)xml.ReadObject(), 
                    (ImageIcon)xml.ReadObject(),(ImageIcon)xml.ReadObject());
            campusList[i].setQuestions(questionList);
        }
        xml.closeReaderXML();
        
        campus = campusList[0];
        
        return campusList;
    }
    
    public TriviaQuestion[] createQuestions()
    {
        int questionCount = 15;
        
        XML_240 xml = new XML_240();
        xml.openReaderXML("questions.xml");
        
        TriviaQuestion[] questionList = new TriviaQuestion[questionCount];
        
        for(int i = 0; i < questionCount; i++)
        {
            String theme = (String) xml.ReadObject();
            String completed = (String) xml.ReadObject();
            String question = (String) xml.ReadObject();
            String a = (String) xml.ReadObject();
            String b = (String) xml.ReadObject();
            String c = (String) xml.ReadObject();
            String d = (String) xml.ReadObject();
            String answer = (String) xml.ReadObject();     
            
            questionList[i] = new TriviaQuestion(theme, completed, question,
            a, b, c, d, answer);
        }
        xml.closeReaderXML();
        
        return questionList;
    }
        
    public void showChoice()
    {
        /* toggle panel visibility */
            choice.setVisible(true);
            main.setVisible(false);
            instr.setVisible(false);
            devs.setVisible(false);
            
            /* reassign buttons */
            bBack = choice.getBackButton();
            bBack.addActionListener(this);
    }
    
    public void showInstruction()
    {
        /* toggle panel visibility */
            instr.setVisible(true);
            main.setVisible(false);
            choice.setVisible(false);
            devs.setVisible(false);
            
            /* reassign buttons */
            bBack = instr.getBackButton();
            bBack.addActionListener(this);
    }
    
    public void showDeveloper()
    {
        /* toggle panel visibility */
            devs.setVisible(true);
            main.setVisible(false);
            instr.setVisible(false);
            choice.setVisible(false);
            
            /* reassign buttons */
            bBack = devs.getBackButton();
            bBack.addActionListener(this);
    }
    
    public void showCredits()
    {
        /* toggle panel visibility */
            credits.setVisible(true);
            main.setVisible(false);
            instr.setVisible(false);
            choice.setVisible(false);
            devs.setVisible(false);
    }
    
    public Player createPlayer()
    {
        currentPlayer = new Player(choice.getCharacter());
        currentPlayer.setTheme(choice.getTheme());
        currentPlayer.setThemeIcon(choice.getThemeIcon(currentPlayer.getTheme()));
        
        return currentPlayer;
    }
    
    public void playGame(Player inPlayer)
    {
        /* pass player into game & campus panel */
        currentPlayer = createPlayer(); 
        inPlayer = currentPlayer;
        game.assignPlayer(currentPlayer);
//        credits.assignPlayer(currentPlayer);

        /* pass character icon & qustions into campus panel */
        for(int i=0;i<campusList.length;i++)
        {
            campusList[i].setPlayer(currentPlayer);
            campusList[i].filterQuestions();
            campusList[i].repaint();
        }
        
        
        /* toggle panel visibility */
        instr.setVisible(false);
        devs.setVisible(false);
        choice.setVisible(false);
        main.setVisible(false);
        game.setVisible(true);

        /* toggle background color */
        setBackground(Color.BLACK);

        /* reassign buttons */
        bBack = game.getBackButton();
        bBack.addActionListener(this);
        bPause = game.getPauseButton();
        bPause.addActionListener(this);

        /* start timer */
        time.restart();

        /* focus on game board */
        game.setFocus();
    }
    
    public void displayCampus(String inCampus)
    {
        for(int i=0; i<campusList.length; i++)
        {
            boolean nameMatch = campusList[i].getName().equals(inCampus);
            boolean completed = campusList[i].getCompleted() == false;
            
            if(nameMatch && completed)
            {
                campus = campusList[i];
                game.setVisible(false);
                campus.setVisible(true);
                bBack = campusList[i].getBackButton();
                bBack.addActionListener(this);
                bMainMenu = campusList[i].getMainMenuButton();
                bMainMenu.addActionListener(this);
                campus.setScore(currentPlayer.getScore());
                campus.selectQuestion();
                
            }
            else
            {
                campusList[i].setVisible(false);
            }
        }
    }
    
    public void backButton()
    {
        if(instr.isVisible() || choice.isVisible() || devs.isVisible() || game.isVisible())
            {
                time.stop();
                /* toggle panel visibility */
                instr.setVisible(false);
                devs.setVisible(false);
                choice.setVisible(false);
                game.setVisible(false);
                main.setVisible(true);
                bScore = game.getScoreButton();
                bScore.setText("Score: " + currentPlayer.getScore());
                
                /* reassign buttons */
                bBack = null;
            }
        for(int i=0; i<campusList.length; i++)
        {
            if(campusList[i].isVisible())
            {
                bScore = game.getScoreButton();
                bScore.setText("Score: " + currentPlayer.getScore());
                campusList[i].setCompleted(true);
                campusList[i].setVisible(false);
                game.setVisible(true);
                game.setFocus();
                bBack = game.getBackButton();
                currentPlayer.setVisits();
            }
            campusList[i].getScoreButton().setText("Score: " + currentPlayer.getScore());
        }
        if(currentPlayer.getVisits() == 1)
        {
            time.stop();
            for(int i = 0; i <campusList.length; ++i)
            {
                campusList[i].setVisible(false);
                game.setVisible(false);
            }
            credits.setPlayer(currentPlayer);
            credits.getHighScores();
            credits.setVisible(true);
            if (currentPlayer.getScore() >= 5){credits.winLoseLabel.setText("You Won!");}
            else {credits.winLoseLabel.setText("You Lost!");}
        }
    }
    
    public void mainMenuButton()
    {
        game.setVisible(false);
        instr.setVisible(false);
        devs.setVisible(false);
        choice.setVisible(false);
        credits.setVisible(false);
        currentPlayer = null;
        for(int i=0; i<campusList.length; i++) {campusList[i].setVisible(false);}
        main.setVisible(true);
    }
   
    private void pausePressed()
    {
        if(time.isRunning())
        {
            gamePaused = true;
            game.setPauseButtonText("Resume Game");
            time.stop();
            game.setFocus();
        }
        else
        {
            gamePaused = false;
            game.setPauseButtonText("Pause Game");
            time.start();
            game.setFocus();
        }
    }
    
    private void movePlayer(KeyEvent e)
    {
        int code = e.getKeyCode();
        int speed = 5;
        if(gamePaused == false)
        {
            if(code == e.VK_LEFT)
            { 
                if(game.getPlayerY() - speed > gameWin.x)
                {
                    game.setPlayerX(speed * -1);
                }
            }
            if(code == e.VK_RIGHT)
            {
                if(game.getPlayerX() + speed < gameWin.width - game.getPlayerIcon().getBounds().width)
                {
                    game.setPlayerX(speed);
                }
            }
            if(code == e.VK_UP)
            {
                if(game.getPlayerY() - speed > gameWin.y)
                {
                    game.setPlayerY(speed * -1);
                }
            }
            if(code == e.VK_DOWN)
            { 
                if(game.getPlayerY() + speed < gameWin.height - game.getPlayerIcon().getBounds().height) 
                {
                    game.setPlayerY(speed);
                }
            }
        }
    }
    
    public String campusCheck(int x, int y)
    {
        String campus = "";

        /* if paw icon is over Shenango, return selectedCampus */
        if(x > 7 && x < 40 && y > 270 && y < 291) { campus = "Campus:Shenango"; }
         /* if paw icon is over World Campus, return selectedCampus */
        if(x > 300 && x < 330 && y > 160 && y < 190) { campus = "Campus:World Campus"; }
        /* if paw icon is over Greater Allegheny, return selectedCampus */
        if(x > 92 && x < 120 && y > 440 && y < 462) { campus = "Campus:Greater Allegheny"; }
        /* if paw icon is over University Park, return selectedCampus */
        if(x > 352 && x < 381 && y > 346 && y < 369) { campus = "Campus:University Park"; }
        /* if paw icon is over Worthington Scranton, return selectedCampus */
        if(x > 672 && x < 696 && y > 245 && y < 270) { campus = "Campus:Worthington Scranton"; }
        /* if paw icon is over Great Valley, return selectedCampus */
        if(x > 670 && x < 690 && y > 499 && y < 521) { campus = "Campus:Great Valley"; }
        
        return campus;
    }
    
    public void pushTime(int time)
    {
        game.setTimer(time);
        for(int i=0; i < campusList.length; i++)
        {
           campusList[i].setTimer(time);
        }
    }
        
    @Override
    public void actionPerformed(ActionEvent e)
    {
        Object obj =  e.getSource();
        if(obj == bNewGame) { showChoice(); }
        if(obj == bInstructions) { showInstruction(); }
        if(obj == bDevelopers) { showDeveloper(); }
        if(obj == bBack) { backButton(); }
        if(obj == bPlayGame)
        {
            currentPlayer = createPlayer();
            playGame(currentPlayer);
            game.setFocus();
        }
        if(obj == time)
        {
            currentPlayer.setTime(currentPlayer.getTime() + 1);
            pushTime(currentPlayer.getTime());
        }
        if(obj == bPause) { pausePressed(); }
        if(obj == bMainMenu) { mainMenuButton(); }
    }
    
    @Override
    public void keyPressed(KeyEvent e)
    {
        if(time.isRunning()) { movePlayer(e); }
        
        String onCampus = campusCheck(game.getPlayerX(),game.getPlayerY());
        if(onCampus != "")
        {
            displayCampus(onCampus);
        }
    }
    
    @Override
    public void keyReleased(KeyEvent e) {}
    
    @Override
    public void keyTyped(KeyEvent e) {}
}
