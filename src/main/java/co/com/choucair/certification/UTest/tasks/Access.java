package co.com.choucair.certification.UTest.tasks;


import co.com.choucair.certification.UTest.userinterface.UTestAccesPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import org.openqa.selenium.Keys;


public class Access implements Task {
    public static Access onThePage() {
        return Tasks.instrumented(Access.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Click.on(UTestAccesPage.JOIN_BUTTON),
                Enter.theValue("Jahaziel").into(UTestAccesPage.INPUT_FIRST_NAME),
                Enter.theValue("De Salas").into(UTestAccesPage.INPUT_LAST_NAME),
                Enter.theValue("jahazieldesalas3@hotmail.com").into(UTestAccesPage.INPUT_EMAIL),
                SelectFromOptions.byVisibleText("November").from(UTestAccesPage.SELECT_MONTH),
                SelectFromOptions.byVisibleText("3").from(UTestAccesPage.SELECT_DAY),
                SelectFromOptions.byVisibleText("1988").from(UTestAccesPage.SELECT_YEAR),
                Enter.theValue("Spanish").into(UTestAccesPage.INPUT_LANGUAGE),
                Hit.the(Keys.ENTER).into(UTestAccesPage.INPUT_LANGUAGE),
                Click.on(UTestAccesPage.NEXT_BUTTON),
                Enter.theValue("La Chorrera").into(UTestAccesPage.INPUT_CITY),
                Enter.theValue("07079").into(UTestAccesPage.INPUT_ZIP),
                Click.on(UTestAccesPage.SELECT_COUNTRY),
                Enter.theValue("Panama").into(UTestAccesPage.INPUT_COUNTRY),
                Hit.the(Keys.ENTER).into(UTestAccesPage.INPUT_COUNTRY),
                Click.on(UTestAccesPage.NEXT_DEVICES),


                Click.on(UTestAccesPage.SELECT_OS),
                Enter.theValue("Windows").into(UTestAccesPage.INPUT_OS),
                Hit.the(Keys.ENTER).into(UTestAccesPage.INPUT_OS),

                Click.on(UTestAccesPage.SELECT_OS_VERSION),
                Enter.theValue("10").into(UTestAccesPage.INPUT_OS_VERSION),
                Hit.the(Keys.ENTER).into(UTestAccesPage.INPUT_OS_VERSION),

                Click.on(UTestAccesPage.SELECT_OS_LANGUAGE),
                Enter.theValue("Spanish").into(UTestAccesPage.INPUT_OS_LANGUAGE),
                Hit.the(Keys.ENTER).into(UTestAccesPage.INPUT_OS_LANGUAGE),

                Click.on(UTestAccesPage.SELECT_BRAND),
                Enter.theValue("Huawei").into(UTestAccesPage.INPUT_BRAND),
                Hit.the(Keys.ENTER).into(UTestAccesPage.INPUT_BRAND),

                Click.on(UTestAccesPage.SELECT_MODEL),
                Enter.theValue("Y9 Prime (2019)").into(UTestAccesPage.INPUT_MODEL),
                Hit.the(Keys.ENTER).into(UTestAccesPage.INPUT_MODEL),

                Click.on(UTestAccesPage.SELECT_MOVIL_SO),
                Enter.theValue("Android 10").into(UTestAccesPage.INPUT_MOVIL_SO),
                Hit.the(Keys.ENTER).into(UTestAccesPage.INPUT_MOVIL_SO),

                Click.on(UTestAccesPage.NEXT_LAST_STEP),
                Enter.theValue("YUidni8415*").into(UTestAccesPage.INPUT_PASSWORD),
                Enter.theValue("YUidni8415*").into(UTestAccesPage.INPUT_CONFIRM_PASSWORD),
                Click.on(UTestAccesPage.STAY_INFORMED),
                Click.on(UTestAccesPage.ACCEPT_TERMS),
                Click.on(UTestAccesPage.ACCEPT_PRIVACY),
                Click.on(UTestAccesPage.COMPLETE_SETUP)



        );


    }
}
