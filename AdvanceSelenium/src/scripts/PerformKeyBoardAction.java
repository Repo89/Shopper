package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PerformKeyBoardAction {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(1000);
		WebElement user_name = driver.findElement(By.id("email"));
		user_name.sendKeys("Hello World",Keys.TAB,"Hi@world123",Keys.TAB,Keys.ENTER);
		Thread.sleep(3000);
		driver.quit();
	}
}