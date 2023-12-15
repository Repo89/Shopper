package scripts;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SwitchingBetweenTabs {

	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.gecko.driver",
				"./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		
		Robot rbt=new Robot();
		
		for(int i=0;i<3;i++) {
			rbt.keyPress(KeyEvent.VK_CONTROL);
			rbt.keyPress(KeyEvent.VK_T);
			rbt.keyRelease(KeyEvent.VK_CONTROL);
			rbt.keyRelease(KeyEvent.VK_T);
			Thread.sleep(1000);
		}
		
		Set<String> all_id = driver.getWindowHandles();
		
		ArrayList<String> araylist=new ArrayList<>(all_id);
		String third_tab = araylist.get(2);
		driver.switchTo().window(third_tab);
		driver.get("https://www.facebook.com");
		String first_tab = araylist.get(0);
		driver.switchTo().window(first_tab);
		driver.get("https://www.youtube.com");
		String second_tab = araylist.get(1);
		String fourth_tab = araylist.get(3);
		driver.switchTo().window(second_tab);
		driver.close();
		driver.switchTo().window(fourth_tab);
		driver.close();
	}
}   