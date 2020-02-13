package firstselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Getmethod {

	public static void main(String[] args) {
	System.setProperty("webdriver.gecko.driver", "C://Users//saifa//workspace//Selenium//Driver//geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	driver.get("http://www.facebook.com");
	driver.manage().window().maximize();
	driver.findElement(By.xpath(".//*[@id='email']")).sendKeys("saif.aisdu@gmail.com");
	driver.findElement(By.xpath(".//*[@id='pass']")).sendKeys("12345");
	driver.findElement(By.xpath(".//*[@id='u_0_2']")).sendKeys("sagor");
	driver.findElement(By.xpath(".//*[@id='u_0_4']")).sendKeys("khan");
	driver.findElement(By.xpath(".//*[@id='u_0_k']/span[2]/label")).click();
	Select data = new Select(driver.findElement(By.xpath(".//*[@id='month']")));
			data.selectByIndex(4);
			Select data1 = new Select(driver.findElement(By.xpath(".//*[@id='day']")));
			data1.selectByValue("23");
			Select data2 = new Select(driver.findElement(By.xpath(".//*[@id='year']")));
			data2.selectByIndex(6);
	
		// TODO Auto-generated method stub

	}

}
