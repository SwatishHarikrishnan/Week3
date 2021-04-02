package week3.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Disappear {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup(); //navigate to exe or binary of chrome
		ChromeDriver driver = new ChromeDriver(); // creating a reference/object as driver
		driver.get("http://leafground.com/pages/disapper.html"); //using object and calling a method to open the url 
		driver.manage().window().maximize(); //now maximizing the windows
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement find= driver.findElement(By.id("btn"));
		wait.until(ExpectedConditions.invisibilityOf(find));
		//System.out.println(find.isDisplayed());
		if(find.isDisplayed()==false)
		{
			System.out.println("The button is sucessfully disappeared");
		}
		

		
	}

}
