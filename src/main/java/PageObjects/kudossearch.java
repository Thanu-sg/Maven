package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class kudossearch extends login {

	public kudossearch(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	By search = By.xpath("/html/body/div[1]/div[1]/div[1]/div/div[5]/div/h5/a/span");
	By email = By.xpath("//*[@id=\"s_e_add\"]");
	By go = By.xpath("//*[@id=\"search_panel\"]/button/i");
	
	
	public WebElement Search() {
		return driver.findElement(search);
		
	}
	public WebElement Email() {
		return driver.findElement(email);
		
	}
	public WebElement Go() {
		return driver.findElement(go);
		
	}

}
