package webelementsmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayed {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://services.ecourts.gov.in/ecourtindia_v6");	
		
		if(!driver.findElement(By.id("rgyearP")).isDisplayed()) {
			System.out.println("PASS: Element Reg Year is Not Displayed");
		} else {
			System.out.println("FAIL: Element Reg Year is Displayed");
		}
		
		if(driver.findElement(By.id("cino")).isDisplayed()) {
			System.out.println("PASS:: Element CNR is Displayed");
		} else {
			System.out.println("FAIL:: Element CNR is Not Displayed");
		}
	}

}
