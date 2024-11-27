package co.com.demoblaze.tasks.registro;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;

import static co.com.demoblaze.ui.registro.PaginaRegistro.PASSWORD_FIELD;
import static co.com.demoblaze.ui.registro.PaginaRegistro.SIGN_UP_BUTTON;
import static co.com.demoblaze.ui.registro.PaginaRegistro.SIGN_UP_LINK;
import static co.com.demoblaze.ui.registro.PaginaRegistro.USERNAME_FIELD;
import static co.com.demoblaze.utils.FakerDataGenerator.PASSWORD_RANDOM;
import static co.com.demoblaze.utils.FakerDataGenerator.USERNAME_RANDOM;

public class Registrarse implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.wasAbleTo(
                Scroll.to(SIGN_UP_LINK),
                Click.on(SIGN_UP_LINK),
                Enter.theValue(USERNAME_RANDOM).into(USERNAME_FIELD),
                Enter.theValue(PASSWORD_RANDOM).into(PASSWORD_FIELD),
                Click.on(SIGN_UP_BUTTON)
        );

    }

    @Override
    public Performable then(Performable nextPerformable) {
        return Task.super.then(nextPerformable);
    }

    public static Registrarse registro() {
        return Tasks.instrumented(Registrarse.class);
    }
}
