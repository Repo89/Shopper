package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FetchLocationOfanElement {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.amazon.in");
		Thread.sleep(1000);
		WebElement aus = driver.findElement(By.linkText("Australia"));
		Point loc = aus.getLocation();
		int x = loc.getX();
		int y = loc.getY();
		System.out.println(x+"   "+y);
		System.out.println(loc);
		Thread.sleep(1000);
		driver.quit();
	}
}