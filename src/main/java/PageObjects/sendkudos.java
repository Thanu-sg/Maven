package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class sendkudos extends login {

	public sendkudos(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	By send = By.xpath("//*[@id=\'navbarCollapse\']/div[2]/a");
	By enter = By.id( "email_address");
  By kudo = By.xpath("//*[@id=\'trophy_list\']/div[3]/div");
  By Comment = By.xpath("//*[@id=\'comment\']");
  By send1 = By.xpath("//*[@id=\"myModal\"]/div/div/div/button[2]");
 public WebElement Send() {
	 return driver.findElement(send);

 }
 public WebElement Enter() {
	 return driver.findElement(enter);
 }
 public WebElement Kudo() {
	 return driver.findElement(kudo);
 }
 public WebElement comment() {
	 return driver.findElement(Comment);
 }
 public WebElement Send1() {
	 return driver.findElement(send1);
 }

}
