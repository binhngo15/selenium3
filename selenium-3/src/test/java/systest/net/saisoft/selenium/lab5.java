package systest.net.saisoft.selenium;

import static org.junit.Assert.*;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import jxl.JXLException;
import jxl.Sheet;
import jxl.Workbook;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class lab5 {
	
	WebDriver driver = new FirefoxDriver();

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}


	
	@Test
	public void add() throws IOException, JXLException {
		
		Properties obj = new Properties();
		FileInputStream objFile = new FileInputStream("add.properties");
		obj.load(objFile);
		
		FileInputStream file = new FileInputStream("data2.xls");
		Workbook w = Workbook.getWorkbook(file);
		
		Sheet s;
	    
		s=w.getSheet(0); 
		 
		
		for (int row =1; row < s.getRows(); row++)
		{
		   driver.get("http://localhost:8080/add");	  
		   String firstName = s.getCell(0,row).getContents();
		//   driver.findElement(By.id("firstName")).sendKeys(firstName);
		   driver.findElement(By.id(obj.getProperty("firstName"))).sendKeys(firstName);
		   //driver.findElement(By.id("lastName")).sendKeys(s.getCell(1,row).getContents());
		   driver.findElement(By.id(obj.getProperty("lastName"))).sendKeys(s.getCell(1,row).getContents());
		   //driver.findElement(By.id("emailAddress")).sendKeys(s.getCell(1,row).getContents());
		   driver.findElement(By.id(obj.getProperty("emailAddress"))).sendKeys(s.getCell(1,row).getContents());
		   //driver.findElement(By.id("active1")).click();
		   driver.findElement(By.id(obj.getProperty("activeTrue"))).click();
		   //driver.findElement(By.id("age")).sendKeys(s.getCell(3,row).getContents());
		   driver.findElement(By.id(obj.getProperty("age"))).sendKeys(s.getCell(3,row).getContents());
		   //driver.findElement(By.name("submit")).click();
		   driver.findElement(By.name(obj.getProperty("submitButton"))).click();
		}
		
	}
	

	@Test
	public void update() throws IOException, JXLException {
		
		
		 
		   driver.get("http://localhost:8080/display");	  
		   driver.findElement(By.name("fobs[0].firstName")).clear();
		   driver.findElement(By.name("fobs[0].firstName")).sendKeys("Mary");
		   driver.findElement(By.name("fobs[0].lastName")).clear();
		   driver.findElement(By.name("fobs[0].lastName")).sendKeys("Smith");
		   driver.findElement(By.name("fobs[0].emailAddress")).clear();
		   driver.findElement(By.name("fobs[0].emailAddress")).sendKeys("qa@activcard.com");
		   driver.findElement(By.name("fobs[0].active")).sendKeys("false");
		   driver.findElement(By.name("fobs[0].age")).sendKeys("20");
		   driver.findElement(By.name("update")).click();
		  
		   try {
		   
			   driver.findElement(By.name("fobs[8].firstName")).sendKeys("20");
		   }
		   catch (Exception e){
			  System.out.println("test");
		   }
		   finally { System.out.println ("done"); }
		 
	}

}
