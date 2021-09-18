package findElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tester1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		List<WebElement> allLinksList = driver.findElements(By.tagName("a"));
		int expectedCount = 7;
		int actualCount = allLinksList.size();
		System.out.println("expectedCount" + expectedCount);
		System.out.println("actualCount" + actualCount);

		if (actualCount == expectedCount) {
			System.out.println("PASS:: link count is correct");
		} else
			System.out.println("FAIL:: link count is Incorrect");

		driver.quit();
	}

}
