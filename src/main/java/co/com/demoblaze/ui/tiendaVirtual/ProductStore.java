package co.com.demoblaze.ui.tiendaVirtual;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ProductStore extends PageObject {

    public static final Target CART_BUTTON = Target.the("Boton carrito de compras").located(By.id("cartur"));
    public static final Target ADD_TO_CART_BUTTON = Target.the("Boton agregar al carrito").located(By.xpath("//a[contains(text(),'Add to cart')]"));
    public static final Target MENU_BUTTON = Target.the("Boton ir a pagina principal").located(By.xpath("//a[@id='nava']"));
    public static final Target PHONES_CATEGORY = Target.the("Categoria telefonos").located(By.xpath("//a[contains(text(),'Phones')]"));
    public static final Target LAPTOPS_CATEGORY = Target.the("Categoria laptops").located(By.xpath("//a[contains(text(),'Laptops')]"));
    public static final Target MONITORS_CATEGORY = Target.the("Categoria monitores").located(By.xpath("//a[contains(text(),'Monitors')]"));

    //Agregar Smartphone
    public static final Target NOKIA_LUMIA_1520 = Target.the("Smartphone Nokia").located(By.xpath("//a[contains(text(),'Nokia lumia 1520')]"));
    //Agregar Laptop
    public static final Target SONY_VAIO_I5 = Target.the("Laptop Sony").located(By.xpath("//a[contains(text(),'Sony vaio i5')]"));
    //Agregar Monitor
    public static final Target APPLE_MONITOR = Target.the("Monitor Apple").located(By.xpath("//a[contains(text(),'Apple monitor 24')]"));

    //Validar precio total
    public static final Target TOTAL_ORDER = Target.the("Precio Total").located(By.xpath("//h3[@id='totalp']"));


}
