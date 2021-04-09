package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Recent extends login {

	public Recent(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
 By plane = By.xpath("//*[@id=\"contact_list\"]/div[1]/div/h5/small/a/i");
 By app = By.xpath("//*[@id=\"trophy_list\"]/div[7]/div/div/center");
By Cmt = By.xpath("//*[@id=\"comment\"]");
 By sendclick = By.xpath("//*[@id=\"myModal\"]/div/div/div/button[2]");
// 
 
 public WebElement Plane() {
		return driver.findElement(plane);
		
	}
 public WebElement App() {
	 return driver.findElement(app);
 }
 public WebElement cmt() {
	 return driver.findElement(Cmt);
 }
 public WebElement SendClick() {
	 return driver.findElement(sendclick);
 }
 
 
}
