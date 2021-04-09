package Package;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import PageObjects.sendkudos;
import Resources.base;

public class sendkudostest  extends base{

	@Test   
	public void sendkudo() throws IOException, AWTException, InterruptedException {
	driver = Driver();
	driver.get(prop.getProperty("url"));
	sendkudos sk = new sendkudos(driver);
	sk.Enterusername().sendKeys("thanushree.gowdru@qualitestgroup.com");
	sk.EnterPassword().sendKeys("P@ssw0rd");
	sk.ClickLogin().click();
	sk.Send().click();
	Thread.sleep(1000);
	sk.Enter().sendKeys("Sinchana S Basavaraj");
	sk.Enter().click();
	Robot r = new Robot();
	r.keyPress(KeyEvent.VK_DOWN);
	r.keyPress(KeyEvent.VK_ENTER);
	sk.Kudo().click();
	sk.comment().sendKeys("Good");
	sk.Send1().click();
	Thread.sleep(1000);
	
	}
	
@AfterTest
public void sendkudo1() throws IOException, AWTException, InterruptedException {
	driver = Driver();
	driver.get(prop.getProperty("url"));
	sendkudos sk = new sendkudos(driver);
	sk.Enterusername().sendKeys("thanushree.gowdru@qualitestgroup.com");
	sk.EnterPassword().sendKeys("P@ssw0rd");
	sk.ClickLogin().click();
	sk.Send().click();
	Thread.sleep(1000);
	sk.Enter().sendKeys("Sinchana S Basavaraj");
	sk.Enter().click();
	Robot r = new Robot();
	r.keyPress(KeyEvent.VK_DOWN);
	r.keyPress(KeyEvent.VK_ENTER);
	sk.Kudo().click();
	//sk.comment().sendKeys("Good");
	sk.Send1().click();
	
	
	
	
	}
}


	
	

