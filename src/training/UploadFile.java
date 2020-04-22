package training;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class UploadFile {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\itsdi\\Downloads\\selenium\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://filebin.net/");
		driver.findElement(By.id("fileField")).sendKeys("C:\\Users\\itsdi\\Downloads\\selenium\\Test data\\Testing.docx");
		
		System.out.println("closing the browser");
		driver.quit();
		
	}

}
