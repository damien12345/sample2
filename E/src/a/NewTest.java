package a;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NewTest {
  @Test
  public void f()
  {
	  
	  System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver h= new ChromeDriver();
		h.get("http://www.seleniumhq.org/download/");
	
  }
}
