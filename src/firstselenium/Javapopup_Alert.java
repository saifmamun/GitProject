package firstselenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Javapopup_Alert {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","C://Users//saifa//workspace//Selenium//Driver//geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://socialtriggers.com/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Alert simpleAlert = driver.switchTo().alert();
		simpleAlert.accept();
		//simpleAlert.dismiss();
		//driver.switchTo().alert().getText();
		//string alertValue=simpleAlert.getText();
		//System.out.println("alertvalue");
		// TODO Auto-generated method stub

	}

}
