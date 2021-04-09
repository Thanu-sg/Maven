package Package;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.annotations.Test;

import PageObjects.Recent;
import Resources.base;

public class RecentTest extends base {
        @Test
		public void kudoss() throws IOException, InterruptedException, AWTException {
			driver= Driver();
	    	driver.get(prop.getProperty("url"));
	    	driver.manage().window().maximize();
	    	Recent rc = new Recent(driver);
	    	rc.Enterusername().sendKeys("thanushree.gowdru@qualitestgroup.com");
	    	rc.EnterPassword().sendKeys("P@ssw0rd");
	    	rc.ClickLogin().click();
	    	rc.Plane().click();
	    	Thread.sleep(1000);
	    	rc.App().click();
	    	rc.cmt().sendKeys("Nice");
	    	rc.SendClick().click();
	    	driver.close();
}
}
