package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.ProjectSpecificWrappers;

public class LoginPage_CW extends ProjectSpecificWrappers{
	
	public LoginPage_CW(RemoteWebDriver driver, ExtentTest test) {
		driver=this.driver;
		test =this.test;
		
		if(!verifyTitle("ToolsQA")) {
			reportStep("Page verification failed", "FAIL");
		}
	}
	
	
	public LoginPage_CW enterUserName(String locator, String data) {
		enterById(locator, data);
		return this;
	}
	
	public LoginPage_CW enterPassword(String locator, String data) {
		enterById(locator, data);
		return this;
	}

	public ProfilePage clickLogin(String locator) {
		clickById(locator);
		return new ProfilePage(driver, test);
	}
}
