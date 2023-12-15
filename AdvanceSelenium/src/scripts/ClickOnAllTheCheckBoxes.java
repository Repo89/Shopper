package scripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ClickOnAllTheCheckBoxes {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", 
				"./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///C:/Users/QSPR/Desktop/checkbox.html");
		Thread.sleep(1000);
		List<WebElement> cboxes = driver.findElements(By.xpath("//input[@type='checkbox']"));
		int count = cboxes.size();

		for(WebElement cbox:cboxes) {
			cbox.click();
		}
		Thread.sleep(1000);
		
		for(int i=count-1;i>=0;i--) {
			WebElement cbox = cboxes.get(i);
			cbox.click();
		}
		driver.quit();
	}
}