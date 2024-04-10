package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import ui.DemoblazePage;

import static ui.DemoblazePage.BUTTON_CART;

public class GoTo implements Task {
    private DemoblazePage demoblazePage;
    public GoTo() {
    }

    public static GoTo theCart(){
        return Tasks.instrumented(GoTo.class);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(BUTTON_CART));
    }
}
