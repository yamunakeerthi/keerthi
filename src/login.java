import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class login {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\yamua\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver dr=new ChromeDriver();
		dr.manage().window().maximize();
		dr.get("https://www.facebook.com");
		WebElement email=dr.findElement(By.xpath("//*[@id=\"email\"]"));
				email.sendKeys("abc@gmail.com");
		WebElement psd=dr.findElement(By.xpath("//*[@id=\"pass\"]"));
		psd.sendKeys("hhjdfdfdj");
		WebElement btn=dr.findElement(By.id("loginbutton"));
		btn.click();
	}


}
