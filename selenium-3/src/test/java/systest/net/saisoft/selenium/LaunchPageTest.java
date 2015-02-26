/**
 * 
 */
package systest.net.saisoft.selenium;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * @author Joe Guaneri
 *
 */
public class LaunchPageTest {

	private WebDriver driver = new FirefoxDriver();
	
	@After
	public void afterClass() throws Exception {
		driver.quit();
	}

	@Test
	public void test() {
		driver.manage().window().maximize();
		driver.get("http://localhost:8080/");
	}
}
