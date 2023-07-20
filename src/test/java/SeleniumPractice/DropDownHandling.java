package SeleniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownHandling {

	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://magento.softwaretestingboard.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[@class='block-promo home-erin']")).click();
		WebElement dropdown=driver.findElement(By.id("sorter"));
		Select s=new Select(dropdown);
		List<WebElement> items = s.getOptions();
		for(WebElement we:items)
		{
			System.out.println(we.getText());
		}
		
		s.selectByVisibleText("Product Name");
	///	Thread.sleep(500);
	//.deselectByVisibleText("Product Name");
	//	System.out.println("seleced is "+option.getText());
	

	}

}
