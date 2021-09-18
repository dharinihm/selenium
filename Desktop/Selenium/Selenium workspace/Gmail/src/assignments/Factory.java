package assignments;

import org.openqa.selenium.WebDriver;

public class Factory {

	public static void test(WebDriver driver) {
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com");

		// verifying Title of web page
		String expectedTitle = "Online Shopping for Women, Men, Kids Fashion & Lifestyle - Myntra";
		String actualTitle = driver.getTitle();
		System.out.println("expectedTitle :" + expectedTitle);
		System.out.println("actualTitle :" + actualTitle);

		if (actualTitle.equals(expectedTitle)) {
			System.out.println("PASS:: Title is correct");
		} else {
			System.out.println("FAIL:: Title is incorrect");

		}

		// verifying Url of web page
		String expectedUrl = "https://www.myntra.com/";
		String actualUrl = driver.getCurrentUrl();
		System.out.println("expectedUrl :" + expectedUrl);
		System.out.println("actualUrl :" + actualUrl);

		if (actualUrl.equals(expectedUrl)) {
			System.out.println("PASS:: Url is correct");
		} else {
			System.out.println("FAIL:: Url is incorrect");

		}

		driver.quit();
	}

}
