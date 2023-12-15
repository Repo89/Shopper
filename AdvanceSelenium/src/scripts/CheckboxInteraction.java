package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class CheckboxInteraction {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.edge.driver",
				"./softwares/msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.get("file:///C:/Users/QSPR/Desktop/dummypage.html");
		Thread.sleep(1000);
		WebElement text1=driver.findElement(By.tagName("input"));
		text1.sendKeys("Hello");
		Thread.sleep(1000);
		text1.clear();
		Thread.sleep(1000);
		WebElement	text2=driver.findElement(By.id("a1"));
		text2.sendKeys("World");
		Thread.sleep(1000);
		text2.clear();
		WebElement	cbox=driver.findElement(By.className("c1"));
		cbox.click();
		Thread.sleep(1000);
		cbox.click();
		Thread.sleep(1000);
		driver.quit();
	}
}