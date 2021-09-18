package webDriverMethods;

import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateMethod {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://licindia.in/");
		driver.get("https://en.wikipedia.org/wiki/Main_Page");
		Navigation nav = driver.navigate();
		nav.back();
		nav.forward();
		nav.refresh();
		
		nav.to("https://en.wikipedia.org/wiki/Wikipedia:Contents");
		driver.quit();
	}

}
