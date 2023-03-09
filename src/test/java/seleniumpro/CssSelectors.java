package seleniumpro;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CssSelectors {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.demoblaze.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15)) ;
		driver.findElement(By.cssSelector("a[href='prod.html?idp_=1'].hrefch")).click();
		
	}

}
