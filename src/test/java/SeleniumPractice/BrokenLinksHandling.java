package SeleniumPractice;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrokenLinksHandling {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://tutorialsninja.com/demo/");
		List<WebElement> links = driver.findElements(By.tagName("a"));
		
		for(WebElement we:links)
		{
			String url=we.getAttribute("href");
			if(url==null || url.isEmpty())
			{
				System.out.println(url+" is empty");
			}
			else
			{
				try {
					HttpURLConnection con = (HttpURLConnection)(new URL(url).openConnection());
					con.connect();
					if(con.getResponseCode()>=400)
					{
						System.out.println(url+ "it is a broken link");
					}
					else
						System.out.println(url+ "it is valid url");
					
					} catch (MalformedURLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
				
		}
		driver.quit();

	}

	private static HttpURLConnection HttpURLConnection(URLConnection openConnection) {
		// TODO Auto-generated method stub
		return null;
	}

}
