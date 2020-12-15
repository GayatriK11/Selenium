package runners;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;




/*@RunWith(Cucumber.class)
@CucumberOptions(
		features={"src/test/resources/features"}, 
		glue= {"steps"}, 
		monochrome=true, 
				plugin={"html:target/cucumber-html-report","json:target/cucumber-reports/cucumber.json","junit:target/cucumber-reports/cucumber.xml","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
		)


public class TestRunner {
	
	


}*/


@CucumberOptions(
		features={"src/test/resources/features"}, 
		glue= {"steps"}, 
		monochrome=true, 
				plugin={"html:target/cucumber-html-report","json:target/cucumber-reports/cucumber.json","junit:target/cucumber-reports/cucumber.xml","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
		)


public class TestRunner extends AbstractTestNGCucumberTests{
	
	


}

