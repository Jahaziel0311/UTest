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
    public static final Target SELECT_DAY = Target.the("Select Birth Day")
            .located(By.xpath("//*[@id=\"birthDay\"]"));
    public static final Target SELECT_YEAR= Target.the("Select Birth Year")
            .located(By.xpath("//*[@id=\"birthYear\"]"));
    public static final Target INPUT_LANGUAGE = Target.the("Insert Language")
            .located(By.xpath("//*[@id=\"languages\"]/div[1]/input"));
    public static final Target NEXT_BUTTON = Target.the("button to go the next location")
            .located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[2]/a/span"));

    public static final Target INPUT_CITY = Target.the("Insert city")
            .located(By.id("city"));
    public static final Target INPUT_ZIP = Target.the("Insert Zip Code")
            .located(By.xpath("//*[@id=\"zip\"]"));
    public static final Target SELECT_COUNTRY = Target.the("Insert country")
            .located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[1]/div[4]/div[2]/div/div/div[1]"));
    public static final Target INPUT_COUNTRY = Target.the("Insert country")
            .located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[1]/div[4]/div[2]/div/div/input[1]"));
    public static final Target NEXT_DEVICES = Target.the("button to go the next devices")
            .located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[2]/div/a/span"));

    public static final Target SELECT_OS = Target.the("Select OS INPUT")
            .located(By.xpath("//*[@id=\"web-device\"]/div[1]/div[2]/div/div[1]"));
    public static final Target INPUT_OS = Target.the("Insert OS selected")
            .located(By.xpath("//*[@id=\"web-device\"]/div[1]/div[2]/div/input[1]"));

    public static final Target SELECT_OS_VERSION = Target.the("Select OS Version INPUT")
            .located(By.xpath("//*[@id=\"web-device\"]/div[2]/div[2]/div/div[1]"));
    public static final Target INPUT_OS_VERSION = Target.the("Insert OS Version selected")
            .located(By.xpath("//*[@id=\"web-device\"]/div[2]/div[2]/div/input[1]"));

    public static final Target SELECT_OS_LANGUAGE = Target.the("Select OS language INPUT")
            .located(By.xpath("//*[@id=\"web-device\"]/div[3]/div[2]/div/div[1]"));
    public static final Target INPUT_OS_LANGUAGE = Target.the("Insert OS language selected")
            .located(By.xpath("//*[@id=\"web-device\"]/div[3]/div[2]/div/input[1]"));


    public static final Target SELECT_BRAND = Target.the("Select movil device brand")
            .located(By.xpath("//*[@id=\"mobile-device\"]/div[1]/div[2]/div/div[1]"));
    public static final Target INPUT_BRAND = Target.the("insert movil device brand")
            .located(By.xpath("//*[@id=\"mobile-device\"]/div[1]/div[2]/div/input[1]"));

    public static final Target SELECT_MODEL = Target.the("Select movil device model")
            .located(By.xpath("//*[@id=\"mobile-device\"]/div[2]/div[2]/div/div[1]"));
    public static final Target INPUT_MODEL = Target.the("insert movil device model")
            .located(By.xpath("//*[@id=\"mobile-device\"]/div[2]/div[2]/div/input[1]"));

    public static final Target SELECT_MOVIL_SO = Target.the("Select movil device SO")
            .located(By.xpath("//*[@id=\"mobile-device\"]/div[3]/div[2]/div/div[1]"));
    public static final Target INPUT_MOVIL_SO = Target.the("insert movil device SO")
            .located(By.xpath("//*[@id=\"mobile-device\"]/div[3]/div[2]/div/input[1]"));

    public static final Target NEXT_LAST_STEP = Target.the("button to go the next last step")
            .located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/div[2]/div/a"));
    public static final Target INPUT_PASSWORD = Target.the("Insert password")
            .located(By.id("password"));
    public static final Target INPUT_CONFIRM_PASSWORD = Target.the("Insert confirm password")
            .located(By.id("confirmPassword"));
    public static final Target STAY_INFORMED = Target.the("accept stay informed")
            .located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[4]/label/span"));
    public static final Target ACCEPT_TERMS = Target.the("accept terms of use")
            .located(By.id("termOfUse"));
    public static final Target ACCEPT_PRIVACY = Target.the("accept privacy and security policy")
            .located(By.id("privacySetting"));
    public static final Target COMPLETE_SETUP = Target.the("button to complete setup and register")
            .located(By.xpath("//*[@id=\"laddaBtn\"]/span"));
}
