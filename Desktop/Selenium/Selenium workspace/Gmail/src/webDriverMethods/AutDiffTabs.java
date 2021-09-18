package webDriverMethods;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutDiffTabs {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com");

		String parentWid = driver.getWindowHandle();
		
		driver.findElement(By.linkText("actiTIME Inc.")).click();
		Set<String> allWidIds = driver.getWindowHandles();
		for (String wid : allWidIds) {
			driver.switchTo().window(wid);
			if (driver.getTitle().equals("actiTIME - Time Tracking Software for Boosting Your Business")) {
				break;
			}
		}

		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		driver.close();
		System.out.println("====================");

		driver.switchTo().window(parentWid);
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		driver.quit();

	}

}
