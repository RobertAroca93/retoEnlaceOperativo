package co.com.demoblaze.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

import static co.com.demoblaze.ui.tiendaVirtual.ProductStore.TOTAL_ORDER;

public class ValidarCompra implements Question<Double> {


    @Override
    public Double answeredBy(Actor actor) {


        String valorTotalOrder = BrowseTheWeb.as(actor).find(TOTAL_ORDER).getTextContent();
        double totalRecibido = Double.parseDouble(valorTotalOrder.trim());

        return totalRecibido;
    }


    public static Question<Double> totalObtenido() {
        return new ValidarCompra();
    }
}
