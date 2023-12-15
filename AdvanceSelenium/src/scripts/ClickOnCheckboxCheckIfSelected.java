package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickOnCheckboxCheckIfSelected {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/checkbox");
		Thread.sleep(1000);
		WebElement whatsapp_checkbox = driver.findElement(By.xpath("//span[text()='WhatsApp']/preceding-sibling::input"));
		whatsapp_checkbox.click();
		Thread.sleep(1000);
		if(whatsapp_checkbox.isSelected()) {
			System.out.println("IT IS SELECTED");
		}
		else{
			System.out.println("Not Selected");
		}
		Thread.sleep(1000);
		driver.quit();
	}

}
