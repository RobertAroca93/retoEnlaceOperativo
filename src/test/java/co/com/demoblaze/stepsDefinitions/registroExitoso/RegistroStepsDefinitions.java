package co.com.demoblaze.stepsDefinitions.registroExitoso;

import co.com.demoblaze.stepsDefinitions.SetUp;
import co.com.demoblaze.tasks.ManejarAlerta;
import co.com.demoblaze.tasks.registro.Registrarse;
import io.cucumber.java.Before;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import lombok.RequiredArgsConstructor;
import net.serenitybdd.annotations.Managed;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

@RequiredArgsConstructor
public class RegistroStepsDefinitions extends SetUp {


    @Managed
    Actor actor;

    @Before
    public void prepareTest() {
        setTheTest();
    }


    @Dado("que el usuario se dirige al menu de registro")
    public void que_el_usuario_se_dirige_al_menu_de_registro() {

        OnStage.theActorInTheSpotlight().wasAbleTo(Open.browserOn().thePageNamed("home.page"));

        WebDriver webDriver = BrowseTheWeb.as(theActorInTheSpotlight()).getDriver();
        String userAgent = ((JavascriptExecutor) webDriver).executeScript("return navigator.userAgent;").toString();
        System.out.println("SE ESTA UTILIZANDO ESTE DRIVER:   " + userAgent);

    }

    @Cuando("ingresa los datos correctamente")
    public void ingresa_los_datos_correctamente() {

        OnStage.theActorInTheSpotlight().wasAbleTo(Registrarse.registro());

    }

    @Entonces("el registro debe permitirse exitosamente")
    public void el_registro_debe_permitirse_exitosamente() {

        OnStage.theActorInTheSpotlight().attemptsTo(ManejarAlerta.conMensaje("Sign up successful."));

    }


}
