package systest.net.saisoft.selenium;

import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DisplayTest {

	private WebDriver driver = new FirefoxDriver();
	
	@After
	public void afterClass() throws Exception {
		driver.quit();
	}

	@Test
	public void test() {
		driver.manage().window().maximize();
		driver.get("http://www.google.com");
	}

}
