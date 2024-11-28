package co.com.demoblaze.runners.agregarProductos;


import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        plugin = {"pretty"},
        features = "src/test/resources/features/agregarProductos.feature",
        glue = "co.com.demoblaze.stepsDefinitions.agregarProductos",
        tags = "@AgregadoExitoso"
)

public class AgregarProductosTest {

}
