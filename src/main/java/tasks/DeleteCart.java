package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import ui.DemoblazePage;

import static ui.DemoblazePage.DELETE_ITEM;

public class DeleteCart  implements Task {
    private DemoblazePage demoblazePage;


    public static DeleteCart item() {
        return Tasks.instrumented(DeleteCart.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(DELETE_ITEM));
    }
}
