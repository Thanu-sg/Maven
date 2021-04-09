package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class mod6 extends login {

	public mod6(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
		
	}
	
	By Kudosfm = By.xpath("/html/body/div[1]/div[1]/div[1]/div/div[3]/div/h5/a/span");
	By Kudostm  = By.xpath("/html/body/div[1]/div[1]/div[1]/div/div[4]/div/h5/a/span");
	By Activity = By.xpath("/html/body/div[1]/div[1]/div[1]/div/div[2]/div/h5/a/span");
	By send = By.xpath("//*[@id=\'navbarCollapse\']/div[2]/a");
	By enter = By.id( "email_address");
	By kudo = By.xpath("//*[@id=\'trophy_list\']/div[3]/div");
	By Comment = By.xpath("//*[@id=\'comment\']");
	By send1 = By.xpath("//*[@id=\"myModal\"]/div/div/div/button[2]");
	
	public  WebElement KudosFM() {
		return driver.findElement(Kudosfm);
	}
	
	public  WebElement KudosTM() {
		return driver.findElement(Kudostm);
	
}
	
	
	public  WebElement Act() {
		return driver.findElement(Activity);
	
	}

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
