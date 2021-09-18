package assignments;

import java.awt.Checkbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelectedPgm {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://demo.actitime.com/login.do");
		WebElement checkBox = driver.findElement(By.id("keepLoggedInCheckBox"));
		
		if (!checkBox.isSelected())
			System.out.println("PASS:: The keep me LoggedIn CheckBox is not selected");
		else
			System.out.println("FAIL:: The keep me LoggedIn CheckBox is selected");

		checkBox.click();
		Thread.sleep(3000);

		if (checkBox.isSelected())
			System.out.println("PASS:: The keep me LoggedIn CheckBox is  selected");
		else
			System.out.println("FAIL:: The keep me LoggedIn CheckBox is not selected");

		driver.quit();
	}

}
