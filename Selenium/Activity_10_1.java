package Selenium_Sessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Activity_10_1 {

	public static void main(String[] args) {
		
		FirefoxDriver driver = new FirefoxDriver();
        Actions actions = new Actions();
 
        //Open browser
        driver.get("https://www.training-support.net/selenium/input-events");
        //Find the cube
        WebElement cube = driver.findElement(By.id("wrapD3Cube"));
 
        //Left click
        actions.click(cube);
        WebElement cubeVal = driver.findElement(By.className("active"));
        System.out.println("Left Click: " + cubeVal.getText());
 
        //Double click
        ((Object) actions.doubleClick(cube)).perform();
        cubeVal = driver.findElement(By.className("active"));
        System.out.println("Double Click: " + cubeVal.getText());
        
        //Right click        
        ((Object) actions.contextClick(cube)).perform();
        cubeVal = driver.findElement(By.className("active"));
        System.out.println("Right Click: " + cubeVal.getText());
 
        //Close browser
        driver.close();

	}}