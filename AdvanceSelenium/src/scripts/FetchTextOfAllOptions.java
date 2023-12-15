package scripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class FetchTextOfAllOptions {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", 
				"./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://demoapps.qspiders.com/dropdown");
		Thread.sleep(1000);
		WebElement country_dropdown = driver.findElement(By.xpath("//label[text()='Country']/following-sibling::select"));
		Select sel=new Select(country_dropdown);
		List<WebElement> options = sel.getOptions();
		for(WebElement option:options)
		{
			String text=option.getText();
			System.out.println(text);
		}
		Thread.sleep(1000);
		driver.quit();
	}
}