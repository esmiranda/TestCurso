package pa.certificacion.proyectobase.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;
import pa.certificacion.proyectobase.userinterface.GoogleTraductor;

public class AbrirEl implements Task {
    private GoogleTraductor googleTraductor;
    public static AbrirEl traductor() { return Tasks.instrumented(AbrirEl.class);}

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(googleTraductor));
    }
}
