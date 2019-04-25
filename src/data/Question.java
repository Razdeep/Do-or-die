package data;

import java.util.ArrayList;

public class Question
{
    private String statement;
    private int answer;  // Range 1 to 4 @TODO define exception
    private ArrayList<String> options;
    private static ArrayList<String> createOptions(String a, String b, String c, String d)
    {
        ArrayList<String> result = new ArrayList<>();
        result.add(a);
        result.add(b);
        result.add(c);
        result.add(d);
        return result;
    }
    private boolean validateAnswer(int answer)
    {
        return answer >= 1 && answer <= 4;
    }
    public Question(String statement, int answer, String a, String b, String c, String d)
    {
        this.statement = statement;
        this.answer = validateAnswer(answer) ? answer : -1;
        this.options = createOptions(a, b, c, d);
    }
    public String getStatement()
    {
        return this.statement;
    }
    public int getAnswer()
    {
        return this.answer;
    }
    public ArrayList<String> getOptions()
    {
        return this.options;
    }
}