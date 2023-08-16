package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage_Pom {
		WebDriver localdriver;
			public Homepage_Pom(WebDriver remotedriver) {
				localdriver=remotedriver;
				PageFactory.initElements(remotedriver, this);
	}
	@FindBy(name = "uid")
	WebElement username;
	
//	@FindBy(id = "continue")
//	WebElement cont;
	
	@FindBy(name = "password")
	WebElement password;
	
	@FindBy(name = "btnLogin")
	WebElement submitbutton;
	
//	@FindBy(xpath= "//span[contains(text(),'Logout')]")
//	WebElement logout;
	
	
	public void enter_Usernmae(String userId) {
		username.sendKeys(userId);
	}
//	public void Click_Continue() {
//		cont.click();
//	}
	public void enter_Password(String enterpassword) {
		password.sendKeys(enterpassword);
	}
	
	public void click_Button() {
		submitbutton.click();
	}
//	public void click_logout() {
//		logout.click();
//	}
}
