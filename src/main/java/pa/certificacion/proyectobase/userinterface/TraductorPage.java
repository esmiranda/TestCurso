package pa.certificacion.proyectobase.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class TraductorPage extends PageObject {

    public static final Target IDIOMA_ORIGEN = Target.the("Idioma de origen")
            .located(By.xpath("//div[2]/button[1]/span[@class='zQ0atf']"));
    public static final Target IDIOMA_A_TRADUCIR = Target.the("Idioma a traducir")
            .located(By.xpath("//div[5]/button[1]/span[@class='zQ0atf']"));
    public static final Target IDIOMA1 = Target.the("Ingresar el idioma original")
            .locatedBy("//input[@class='yFQBKb']");
    public static final Target IDIOMA2 = Target.the("Ingresar el idioma a traducir")
            .locatedBy("//div[2]/div/div[2]/input[@class='yFQBKb']");
    public static final Target SELECCIONAR_IDIOMA = Target.the("Seleccionar el idioma de la busqueda")
            .locatedBy("//span[@class='hBxMjb']");
    public static final Target INGRESAR_PALABRA = Target.the("Ingresar el texto a traducir")
            .locatedBy("//textarea[@jsname='BJE2fc']");
    public static final Target PALABRA_TRADUCIDA = Target.the("Texto traducido")
            .locatedBy("//span[@jsname='W297wb']");

}
