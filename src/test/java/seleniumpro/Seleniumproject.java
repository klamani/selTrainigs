package seleniumpro;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Seleniumproject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.demoblaze.com/");		
		driver.manage().window().maximize();
		
		//total slids
		List<WebElement> slids= driver.findElements(By.className("d-block img-fluid"));
		System.out.println("The total slids are :" + " " +slids.size());
		//total image
		
		List<WebElement> img=driver.findElements(By.tagName("img"));
		System.out.println("tatal img are in webpage : " + " " +img.size());
	}

}
