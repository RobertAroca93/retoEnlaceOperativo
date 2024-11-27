package co.com.demoblaze.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class TextOfThe implements Question<String> {

    private final Target target;

    public TextOfThe(Target target) {
        this.target = target;
    }

    @Override
    public String answeredBy(Actor actor) {
        actor.attemptsTo(
                WaitUntil.the(target, WebElementStateMatchers.isCurrentlyEnabled()).forNoMoreThan(60).seconds()
        );
        return target.resolveFor(actor).getText().replace("\n", " ");
    }

    public static TextOfThe element(Target target) {
        return new TextOfThe(target);
    }
}
