package firstselenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ListFinding {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C://Users//saifa//workspace//Selenium//Driver//geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://www.facebook.com");
		// TODO Auto-generated method stub

	}

}
