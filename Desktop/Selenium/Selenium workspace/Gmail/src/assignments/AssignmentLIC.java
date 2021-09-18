package assignments;

import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentLIC {

	public static void main(String[] args) {
		String url = "https://licindia.in/";
		String expectedTitle = "Life Insurance Corporation of India - Home";
		String subUrl = "https://licindia.in/Guidelines/Be-a-Corporate-Agent";
		String expectedSubTitle = "Life Insurance Corporation of India - Be a corporate Agent";

		// launch the empty browser
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		// go to LIC India home page
		driver.get(url);

		// verifying Url
		verifyUrl(driver, url);

		// verifying Web page title
		verifyTitle(driver, expectedTitle);

		// Navigate to the subUrl
		Navigation nav = driver.navigate();
		nav.to(subUrl);

		// verifying SubUrl
		verifyUrl(driver, subUrl);

		// verifying Web page SubTitle
		verifyTitle(driver, expectedSubTitle);

		// Navigating back to home page
		nav.back();

		// verifying Url
		verifyUrl(driver, url);

		// Navigating to corporate Agent page
		nav.forward();

		// verifying SubUrl
		verifyUrl(driver, subUrl);

		// close the browser
		driver.quit();
	}

	public static void verifyTitle(ChromeDriver driver, String expectedTitle) {
		
		String actualTitle = driver.getTitle();
		System.out.println("expectedTitle: " + expectedTitle);
		System.out.println("actualTitle: " + actualTitle);
		if (actualTitle.equalsIgnoreCase(expectedTitle)) {
			System.out.println("PASS:: web Page title of LIC is Correct");
		} else {
			System.out.println("FAIL:: web Page title of LIC is InCorrect");
		}

	}

	public static void verifyUrl(ChromeDriver driver, String expectedUrl) {

		String actualUrl = driver.getCurrentUrl();
		System.out.println("expectedUrl: " + expectedUrl);
		System.out.println("actualUrl: " + actualUrl);

		if (actualUrl.equals(expectedUrl)) {
			System.out.println("PASS:: url of LIC is Correct");
		} else {
			System.out.println("FAIL:: url  of LIC is InCorrect");
		}
	}

}
