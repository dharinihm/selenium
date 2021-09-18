package webDriverMethods;

import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTime {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");		
		String expectedResult = "Please identify yourself";
		String source = driver.getPageSource();
		System.out.println(source);
		if (source.contains(expectedResult))
		{
		System.out.println("PASS::The TEXT is present");
		}
		else {
		System.out.println("FAIL::The TEXT is not present");
		}
	}

}
