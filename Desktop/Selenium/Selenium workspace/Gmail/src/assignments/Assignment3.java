package assignments;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment3 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.skillrary.com/");

		Window window = driver.manage().window();

		Dimension dimension = window.getSize();
		int width = dimension.getWidth();
		int height = dimension.getHeight();
		System.out.println("The dimensions of the browser in which search text field is hidden: ");
		System.out.println("width = " + width + " pixels");
		System.out.println("height = " + height + " pixels");

		Point currentPoint = window.getPosition();
		int startX = currentPoint.getX();
		int startY = currentPoint.getY();
		System.out.println("The co-ordinates of the browser in which search text field is hidden: ");
		System.out.println("startX = " + startX);
		System.out.println("startY = " + startY);

	}

}
