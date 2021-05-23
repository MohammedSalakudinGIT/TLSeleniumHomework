package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

	
	@CucumberOptions(dryRun=false,
			features= {"src/test/java/feature/EditLead.feature"},
			glue= {"stepdefinition"},
			monochrome=true)
			
	public class EditLeadRunner extends AbstractTestNGCucumberTests{
			
			
	

}
