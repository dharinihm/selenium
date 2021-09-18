package webelementsmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;

public class Click {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");	
		driver.findElement(By.xpath("//button[text() = 'GOT IT']")).click();
		driver.findElement(By.linkText("CEO Jobs")).click();
		String bgColor = driver.findElement(By.cssSelector("input[type='submit']")).getCssValue("background-color");
		String hexaCode = Color.fromString(bgColor).asHex();
		System.out.println(hexaCode);
	}

}
