package CA2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Q3 {
	@Test
	public  void function() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver;
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(co);
		
		driver.get("https://www.trivago.in/");
		Thread.sleep(3000);
		String actualTitle="trivago.in - Compare hotel prices worldwide";
		String extractedTitle=driver.getTitle();
		AssertJUnit.assertEquals(actualTitle, extractedTitle);
		Thread.sleep(3000);
		WebElement location=driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div[1]/section/div[2]/div[3]/div/div[1]/div/form/div"));
		location.click();
		Thread.sleep(3000);
		WebElement ben=driver.findElement(By.xpath("//*[@id=\"suggestion-list\"]/ul/li[2]/div/div"));
		ben.click();
		Thread.sleep(3000);
		WebElement checkin=driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div[1]/section/div[2]/div[3]/div/div[2]/div/div/div/div[2]/div/div[1]/div[2]/button[2]/time"));
		checkin.click();
		Thread.sleep(3000);
		WebElement checkout=driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div[1]/section/div[2]/div[3]/div/div[2]/div/div/div/div[2]/div/div[1]/div[2]/button[7]/time"));
		checkout.click();
		Thread.sleep(3000);
		WebElement adult=driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div[1]/section/div[2]/div[3]/div/div[2]/div/div/div[1]/div/div[1]/div[1]/div/button[2]/span/span[1]"));
		adult.click();
		adult.click();
		Thread.sleep(3000);
		WebElement pet=driver.findElement(By.id("checkbox-13"));
		pet.click();
		Thread.sleep(3000);
		WebElement apply=driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div[1]/section/div[2]/div[3]/div/div[2]/div/div/div[2]/div/button[2]"));
		apply.click();
		Thread.sleep(40000);
		WebElement hotel = driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/main/div[2]/div[2]/div/div/div/div[2]/div/ul/li[2]/div"));
		hotel.click();
		Thread.sleep(3000);
		WebElement sort =driver.findElement(By.xpath("//*[@id=\"sorting-selector\"]"));
		Select sl = new Select(sort);
		sl.selectByIndex(3);
		WebElement product = driver.findElement(By.xpath("//*[@class=\"text-left w-full truncate font-bold\"]"));
		System.out.println(product.getText());
		List<WebElement> productprice = driver.findElements(By.xpath("//*[@class=\"flex align-bottom flex-wrap\"]"));
		System.out.println(productprice.get(0).getText());
		Select sl1 = new Select(sort);
		sl1.selectByIndex(5);
		List<WebElement>  product1 = driver.findElements(By.xpath("//*[@class=\"text-left w-full truncate font-bold\"]"));
		System.out.println(product1.get(0).getText());
		List<WebElement>  productprice1 = driver.findElements(By.xpath("//*[@class=\"flex align-bottom flex-wrap\"]"));
		System.out.println(productprice1.get(0).getText());
		System.out.println("Number of stays found "+ driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/main/div[5]/div[3]/div/div[2]/div[1]/div/div[2]/div[2]/div/div/div[1]/span[2]/strong")).getText());
		System.out.println("Number of booking sites reached "+driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/main/div[5]/div[3]/div/div[2]/div[1]/div/div[2]/div[2]/div/div/div[2]/span[2]/strong")).getText());
		
		List<WebElement> li = driver.findElements(By.xpath("//*[@class=\"text-left w-full truncate font-bold\"]"));
		for(int i=0;i<li.size();i++) {
			System.out.println(li.get(i));
		}
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/main/div[5]/section/div/div/ol/li[1]/div/article/div[2]/div[2]/div[1]/div/div[2]/div[2]/button")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"search_results_table\"]/div[2]/div/div/div[3]/div[2]/div[1]/div[2]/div/div[2]/div[2]/div/div[2]/a"));
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"hp_book_now_button\"]/span[1]"));
		Thread.sleep(3000);
		String check =driver.findElement(By.xpath("//*[@id=\"hprt-form\"]/div[6]/div[2]/div[2]/div[10]/ul/li[2]/div/div")).getText();
		System.out.println(check);
		
		}
}
