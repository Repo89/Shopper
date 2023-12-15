package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UnderstandingBasicLocators {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", 
				"./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/QSPR/Desktop/dummypage.html");
		Thread.sleep(1000);
		driver.findElement(By.tagName("input")).sendKeys("Hello");
		Thread.sleep(1000);
		driver.findElement(By.id("text-field")).sendKeys("World");
		Thread.sleep(1000);
		driver.quit();
	}
}