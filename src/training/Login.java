package training;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.ie.InternetExplorerDriver;

public class Login {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\itsdi\\Downloads\\selenium\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//System.setProperty("webdriver.ie.driver","C:\\Users\\itsdi\\Downloads\\selenium\\drivers\\IEDriverServer32.exe");
		//WebDriver driver = new InternetExplorerDriver();
		driver.get("https://www.google.com/");
		System.out.println("the title is "+driver.getTitle());
		driver.close();

	}

}
