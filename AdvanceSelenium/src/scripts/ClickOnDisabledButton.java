package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ClickOnDisabledButton {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://demoapps.qspiders.com/");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//section[text()='Button']")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Disabled")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//button[text()='Yes'])[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//button[text()='Yes'])[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[text()='4']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("submit")).click();
		Thread.sleep(1000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement button_disabled = driver.findElement(By.xpath("//button[text()='Submit']"));
		js.executeScript("arguments[0].click();", button_disabled);
	}
}