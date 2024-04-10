package tasks;



import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.JavascriptExecutor;
import ui.DemoblazePage;

public class Login implements Task {

    private String strUserName;
    private String strPassword;

    public Login(String strUserName, String strPassword) {
        this.strUserName = strUserName;
        this.strPassword = strPassword;
    }

    public static Login formpage(String strUserName, String strPassword) {
        return Tasks.instrumented(Login.class, strUserName, strPassword);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(

                WaitUntil.the(DemoblazePage.LOGIN_BUTTON,WebElementStateMatchers.isVisible()),
                Click.on(DemoblazePage.LOGIN_BUTTON),
//                Click.on(DemoblazePage.LOGIN_BUTTON),
                Enter.theValue(strUserName).into(DemoblazePage.INPUTLOGIN_USER),
                Enter.theValue(strPassword).into(DemoblazePage.INPUTLOGIN_PASSWORD),
                Click.on(DemoblazePage.FORM_LOGINBUTTON),
                WaitUntil.the(DemoblazePage.LABEL_WELCOME, WebElementStateMatchers.isVisible())

        );

    }
}
