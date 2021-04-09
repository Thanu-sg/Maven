package Package;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.TakesScreenshot;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import PageObjects.login;

import Resources.base;

public class loginTest extends base {
	
	@Test(dataProvider="getData")
	public void welcomePage(String username, String password) throws IOException, InterruptedException {
		
		driver = Driver();
		driver.get(prop.getProperty("url"));
		
		
		login l = new login(driver);
		l.Enterusername().sendKeys(username);
		l.EnterPassword().sendKeys(password);
		l.ClickLogin().click();
		log1.info("Login successfull");
	
		
		//Thread.sleep(3000);
		//driver.close();
	}


	
		
		
	    @DataProvider
		public Object[][] getData() throws IOException {
			Object[][] data = new Object[2][2];
			data[0][0] = "hello";
			data[0][1] = "P@ssw0rd";
			
			data[1][0] = "Thanushree.gowdru@qualitestgroup.com";
			data[1][1] = "P@ssw0rd";
			
			
			//data[2][0] = "Thanushree.gowdru@qualitestgroup.com";
			//data[2][1] = "P@SSW0RD";
			
			
			
			return data;
			
	    }
	    
	    
	     @AfterTest
	     public void Title() throws InterruptedException, IOException {
	    	 driver = Driver();
	    	 driver.get(prop.getProperty("url"));
	    	 login l = new login(driver);
	 		l.Enterusername().sendKeys("Thanushree.gowdru@qualitestgroup.com");
	 		l.EnterPassword().sendKeys("P@SSW0RD");
	 		l.ClickLogin().click();
	    	 Assert.assertEquals(driver.getTitle(),"QTRecognition");
	    	// Thread.sleep(1000);
	    	// driver.close();
	     }
	    
}    





