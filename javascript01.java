package priya;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class javascript01 {
	WebDriver driver;
	String url="https://www.rahulshettyacademy.com/practice-project";
	@BeforeTest
	public void static01()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
}@Test
	public void javascr01()

	{

	JavascriptExecutor js=((JavascriptExecutor)driver);
	js.executeScript("document.getElementById('name').value='arya'" );
	js.executeScript("document.getElementById('email').value='gnana95@gmail.com'");
	js.executeScript("document.getElementById('agreeTerms').click()");
	js.executeScript("document.getElementById('form-submit').click()");
//	js.executeScript("document.getElementById('name').value=\"soundharya\"");
//	js.executeScript("document.getElementById('email').value=\"gnana3095@gmail.com\"");
//	js.executeScript("document.getElementById('agreeTerms').click()");
//	js.executeScript("document.getElementById('form-submit').click()");

	}

}
