package scripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FetchUrlOfAllTheLinks {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", 
				"./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.amazon.in");
		Thread.sleep(1000);
		List<WebElement> all_links = driver.findElements(By.xpath("//a"));
		for(WebElement links:all_links) {
			String url = links.getAttribute("href");
			System.out.println(url);
		}
		
		System.out.println("--------------------Reverse starts---------------");
		Thread.sleep(1000);
		for(int i=all_links.size()-1;i>=0;i--) {
			String url = all_links.get(i).getAttribute("href");
			System.out.println(url);
		}
		Thread.sleep(1000);
		driver.quit();
	}
}