package co.com.demoblaze.stepsDefinitions;

import net.serenitybdd.annotations.Managed;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.openqa.selenium.WebDriver;

import static co.com.demoblaze.utils.FakerDataGenerator.ACTOR_NAME;
import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class SetUp {

    @Managed
    private WebDriver browser;

    private void setupBrowser(WebDriver browser) {
        browser.manage().deleteAllCookies();
        browser.manage().window().maximize();
    }

    private void setupUser(String name, WebDriver browser) {
        OnStage.setTheStage(new OnlineCast());
        theActorCalled(name).can(BrowseTheWeb.with(browser));
    }

    protected void actorSetupTheBrowser(String actorName) {
        defineSO();
        setupBrowser(browser);
        setupUser(actorName, browser);
    }

    private void setStage() {
        setTheStage(Cast.ofStandardActors());
        theActorCalled(ACTOR_NAME);
        theActorInTheSpotlight().can(BrowseTheWeb.with(browser));


    }

    private void defineSO() {

    }

    protected void setTheTest() {
        setStage();
    }
}
