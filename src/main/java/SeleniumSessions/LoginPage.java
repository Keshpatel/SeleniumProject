package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	public static void main(String[] args) throws InterruptedException {
		BrowserUtil br = new BrowserUtil();
		WebDriver driver = br.launchBrowser("chrome");

       br.LunchURL("https:/app.hubspot.com/login");
       
       Thread.sleep(5000);
       
       By userName = By.id("username");
	   By password = By.id("password");
	   By loginButton = By.id("loginBtn");
		
       
       By signUpLink = By.linkText("Sign up");
       By googleButton = By.className("buttonText");
       By ssoButton = By.id("ssoBtn");
       
       
       ElementUtil elementUtil = new ElementUtil(driver);
       
       elementUtil.doDoIsDispaly(userName);
       elementUtil.doDoIsDispaly(password);
       elementUtil.doDoIsDispaly(loginButton);
       elementUtil.doDoIsDispaly(signUpLink);
       elementUtil.doDoIsDispaly(googleButton);
       elementUtil.doDoIsDispaly(ssoButton);
       
       elementUtil.doSendKeys(userName,  "test@gmail.com");
       elementUtil.doSendKeys(password,  "test@123");
       elementUtil.doClick(loginButton);
       
       
       
       
       
       
       
       
       }

}
