package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ErailSort 
{

		public static void main(String[] args) throws InterruptedException 
		{
//			Launch the browser
			WebDriverManager.chromedriver().setup(); //navigate to exe or binary of chrome
			ChromeDriver driver = new ChromeDriver(); // creating a reference/object as driver
			
//			Launch the URL - https://erail.in/
			driver.get("https://erail.in/"); //using object and calling a method to open the url 
			driver.manage().window().maximize(); //now maximizing the windows
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			
//			Uncheck the check box - sort on date
			driver.findElement(By.xpath("//input[@id='chkSelectDateOnly']")).click();
			
//			clear and type in the source station 
			driver.findElement(By.id("txtStationFrom")).clear();
			driver.findElement(By.id("txtStationFrom")).sendKeys("chennai");
			driver.findElement(By.id("txtStationFrom")).sendKeys(Keys.DOWN, Keys.DOWN, Keys.ENTER);
			
//			clear and type in the destination station
			driver.findElement(By.id("txtStationTo")).clear();
			driver.findElement(By.id("txtStationTo")).sendKeys("mumbai", Keys.ENTER);
			Thread.sleep(2000);
			
//			Find all the train names using xpath and store it in a list
			List<WebElement> multrains= driver.findElements(By.xpath("//table[@class='DataTable TrainList TrainListHeader']//tr/td[2]/a"));
			List<String> trainnames = new ArrayList<String>();
			for(WebElement trains : multrains)
			{
				trainnames.add(trains.getText());
			}
			
//			Use Java Collections sort to sort it and then print it
			Collections.sort(trainnames);
			System.out.println("The sorted train names are " +trainnames );
			
		}

	}