package Selenium_Sessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity_3 {

	public static void main(String[] args) throws InterruptedException {

		// Create a new instance of the Firefox driver
		FirefoxDriver driver = new FirefoxDriver();
		    
        //Open the browser
        driver.get("https://www.training-support.net/selenium/simple-form");
		        
        //Find the page title and print it
        String pageTitle = driver.getTitle();
        System.out.println(pageTitle);
        
        //Find the input fields
        WebElement firstName = driver.findElement(By.id("firstName"));
        WebElement lastName = driver.findElement(By.id("lastName"));
        //Enter text
        firstName.sendKeys("Tury");
        lastName.sendKeys("Subh");
        
        //Enter the email
        driver.findElement(By.id("email")).sendKeys("tury@example.com");
        
        //Enter the contact number
        driver.findElement(By.id("number")).sendKeys("1010101010");
        
        //Click Submit
        driver.findElement(By.cssSelector(".ui.green.button")).click();
        
        //Thread Sleep for visual verification of steps
        Thread.sleep(1000);
        
        //Close the browser
        driver.close();

	}

}