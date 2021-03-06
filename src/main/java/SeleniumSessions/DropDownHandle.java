package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownHandle {
	static WebDriver driver;

	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		By country = By.id("Form_submitForm_Country");
		By Industry = By.id("Form_submitForm_Industry");
		
		selectDropDownByVisisbleText(country, "Canada");
		selectDropDownByindex(Industry,5);
		
//		WebElement country = driver.findElement(By.id("Form_submitForm_Country"));
//		WebElement Industry = driver.findElement(By.id("Form_submitForm_Industry"));
		
		
	}
	
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

	public static void selectDropDownByVisisbleText(By locator , String value) {
		Select select = new Select(getElement(locator));
		select.selectByVisibleText(value);
	}
	public static void selectDropDownByindex(By locator , int index) {
		Select select = new Select(getElement(locator));
		select.selectByIndex(index);
	}
	public static void selectDropDownByValue(By locator , String value) {
		Select select = new Select(getElement(locator));
		select.selectByValue(value);
	}
}
