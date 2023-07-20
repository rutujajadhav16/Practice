package SeleniumPractice;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.bidi.log.LogEntry;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.logging.LogEntries;
import org.openqa.selenium.logging.LogType;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ConsoleLogHandling {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/broken_images");
		LogEntries log=driver.manage().logs().get(LogType.BROWSER);
		List<org.openqa.selenium.logging.LogEntry> lst=log.getAll();
		for(org.openqa.selenium.logging.LogEntry l:lst)
		{
			System.out.println(l);
		}
		for(org.openqa.selenium.logging.LogEntry e:lst)
		{
			System.out.println(e.getMessage());
			System.out.println(e.getLevel());
		}
		

	}

}
