package co.com.demoblaze.runners.login;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        plugin = {"pretty"},
        features = "src/test/resources/features/login.feature",
        glue = "co.com.demoblaze.stepsDefinitions.login",
        tags = "@LoginExitoso"
)


public class LoginTest {
}
