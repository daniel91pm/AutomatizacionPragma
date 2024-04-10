package questions;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import ui.DemoblazePage;

public class AnswerLogin implements Question<String> {


    public static AnswerLogin successful(){
        return new AnswerLogin();
    }

    @Override
    public String answeredBy(Actor actor) {
        return DemoblazePage.LABEL_WELCOME.resolveFor(actor).getText();
    }
}
