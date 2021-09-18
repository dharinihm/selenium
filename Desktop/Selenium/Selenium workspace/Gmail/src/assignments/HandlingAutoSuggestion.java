package assignments;

import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

//WAS to verify whether auto suggestions starts with search keyword in Google website
public class HandlingAutoSuggestion {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(driver,15);
		
		driver.get("https://www.google.com/");
		String searchKeyword = "advance selenium";
		driver.switchTo().activeElement().sendKeys(searchKeyword);
		Thread.sleep(5000);
		
		List<WebElement> autoSuggestionList = driver.findElements(By.xpath("//li[contains(@class,'sbct')]"));
		System.out.println(autoSuggestionList.size());

	
		for (WebElement ele : autoSuggestionList)
			if (ele.getText().startsWith(searchKeyword)) {
				wait.until(ExpectedConditions.textToBe(By.xpath("//li[contains(@class,'sbct')]"), searchKeyword));
				System.out.println("PASS:: AutoSuggestion text starts with " + searchKeyword);
			}
			else
				System.out.println("FAIL:: AutoSuggestion text doesn't starts with " + searchKeyword);
		driver.quit();
		
	}

}
