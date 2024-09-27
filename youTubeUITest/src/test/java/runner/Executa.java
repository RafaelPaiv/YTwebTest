package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(
		
features = "src/test/resources/Features",
tags = "@videoBichoVindo",
dryRun = false,
glue = "steps",
monochrome = false,
snippets = SnippetType.CAMELCASE,
plugin = {"pretty","html:target/cucumber-report.html"}
		
)

public class Executa {

}
