package co.com.demoblaze.ui.registro;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaginaRegistro extends PageObject {

    public static final Target SIGN_UP_LINK = Target.the("Link Registro").located(By.id("signin2"));
    public static final Target USERNAME_FIELD = Target.the("Campo Username").located(By.xpath("//input[@id='sign-username']"));
    public static final Target PASSWORD_FIELD = Target.the("Campo Contraseña").located(By.xpath("//input[@id='sign-password']"));
    public static final Target SIGN_UP_BUTTON = Target.the("Boton Regitrarse").located(By.xpath("//button[contains(text(),'Sign up')]"));


}
