package systest.net.saisoft.selenium;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class searchGoogle {
	
	WebDriver driver = new ChromeDriver();

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		driver.get("http://www.google.com");
		List<WebElement> buttons = driver.findElements(By.tagName("button"));
		System.out.println(buttons.size());
		
		
		
		
	}

}
