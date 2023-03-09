package seleniumpro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ProjectOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.demoblaze.com/");		
		driver.manage().window().maximize();
		driver.findElement(By.id("login2")).click();
		
		driver.findElement(By.id("loginusername")).sendKeys("Klamani");
		driver.findElement(By.id("loginpassword")).sendKeys("4KM$17#cs030");
		driver.findElement(By.xpath("(//button[@class='btn btn-primary'])[3]")).click();
		///html/body/nav/div[2]/div/div/div[3]/img
		//*[@id="contcont"]/div/div[1]/div
		//html/body/div[5]/div/div[1]/div
	}
}
