package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

// WAS to verify image alt text is correct or not  in Flipkart
public class ImageAttTesting {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.flipkart.com/");
		String actualAltText = driver.findElement(By.cssSelector("img[title = 'Flipkart']")).getAttribute("alt");
		String expectedAltText = "Flipkart";

		System.out.println("expectedAltText: " + expectedAltText);
		System.out.println("actualAltText: " + actualAltText);

		if (actualAltText != null) {
			if (actualAltText.equals(expectedAltText)) {
				System.out.println("PASS:: alt text is correct");
			} else if (actualAltText.isEmpty()) {
				System.out.println("FAIL:: alt text is empty");
			} else {
				System.out.println("FAIL:: alt text is Incorrect");
			}
		}

		driver.quit();

	}

}
