package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;

public class TestP {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		Thread.sleep(5000);
		String ActualRGBColor = driver
				.findElement(By.xpath("//span[text()='Username or Password is invalid. Please try again.']"))
				.getCssValue("color");

		String expectedhexacode = "#ce0100";
		String actualhexacode = Color.fromString(ActualRGBColor).asHex();
		if (!ActualRGBColor.isEmpty()) {
			if (expectedhexacode.equals(actualhexacode)) {
				System.out.println("Pass : Color is correct");
			} else {
				System.out.println("Fail : Color is incorrect");
			}
		} else {
			System.out.println("Fail - Either the property name is incorrect or value is Empty");
		}

	}
}
