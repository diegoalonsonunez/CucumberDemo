package testRunner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import io.github.bonigarcia.wdm.WebDriverManager;

@CucumberOptions(features={"Features"},glue = {"stepDefinitionPackage"})

public class RunnerTest extends AbstractTestNGCucumberTests {
	public static WebDriver driver;
	@BeforeTest
	public void setUp(){
		//option to choose any webDriver 
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		}
		
	
}//class
