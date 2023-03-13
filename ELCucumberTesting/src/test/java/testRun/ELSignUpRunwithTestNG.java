package testRun;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

//@RunWith(Cucumber.class)
@CucumberOptions(features =".//Features/SignUpFeature.feature" ,
glue="stepDefination",
dryRun=true,
monochrome=true,
plugin= {"pretty","html:target/cucumber-reports/reports4.html"})
public class ELSignUpRunwithTestNG {

}
