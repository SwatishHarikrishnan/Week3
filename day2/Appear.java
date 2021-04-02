package week3.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Appear {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup(); //navigate to exe or binary of chrome
		ChromeDriver driver = new ChromeDriver(); // creating a reference/object as driver
		driver.get("http://www.leafground.com/pages/appear.html"); //using object and calling a method to open the url 
		driver.manage().window().maximize(); //now maximizing the windows
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement appear = driver.findElement(By.xpath("//div[@class='flex']//following::button[@id='btn']"));
		wait.until(ExpectedConditions.visibilityOf(appear));
		//System.out.println(appear.getText());
		if(appear.getText().contentEquals("Voila! I'm here Guys"))
		{
			System.out.println("The missing friend is finded and she is saying : " +appear.getText());
		}
	}

}
