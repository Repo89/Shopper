package scripts;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ChildBrowsers {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/browser-windows");
		Thread.sleep(1000);
		driver.findElement(By.id("windowButton")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("messageWindowButton")).click();
		Thread.sleep(1000);
		String parent_id = driver.getWindowHandle();
		Thread.sleep(1000);
		Set<String> all_id = driver.getWindowHandles();
		for(String id:all_id) {
			driver.switchTo().window(id);
			String url = driver.getCurrentUrl();
			if(url.equals("https://demoqa.com/sample")) {
				driver.close();
			}
			else {
				System.out.println(url);
			}
		}
	}
}