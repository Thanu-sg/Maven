package Package;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import PageObjects.Integration1;
import PageObjects.sendkudos;
import Resources.base;

public class inttest extends base{
	


		@Test   
		public void sendkudo() throws IOException, AWTException, InterruptedException {
		driver = Driver();
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
		Integration1 in = new Integration1(driver);
		in.Enterusername().sendKeys("thanushree.gowdru@qualitestgroup.com");
		in.EnterPassword().sendKeys("P@ssw0rd");
		in.ClickLogin().click();
		log1.info("The login is successfull");
		in.Send().click();
		//Thread.sleep(1000);
		try {
			driver.findElement(By.xpath("//*[@id=\"email_address\"]"));
			System.out.println("element is present");
		}
		catch( NoSuchElementException e) {
			System.out.println("There is no such element");
		}
		in.Enter().sendKeys("Sinchana S Basavaraj");
		in.Enter().click();
		log1.info("The employee is selected");
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		in.Kudo().click();
		in.comment().sendKeys("Thanks for resolving my laptop issue");
		in.Send1().click();
		driver.close();
		
		}

	}

