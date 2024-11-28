package co.com.demoblaze.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class AceptarAlerta implements Task {

    public static AceptarAlerta aceptarAlerta() {
        return instrumented(AceptarAlerta.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        WebDriver driver = BrowseTheWeb.as(actor).getDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        try {
            wait.until(ExpectedConditions.alertIsPresent());
            Alert alerta = driver.switchTo().alert();
            alerta.accept();
        } catch (Exception e) {
            System.out.println("No se detectó una alerta o ocurrió un problema al manejarla.");
        }


    }
}
