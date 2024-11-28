package co.com.demoblaze.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ManejarAlerta implements Task {
    private final String mensajeEsperado;

    public ManejarAlerta(String mensajeEsperado) {
        this.mensajeEsperado = mensajeEsperado;
    }

    public static ManejarAlerta conMensaje(String mensajeEsperado) {
        return instrumented(ManejarAlerta.class, mensajeEsperado);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        WebDriver driver = BrowseTheWeb.as(actor).getDriver();

        // Espera explícita para garantizar que la alerta esté presente
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(driver1 -> {
            try {
                driver1.switchTo().alert();
                return true;
            } catch (Exception e) {
                return false;
            }
        });

        Alert alerta = driver.switchTo().alert();

        String textoAlerta = alerta.getText();
        if (!textoAlerta.equals(mensajeEsperado)) {
            throw new AssertionError("El mensaje de la alerta no coincide: " + mensajeEsperado + " , pero se obtuvo: " + textoAlerta);
        }

        alerta.accept();

    }

    @Override
    public Performable then(Performable nextPerformable) {
        return Task.super.then(nextPerformable);
    }
}