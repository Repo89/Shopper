package scripts;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class SortOptionsInAscendingOrder {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver",
				"./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
		Thread.sleep(1000);
		WebElement month_dd = driver.findElement(By.id("month"));
		Select sel=new Select(month_dd);
		List<WebElement> options = sel.getOptions();
		ArrayList<String> arlist=new ArrayList<String>();
		
		for(WebElement option:options) {
			String text = option.getText();
			arlist.add(text);
		}
		
		Collections.sort(arlist,Collections.reverseOrder());
		
		for(String sorted:arlist) {
			System.out.println(sorted);
		}
		Thread.sleep(2000);
		driver.quit();
	}

}
