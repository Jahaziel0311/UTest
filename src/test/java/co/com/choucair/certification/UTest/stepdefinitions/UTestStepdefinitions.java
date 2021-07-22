package co.com.choucair.certification.UTest.stepdefinitions;

import co.com.choucair.certification.UTest.questions.Answer;
import co.com.choucair.certification.UTest.tasks.Access;
import co.com.choucair.certification.UTest.tasks.OpenUp;
import  cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class UTestStepdefinitions {

    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^than Jahaziel needs to enter uTest$")
    public void thanJahazielNeedsToEnterUtest() throws Exception{

        OnStage.theActorCalled("Jahaziel").wasAbleTo(OpenUp.thePage(),(Access.onThePage()));

    }

    @When("^he enter your data to be able to register on the uTest platform$")
    public void heEnterYourDataToBeAbleToRegisterOnTheUtestPlatform() throws Exception{

    }

    @Then("^he see the welcome page on the uTest platform and see the message (.*)$")
    public void heSeeTheWelcomePageOnTheUtestPlatformAndSeeTheMessage(String question) throws Exception{
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(question)));
    }

}
