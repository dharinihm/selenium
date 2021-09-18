package assignments;

import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

// To close only only the Child Browser Windows

public class GetWindowHandles6 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.naukri.com/");
		String parentWid = driver.getWindowHandle();

		Set<String> allwidId = driver.getWindowHandles();
		for (String s : allwidId) {
			System.out.println(s);
			// switching driver control to child windows
			driver.switchTo().window(s);
			if (!s.equals(parentWid)) {
				driver.close();
			}
		}
		driver.switchTo().window(parentWid);
		// performing action on parent window
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		

	}
}