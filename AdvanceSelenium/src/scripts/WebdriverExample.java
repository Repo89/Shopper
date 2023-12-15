package scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebdriverExample {

	public static WebDriver driver;
	
	public static void chrome() {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		 driver=new ChromeDriver();
		 driver.close();
	}
	
	public static void firefox() {
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		 driver=new FirefoxDriver();
		 driver.close();
	}
	
	public static void main(String[] args) {
		chrome();
		firefox();

	}

}
