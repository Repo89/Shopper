package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ClickOnForgotpassword {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.edge.driver", 
				"./softwares/msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		Thread.sleep(1000);
		driver.findElement(By.linkText("Forgotten password?")).click();
		Thread.sleep(1000);
		driver.quit();
	}
}