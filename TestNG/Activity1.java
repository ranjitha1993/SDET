package TestNG_Sessions;
import org.testng.annotations.Test;
import junit.framework.Assert;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterMethod;

public class Activity1 {
	FirefoxDriver driver;
	
	@BeforeMethod
	public void beforeMethod() {
		driver = new FirefoxDriver();
		driver.get("https://www.training-support.net/");
	}
	
	@Test
	public void TestCase() {
		String title = driver.getTitle();
        System.out.println("Page title is: " + title);
        AssertJUnit.assertEquals(title,"Training Support");
        driver.findElement(By.id("about-link")).click();
	}
  
	@AfterMethod
	public void afterMethod() {
		driver.quit();
	}
}