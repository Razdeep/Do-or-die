import com.amazon.ask.Skill;
import com.amazon.ask.Skills;
import com.amazon.ask.SkillStreamHandler;
import handlers.CancelandStopIntentHandler;
import handlers.HelloWorldIntentHandler;
import handlers.HelpIntentHandler;
import handlers.SessionEndedRequestHandler;
import handlers.LaunchRequestHandler;
import handlers.FallbackIntentHandler;

public class DoOrDieHandler extends SkillStreamHandler {

    private static Skill getSkill() {
        return Skills.standard()
                .addRequestHandlers(
                        new CancelandStopIntentHandler(),
                        new HelloWorldIntentHandler(),
                        new HelpIntentHandler(),
                        new LaunchRequestHandler(),
                        new SessionEndedRequestHandler(),
                        new FallbackIntentHandler())
                .withSkillId("amzn1.ask.skill.4fba54b6-d53a-4fe5-8baf-e47cbc6550e1")
                .build();
    }

    public DoOrDieHandler() {
        super(getSkill());
    }

}