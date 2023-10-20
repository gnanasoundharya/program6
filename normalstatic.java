package priya;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class normalstatic {
		WebDriver driver;
		String url="https://rahulshettyacademy.com/dropdownsPractise/";
		@BeforeTest
		public void static01()
		{
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			driver.get(url);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
			
	}
		@Test
		public void static02() throws AWTException
		{
			WebElement web=driver.findElement(By.id("divpaxinfo"));
		web.click();
		driver.findElement(By.id("hrefIncAdt")).click();
		}
		@Test
		public void dynamic01() throws InterruptedException
		{
			WebElement web1=driver.findElement(By.className("select_CTXT"));
			web1.click();
			driver.findElement(By.xpath("//a[@text='Bengaluru (BLR)']")).click();
			//Thread.sleep(3000);
			driver.findElement(By.xpath("(//a[@text='Thiruvananthapuram (TRV)'])[2]")).click();
			Thread.sleep(3000);
		}
}
