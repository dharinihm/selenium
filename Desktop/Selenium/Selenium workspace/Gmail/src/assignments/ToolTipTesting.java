package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//WAS to verify tool tip text is correct or not in actitime
public class ToolTipTesting {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://demo.actitime.com/login.do");

		String expectedToolTip = "Do not select if this computer is shared";
		String actualToolTip = driver.findElement(By.id("keepLoggedInCheckBox")).getAttribute("title");

		System.out.println("expectedToolTip: " + expectedToolTip);
		System.out.println("actualToolTip: " + actualToolTip);

		if (actualToolTip != null) {
			if (actualToolTip.equals(expectedToolTip)) {
				System.out.println("PASS:: ToolTip text is correct");
			} else if (actualToolTip.isEmpty()) {
				System.out.println("FAIL:: ToolTip text is empty");
			} else {
				System.out.println("FAIL:: ToolTip attribute is InCorrect");

			}
		}

		driver.quit();
	}

}
