package scripts;

import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxBrowserLaunch {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", 
				"./softwares/geckodriver.exe");
		
		FirefoxDriver driver = new FirefoxDriver();
	}
}