package systest.net.saisoft.selenium;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class clickButton {
	
	WebDriver driver = new FirefoxDriver();

	@After
	public void tearDown() throws Exception {
		driver.quit();
	}


	
	@Test
	public void test() {
		//Location of the local file
		String url = "file:///Users/bdavis/Desktop/Selenium/seleniumday2individualfiles/Selenium_Test2.html";
		driver.get(url);
		System.out.print(url);
		WebElement firstName = driver.findElement(By.xpath("html/body/form[1]/input[1]"));
		
		
		
	}

}
