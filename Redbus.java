package week3.day1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Redbus {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup(); //navigate to exe or binary of chrome
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
		Thread.sleep(2000); //to avoid show notification option to disturbing my input
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@id='src']")).sendKeys("C");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li[@data-no='2']")).click();
		driver.findElement(By.xpath("//input[@id='dest']")).sendKeys("b");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[@data-no='1']")).click();;
		driver.findElement(By.xpath("//*[@id=\"rb-calendar_onward_cal\"]/table/tbody/tr[1]/td[3]/button")).click();
		driver.findElement(By.xpath("//table[@class='rb-monthTable first last']/tbody/tr[3]/td[4]")).click();
		driver.findElement(By.id("search_btn")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div[1]/i")).click();
		System.out.println("The number of buses found is : " +driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[2]/div[1]/span[1]/span")).getText());
		driver.findElement(By.xpath("//label[@for='bt_SLEEPER'][1]")).click();
		System.out.println("The number of sleeper class buses found is : " +driver.findElement(By.xpath("//span[@class='f-bold busFound']")).getText());
		driver.findElement(By.xpath("//label[@for='bt_AC'][1]")).click();
		System.out.println("The number of sleeper with AC class buses found is : " +driver.findElement(By.xpath("//span[@class='f-bold busFound']")).getText());
		driver.findElement(By.xpath("//i[@class='p-left-10 icon icon-down']")).click();
		List<WebElement> lesscost=driver.findElements(By.xpath("//div[@class='fare d-block']/span"));
		List<Integer> number=new ArrayList<Integer>();
		for(WebElement loopingallbusescost : lesscost)
		{
			String webelementtostring=loopingallbusescost.getText().replace("", "");
			number.add(Integer.parseInt(webelementtostring));
		}
		    Integer minimum = Collections.min(number);
		    System.out.println("The minimum cost available in the list is " +minimum);
	}

}
