package scripts;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class OpenLinkInNewTab {

	public static void main(String[] args) throws InterruptedException, AWTException {
		
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//section[text()='Link']")).click();
		Thread.sleep(1000);
		WebElement payments_link = driver.findElement(By.linkText("Payments"));
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", payments_link);
		Thread.sleep(1000);
		Actions act=new Actions(driver);
		act.contextClick(payments_link).perform();
		Thread.sleep(1000);
		Robot rbt=new Robot();
		rbt.keyPress(KeyEvent.VK_RIGHT);
		rbt.keyRelease(KeyEvent.VK_RIGHT);
		Thread.sleep(1000);
		rbt.keyPress(KeyEvent.VK_ENTER);
		rbt.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		driver.quit();
	}
}