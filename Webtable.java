package webtable;

import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtable 
{
	public static void main(String[] args)
	{	
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.techlistic.com/2017/02/automate-demo-web-table-with-selenium.html");
		List<WebElement> tr = driver.findElements(By.xpath("//*[@id='customers']//tbody//tr"));
		System.out.println(tr.size());
		List<WebElement> th = driver.findElements(By.xpath("//*[@id='customers']//tbody//tr//th"));
		System.out.println(th.size());
		for(int i=1; i<=tr.size(); i++)
		{

			for(int j=1; j<=th.size(); j++)
			{
				if(i>1)
				{
					WebElement value = driver.findElement(By.xpath("//*[@id='customers']//tbody//tr["+i+"]//td["+j+"]"));
					System.out.print(value.getText()+"      ");
				}
				else
				{
					WebElement value = driver.findElement(By.xpath("//*[@id='customers']//tbody//tr["+i+"]//th["+j+"]"));
					System.out.print(value.getText()+"     ");
				}
			}
			System.out.println();

		}

	}
}
