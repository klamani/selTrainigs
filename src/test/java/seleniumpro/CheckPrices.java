package seleniumpro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckPrices {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.demoblaze.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//*[@onclick=\"byCat('monitor')\"]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@src=\"imgs/apple_cinema.jpg\"]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@onclick=\"addToCart(10)\"]")).click();
		Thread.sleep(5000);
		driver.switchTo().alert().accept();
		driver.findElement(By.xpath("//*[@onclick=\"addToCart(10)\"]")).click();
		Thread.sleep(5000);
		driver.switchTo().alert().accept();
		driver.findElement(By.xpath("//*[@id=\"cartur\"]")).click();
		Thread.sleep(5000);
		String amount=driver.findElement(By.xpath("//*[@id=\"totalp\"]")).getText();
		int n = Integer.parseInt(amount);
		System.out.println("Your iteams price" + " " + n);
		if(n>500) {
			System.out.println("Exceded amount");
			String iteamdetailes=driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[1]")).getText();
			System.out.println("Your iteam detailes are like " + " " +iteamdetailes);
		}
		driver.findElement(By.xpath("//*[@class=\"btn btn-success\"]")).click();
		
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
