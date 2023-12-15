package scripts;

import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class SortDataInDescendingOrder {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver",
				"./softwares/geckodriv`er.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
		Thread.sleep(1000);
		WebElement month_dd = driver.findElement(By.id("month"));
		Select sel=new Select(month_dd);
		List<WebElement> options = sel.getOptions();
		TreeSet<String> treset=new TreeSet<String>(Collections.reverseOrder());
		for(WebElement option:options) {
			String text=option.getText();
			treset.add(text);
		}
		
		for(String sorted:treset) {
			System.out.println(sorted);
		}
	}

}
