package data;

import java.util.ArrayList;
import data.Question;

public class QuestionList{
    private static ArrayList<Question> questions;
    public static Question getRandomQuestion() // @TODO Dont Repeat
    {
        return questions.get((int)Math.random() % questions.size());
    }
    public QuestionList()
    {
        Question q = null;
        // @TODO populate with dummy data or use a local db
        q = new Question("What is your name?", 1, "Rajdeep", "Roy", "Chowdhury", "None");
        questions.add(q);
        q = new Question("What is your hobby?", 1, "Dreaming", "Sleeping", "Eating", "None");
    }
}