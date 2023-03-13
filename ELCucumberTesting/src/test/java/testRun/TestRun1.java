package testRun;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(features ="C:\\Users\\TOSHIBA\\eclipse-workspace\\ELCucumberTesting\\Features\\BOCompareandSave.feature",
glue="stepDefination",
dryRun=true,
monochrome=true,
plugin= {"pretty","html:target/cucumber-reports/reports5.html"})

public class TestRun1 {
	
	
	

}
