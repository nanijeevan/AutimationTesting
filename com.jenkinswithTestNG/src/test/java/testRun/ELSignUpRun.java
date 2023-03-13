package testRun;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;




@RunWith(Cucumber.class)
@CucumberOptions(features =".//Features/SignUpFeature.feature" ,
glue="stepDefination",
dryRun=false,
monochrome=true,
plugin= {"pretty","html:target/cucumber-reports/reports4.html"})
public class ELSignUpRun {
	
	
}
