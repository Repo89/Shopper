package scripts;

import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowserLaunch {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", 
				"./softwares/chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();

	}
}