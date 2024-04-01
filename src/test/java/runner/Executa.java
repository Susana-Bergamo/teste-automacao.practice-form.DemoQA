package runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.chrome.ChromeDriver;

import drivers.DriversFactory;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;
import io.github.bonigarcia.wdm.WebDriverManager;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features", 
				glue = "steps", 
				dryRun = false, 
				tags = "@regressivos", 
				monochrome = true, 
				snippets = SnippetType.CAMELCASE, 
				plugin = {"pretty", "html:target/cucumber-report.html" }
)

public class Executa extends DriversFactory {

	
	public static void openBrowse() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://demoqa.com/automation-practice-form");
		driver.manage().window().maximize();

	}

	@AfterClass
	public static void closeBrowser() {
		driver.quit();

	}

}