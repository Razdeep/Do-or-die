package handlers;

import data.Question;
import data.QuestionList;

import com.amazon.ask.dispatcher.request.handler.HandlerInput;
import com.amazon.ask.dispatcher.request.handler.RequestHandler;
import com.amazon.ask.model.Response;

import java.util.Optional;

import static com.amazon.ask.request.Predicates.intentName;

public class YesIntentHandler implements RequestHandler {

    @Override
    public boolean canHandle(HandlerInput input) {
        return input.matches(intentName("YesIntent"));
    }

    @Override
    public Optional<Response> handle(HandlerInput input) {
        String pause = "<break time=1s>";
        Question this_question = QuestionList.getRandomQuestion();
        String speechText = this_question.getStatement() + pause;
        speechText = speechText + "Your options are";
        for(String this_option : this_question.getOptions())
        {
            speechText += pause + this_option;
        }
       return input.getResponseBuilder()
                .withSpeech(speechText)
                .withSimpleCard("Question", speechText)
                .build();
    }

}
