package webDriverMethods;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;

public class Tester1 {

	public static void main(String[] args) {
		System.setProperty("wedriver.chrome.driver", "./drivers/chromedriver.exe");
		System.setProperty("wedriver.gecko.driver", "./drivers/geckodriver.exe");
		System.setProperty("wedriver.opera.driver", "./drivers/operadriver.exe");
		System.setProperty("wedriver.ie.driver", "./drivers/ieDriverServer.exe");
		System.setProperty("wedriver.edge.driver", "./drivers/msedgedriver.exe");

		Factory.test(new ChromeDriver());
		Factory.test(new FirefoxDriver());
		Factory.test(new OperaDriver());
		Factory.test(new InternetExplorerDriver());
		Factory.test(new EdgeDriver());

	}

}
