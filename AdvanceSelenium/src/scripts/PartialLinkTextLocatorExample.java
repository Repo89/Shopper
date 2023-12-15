package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PartialLinkTextLocatorExample {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.google.com/doodles");
		Thread.sleep(1000);
		driver.findElement(By.partialLinkText("Fumiko Enchi's")).click();
		Thread.sleep(2000);
		driver.quit();
	}
}