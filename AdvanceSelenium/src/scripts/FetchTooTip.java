package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class FetchTooTip {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.edge.driver", 
				"./softwares/msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		WebElement kannada = driver.findElement(By.xpath("//a[text()='ಕನ್ನಡ']"));
		String tool_tip = kannada.getAttribute("title");
		String link = kannada.getAttribute("href");
		System.out.println(tool_tip);
		System.out.println(link);
		Thread.sleep(1000);
		WebElement message = driver.findElement(By.xpath("//h2[contains(text(),'Facebook')]"));
		String text = message.getText();
		System.out.println(text);
		driver.quit();
	}
}