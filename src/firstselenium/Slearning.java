package firstselenium;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class Slearning {

	public static void main(String[] args) throws InterruptedException {
		//System.setProperty("webdriver.gecko.driver", "C://Users//saifa//workspace//Selenium//Driver//geckodriver.exe");
		System.setProperty("webdriver.chrome.driver", "C://Users//saifa//workspace//Selenium//Driver//chromedriver.exe");
		//WebDriver driver = new FirefoxDriver();
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.facebook.com");
		System.out.println("testing is successfull");
		Thread.sleep(2000);
		//driver.close();
		
		// TODO Auto-generated method stub
	}

	}
