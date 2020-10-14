package mcTestRunner;

import com.cucumber.listener.Reporter;
import dataReader.FileReaderManager;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.runner.RunWith;


import java.io.File;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/main/java/allFeatures"},
        glue = "stepsDefenitions",
        //plugin = {"pretty", "json:target/cucumber-reports/cucumber.json", "html:target/cucumber-reports"},
        plugin = { "com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html"},

        strict = true,
        monochrome = true,
        dryRun = false
// tags = " ( @Regression or @smokeTest ) and not @pending "
// tags = {"@Regression or @smokeTest or "}
// tags={"@Test1,@Test2"}

)

public class MCTestRunner {

}
