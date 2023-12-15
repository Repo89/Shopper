package scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class EdgeBrowserOpenAndClose {

	public static void main(String[] args) throws InterruptedException {	
		System.setProperty("webdriver.edge.driver",
				"./softwares/msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		Thread.sleep(2000);
		driver.get("https://www.amazon.in");
		Thread.sleep(1000);
		String title=driver.getTitle();
		System.out.println(title);
		String url = driver.getCurrentUrl();
		System.out.println(url);
	/*	String src_code = driver.getPageSource();
		Thread.sleep(2000);
		if(src_code.contains("Australia")) {
			System.out.println("It is present");
		}
		else {
			System.out.println("Not present");
		}*/
		driver.quit();
	}
}