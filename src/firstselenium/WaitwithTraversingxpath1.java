package firstselenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitwithTraversingxpath1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.firefox.driver", "C://Users//saifa//workspace//Selenium//Drivergeckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.get("http://www.facebook.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath(".//*[@id='pageFooter']/ul/li[3]/a")).click();
		//WebDriverWait exWait= new WebDriverWait(driver,3000);
		//exWait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath(".//*[@id='pageFooter']/ul/li[1]"))));
		//driver.findElement(By.xpath(".//*[@id='pageFooter']/ul/li[1]")).click();
		
		// TODO Auto-generated method stub

	}

}
