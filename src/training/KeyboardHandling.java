package training;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardHandling {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\itsdi\\Downloads\\selenium\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://facebook.com/");
		driver.findElement(By.xpath("//*[@id='email']")).sendKeys("manjula");
		
		Actions actions = new Actions(driver);
		actions.sendKeys(Keys.TAB).perform();
		actions.sendKeys("udubb").perform();
		//actions.sendKeys(Keys.ENTER).perform();
		actions.sendKeys(Keys.RETURN).perform();

	}

}
