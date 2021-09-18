package assignments;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//WAS to verify whether auto suggestions contains search keyword in Udemy website
public class HandlingAutoSuggestion1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.udemy.com/");
		Thread.sleep(5000);

		String searchKeyword = "advanced selenium";
		driver.findElement(By.name("q")).sendKeys(searchKeyword);
		Thread.sleep(5000);

		List<WebElement> autoSuggestionList = driver
				.findElements(By.xpath("//a[contains(@id,'search-form-autocomplete')]"));
		
		System.out.println(autoSuggestionList.contains(searchKeyword));
		for (WebElement ele : autoSuggestionList) {
			if (ele.getText().contains(searchKeyword)) {
				System.out.println("PASS:: AutoSuggestion text contains " + searchKeyword);
			} else
				System.out.println("FAIL:: AutoSuggestion text doesn't contains " + searchKeyword);
		}
		driver.quit();
	}

}
