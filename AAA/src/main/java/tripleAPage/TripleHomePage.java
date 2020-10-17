package tripleAPage;
import common.BDDWebAPI;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class TripleHomePage extends BDDWebAPI {

    public static  TripleHomePage tripleAHomePage ;
    public static TripleAWebElemment tripleAWebElemment ;
    public static void inIt(){
        tripleAHomePage = PageFactory.initElements(driver,TripleHomePage.class);
        tripleAWebElemment = PageFactory.initElements(driver,TripleAWebElemment.class);
    }

   public static String currentUrl = "";
    public static void  HPuser_enter_url() {
        driver.get("https://northeast.aaa.com/");
    }
    public static void HPuser_land_on_AAAHomePage() {
        currentUrl = driver.getCurrentUrl();
    }
    public static void HPuser_should_see() {
        Assert.assertEquals("https://northeast.aaa.com/",currentUrl);
    }
}
