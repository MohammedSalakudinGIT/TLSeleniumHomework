package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

	
	@CucumberOptions(dryRun=false,
			features= {"src/test/java/feature/Login.feature"},
			glue= {"stepdefinition"},
			monochrome=true)
			
	public class LoginRunner extends AbstractTestNGCucumberTests{
			
			
	

}
