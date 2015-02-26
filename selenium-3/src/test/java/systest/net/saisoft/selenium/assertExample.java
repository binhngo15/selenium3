package systest.net.saisoft.selenium;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class assertExample {
	 
	WebDriver driver = new FirefoxDriver();
	

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
		  driver.close();
		  driver.quit();
	}
	
	@Test
	public void assertNullExample() {
		driver.get("http://localhost:8080/test");
		WebElement textbox = driver.findElement(By.name("fname"));
		System.out.println(textbox.getAttribute("disabled"));
		assertNull(textbox.getAttribute("disabled"));
     		
	}
	@Test
	public void assertTrueExample() {
		driver.get("http://localhost:8080/test");
		WebElement checkbox = driver.findElement(By.name("mushroom"));
		
        assertTrue(checkbox.isSelected());		
	}
	@Test
	public void assertEqualsExample() {
		driver.get("http://localhost:8080/display");
		String pageTitle = driver.getTitle();
		System.out.println(pageTitle);
assertEquals("Display Entries", pageTitle);		
	}

}
