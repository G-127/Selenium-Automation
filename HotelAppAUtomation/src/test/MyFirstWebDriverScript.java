package test;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyFirstWebDriverScript {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\G-1-2043\\Desktop\\capita\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.adactinhotelapp.com");
		WebElement uname= driver.findElement(By.id("username"));
		uname.sendKeys("Jeevan8120");
		driver.findElement(By.id("password")).sendKeys("Jeevan@8120");
		driver.findElement(By.id("login")).click();
		driver.quit();
	}

}
