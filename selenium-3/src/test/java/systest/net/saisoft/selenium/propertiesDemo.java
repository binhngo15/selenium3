package systest.net.saisoft.selenium;

import static org.junit.Assert.*;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.DrivenSeleniumLauncher;


public class propertiesDemo {
    WebDriver driver = new FirefoxDriver();
	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() throws IOException {
        Properties obj = new Properties();
        
        FileInputStream objFile = new FileInputStream("seleniumtest.properties");
        obj.load(objFile);
        
        driver.get("http://localhost:8080/add");
        driver.findElement(By.xpath(obj.getProperty("firstName"))).sendKeys("Binh");
        driver.findElement(By.xpath(obj.getProperty("lastName"))).sendKeys("Ngo");
        driver.findElement(By.xpath(obj.getProperty("email"))).sendKeys("Ngo@yahoo.com");
        driver.findElement(By.xpath(obj.getProperty("active"))).click();
        driver.findElement(By.name("submit")).click();
        
        
        
    
	}

}
