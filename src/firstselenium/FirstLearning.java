package firstselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstLearning {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","‪C://Users//saifa//workspace//Selenium//Driver//geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		//driver.findElement(By.id("‪email")).sendKeys("saif.aisdu@gmail.com");
		driver.get("http://www.facebook.com");
		driver.findElement(By.id("‪email")).clear();
		//driver.findElement(By.id("email"));
		driver.findElement(By.id("‪email")).sendKeys("saif.aisdu@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("123");
		driver.findElement(By.id("u_0_r")).click();
		Thread.sleep(5000);
		// TODO Auto-generated method stub

	}

}
