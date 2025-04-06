package Executor;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = "src/test/java/Testcase",
		glue = "TestcaseCode",
		plugin = "html:CucumberReport/cucumberReport.html",
		dryRun = false,
		tags = "@myntrasearch"
		)



public class CucumberExecutor extends AbstractTestNGCucumberTests{

}
