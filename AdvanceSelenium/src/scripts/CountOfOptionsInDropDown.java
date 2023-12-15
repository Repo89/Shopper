package scripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class CountOfOptionsInDropDown {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", 
				"./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://demoapps.qspiders.com/dropdown");
		Thread.sleep(1000);
		WebElement country_dropdown = driver.findElement(By.xpath("//label[text()='Country']/following-sibling::select"));
		Select sel=new Select(country_dropdown);
		List<WebElement> options = sel.getOptions();
		int count = options.size();
		System.out.println(count);
		Thread.sleep(1000);
		driver.quit();
	}

}
