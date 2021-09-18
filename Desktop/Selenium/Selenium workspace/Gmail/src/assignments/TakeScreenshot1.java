package assignments;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakeScreenshot1 {

	public static void main(String[] args) throws IOException {
		String timeStamp = LocalDateTime.now().toString().replace(':', '-');
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("https://en-gb.facebook.com/");
		File tempFile = driver.findElement(By.cssSelector("form[data-testid='royal_login_form']")).getScreenshotAs(OutputType.FILE);
		File destFile = new File("./errorshots/facebookLoginPanel"+timeStamp+ ".png");
		FileUtils.copyFile(tempFile, destFile);
		driver.quit();
	
	}

}
