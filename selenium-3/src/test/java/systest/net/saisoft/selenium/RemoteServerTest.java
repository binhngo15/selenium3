package systest.net.saisoft.selenium;

import static org.junit.Assert.*;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.Augmenter;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class RemoteServerTest {
	
	
	@After
	public void tearDown() throws Exception {
		
	}

	@Test
	public void test() throws IOException {
		DesiredCapabilities capabilities = new DesiredCapabilities();
		//capabilities.setPlatform(Platform.WIN8_1);
		capabilities.setBrowserName("firefox");
		RemoteWebDriver remoteWD = null;
		try {
			remoteWD = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), capabilities);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		//Navigate to Google using a remote firefox browser
		remoteWD.get("http://www.google.com");
		WebElement element = remoteWD.findElement(By.name("q"));
		element.sendKeys("Selenium Grid");
		remoteWD = (RemoteWebDriver) new Augmenter().augment(remoteWD);
		File scrFile = ((TakesScreenshot)remoteWD).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile, new File("screenshot.jpg"));
		
		
		remoteWD.close();
		remoteWD.quit();
	
	}

	

}
