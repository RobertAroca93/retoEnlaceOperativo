package co.com.demoblaze.ui.login;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaginaLogin extends PageObject {

    public static final Target LOG_IN_LINK = Target.the("Link Inicio Sesion").located(By.id("login2"));
    public static final Target USERNAME_FIELD_LOGIN = Target.the("Campo username del login").located(By.xpath("//input[@id='loginusername']"));
    public static final Target PASSWORD_FIELD_LOGIN = Target.the("Campo password del login").located(By.xpath("//input[@id='loginpassword']"));
    public static final Target LOG_IN_BUTTON = Target.the("Boton iniciar sesion").located(By.xpath("//button[contains(text(),'Log in')]"));
    public static final Target LOGIN_VALIDATION = Target.the("Titulo Cerrar Sesion").located(By.xpath("//a[@id='logout2']"));

}
