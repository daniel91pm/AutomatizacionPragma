package tasks;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;
import ui.DemoblazePage;

public class AddItemToCart implements Task {

    private DemoblazePage demoBlazePage;
    private String strItem;

    public AddItemToCart (String strItem){
        this.strItem = strItem;
    }


    public static AddItemToCart additem(String strItem) {
        return Tasks.instrumented(AddItemToCart.class, strItem);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(WaitUntil.the(DemoblazePage.LABEL_LAPTOPS, WebElementStateMatchers.isVisible()),
                Click.on(DemoblazePage.LABEL_LAPTOPS),
                Click.on(DemoblazePage.LABEL_ITEM),
                Click.on(DemoblazePage.BUTTON_ADDTOCART));
    }
}
