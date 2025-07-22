package testRunner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)

@CucumberOptions(features ="D:\\SeleniumCucumberProjects\\Feature\\login.feature",
        glue= "stepDefinitions",
        dryRun=false,
        monochrome=true,
        plugin= {"pretty","html:test-output"

        }
)
public class TestRunner {



}
