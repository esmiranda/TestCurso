package pa.certificacion.proyectobase.stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import pa.certificacion.proyectobase.model.DatosGoogleTraductor;
import pa.certificacion.proyectobase.questions.Palabra;
import pa.certificacion.proyectobase.tasks.AbrirEl;
import pa.certificacion.proyectobase.tasks.Traducir;

import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.*;

public class GoogleTraductorStepDefinitions {

    @Before
    public void setStage(){ setTheStage(new OnlineCast());
    }

    @Given("^que Caleb quiere usar el traductor de google$")
    public void queCalebQuiereUsarElTraductorDeGoogle() {
        theActorCalled("Caleb").wasAbleTo(AbrirEl.traductor());
    }

    @When("^el traduce una palabra del ingles a espanol$")
    public void elTraduceUnaPalabraDelInglesAEspanol(List<DatosGoogleTraductor> DatosgoogleTraductor) {
        OnStage.theActorInTheSpotlight().attemptsTo(Traducir.deInglesAEspanol(DatosgoogleTraductor.get(0)));
    }

    @Then("^el deberia ver la palabra traducida del ingles al espanol$")
    public void elDeberiaVerLaPalabraTraducidaDelInglesAlEspanol(List<DatosGoogleTraductor> DatosgoogleTraductor) {
        OnStage.theActorInTheSpotlight().should(seeThat("Verificar la traduccion", Palabra.traducidaCorrectamente(DatosgoogleTraductor.get(0))));
    }

}
