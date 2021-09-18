package webelementsmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelected {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://en-gb.facebook.com/signup");
		WebElement radio = driver.findElement(By.xpath("//label[text() = 'Female']/following-sibling::input"));
		if (!radio.isSelected())
			System.out.println("PASS:: Female radio button is not selected earlier");
		else
			System.out.println("FAIL:: Female radio button is selected");

		radio.click();
		Thread.sleep(3000);

		if (radio.isSelected())
			System.out.println("PASS:: Female radio button is  selected earlier");
		else
			System.out.println("FAIL:: Female radio button is not selected");

		driver.quit();
	}

}
