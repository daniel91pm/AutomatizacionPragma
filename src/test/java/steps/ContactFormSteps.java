package steps;

import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import tasks.FillContact;

public class ContactFormSteps {
    /**
     * This method is use when the user wants to send their information contact
     * this fullfil a contac form with the params
     * @param email the email which the user would like to be contacted
     * @param user  the name of the user associated to the email
     * @param message the message that the user wants to send
     */
    @When("^user enter (.*) with (.*) and (.*) for fill contact form$")
    public void userEnterStrEmailWithStrNameAndStrMessageForFillContactForm(String email, String user,String message) {
        OnStage.theActorInTheSpotlight().attemptsTo(FillContact.theform(email, user, message));
    }
}
