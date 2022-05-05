package SeleniumWithTestNG.SeleniumWithTestNG;

import org.openqa.selenium.By;

public class LoginPage extends Base{
	//pom without page factory.
	
	 By username=By.id("txtUsername");
	 By Password =By.id("txtPassword");
	 By loginbutton=By.id("btnLogin");
	 
	 
	 public LoginPage(){
		 this.driver=driver;
	 }
	 
	 public void loginFunctionality(String uname, String password) {
		 driver.findElement(username).sendKeys(uname);
		 driver.findElement(Password).sendKeys(password);
		 driver.findElement(loginbutton).click();
	 }
	 
	

}
