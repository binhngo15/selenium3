package systest.net.saisoft.selenium;

import static org.junit.Assert.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import jxl.JXLException;
import jxl.Sheet;
import jxl.Workbook;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class dataDrivenExample {
	WebDriver driver = new FirefoxDriver();

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
		driver.quit();
	}

	@Test
	public void test() throws IOException, JXLException {
		
		FileInputStream file = new FileInputStream("data2.xls");
		Workbook w = Workbook.getWorkbook(file);
		
		Sheet s;
	    
		s=w.getSheet(0); 
		 
		
		for (int row =1; row < s.getRows(); row++)
		{
		   driver.get("http://localhost:8080/add");	  
		   String firstName = s.getCell(0,row).getContents();
		   driver.findElement(By.id("firstName")).sendKeys(firstName);
		   driver.findElement(By.id("lastName")).sendKeys(s.getCell(1,row).getContents());
		   driver.findElement(By.id("emailAddress")).sendKeys(s.getCell(1,row).getContents());
		   driver.findElement(By.id("active1")).click();
		   driver.findElement(By.id("age")).sendKeys(s.getCell(3,row).getContents());
		   driver.findElement(By.name("submit")).click();
		}
		
	}

}
