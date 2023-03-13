package seleniumpro;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChangeingWindoes {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		// String websource =driver.getWindowHandle();
		// System.out.println(websource);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@href='https://twitter.com/nopCommerce']")).click();
		// String websource1 =driver.getWindowHandle();
		// System.out.println(websource1);

		Set<String> websource = driver.getWindowHandles();
		for(String websrc:websource){
			System.out.println(websrc);
		}
		Thread.sleep(3000);
		driver.quit();
	}

}
