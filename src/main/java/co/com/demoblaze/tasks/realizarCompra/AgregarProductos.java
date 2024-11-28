package co.com.demoblaze.tasks.realizarCompra;

import co.com.demoblaze.tasks.AceptarAlerta;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;

import static co.com.demoblaze.ui.tiendaVirtual.ProductStore.ADD_TO_CART_BUTTON;
import static co.com.demoblaze.ui.tiendaVirtual.ProductStore.APPLE_MONITOR;
import static co.com.demoblaze.ui.tiendaVirtual.ProductStore.CART_BUTTON;
import static co.com.demoblaze.ui.tiendaVirtual.ProductStore.LAPTOPS_CATEGORY;
import static co.com.demoblaze.ui.tiendaVirtual.ProductStore.MENU_BUTTON;
import static co.com.demoblaze.ui.tiendaVirtual.ProductStore.MONITORS_CATEGORY;
import static co.com.demoblaze.ui.tiendaVirtual.ProductStore.NOKIA_LUMIA_1520;
import static co.com.demoblaze.ui.tiendaVirtual.ProductStore.PHONES_CATEGORY;
import static co.com.demoblaze.ui.tiendaVirtual.ProductStore.SONY_VAIO_I5;

public class AgregarProductos implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {


        actor.wasAbleTo(
                Scroll.to(PHONES_CATEGORY),
                Click.on(PHONES_CATEGORY),
                Click.on(NOKIA_LUMIA_1520),
                Click.on(ADD_TO_CART_BUTTON),
                AceptarAlerta.aceptarAlerta(),

                Scroll.to(MENU_BUTTON),
                Click.on(MENU_BUTTON),
                Scroll.to(LAPTOPS_CATEGORY),
                Click.on(LAPTOPS_CATEGORY),
                Click.on(SONY_VAIO_I5),
                Click.on(ADD_TO_CART_BUTTON),
                AceptarAlerta.aceptarAlerta(),

                Scroll.to(MENU_BUTTON),
                Click.on(MENU_BUTTON),
                Scroll.to(MONITORS_CATEGORY),
                Click.on(MONITORS_CATEGORY),
                Click.on(APPLE_MONITOR),
                Click.on(ADD_TO_CART_BUTTON),
                AceptarAlerta.aceptarAlerta(),
                Click.on(CART_BUTTON)


        );

    }

    public static AgregarProductos agregarProductos() {
        return Tasks.instrumented(AgregarProductos.class);
    }
}
