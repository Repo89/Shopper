package scripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class FetchOnlyTheSelectedOption {

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
		Thread.sleep(1000);
		WebElement option = sel.getFirstSelectedOption();
		String text = option.getText();
		System.out.println(text);
		Thread.sleep(1000);
		driver.quit();
	}
}