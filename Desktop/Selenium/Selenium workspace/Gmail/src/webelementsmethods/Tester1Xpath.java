package webelementsmethods;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tester1Xpath {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://dharini0001.testrail.io/index.php?/auth/login/");
		driver.findElement(By.id("name")).sendKeys("dharinihm91@gmail.com");
		driver.findElement(By.name("password")).sendKeys("12381471649");
		driver.findElement(By.xpath("//a[@href='index.php?/auth/forgot_password']/../..//span[text()=' Log In']")).click();
		driver.findElement(By.xpath("//a[@href='index.php?/auth/forgot_password']/following::span[contains(text(),' Log In')]"))
			.click();
	}
}
