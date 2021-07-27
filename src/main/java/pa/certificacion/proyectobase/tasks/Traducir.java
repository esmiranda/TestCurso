package pa.certificacion.proyectobase.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;
import pa.certificacion.proyectobase.model.DatosGoogleTraductor;

import java.util.List;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;
import static pa.certificacion.proyectobase.userinterface.TraductorPage.*;

public class Traducir implements Task {
    private DatosGoogleTraductor DatosgoogleTraductor;

    public Traducir(DatosGoogleTraductor datosgoogleTraductor) {
        DatosgoogleTraductor = datosgoogleTraductor;
    }

    public static Traducir deInglesAEspanol(DatosGoogleTraductor DatosgoogleTraductor) {
        return Tasks.instrumented(Traducir.class,DatosgoogleTraductor );
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(IDIOMA_ORIGEN),
                Enter.theValue(DatosgoogleTraductor.getOrigen()).into(IDIOMA1),
                Click.on(SELECCIONAR_IDIOMA),
                Click.on(IDIOMA_A_TRADUCIR),
                Enter.theValue(DatosgoogleTraductor.getDestino()).into(IDIOMA2),
                Click.on(SELECCIONAR_IDIOMA),
                Click.on(INGRESAR_PALABRA),
                WaitUntil.the(INGRESAR_PALABRA, isEnabled()),
                Enter.theValue(DatosgoogleTraductor.getPalabrai()).into(INGRESAR_PALABRA));
    }
}
