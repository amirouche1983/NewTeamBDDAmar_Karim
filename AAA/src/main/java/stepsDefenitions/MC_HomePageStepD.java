package stepsDefenitions;

import common.WebAPI;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;

public class MC_HomePageStepD extends WebAPI {
  // public static MC_HomePageStepD mc_HomePageStepD;
    String url = "https://northeast.aaa.com/";
//    public static void inIt(){
//      mc_HomePageStepD = PageFactory.initElements(driver,MC_HomePageStepD.class);
//    }
    @Given("user enter url {string}")
    public void user_enter_url(String url) {
       // inIt();
        getLocalDriver("OS X","chrome").get(url);
    }

    @When("user land on AAAHomePage")
    public void user_lande_on_AAAHomePage() {
       driver.getCurrentUrl();
    }

    @Then("user should see {string}")
    public void user_should_see(String string) {
        Assert.assertEquals("https://northeast.aaa.com/",url);
    }

}
