package co.com.demoblaze.stepsDefinitions.login;

import co.com.demoblaze.questions.TextOfThe;
import co.com.demoblaze.stepsDefinitions.SetUp;
import co.com.demoblaze.tasks.ManejarAlerta;
import co.com.demoblaze.tasks.login.IniciarSesion;
import co.com.demoblaze.tasks.registro.Registrarse;
import co.com.demoblaze.ui.login.PaginaLogin;
import co.com.demoblaze.utils.Wait;
import io.cucumber.java.Before;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.equalTo;

public class LoginStepsDefinitions extends SetUp {

    @Before
    public void prepareTest() {
        setTheTest();
    }

    @Dado("que el usuario se ha registrado exitosamente")
    public void que_el_usuario_se_ha_registrado_exitosamente() {
        OnStage.theActorInTheSpotlight().wasAbleTo(Open.browserOn().thePageNamed("home.page"));

        WebDriver webDriver = BrowseTheWeb.as(theActorInTheSpotlight()).getDriver();
        String userAgent = ((JavascriptExecutor) webDriver).executeScript("return navigator.userAgent;").toString();
        System.out.println("SE ESTA UTILIZANDO ESTE DRIVER:   " + userAgent);
        OnStage.theActorInTheSpotlight().wasAbleTo(Registrarse.registro());
        OnStage.theActorInTheSpotlight().attemptsTo(ManejarAlerta.conMensaje("Sign up successful."));
    }

    @Cuando("se dirige al home")
    public void se_dirige_al_home() {
        OnStage.theActorInTheSpotlight().wasAbleTo(Open.browserOn().thePageNamed("home.page"));

    }

    @Cuando("realiza el inicio de sesion correctamente")
    public void realiza_el_inicio_de_sesion_correctamente() {
        OnStage.theActorInTheSpotlight().wasAbleTo(IniciarSesion.iniciarSesion());

    }

    @Entonces("^se debe mostrar el titulo (.*)$")
    public void se_debe_mostrar_el_titulo_welcome(String titlePage) {
        Wait.inSeconds(5);
        theActorInTheSpotlight()
                .should(seeThat(TextOfThe.element(PaginaLogin.LOGIN_VALIDATION), equalTo(titlePage))
                );


    }


}
