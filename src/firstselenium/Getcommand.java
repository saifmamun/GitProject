package firstselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Getcommand {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","C://Users//saifa.//workspace//Selenium//Driver//geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.get("http://www.facebook.com");
		driver.manage().window().maximize();
			WebElement element= driver.findElement(By.id("u_0_r"));
			String attValue= element.getAttribute("type");
			System.out.println(attValue);
			WebElement email= driver.findElement(By.id("email"));email.sendKeys("saif.aisdu@gmail.com");
			String actual=email.getAttribute("value");
			System.out.println(actual);
			String expected;
			expected="saif.aisdu@gmail.com";
			if(actual.equalsIgnoreCase(expected)){
				System.out.println("successful");
			}
			else
				System.out.println("fail");
				boolean isSelect= driver.findElement(By.name("sex")).isSelected();
				System.out.println(isSelect);
				driver.findElement(By.linkText("Forgot account")).click();
				driver.findElement(By.partialLinkText("account?")).click();
				System.out.println("text value:+");
				driver.findElement(By.xpath(".//*[@id='blueBarDOMInspector']/div/div/div/div[1]/h1/a/i"))
				. getText();
				driver.findElement(By.xpath(".//*[@id='email']")).sendKeys("sbdgfiuwyi");
				
			}
		// TODO Auto-generated method stub

	}

//}
