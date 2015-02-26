package systest.net.saisoft.selenium;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class dialogTests {

	WebDriver driver = new FirefoxDriver();
	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
		driver.quit();
	}

	@Test
	public void alertTest() {
		  driver.get("http://localhost:8080/test");
		  
		  Alert a1 = driver.switchTo().alert();
		  String alertText = a1.getText();
		  System.out.print(alertText);
		  //click OK button
		  a1.accept();
		
	}

}
