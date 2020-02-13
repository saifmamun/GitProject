package firstselenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;

public class RadioButton {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C://Users//saifa//workspace//Selenium//Driver//geckodriver.exe");
		//FirefoxOptions firefoxOptions= new FirefoxOptions();//ChromeOptions chromeOptions= new ChromeOptions();
		//firefoxOptions.addArguments("--start- maximized");//chromeOptions.addArguments("--start-maximized");
		WebDriver driver= new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://www.facebook.com");
		boolean selectGender= driver.findElement(By.xpath("//input[@id='u_0_i'")).isSelected();
		System.out.println(selectGender);
		if(selectGender){
			System.out.println("Already Selected");
			}
		else
			driver.findElement(By.xpath("//input[@id='u_0_i'")).click();
          List<WebElement>rdBtn_sex=driver.findElements(By.name("sex"));
		   boolean fvalue= false;
		  fvalue=rdBtn_sex.get(0).isSelected();
		  if (fvalue==true){
			  rdBtn_sex.get(1).click();
		  }
		  int totalrdBtn= rdBtn_sex.size();
		  for (int i=0;i<totalrdBtn;i++){
			  String rdBtnvalue= rdBtn_sex.get(i).getAttribute("value");
			  System.out.println(rdBtnvalue);
		  }
		  for(int i=0;i<totalrdBtn;i++){
			  if(rdBtn_sex.get(i).isSelected()){
				  System.out.println("Already selected"+i);
				  break;
			  }
			  else{
				  System.out.println("now selecting");
				  rdBtn_sex.get(i).click();
			  }
			
		}
		
		// TODO Auto-generated method stub

	}

}
