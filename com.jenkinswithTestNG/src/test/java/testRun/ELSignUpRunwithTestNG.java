package testRun;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

// @RunWith(Cucumber.class)
@CucumberOptions(features =".//Features/Signupfeature.feature" ,
glue="stepDefination",
dryRun=false,
monochrome=true,
plugin= {"pretty","html:target/cucumberreports/reports5.html"})
public class ELSignUpRunwithTestNG extends AbstractTestNGCucumberTests  {

}
