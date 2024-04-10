package steps;

import io.cucumber.java.en.Given;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import util.DriverUtil;

import static net.serenitybdd.screenplay.actors.OnStage.*;

public class RegisterSteps {

    /**
     * This open up the default url
     */
    @Given("user on the Register Page")
    public void userOnTheRegisterPage() {

        OnStage.setTheStage(new OnlineCast());
        theActorCalled("Daniel");
        theActorInTheSpotlight().can(BrowseTheWeb.with(DriverUtil.setUp()));

    }
}
