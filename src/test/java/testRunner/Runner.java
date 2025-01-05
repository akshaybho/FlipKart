package testRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = ".//Feature",
                   glue = "stepDefinations",
                 monochrome = true,
                  dryRun = false)

public class Runner extends AbstractTestNGCucumberTests {

}
