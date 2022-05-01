package kdf;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Methods {

	WebDriver driver;
	
	public void navigateToApplication(String url) {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get(url);
	}
	
	public void enterInATextbox(String locValue, String testData) {
		driver.findElement(By.id(locValue)).sendKeys(testData);
	}
	
	public void clickButton(String locValue) {
		driver.findElement(By.name(locValue)).click();
	}
	
	public String getMsgText(String locValue){
		String text = driver.findElement(By.cssSelector(locValue)).getText();
		
		return text;
	}
	
	public void closeApplication() {
		driver.quit();
	}
	
}
