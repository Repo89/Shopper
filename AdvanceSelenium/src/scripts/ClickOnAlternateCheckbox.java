package scripts;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class ClickOnAlternateCheckbox {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", 
				"./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/r.php");
		Thread.sleep(2000);
		WebElement ele = driver.findElement(By.id("month"));
		ArrayList<String> l=new ArrayList<String>();
		Select s=new Select(ele);
		List<WebElement> opt = s.getOptions();
		for(WebElement we:opt)
		{
			String t = we.getText();
			l.add(t);
			l.remove("Sep");
		}
		for(String t1:l)
		{
			System.out.println(t1);
		}
	}
}