package steps;

import interaction.AcceptAlert;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import org.hamcrest.Matchers;
import questions.AnswerItemAdded;
import tasks.AddItemToCart;

import tasks.DeleteCart;
import tasks.GoTo;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class CartSteps {
    /**
     * Add the item to the cart
     * @param item
     */
    @When("^user add (.*) to the cart$")
    public void userAddStrItemToTheCart(String item) {
        theActorInTheSpotlight().attemptsTo(AddItemToCart.additem(item));
    }

    /**
     * This see the cart fullfil with their items
     * @param itemAdded
     */
    @Then("^user going to see (.*)$")
    public void userGoingToSeeStrAdded(String itemAdded) {
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(AnswerItemAdded.complete(), Matchers.containsString(itemAdded)));
    }

    /**
     * This goes to the cart
     */
    @When("user go to the Cart")
    public void userGoToTheCart() {
        theActorInTheSpotlight().attemptsTo(AcceptAlert.alert());
        theActorInTheSpotlight().attemptsTo(GoTo.theCart());
    }

    /**
     * This deletes the last item added
     */
    @Then("delete the item")
    public void deleteTheItem() {
        theActorInTheSpotlight().attemptsTo(DeleteCart.item());
    }
}
