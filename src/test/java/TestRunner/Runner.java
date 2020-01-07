package TestRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features ="src/test/resources/FeatureFile/HomePageSearch.feature",
				glue= "stepDefinition",
				dryRun=false,monochrome=true,plugin= {"pretty","junit:Foldername/report/cucumber.xml"})
public class Runner {

}
