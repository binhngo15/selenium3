package systest.net.saisoft.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class lab5Test {
   WebDriver driver = new FirefoxDriver();
 
   @Test
  public void Test1() {
    System.out.println("This is test1");
  }

  @Test
  public void Test2() {
    System.out.println("This is test2");
  }


}
