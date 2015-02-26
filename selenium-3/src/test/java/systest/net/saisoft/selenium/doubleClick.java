package systest.net.saisoft.selenium;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class doubleClick {
	WebDriver driver= new FirefoxDriver();
	
	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

/*	@Test
	public void test1() {
	  driver.get("http://localhost:8080/doubleclick");
	  WebElement dbClick = driver.findElement(By.name("dblClick"));
	  
	  Actions build = new Actions(driver);
	  build.moveToElement(dbClick).doubleClick().perform();
		  
	}
	*/
	@Test
	public void test2() {
	  driver.get("http://localhost:8080/selectable");
	  WebElement one = driver.findElement(By.name("one"));
	  WebElement two = driver.findElement(By.name("two"));
	  WebElement five = driver.findElement(By.name("five"));
	  
	  
	  
	  Actions build = new Actions(driver);
	  build.keyDown(Keys.CONTROL).click(one).click(two).click(five).keyUp(Keys.CONTROL);
	  build.perform();
		  
	}

}
