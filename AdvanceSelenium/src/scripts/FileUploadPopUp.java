package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadPopUp {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//section[text()='Popups']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//section[text()='File Uploads']")).click();
		Thread.sleep(1000);
		WebElement browse_btn = driver.findElement(By.xpath("//input[@id='fileInput']"));
		Thread.sleep(1000);
		browse_btn.sendKeys("C:\\Users\\QSPR\\Desktop\\defect screenshots\\Facebook.png");
		Thread.sleep(1000);
		driver.quit();
	}

}
