package interaction;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;

import static util.DriverUtil.driver;

public class AcceptAlert implements Interaction {



    public static AcceptAlert alert(){
        return Tasks.instrumented(AcceptAlert.class);
    }

    public AcceptAlert() {
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        driver.switchTo().alert().accept();

    }
}
