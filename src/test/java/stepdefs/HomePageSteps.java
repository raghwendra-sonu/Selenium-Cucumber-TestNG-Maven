package stepdefs;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

import ApplicationPages.Homepage;
import WebConnector.webconnector;
import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class HomePageSteps extends webconnector {
    private Homepage homePage;
	private String scenDesc;

    public HomePageSteps() {
        this.homePage = new Homepage();
    }
    
    @Before
	public void before(Scenario scenario) {
		this.scenDesc = scenario.getName();
		setUpDriver();
	}
    
    @After
    public void after(Scenario scenario){
    	closeDriver(scenario);
    }
	
	@BeforeStep
	public void beforeStep() throws InterruptedException {
		Thread.sleep(2000);
	}

    @Given("^User navigates to QATechTesting HomePage$")
    public void aUserNavigatesToHomePage() throws InvalidFormatException, IOException {
        this.homePage.goToHomePage();
    }

    @Then("^User verify that Blog Link is displayed$")
    public void googleLogoIsDisplayed() throws Exception {
        this.homePage.checkBlogLinkDisplay();
    }
}
