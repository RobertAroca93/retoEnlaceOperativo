package co.com.demoblaze.tasks.login;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;

import static co.com.demoblaze.ui.login.PaginaLogin.LOG_IN_BUTTON;
import static co.com.demoblaze.ui.login.PaginaLogin.LOG_IN_LINK;
import static co.com.demoblaze.ui.login.PaginaLogin.PASSWORD_FIELD_LOGIN;
import static co.com.demoblaze.ui.login.PaginaLogin.USERNAME_FIELD_LOGIN;
import static co.com.demoblaze.utils.FakerDataGenerator.PASSWORD_LOGIN;
import static co.com.demoblaze.utils.FakerDataGenerator.USERNAME_LOGIN;

public class IniciarSesion implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.wasAbleTo(
                Scroll.to(LOG_IN_LINK),
                Click.on(LOG_IN_LINK),
                Enter.theValue(USERNAME_LOGIN).into(USERNAME_FIELD_LOGIN),
                Enter.theValue(PASSWORD_LOGIN).into(PASSWORD_FIELD_LOGIN),
                Click.on(LOG_IN_BUTTON)
        );

    }

    public static IniciarSesion iniciarSesion() {
        return Tasks.instrumented(IniciarSesion.class);
    }
}
