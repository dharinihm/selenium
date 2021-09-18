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

public class TakeScreenshot2 {

	public static void main(String[] args) throws IOException {
		String timeStamp = LocalDateTime.now().toString().replace(':', '-');
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("https://licindia.in/");
		
		driver.findElement(By.linkText("Stop")).click();
		File tempFile = driver.findElement(By.cssSelector("img[alt='LIC Policy Independence-Day_2021']"))
							.getScreenshotAs(OutputType.FILE);
		File destFile = new File("./errorshots/lic"+timeStamp+ ".png");
		FileUtils.copyFile(tempFile, destFile);
		driver.quit();
	
	}

}
