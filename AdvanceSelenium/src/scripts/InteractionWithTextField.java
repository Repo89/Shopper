package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InteractionWithTextField {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", 
				"./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		Thread.sleep(1000);
		WebElement ele = driver.findElement(By.id("nav-search-submit-button"));
		Thread.sleep(1000);
		ele.click();
		Thread.sleep(1000);
		driver.navigate().refresh();
		Thread.sleep(1000);
		ele.click();
	
	
	
	}

}
