package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Locale.Category;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.Mouse;
import org.openqa.selenium.interactions.internal.MouseAction;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Myntra {

	public static void main(String[] args) throws InterruptedException {

		// 1) Open https://www.myntra.com/
		WebDriverManager.chromedriver().setup(); //navigate to exe or binary of chrome
		ChromeDriver driver = new ChromeDriver(); // creating a reference/object as driver
		driver.get("https://www.myntra.com/"); //using object and calling a method to open the url 
		driver.manage().window().maximize(); //now maximizing the windows
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		// 2) Mouse over on WOMEN 
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		WebElement women = driver.findElement(By.xpath("//a[@data-group='women']"));
		Actions action = new Actions(driver);
		action.moveToElement(women).perform();
		
		// 3) Click Jackets & Coats
		driver.findElement(By.xpath("//a[@href='/women-jackets-coats']")).click();
		
		// 4) Find the total count of item 
		WebElement totalcount = driver.findElement(By.xpath("//span[@class='title-count']"));
		System.out.println("The total count of item present is " +totalcount.getText().replaceAll("\\D", ""));
		
		// 5) Validate the sum of categories count matches
		List<WebElement> sumofcat = driver.findElements(By.xpath("//ul[@class='categories-list']/li/label"));
		List<Integer> number = new ArrayList<Integer>();
		int count = 2; //since jackets and coats count are 2
		for(WebElement name : sumofcat)
		{
			String categories= name.getText().replaceAll("\\D", "");
			number.add(Integer.parseInt(categories));
		}
		if(number.size()==count)
		{
			System.out.println("The sum of categories count is matched successfully");
		}
		
		// 6) Check Coats
		driver.findElement(By.xpath("(//ul[@class='categories-list']/li/label/div[@class='common-checkboxIndicator'])[2]")).click();
		
		// 7) Click + More option under BRAND	
		driver.findElement(By.xpath("//div[@class='brand-more']")).click();
		
		// 8) Type MANGO and click checkbox
		driver.findElement(By.xpath("//input[@placeholder='Search brand']")).sendKeys("Mango");
		driver.findElement(By.xpath("(//input[@value='MANGO']/parent::label/div)[2]")).click();
		
		// 9) Close the pop-up x
		driver.findElement(By.xpath("//span[@class='myntraweb-sprite FilterDirectory-close sprites-remove']")).click();
		
		// 10) Confirm all the Coats are of brand MANGO
		if(driver.findElement(By.xpath("(//div[@class='filter-summary-filter'])[2]")).getText().contains("MANGO"))
		{
			System.out.println("All the coats are of brand MANGO are confirmed successfully");
		}
		
		// 11) Sort by Better Discount
		List<WebElement> betterdiscount = driver.findElements(By.xpath("//ul[@class='results-base']//div[@class='product-productMetaInfo']//span[@class='product-discountPercentage']"));
		List<Integer> number1 = new ArrayList<Integer>();
		for(WebElement disc : betterdiscount)
		{
			String name1 = disc.getText().replaceAll("\\D", "");
			number1.add(Integer.parseInt(name1));
		}
		Collections.sort(number1);
		System.out.println("The discount are sorted in better order : " +number1);
		
		//12) Find the price of first displayed item		
		System.out.println("The price of first displayed item is  "+ driver.findElement(By.xpath("(//div[@class='product-price']//span[@class='product-discountedPrice'])[1]")).getText());
		
		//13) Mouse over on size of the first item
		WebElement mouseover= driver.findElement(By.xpath("//h4[text()='Women Solid Longline Overcoat']"));
		action.moveToElement(mouseover).build().perform();
		
		//14) Click on WishList Now
		driver.findElement(By.xpath("//span[@class='product-wishlistFlex product-actionsButton product-wishlist '][1]")).click();
		
		//15) Close Browser
		driver.close();
	}

}
