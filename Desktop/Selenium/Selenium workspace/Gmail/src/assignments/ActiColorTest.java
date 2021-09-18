package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;

// WAS to verify whether the error message color is correct in Actitime
public class ActiColorTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.id("username")).sendKeys("Dharini");
		driver.findElement(By.name("pwd")).sendKeys("Dharini");
		driver.findElement(By.xpath("//div[text()='Login ']")).click();

		Thread.sleep(5000);
		String expectedHexaCode = "#ce0100";
		String actualErrColor = driver
				.findElement(By.xpath("//span[text()='Username or Password is invalid. Please try again.']"))
				.getCssValue("color");

		if (!actualErrColor.isEmpty()) {
			String actualHexaCode = Color.fromString(actualErrColor).asHex();

			System.out.println("expectedHexaCode: " + expectedHexaCode);
			System.out.println("actualHexaCode: " + actualHexaCode);

			if (actualHexaCode.equals(expectedHexaCode)) {
				System.out.println("PASS:: Error message color is correct");
			} else {
				System.out.println("FAIL:: Error message color is Incorrect");
			}
		} else
			System.out.println("FAIL:: Error message color is not present");

		driver.quit();
	}

}
