package scripts;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ChangingDisplayResolution {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		Dimension d=new Dimension(500, 500);
		driver.manage().window().setSize(d);
		driver.get("https://www.facebook.com/");
		Thread.sleep(1000);
		Point p=new Point(500, 600);
		driver.manage().window().setPosition(p);

	}

}
