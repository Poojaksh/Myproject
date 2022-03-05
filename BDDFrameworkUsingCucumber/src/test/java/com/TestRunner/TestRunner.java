package com.TestRunner;



import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features= {"AllFeature/my.feature"},
		glue = {"com.StepDefination"},
		dryRun=false,
		monochrome=true,
		plugin = {"html:Reports/Facebook.html",
				
				}
		
		)
public class TestRunner {

}

