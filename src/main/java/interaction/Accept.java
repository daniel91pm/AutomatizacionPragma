package interaction;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import org.openqa.selenium.WebDriver;

public class Accept implements Interaction {

    WebDriver driver ;

    public static Accept alert(){
        return Tasks.instrumented(Accept.class);
    }

    public Accept() {
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        driver.switchTo().activeElement().click();

    }
}
