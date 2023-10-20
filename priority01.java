package priya;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class priority01 {
		WebDriver driver;
		String url="https://www.amazon.in";
		@BeforeTest(enabled = true)
		public void title() throws InterruptedException {
			WebDriverManager.chromedriver().setup();
			ChromeOptions op=new ChromeOptions();
			op.addArguments("--remote-allow-origins=*");
			driver=new ChromeDriver(op);
			driver.get(url);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			System.out.println(driver.getCurrentUrl());
			driver.getTitle();
			System.out.println(driver.getTitle());	
} 

@Test(enabled=true,priority=0)
public void login()
{
	driver.findElement(By.xpath("//span[@id='nav-link-accountList-nav-line-1']")).click();//hello,singin
	driver.findElement(By.xpath("//input[@id='ap_email']")).sendKeys("9362738419");//mailid or mobile no
	driver.findElement(By.xpath("//input[@id='continue']")).click();//continue button
	driver.findElement(By.id("ap_password")).sendKeys("ramya95@Sound");//password
	driver.findElement(By.xpath("//input[@id='signInSubmit']")).click();//singin
}
@Test(enabled=true,priority=1)
public void screenshot() throws IOException, InterruptedException
{
	File harya=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(harya,new File("C:/Users/user/Desktop/selenium screenshot/pr.png"));//screenshot
	Thread.sleep(5000);
	
}
@Test (enabled = true,priority = 2)
public void close()
{
	driver.close();
}
}

