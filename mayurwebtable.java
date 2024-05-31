package webtable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class mayurwebtable 
{//C:\Users\Administrator\Desktop-win64\chromedriver-win64\chromedriver.exe
	static WebElement abc = null;
	public static void main(String[] args) 
	{
		ChromeDriver chrome_driver;
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Administrator\\Documents\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeOptions cop = new ChromeOptions();
		cop.setBinary("C:\\Users\\Administrator\\Documents\\chrome-win64\\chrome-win64\\chrome.exe");
		chrome_driver = new ChromeDriver(cop);
		chrome_driver.get("https://cosmocode.io/automation-practice-webtable/#google_vignette");
		List<WebElement> tot_elements = chrome_driver.findElements(By.xpath("//*[@id='countries']//tr//td"));

		int count = 0;
		for(int i=0; i<tot_elements.size(); i++)
		{
			//				WebElement country = chrome_driver.findElement(By.xpath("//*[text()='Algeria']"));
			//				if(country.getText() == "Algeria")

			abc = tot_elements.get(i);
			System.out.print(abc.getText()+"		");
			String country_name = tot_elements.get(i).getText();
			String capital_name = tot_elements.get(i+1).getText();
			if(tot_elements.get(i).getText().equals("Algeria"))
			{
				System.out.print("Country: "+country_name);
				System.out.print("Capital: "+capital_name);
			}
			if(count == 4)
			{
				System.out.println();
				count = 0;
			}
			else
			{
				count ++;
			}
		}
	}
}	


