package tasks;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;
import ui.DemoblazePage;

public class FillContact implements Task {

    private String strEmail;
    private String strName;
    private String strMessage;

    public FillContact (String strEmail, String strName, String strMessage) {
        this.strEmail = strEmail;
        this.strName = strName;
        this.strMessage = strMessage;
    }

    public static FillContact theform(String strEmail, String strName, String strMessage) {
        return Tasks.instrumented(FillContact.class, strEmail, strName, strMessage);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(DemoblazePage.CONTACT_BUTTON),
                Enter.theValue(strEmail).into(DemoblazePage.INPUT_CONTACTEMAIL),
                Enter.theValue(strName).into(DemoblazePage.INPUT_CONTACTNAME),
                Enter.theValue(strMessage).into(DemoblazePage.INPUT_CONTACTMESSAGE),
                Click.on(DemoblazePage.SENDMESSAGE_BUTTON),
                WaitUntil.the(DemoblazePage.LABEL_WELCOME, WebElementStateMatchers.isVisible())

        );

    }
}

