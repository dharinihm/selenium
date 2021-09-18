package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;

//WAS to verify the error message color is correct or not in actititme
public class p21 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		Thread.sleep(5000);

		String ActualRGBcolor = driver
				.findElement(By.xpath("//span[text()='Username or Password is invalid. Please try again.']"))
				.getCssValue("color");

		String expectedhexacode = "#ce0100";
		String actualhexacode = Color.fromString(ActualRGBcolor).asHex();
		if (!ActualRGBcolor.isEmpty()) {

			if (expectedhexacode.equals(actualhexacode)) {
				System.out.println("PASS:color is correct");

			} else {
				System.out.println("FAIL:Color is incorrect ");
			}
		} else {
			System.out.println("FAIL:Either the property name is incorrect or value is Empty");
		}
		driver.quit();
	}

}
