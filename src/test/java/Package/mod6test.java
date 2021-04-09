package Package;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PageObjects.login;
import PageObjects.mod6;
import Resources.base;

public class mod6test extends  base {
	
	
	public void login1() throws IOException {
		driver= Driver();
		driver.get(prop.getProperty("url"));
		login l = new login(driver);
		l.Enterusername().sendKeys("thanushree.gowdru@qualitestgroup.com");
	    l.EnterPassword().sendKeys("P@ssw0rd");
	    l.ClickLogin().click();
		
	}
	
	
	@Test	//kudos from me
	public void Kudofm() throws IOException, InterruptedException {
		login1();
	    mod6 fm = new mod6(driver);
		 fm.KudosFM().click();
		 Thread.sleep(3000);
		 driver.close();
		 
		
		 
}
	

	@Test	//kudos to me
	public void Kudotm() throws IOException, InterruptedException {
	    mod6 tm = new mod6(driver);
	     tm.KudosTM().click();
		 Thread.sleep(1000);
		 WebElement ele = driver.findElement(By.xpath("//b[contains(.,'Thanushree Gowdru')]"));
		 String str = ele.getText();
		 System.out.println(str);
		 Thread.sleep(1000);
		 Assert.assertEquals("Thanushree Gowdru", str);
		 log1.info("kudos to me");
		 
		 driver.close();
		 	}
	
	
	@Test	// clicking on activity
	public void Activity() throws IOException, InterruptedException {
		mod6 a = new mod6(driver);
	    log1.info("The activity is successfull");
		 a.Act().click();
		 int count = driver.findElements(By.xpath("//*[@id=\"todayCount\"]")).size();
		 System.out.println(count);
		 driver.close();
		 	}
	
	@AfterTest//Kudos sent to myself
	public 
	void self() throws IOException, InterruptedException, AWTException {
		login1();
		mod6 s = new mod6(driver);
		s.Send().click();
		Thread.sleep(1000);
		s.Enter().sendKeys("Thanushree sanna gowdru");
		s.Enter().click();
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		s.Kudo().click();
		s.comment().sendKeys("Good");
		s.Send1().click();
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(src,new File("C:\\Users\\intern 17\\Pictures\\Ss1.png"));
		
		
		
	}
}
