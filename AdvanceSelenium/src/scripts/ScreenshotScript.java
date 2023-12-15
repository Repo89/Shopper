package scripts;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenshotScript {

	public static void main(String[] args) throws InterruptedException, IOException {

		System.setProperty("webdriver.chrome.driver",
				"./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		Thread.sleep(1000);
		WebElement login_btn = driver.findElement(By.name("login"));
		File temp_mem = login_btn.getScreenshotAs(OutputType.FILE);
		File perm_mem = new File("C:\\Users\\QSPR\\Desktop\\defect screenshots\\login_btn.jpeg");
		FileHandler.copy(temp_mem, perm_mem);
		driver.quit();
	}

}
