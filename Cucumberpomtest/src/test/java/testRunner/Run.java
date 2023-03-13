package testRunner;



import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(features =".//Features/ElLogin.feature" ,
glue="stepDefination",
dryRun=false,
monochrome=true,
tags="@smoke",
plugin= {"pretty","html:target/cucumber-reports/reports2.html"})

public class Run {

}
