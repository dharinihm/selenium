package assignments;

import org.openqa.selenium.chrome.ChromeDriver;

public class MyntraTesting {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.myntra.com");
		String expectedTitle = "Online shopping for women, men, kids fashion & lifestyle - myntra";
		String actualTitle = driver.getTitle();
		System.out.println("expectedTitle: " + expectedTitle);
		System.out.println("actualTitle: " + actualTitle);

		if (actualTitle.equalsIgnoreCase(expectedTitle)) {
			System.out.println("PASS:: web Page title of myntra is Correct");
		} else {
			System.out.println("FAIL:: web Page title of myntra is InCorrect");
		}

		String expectedUrl = "https://www.myntra.com/";
		String actualUrl = driver.getCurrentUrl();
		System.out.println("expectedUrl: " + expectedUrl);
		System.out.println("actualUrl: " + actualUrl);

		if (actualUrl.equals(expectedUrl)) {
			System.out.println("PASS:: url of myntra is Correct");
		} else {
			System.out.println("FAIL:: url  of myntra is InCorrect");
		}

		driver.close();

	}

}
