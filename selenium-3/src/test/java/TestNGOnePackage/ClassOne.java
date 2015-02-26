package TestNGOnePackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
import org.testng.annotations.AfterTest;

public class ClassOne {
	
   WebDriver driver = new FirefoxDriver();
   
  @Test(dataProvider = "dp")
  public void f(String first, String last, String email, String age) {
	  driver.get("http://localhost:8080/add");
	  
	  WebElement firstName = driver.findElement(By.id("firstName"));
	  firstName.sendKeys(first);
	  
	  WebElement lastName = driver.findElement(By.id("lastName"));
	  lastName.sendKeys(last);
	  
	  WebElement emailAddress = driver.findElement(By.id("emailAddress"));
	  emailAddress.sendKeys(email);
	  
	  WebElement ageofPerson = driver.findElement(By.id("age"));
	  ageofPerson.sendKeys(age);
	  
	  driver.findElement(By.name("submit"));
	  
  }

  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { "first name", "last name", "email again", "13" },
      new Object[] { "first name 2", "last name 2", "email again 2", "19" },
    };
  }
  @AfterTest
  public void afterTest() {
	  driver.close();
	  driver.quit();
  }

}
