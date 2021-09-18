package assignments;

import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

//Transfer the driver control to 3rd Window and later transfer back to 2nd Window
public class GetWindowHandles4 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.naukri.com/");

		Set<String> allwidId = driver.getWindowHandles();
		String childWid = null;
		for (String s : allwidId) {
			System.out.println(s);
			// switching driver control to child windows
			driver.switchTo().window(s);

			if (driver.getTitle().equalsIgnoreCase("Sykes")) {
				childWid = s;
			}

			if (driver.getTitle().equalsIgnoreCase("Tech Mehindra")) {
				break;
			}
		}

		// performing action on 2nd child window
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		System.out.println();
		driver.close();

		// Switching driver control to another 1st child window
		driver.switchTo().window(childWid);

		// performing action on 1st child window
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		System.out.println();
		driver.quit();
	}
}