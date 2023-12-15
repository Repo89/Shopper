package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class SubmitMethodExampple {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.edge.driver", 
				"./softwares/msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement login_btn = driver.findElement(By.name("login"));
		Dimension size = login_btn.getSize();
		int h = size.getHeight();
		int w = size.getWidth();
		System.out.println(h+"   "+w);
		System.out.println(size);
		driver.quit();
	}
}