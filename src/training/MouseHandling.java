package training;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHandling {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\itsdi\\Downloads\\selenium\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.discover.com/");
		
		
		
		WebElement loanstab = driver.findElement(By.xpath("//*[@id=\"main-content-rwd\"]/div[1]/div[3]/ul/li[1]/a/div/span[1]"));
		
		WebElement credit = driver.findElement(By.xpath("//*[@id=\"main-content-rwd\"]/div[1]/div[3]/ul/li[1]/ul/li[4]/a"));
		Actions action = new Actions(driver);
		action.moveToElement(loanstab);		
		
		action.moveToElement(credit).click().build().perform();
		
		//driver.quit();
		
	}

}
