package tripleaRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)

@CucumberOptions(
        features = {"src/main/java/tripleAFeatures/TreepleAHomePage.feature"},
        glue = "stepDefenetions",
        plugin = {"pretty", "json:target/cucumber-reports/cucumber.json", "html:target/cucumber-reports"},
        strict = true,
        monochrome = true,
        dryRun = false
// tags = " ( @Regression or @smokeTest ) and not @pending "
// tags = {"@Regression or @smokeTest or "}
// tags={"@Test1,@Test2"}

)


public class TripleARunner {
}
