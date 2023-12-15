package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Googlemaps {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.google.com/maps");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@aria-label='Directions']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Choose starting point, or click on the map...']")).sendKeys("Rajajinagar");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder='Choose starting point, or click on the map...']/../../../button[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[contains(@placeholder,'Choose destination')]")).sendKeys("Marathahalli");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[contains(@placeholder,'Choose destination')]/../../../button[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Details']")).click();
		Thread.sleep(2000);
		driver.quit();
	}

}
