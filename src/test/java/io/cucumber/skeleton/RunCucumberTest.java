package io.cucumber.skeleton;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
		 features = "src/test/resources/io/cucumber/skeleton",
		 glue= {"ServicesStepDefinations"},
		 plugin = { "pretty", "html:target/cucumber-reports" },
		 monochrome = true
		)
public class RunCucumberTest {
}
