package testRun;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;



@RunWith(Cucumber.class)
@CucumberOptions(features=".//Features/Login.feature",
glue="stepDefination",
dryRun=true,
monochrome=true,
//plugin= {"pretty","html:target/reports/report1.html"}
plugin= {"pretty","html:target/TestReports/reports5.html"})



public class LoginRun  {

}
