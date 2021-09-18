package assignments;

import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

//Transfering driver control to specific window and return the control back to parent window


public class GetWindowHandles3 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.naukri.com/");
		String parentWid = driver.getWindowHandle();
		Set<String> allwidId = driver.getWindowHandles();

		for (String s : allwidId) {
			System.out.println(s);
			// switching driver control to child window
			driver.switchTo().window(s);
			if (driver.getTitle().equalsIgnoreCase("sykes")) {
				break;
			}

		}
		// performing action on child window
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.close();

		// switching driver control to parent window
		driver.switchTo().window(parentWid);
		
		// performing action on parent window
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.quit();
	}

}
