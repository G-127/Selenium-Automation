package test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class TestHotelAppTest {
	public static WebDriver driver;
  @Test
  public void TestHotelApp() {
	  System.setProperty("web driver.chrome,driver", "C:\\Users\\G-1-2043\\Desktop\\capita\\chromedriver_win32\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.navigate().to("https:\\adactinHotelapp.com");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("Opening Chrome window");
  }

  @AfterMethod
  public void afterMethod() {
	  driver.close();
	  System.out.println("Closing Chrome Browser");
  }

}
