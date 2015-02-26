package systest.net.saisoft.selenium;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class waitExample {
    WebDriver driver= new FirefoxDriver();
	@Before
	public void setUp() throws Exception {
		driver.get("http://localhost:8080/add");
	}

	@After
	public void tearDown() throws Exception {
       driver.quit();
	}

	@Test
	public void test1() {
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.findElement(By.id("firstName")).sendKeys("Binh");
		driver.findElement(By.id("lastName")).sendKeys("Ngo");
		
		
	}
	@Test
	public void test2() {
		driver.get("http://localhost:8080/add");
		WebDriverWait wait = new WebDriverWait(driver, 15);
		
		wait.until(ExpectedConditions.titleContains("Add Entry"));
		
		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("input[name='firstName']")));
		driver.findElement(By.id("firstName")).sendKeys("Binh");
		
		driver.findElement(By.id("lastName")).sendKeys("Ngo");
		
		
	}

}
