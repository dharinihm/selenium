package assignments;

import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

// To close only only the Parent Browser Windows

public class GetWindowHandles7 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.naukri.com/");
		driver.close();

	}
}