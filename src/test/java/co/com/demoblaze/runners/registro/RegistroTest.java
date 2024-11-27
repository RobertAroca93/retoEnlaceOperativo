package co.com.demoblaze.runners.registro;


import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        plugin = {"pretty"},
        features = "src/test/resources/features/registroExitoso.feature",
        glue = "co.com.demoblaze.stepsDefinitions.registroExitoso",
        tags = "@RegistroExitoso"
)


public class RegistroTest {
}
