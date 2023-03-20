package seleniumpro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;                        

import io.github.bonigarcia.wdm.WebDriverManager;

public class ConditionalCommands {

    public static void main(String args[]) throws InterruptedException{
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("http://demowebshop.tricentis.com/");
        driver.manage().window().maximize();
        Thread.sleep(3000);
       boolean logo= driver.findElement(By.xpath("//img[@alt='Tricentis Demo Web Shop']")).isDisplayed();
       System.out.println("logo for the website is prasent ?" + logo);

       boolean serch=driver.findElement(By.id("small-searchterms")).isEnabled();
       System.out.println(serch);

       WebElement radio=driver.findElement(By.id("pollanswers-1"));
       System.out.println("Before selecting the radio button ___________");
       System.out.println(radio.isSelected());  //false
       Thread.sleep(5000);

       System.out.println("After selecting the radio button :________");
       radio.click();
       System.out.println(radio.isSelected()); //true 
       driver.quit();      
    }
    
}
