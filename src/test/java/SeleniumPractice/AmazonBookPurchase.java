package SeleniumPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class AmazonBookPurchase 
{

	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Books");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("(//img[@class='s-image'])[1]")).click();
		Thread.sleep(1000);
		//driver.findElement(By.xpath("//span[text()='Metamorphosis']/ancestor::div[@class='a-section a-spacing-none puis-padding-right-small s-title-instructions-style']/following-sibling::div[@class='sg-row']//span[text()='₹85']")).click();
		//driver.findElement(By.xpath("(//ul[@class='a-unordered-list a-nostyle a-button-list a-horizontal']/li[@class='swatchElement unselected'])[1]")).click();
		driver.findElement(By.id("add-to-cart-button")).click();
		String cartPrice=driver.findElement(By.xpath("//span[@class='a-offscreen']/parent::span[@class='a-price sw-subtotal-amount']")).getText();
		String expCart="85.00";
		Assert.assertEquals(cartPrice, expCart);
		
		
	}

}
