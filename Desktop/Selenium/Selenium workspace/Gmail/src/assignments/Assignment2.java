package assignments;

import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://licindia.in/");
		
		// verifying Url
		String expectedUrl = "https://licindia.in/";
		String actualUrl = driver.getCurrentUrl();
		System.out.println("expectedUrl: " + expectedUrl);
		System.out.println("actualUrl: " + actualUrl);

		if (actualUrl.equals(expectedUrl)) {
			System.out.println("PASS:: url of LIC is Correct");
		} else {
			System.out.println("FAIL:: url  of LIC is InCorrect");
		}
		
		
		// verifying Web page title
		String expectedTitle = "Life Insurance Corporation of India - Home";
		String actualTitle = driver.getTitle();
		System.out.println("expectedTitle: " + expectedTitle);
		System.out.println("actualTitle: " + actualTitle);
		if (actualTitle.equalsIgnoreCase(expectedTitle)) {
			System.out.println("PASS:: web Page title of LIC is Correct");
		} else {
			System.out.println("FAIL:: web Page title of LIC is InCorrect");
		}
		
		
		Navigation nav = driver.navigate();
		nav.to("https://licindia.in/Guidelines/Be-a-Corporate-Agent");
		
		// verifying Url
		String expectedUrl1 = "https://licindia.in/Guidelines/Be-a-Corporate-Agent";
		String actualUrl1 = driver.getCurrentUrl();
		System.out.println("expectedUrl1: " + expectedUrl1);
		System.out.println("actualUrl1: " + actualUrl1);

		if (actualUrl1.equals(expectedUrl1)) {
			System.out.println("PASS:: url of LIC is Correct");
		} else {
			System.out.println("FAIL:: url  of LIC is InCorrect");
		}
		
		
		// verifying Web page title
		String expectedTitle1 = "Life Insurance Corporation of India - Be a corporate Agent";
		String actualTitle1 = driver.getTitle();
		System.out.println("expectedTitle1: " + expectedTitle1);
		System.out.println("actualTitle1: " + actualTitle1);
		if (actualTitle1.equalsIgnoreCase(expectedTitle1)) {
			System.out.println("PASS:: web Page title of LIC is Correct");
		} else {
			System.out.println("FAIL:: web Page title of LIC is InCorrect");
		}
		
		
		
		nav.back();
		// verifying Url
		String expectedUrl3 = "https://licindia.in/";
		String actualUrl3 = driver.getCurrentUrl();
		System.out.println("expectedUrl: " + expectedUrl);
		System.out.println("actualUrl: " + actualUrl);

		if (actualUrl3.equals(expectedUrl3)) {
			System.out.println("PASS:: url of LIC is Correct");
		} else {
			System.out.println("FAIL:: url  of LIC is InCorrect");
		}
		
		
		nav.forward();
		// verifying Url
		String expectedUrl4 = "https://licindia.in/Guidelines/Be-a-Corporate-Agent";
		String actualUrl4 = driver.getCurrentUrl();
		System.out.println("expectedUrl4: " + expectedUrl4);
		System.out.println("actualUrl4: " + actualUrl4);

		if (actualUrl4.equals(expectedUrl4)) {
			System.out.println("PASS:: url of LIC is Correct");
		} else {
			System.out.println("FAIL:: url  of LIC is InCorrect");
		}
		
		
		driver.quit();
	}

}
