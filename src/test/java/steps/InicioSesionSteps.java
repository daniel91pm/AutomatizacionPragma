package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import org.hamcrest.Matchers;
import questions.AnswerLogin;
import questions.AnswerRegister;
import tasks.Login;
import tasks.SignUp;

import static net.serenitybdd.screenplay.actors.OnStage.*;


public class InicioSesionSteps {

    /**
     * this is sign up method
     *
     * @param username the user which will login into the page
     * @param password the password used by the user to login into the page
     */
    @When("^user enters (.*) and (.*)$")
    public void userEntersStrUsernameAndStrPassword(String username, String password) {
        theActorInTheSpotlight().attemptsTo(SignUp.inThePage(username, password));
    }

    /**
     *  this Asserts  when the Register is successful
     * the message display when the Register is successful
     *
     * @param message
     */
    @Then("^user see (.*) message")
    public void userSeeStrLoginMessage(String message) {
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(AnswerRegister.tothe(), Matchers.equalTo(message)));
    }

    /**
     * this Login method
     *
     * @param username the user which will login into the page
     * @param password the password used by the user to login into the page
     */
    @When("^user enters credential to login (.*) with (.*)$")
    public void userEntersCredentialToLoginStrUsernameWithStrPassword(String username, String password) {
        theActorInTheSpotlight().attemptsTo(Login.formpage(username, password));
    }

    /**
     * this Asserts when the login is successful
     * The message displays when the login is successful
     * @param message
     */
    @Then("^user see (.*) string$")
    public void userSeeStrLoginString(String message) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(AnswerLogin.successful(), Matchers.containsString(message)));
    }


}
