import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Ragavi {
	WebDriver dr;
	@BeforeClass
	public void setup()
	{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\yamua\\Downloads\\chromedriver_win32\\chromedriver.exe");
	dr=new ChromeDriver();
	dr.manage().window().maximize();
	}
	@BeforeMethod
	public void open()
	{
	dr.get("https://www.facebook.com");
	}
	@Test(description="email")
	public void email()
	{
	WebElement email=dr.findElement(By.xpath("//*[@id=\"email\"]"));
			email.sendKeys("abc@gmail.com");
	}
	@Test(description="pass")
	public void psd() {
	WebElement psd=dr.findElement(By.xpath("//*[@id=\"pass\"]"));
	psd.sendKeys("hhjdfdfdj");
	}
	@Test(description="login")
	public void log()
	{
	WebElement btn=dr.findElement(By.id("loginbutton"));
	btn.click();
	}
	@AfterMethod
	public void after()
	{
		dr.getCurrentUrl();
	}
	@AfterClass
	public void quit()
	{
		dr.quit();
	}

}
