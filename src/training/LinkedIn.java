package training;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;


public class LinkedIn {

	public static void main(String[] args) {
		System.setProperty("webdriver.ie.driver","C:\\Users\\itsdi\\Downloads\\selenium\\drivers\\IEDriverServer32.exe");
		WebDriver driver = new InternetExplorerDriver();
		//driver.get("https://www.linkedin.com/login/");
		driver.navigate().to("https://www.linkedin.com/login/");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();	
		
		
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("manjula@gmail.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("juhd4484");
		
		
		driver.findElement(By.xpath("//button[@class='btn__primary--large from__button--floating']")).submit();
		System.out.println("Closing the browser");
		driver.close();
	}

	
	
	

}
