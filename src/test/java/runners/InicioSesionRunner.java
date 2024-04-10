package runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

import org.junit.runner.RunWith;

import static io.cucumber.junit.CucumberOptions.SnippetType.CAMELCASE;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features ={"classpath:features"},
        glue = "steps",
        plugin = "pretty",
        snippets = CAMELCASE


)
public class InicioSesionRunner {

}
