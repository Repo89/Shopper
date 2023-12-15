package scripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class CheckIfAnOptionIsSelectedAndDeselectIt {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", 
				"./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///C:/Users/QSPR/Desktop/listOfactors.html");
		Thread.sleep(1000);
		WebElement dropdown = driver.findElement(By.id("drop-down"));
		Select sel=new Select(dropdown);
		sel.selectByIndex(1);
		Thread.sleep(1000);
		sel.selectByValue("D");
		Thread.sleep(1000);
		sel.selectByVisibleText("Sharmila Mandre");
		List<WebElement> selected_options = sel.getAllSelectedOptions();
		
		for(WebElement options:selected_options) {
			String text = options.getText();
			if(text.equals("Anushka shetty")) {
				sel.deselectByVisibleText(text);
			}
		}
		Thread.sleep(1000);
		driver.quit();
	}

}
