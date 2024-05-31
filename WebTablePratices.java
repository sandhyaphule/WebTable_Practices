package webtable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WebTablePratices 
{

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
		System.out.println("Total Elements: "+tot_elements.size());//985
		int pos_country=0;
		int pos_pri_language=0;
		int count=0;
		for(int i=0; i<tot_elements.size(); i++)//985
		{
			if(tot_elements.get(i).getText().equals("Country"))
			{
				pos_country=i;
			}
			if(tot_elements.get(i).getText().equals("Primary Language(s)"))
			{
				pos_pri_language=i;
			}
			int diff = pos_pri_language - pos_country;	
			System.out.print(tot_elements.get(i).getText()+" | ");
			if(tot_elements.get(i).getText().equals("Armenia"))
			{
				System.out.print("Country: "+tot_elements.get(i).getText()+" | ");//
				System.out.print("Primary Language: "+tot_elements.get(i+diff).getText()+" | ");//
			}
			if(count==4)
			{
				System.out.println();
				count=0;
			}
			else
			{
				count++;
			}
		}
	}
}
