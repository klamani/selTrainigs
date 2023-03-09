package seleniumpro;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PurchesItem {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.demoblaze.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@onclick=\"byCat('phone')\"]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"tbodyid\"]/div[1]/div/a/img")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"tbodyid\"]/div[2]/div/a")).click();
		Thread.sleep(5000);
		driver.switchTo().alert().accept();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"navbarExample\"]/ul/li[4]/a")).click();
		Thread.sleep(5000);
		
		//List<WebElement> cartList=driver.findElements(By.xpath("//tr[@class=\"success\"]"));
		//System.out.println(cartList.size());
//		String cartLi=driver.findElement(By.xpath("//tr[@class=\"success\"]")).getText();
//		int cartnum=Integer.parseInt(cartLi);
//		System.out.println(cartnum);
//		if(cartnum>1) {
//			System.out.println("Sorry you have been added more iteams then expected ,maxmin iteams to be prached is 1");
//			Thread.sleep(5000);
//		}else {
			driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/button")).click();
			
			Thread.sleep(5000);
			driver.findElement(By.xpath("//input[@id=\"name\"]")).sendKeys("Kiran");
			//Thread.sleep(5000);
			driver.findElement(By.xpath("//input[@id=\"country\"]")).sendKeys("India");
			//Thread.sleep(5000);
			driver.findElement(By.xpath("//*[@id=\"city\"]")).sendKeys("Bangalore");
			//Thread.sleep(5000);
			driver.findElement(By.xpath("//*[@id=\"card\"]")).sendKeys("875920438745");
			//Thread.sleep(5000);
			driver.findElement(By.xpath("//*[@id=\"month\"]")).sendKeys("Feb");
			//Thread.sleep(5000);
			driver.findElement(By.xpath("//*[@id=\"year\"]")).sendKeys("2023");
			//Thread.sleep(5000);
			driver.findElement(By.xpath("//*[@id=\"orderModal\"]/div/div/div[3]/button[2]")).click();
			//Thread.sleep(5000);
		//}
		String itemDetails =driver.findElement(By.xpath("/html/body/div[10]/p")).getText();
		Thread.sleep(5000);
		System.out.println("Your iteam detailes are like  :" + itemDetails);
		driver.findElement(By.xpath("//*[@class=\"confirm btn btn-lg btn-primary\"]")).click();
		Thread.sleep(5000);
	}
}
