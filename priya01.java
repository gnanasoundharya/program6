package priya;

import java.security.PublicKey;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;

public class priya01 {
	WebDriver driver;
	String url="https://rahulshettyacademy.com/locatorspractice";
	@BeforeTest
	public void tc1()
	{
		WebDriverManager.chromedriver().setup();
		ChromeOptions op=new ChromeOptions();
		op.addArguments("--remote-allow-origins=*");
		driver=new ChromeDriver(op);
		driver.get(url);
		
	}
	@Test(enabled = false)
	
	public void tc2()
	{
		driver.getTitle();
	}
	@AfterTest
	public void tc3() throws InterruptedException
	{
		Thread.sleep(3000);
		driver.close();
	}
	
	

}
