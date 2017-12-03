package team3_final_project;

public class TriviaQuestion 
{
    private String theme;
    private Boolean complete;
    private String question;
    private String a;
    private String b;
    private String c;
    private String d;
    private String answer;
    
    public TriviaQuestion(String inTheme, String inComplete, String inQuestion,
            String inA, String inB, String inC, String inD, String inAnswer)
    {
        theme = inTheme;
        if(inComplete.equals("true")){complete = true;}
        else{complete = false;}
        question = inQuestion;
        a = inA;
        b = inB;
        c = inC;
        d = inD;
        answer = inAnswer;
    }
    
    public String getTheme(){return theme;}
    public Boolean getComplete(){return complete;}
    public String getQuestion(){return question;}
    public String getA(){return a;}
    public String getB(){return b;}
    public String getC(){return c;}
    public String getD(){return d;}
    public String getAnswer(){return answer;}
    
    public void setComplete(Boolean inComplete){complete = inComplete;}
    
}
