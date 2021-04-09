package Package;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.testng.annotations.Test;

import PageObjects.kudossearch;
import PageObjects.sendkudos;
import Resources.base;

public class KudosSearch extends base {
	@Test
	public void kudoss() throws IOException, InterruptedException, AWTException {
		driver= Driver();
    	driver.get(prop.getProperty("url"));
    	kudossearch  ks = new kudossearch(driver);
    	ks.Enterusername().sendKeys("thanushree.gowdru@qualitestgroup.com");
    	ks.EnterPassword().sendKeys("P@ssw0rd");
    	ks.ClickLogin().click();
    	log1.info("login sucessfull");
    	ks.Search().click();
    	Thread.sleep(1000);
    	ks.Email().sendKeys("Sneha Alladi Suresh");
    	ks.Email().click();
    	Robot r = new Robot();
    	r.keyPress(KeyEvent.VK_DOWN);
    	r.keyPress(KeyEvent.VK_ENTER);
    	ks.Go().click();
    	log1.error("No error");
}
}