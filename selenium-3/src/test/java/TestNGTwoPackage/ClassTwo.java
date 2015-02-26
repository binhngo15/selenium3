package TestNGTwoPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ClassTwo {
   WebDriver driver = new FirefoxDriver();
   
   @BeforeClass
   public void login()
   {
	   driver.get("http://localhost:8080/display");
   }
   
   @AfterClass
   public void close()
   {
	   driver.close();
	   driver.quit();
   }
  @Test (priority=3)
  public void addNewRecord() {
	  WebElement element;
	  
	  element = driver.findElement(By.linkText("Add New Record"));
	  element.click();
	  
	  driver.findElement(By.id("firstName")).sendKeys("Binh");
	  driver.findElement(By.id("lastName")).sendKeys("Ngo");
	  driver.findElement(By.id("emailAddress")).sendKeys("Binh@hotmail.com");
	  driver.findElement(By.id("active1")).click();
	  driver.findElement(By.id("age")).sendKeys("8");
	  driver.findElement(By.name("submit")).click();
	  
	
	  
  }
  @Test (priority=1)
  public void test2() {
	  System.out.println("test2");
	 
  }
  @Test (priority=2)
  public void test3() {
	  System.out.println("test3");
  }
}
