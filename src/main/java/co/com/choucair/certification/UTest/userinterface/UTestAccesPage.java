package co.com.choucair.certification.UTest.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UTestAccesPage {

    public static final Target JOIN_BUTTON = Target.the("button that shows us the form to access")
            .located(By.xpath("/html/body/ui-view/unauthenticated-container/div/div/unauthenticated-header/div/div[3]/ul[2]/li[2]/a"));
    public static final Target INPUT_FIRST_NAME = Target.the("Insert First Name")
            .located(By.id("firstName"));
    public static final Target INPUT_LAST_NAME = Target.the("Insert Last Name")
            .located(By.id("lastName"));
    public static final Target INPUT_EMAIL = Target.the("Insert the Email")
            .located(By.id("email"));
    public static final Target SELECT_MONTH = Target.the("Select Birth Month")
            .located(By.xpath("//*[@id=\"birthMonth\"]"));
}
