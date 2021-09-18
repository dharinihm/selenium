package findElements;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AutoSuggestion1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(driver, 15);
		
		driver.get("https://www.zomato.com/bangalore");
		String pwid = driver.getWindowHandle();
		System.out.println(pwid);
		
		//driver.findElement(By.cssSelector("input[placeholder='Search for restaurant, cuisine or a dish']")).sendKeys("dominos ");
		
	 driver.findElement(By.xpath("//div[text()='Dining Out']")).click();;
		
	 System.out.println(driver.getTitle());
	 
	 Set<String> wids = driver.getWindowHandles();
	 for(String wid:wids) {
		 System.out.println(wid);
		 if (!wid.equals(pwid))
			 driver.switchTo().window(wid);
	 }
		
		
		driver.quit();
	}

}
