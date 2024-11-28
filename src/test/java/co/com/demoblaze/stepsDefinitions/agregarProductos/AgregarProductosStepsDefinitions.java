package co.com.demoblaze.stepsDefinitions.agregarProductos;

import co.com.demoblaze.questions.ValidarCompra;
import co.com.demoblaze.stepsDefinitions.SetUp;
import co.com.demoblaze.tasks.ManejarAlerta;
import co.com.demoblaze.tasks.login.IniciarSesion;
import co.com.demoblaze.tasks.realizarCompra.AgregarProductos;
import co.com.demoblaze.tasks.registro.Registrarse;
import io.cucumber.java.Before;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actions.Open;

import static co.com.demoblaze.utils.FakerDataGenerator.TOTAL_ESPERADO;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.equalTo;

public class AgregarProductosStepsDefinitions extends SetUp {

    @Before
    public void prepareTest() {
        setTheTest();
    }

    @Dado("que el usuario se encuentra logueado en la tienda")
    public void que_el_usuario_se_encuentra_logueado_en_la_tienda() {
        theActorInTheSpotlight().wasAbleTo(Open.browserOn().thePageNamed("home.page"));
        theActorInTheSpotlight().wasAbleTo(Registrarse.registro());
        theActorInTheSpotlight().attemptsTo(ManejarAlerta.conMensaje("Sign up successful."));
        theActorInTheSpotlight().wasAbleTo(IniciarSesion.iniciarSesion());


    }

    @Cuando("selecciona y agrega los productos a comprar")
    public void selecciona_y_agrega_los_productos_a_comprar() {
        theActorInTheSpotlight().wasAbleTo(AgregarProductos.agregarProductos());

    }


    @Entonces("el total del carrito debe coincidir")
    public void el_total_del_carrito_debe_coincidir() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException("La espera fue interrumpida", e);
        }
        theActorInTheSpotlight().should(seeThat("El valor total es: ",
                ValidarCompra.totalObtenido(), equalTo(TOTAL_ESPERADO)));
    }


}
