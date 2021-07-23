package co.com.choucair.certification.UTest.stepdefinitions;




import co.com.choucair.certification.UTest.model.UTestData;
import co.com.choucair.certification.UTest.questions.Answer;
import co.com.choucair.certification.UTest.tasks.Access;
import co.com.choucair.certification.UTest.tasks.OpenUp;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;


public class UTestStepdefinitions {



    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^than Jahaziel needs to enter uTest$")
    public void thanJahazielNeedsToEnterUtest(List<UTestData> uTestData) throws Exception{

        OnStage.theActorCalled("Jahaziel").wasAbleTo(OpenUp.thePage(),(Access.onThePage(
                uTestData.get(0).getStrFirstName(),uTestData.get(0).getStrLastName(),uTestData.get(0).getStrEmail(),
                uTestData.get(0).getStrMonth(),uTestData.get(0).getStrDay(),uTestData.get(0).getStrYear(),
                uTestData.get(0).getStrLanguage(),uTestData.get(0).getStrZip(),uTestData.get(0).getStrPassword()
        )));

    }

    @When("^he enter your data to be able to register on the uTest platform$")
    public void heEnterYourDataToBeAbleToRegisterOnTheUtestPlatform() throws Exception{

    }

    @Then("^he see the welcome page on the uTest platform and see the message$")
    public void heSeeTheWelcomePageOnTheUtestPlatformAndSeeTheMessage(List<UTestData> uTestData) throws Exception{
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(uTestData.get(0).getStrWelcomeMessage())));
    }
}
