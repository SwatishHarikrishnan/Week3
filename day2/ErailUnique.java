package week3.day2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.math3.distribution.TriangularDistribution;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ErailUnique {

public static void main(String[] args) throws InterruptedException {
		
//		Set the system property and Launch the URL
		WebDriverManager.chromedriver().setup(); //navigate to exe or binary of chrome
		ChromeDriver driver = new ChromeDriver(); // creating a reference/object as driver
	
//		Click the 'sort on date' checkbox
		driver.get("https://erail.in/"); //using object and calling a method to open the url 
		driver.manage().window().maximize(); //now maximizing the windows
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@id='chkSelectDateOnly']")).click();

//		clear and type in the from station text field
		driver.findElement(By.id("txtStationFrom")).clear();
		driver.findElement(By.id("txtStationFrom")).sendKeys("Mgr Chennai Central Suburban", Keys.ENTER);
		//driver.findElement(By.id("txtStationFrom")).sendKeys(Keys.DOWN, Keys.DOWN, Keys.ENTER);
		
//		clear and type in the to station text field
		driver.findElement(By.id("txtStationTo")).clear();
		driver.findElement(By.id("txtStationTo")).sendKeys("Coimbatore Jn", Keys.ENTER);
		
//		Add a java sleep for 2 seconds
		Thread.sleep(2000);
		
//		Store all the train names in a list
		List<WebElement> multrains= driver.findElements(By.xpath("//table[@class='DataTable TrainList TrainListHeader']//tr/td[2]/a"));
		List<String> trainnames = new ArrayList<String>();
		for(WebElement trains : multrains)
		{
			trainnames.add(trains.getText());
		}
		
//		Get the size of it
		System.out.println("The total size of trains is : " +trainnames.size());
		
//		Add the list into a new Set
		Set<String> unique = new HashSet<String>();
		unique.addAll(trainnames);
		
//		And print the size of it
		System.out.println("The size after adding the list into a new set is : " +unique.size());

	}

}