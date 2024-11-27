package co.com.demoblaze.utils;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Wait {

    Wait() {
    }

    public static void inSeconds(double intSeconds) {
        try {
            Thread.sleep((long) (intSeconds * 1000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static Performable waitForPageToLoad(Duration waitUntil) {
        return Task.where("{0} espera a que la página esté completamente cargada",
                actor -> {
                    WebDriver driver = BrowseTheWeb.as(actor).getDriver();
                    WebDriverWait wait = new WebDriverWait(driver, waitUntil);
                    wait.until(ExpectedConditions.jsReturnsValue("return document.readyState == 'complete';"));
                }
        );
    }
}