package webelementsmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tester1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/");
		Thread.sleep(10000);
		driver.findElement(By.id("aboutArrow")).click();
		Thread.sleep(10000);
		driver.findElement(By.className("headerLink")).click();
		Thread.sleep(10000);
		driver.findElement(By.name("search")).sendKeys("");
		Thread.sleep(10000);
		driver.findElement(By.linkText("Downloads")).click();
		//driver.findElement(By.partialLinkText("NAACP Legal Defense")).click();
		System.out.println(driver.getCurrentUrl());
		driver.quit();
	}

}
