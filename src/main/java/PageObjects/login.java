package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.Color;


public class login {
	public WebDriver driver;
	
	By username  = By.xpath("/html/body/div[2]/form/input[1]");
	By Password = By.xpath("/html/body/div[2]/form/input[2]");
	By Login = By.xpath("/html/body/div[2]/form/button");
	
	public login(WebDriver driver) {
		this.driver = driver;
	}
	
	public  WebElement Enterusername() {
		return driver.findElement(username);
		}
	public  WebElement EnterPassword() {
		return driver.findElement(Password);
		
	}

	public  WebElement ClickLogin() {
		return driver.findElement(Login);
		
	}
	 
	
	}



