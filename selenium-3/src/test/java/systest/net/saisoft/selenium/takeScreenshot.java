package systest.net.saisoft.selenium;

import static org.junit.Assert.*;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class takeScreenshot {
	//WebDriver driver = new FirefoxDriver();

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	//	driver.close();
		//driver.quit();
	}
	

	@Test
	public void switchWindows() throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://localhost:8080/test");
		Alert a1 = driver.switchTo().alert();
		a1.accept();
		a1.accept();
		a1.accept();
		
		String windows1 = driver.getWindowHandle();
		System.out.println(windows1);
		 System.out.println(driver.getTitle());
		
		driver.findElement(By.linkText("Click Here")).click();
		Thread.sleep(9099);
		
        System.out.println(driver.getTitle());
        String windows2 = "";
        windows2 = driver.getWindowHandle();
       
		
		System.out.println(windows2);
	}
/*
	@Test
	public void test() throws IOException {
		Map capilitiesMap = new HashMap();
		capilitiesMap.put("takesScreenshot",  true);
		DesiredCapabilities capabilites = new DesiredCapabilities(capilitiesMap);
		WebDriver driver = new FirefoxDriver(capabilites);
		driver.get("http://localhost:8080/display");
		
		File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile, new File("screenshot.jsp"));
	}
	*/

}
