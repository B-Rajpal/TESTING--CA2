package CA2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Ques1 {
  @Test
  public void function()throws InterruptedException {
	  	WebDriverManager.chromedriver().setup();
		WebDriver  driver;
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		driver=new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.get("https://www.trivago.in/");
		Thread.sleep(2000);
		String actualTitle="trivago.in - Compare hotel prices worldwide";
		String extractedTitle=driver.getTitle();
		AssertJUnit.assertEquals(actualTitle, extractedTitle);
		Thread.sleep(2000);
		WebElement location=driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div[1]/section/div[2]/div[3]/div/div[1]/div/form/div"));
		location.click();
		Thread.sleep(2000);
		WebElement ben=driver.findElement(By.xpath("//*[@id=\"suggestion-list\"]/ul/li[2]/div/div"));
		ben.click();
		Thread.sleep(2000);
		WebElement checkin=driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div[1]/section/div[2]/div[3]/div/div[2]/div/div/div/div[2]/div/div[1]/div[2]/button[2]/time"));
		checkin.click();
		Thread.sleep(2000);
		WebElement checkout=driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div[1]/section/div[2]/div[3]/div/div[2]/div/div/div/div[2]/div/div[1]/div[2]/button[7]/time"));
		checkout.click();
		Thread.sleep(2000);
		WebElement adult=driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div[1]/section/div[2]/div[3]/div/div[2]/div/div/div[1]/div/div[1]/div[1]/div/button[2]/span/span[1]"));
		adult.click();
		adult.click();
		Thread.sleep(2000);
		WebElement pet=driver.findElement(By.id("checkbox-13"));
		pet.click();
		Thread.sleep(3000);
		WebElement apply=driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div[1]/section/div[2]/div[3]/div/div[2]/div/div/div[2]/div/button[2]"));
		apply.click();
		Thread.sleep(3000);
		if(driver.getTitle().equals("Bengaluru (Pet friendly) Hotels | Find & compare great deals on trivago")) {
			System.out.println("1.Verified that the user can enter the location of stay and the user can enter the no of rooms based on their preferences");
		}
		
  }
}