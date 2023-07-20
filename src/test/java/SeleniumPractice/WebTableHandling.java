package SeleniumPractice;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTableHandling {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/web-table-element.php");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
		
		driver.manage().window().maximize();
		//print table headers only
		
		List<WebElement> tableHeader=driver.findElements(By.xpath("//table[@class='dataTable']//tr/th"));
		/*for(WebElement we: tableHeader)
		{
			System.out.print(we.getText());
		}*/
		int no_of_col=tableHeader.size();
		System.out.println(no_of_col);
		List<WebElement> data=driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td"));
		int no_of_rows=data.size();
		System.out.println(no_of_rows);
		/*for(WebElement data1:data)
		{
			System.out.print(data1.getText());
			//System.out.println();
		}*/
		
		System.out.println("-----------------------------------------------------");
		System.out.println("Enter name to search");
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		List<WebElement> td;
		Iterator<WebElement> it1 = null;
		boolean flag;
		for(int i=0;i<no_of_rows;i++)
		{
			flag=false;
			//System.out.println();
			for(int j=0;j<=no_of_col;j++)
			{
				if(i==1)
				{
					List<WebElement> th=driver.findElements(By.xpath("//table[@class='dataTable']//tr["+i+"]/th["+j+"]"));
					Iterator<WebElement> it=th.iterator();
					while(it.hasNext())
					{
						System.out.print(it.next().getText());
						
					}
					//System.out.println();
				}
				
				else if(i>1)
				{
					//System.out.println();
					
					td=driver.findElements(By.xpath("//table[@class='dataTable']//tr["+i+"]/td["+j+"]"));
					 it1=td.iterator();
					 if(it1.hasNext()) 
					 {
						 if(flag==false) {
					 String s=it1.next().getText();
					 
					 if(s.equals(s1))
						{
						 flag=true;
							System.out.println(s);
						 while(it1.hasNext())
							{
								
								System.out.println(it1.next().getText());
							
							}
							
						}
					 
					 }
						 else
						 {
							 
							 while(it1.hasNext())
								{
									
									System.out.println(it1.next().getText());
								
								}

						 }
					
					
				}}
				
			
				
			
			}
		//	System.out.println(it1.next().getText());
			
		}

	}

}
