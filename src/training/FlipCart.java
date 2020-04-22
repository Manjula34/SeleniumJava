package training;

import java.io.File;
import java.io.IOException;

import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FlipCart {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\itsdi\\Downloads\\selenium\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");
		
	
		// Login to flipcart using keybord
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/input")).sendKeys("9751065206");
		Actions action = new Actions(driver);
		action.sendKeys(Keys.TAB).perform();
		
		action.sendKeys("11223344");
		action.sendKeys(Keys.ENTER).perform();
		
		
		Thread.sleep(1000);
		
		System.out.println("login succesful");
		// Select mens shirt using mouse action
		
		WebElement Menstab = driver.findElement(By.xpath("//span[contains(text(),'Men')]"));
		Actions action1 = new Actions(driver);
		action1.moveToElement(Menstab).perform();
		WebElement tshirt = driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/div/ul/li[3]/ul/li/ul/li[2]/ul/li[3]/a"));
		action1.moveToElement(tshirt).click().perform();
		System.out.println("displaying mens Tshirt ");
	
		 driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[2]/div[1]/div[2]/div[1]/div/div/div[2]/div[4]")).click();
		 
	     driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[2]/div[1]/div[2]/div[2]/div/div[1]/div/a/div[1]/div/div/div")).click();
	     Thread.sleep(2000);
	     
	     // switch to another window
	     for(String winHandle : driver.getWindowHandles()){
	    	    driver.switchTo().window(winHandle);
	    	    System.out.println(driver.switchTo().window(winHandle).getTitle());
	    	}
		 
		// Taking screen shot for selected shirt
	    TakesScreenshot ts = (TakesScreenshot)driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(source, new File("C:\\Users\\itsdi\\Downloads\\selenium\\shirt.png"));
		
		driver.quit();
	     
	}

}
