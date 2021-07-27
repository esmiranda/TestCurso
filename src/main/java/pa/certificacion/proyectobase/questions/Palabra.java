package pa.certificacion.proyectobase.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import pa.certificacion.proyectobase.model.DatosGoogleTraductor;
import pa.certificacion.proyectobase.userinterface.TraductorPage;

public class Palabra implements Question<Boolean> {
    private DatosGoogleTraductor DatosgoogleTraductor;

    public Palabra(DatosGoogleTraductor datosgoogleTraductor) {
        DatosgoogleTraductor = datosgoogleTraductor;
    }

    public static Question<Boolean> traducidaCorrectamente(DatosGoogleTraductor DatosgoogleTraductor) {
        return new Palabra(DatosgoogleTraductor);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean result;
        String palabratraducida= Text.of(TraductorPage.PALABRA_TRADUCIDA).viewedBy(actor).asString();
        System.out.println("esta es la palabra capturada" + palabratraducida);
        if ((DatosgoogleTraductor.getPalabrae()).equals(palabratraducida)){
            result=true;
        }else {
            result=false;
        }
        return result;
    }
}
