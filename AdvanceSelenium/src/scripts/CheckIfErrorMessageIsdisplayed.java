package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckIfErrorMessageIsdisplayed {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[text()='Log in']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("Email")).sendKeys("1234458gfasg");
		Thread.sleep(1000);
		driver.findElement(By.id("Password")).sendKeys("2358jsghd68");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		Thread.sleep(1000);
		boolean torf = driver.findElement(By.xpath("//span[contains(text(),'Please enter')]")).isDisplayed();
		System.out.println(torf);
		Thread.sleep(1000);
		driver.quit();
	
	}

}
