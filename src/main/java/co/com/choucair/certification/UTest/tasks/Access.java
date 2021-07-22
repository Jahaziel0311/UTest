package co.com.choucair.certification.UTest.tasks;


import co.com.choucair.certification.UTest.userinterface.UTestAccesPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.selectactions.SelectByVisibleTextFromBy;
import net.serenitybdd.screenplay.questions.SelectedValue;


public class Access implements Task {
    public static Access onThePage() {
        return Tasks.instrumented(Access.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Click.on(UTestAccesPage.JOIN_BUTTON),
                Enter.theValue("Jahaziel").into(UTestAccesPage.INPUT_FIRST_NAME),
                Enter.theValue("De Salas").into(UTestAccesPage.INPUT_LAST_NAME),
                Enter.theValue("jahazieldesalas@hotmail.com").into(UTestAccesPage.INPUT_EMAIL)



        );


    }
}
