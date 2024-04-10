package tasks;

import model.UserDataModel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import ui.DemoblazePage;


public class SignUp implements Task {


    private UserDataModel demoBlazeUserData;

    private String strUserName;
    private String strPassword;

    public SignUp(String strUserName, String strPassword) {
        this.strUserName = strUserName;
        this.strPassword = strPassword;
    }

    public static SignUp inThePage(String strUserName, String strPassword) {
        return Tasks.instrumented(SignUp.class, strUserName, strPassword);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(DemoblazePage.PAGESIGNUP_BUTTON),
               Enter.theValue(strUserName).into(DemoblazePage.INPUT_USER),
                Enter.theValue(strPassword).into(DemoblazePage.INPUT_PASSWORD),
               Click.on(DemoblazePage.FORM_SIGNUPBUTTON)

        );

    }

}
