package stepDefenetions;

import common.BDDWebAPI;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tripleAPage.TripleHomePage;
import java.io.IOException;

public class TripleAHomePageStepD extends TripleHomePage {
    @Before
    public void rampUp() throws IOException {
        setUp(false, "browserstack", "ox", "catalina", "chrome", "86", "https://northeast.aaa.com/");
        TripleHomePage.inIt();
    }
    @After
    public void rampDown() {
        driver.quit(); }

    @Given("user enter url")
    public void user_enter_url() {
        TripleHomePage.HPuser_enter_url();
}
    @When("user land on AAAHomePage")
    public void user_land_on_AAAHomePage() {
        TripleHomePage.HPuser_land_on_AAAHomePage();
    }
    @Then("user should see home page")
    public void user_should_see_home_page() {
        TripleHomePage.HPuser_should_see();
    }
}
