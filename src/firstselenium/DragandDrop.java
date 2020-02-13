package firstselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","C://Users//saifa//workspace//Selenium//Driver//geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://www.jqueryui.com/droppable/");
		Thread.sleep(2000);
		WebElement drag=driver.findElement(By.xpath(".//*[@id='draggable']/p"));
		WebElement drop=driver.findElement(By.xpath(".//*[@id='droppable']p"));
		Actions builder=new Actions(driver);
		Action dragAndDrop=builder.clickAndHold(drag).moveToElement(drop).release(drop).build();
		dragAndDrop.perform();
	
		
		// TODO Auto-generated method stub

	}

}
