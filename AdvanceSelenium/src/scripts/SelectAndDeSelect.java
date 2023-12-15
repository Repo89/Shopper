package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectAndDeSelect {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", 
				"./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///C:/Users/QSPR/Desktop/listOfactors.html");
		Thread.sleep(1000);
		WebElement drop_down = driver.findElement(By.id("drop-down"));
		Thread.sleep(1000);
		Select sel=new Select(drop_down);
		sel.selectByIndex(1);
		sel.selectByIndex(3);
		Thread.sleep(1000);
		sel.deselectByIndex(1);
		Thread.sleep(1000);
		driver.quit();
	}
}