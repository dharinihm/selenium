package assignments;

import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

// To close the last browser window
// To close nth browser window

public class GetWindowHandles5 {

	public static void main(String[] args) {

			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			ChromeDriver driver = new ChromeDriver();
			driver.get("https://www.naukri.com/");
			Set<String> allwidId = driver.getWindowHandles();

			for (String s : allwidId) {
				System.out.println(s);
				// switching driver control to last child window
				driver.switchTo().window(s);
				}


			// performing action on last child window
			System.out.println(driver.getTitle());
			System.out.println(driver.getCurrentUrl());
			driver.close();
		
	}
}