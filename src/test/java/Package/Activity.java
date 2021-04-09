package Package;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import PageObjects.login;
import Resources.base;

public class Activity extends base {
	
	 @Test
	    public void activitynavigationpage() throws IOException, InterruptedException
	    {
	        driver = Driver();
	        
	        Properties prop=new Properties();
	        FileInputStream fis = new FileInputStream("C:\\Users\\intern 17\\Downloads\\MavenPro\\MavenPro\\src\\main\\java\\Resources\\data.properties");
	        prop.load(fis);
	        
	        driver.get(prop.getProperty("url"));
	        log1.info("Successfully opened the application");
	        
	        login l = new login(driver);
	        
	        Thread.sleep(1000);
	        l.Enterusername().sendKeys("thanushree.gowdru@qualitestgroup.com");
	        l.EnterPassword().sendKeys("P@ssw0rd");
	        Thread.sleep(1000);
	        l.ClickLogin().click();
	        log1.info("Successfully entered username and password");
	        
	        //To verify if the user name is displayed on the left side of the screen after logging in 
	        WebElement ele = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div[1]/div/h5"));
	        Point loc = ele.getLocation();
	        int x = loc.getX();
	        System.out.println(+x);
	        int y=loc.getY();
	        System.out.println(+y);
	         
	        if(x<=450 && y<=200)
	        {
	            System.out.println("username is in the Left side of the screen");
	            log1.info("username is in left side of the screen");
	        }
	        else
	        {
	            System.out.println("username is not in the Left side of the screen");
	        }
	    }
	 
	 @AfterTest
	 public void Title() throws InterruptedException, IOException {
    	 driver = Driver();
    	 driver.get(prop.getProperty("url"));
    	 Assert.assertEquals(driver.getTitle(),"QTRecognition");
    	 Thread.sleep(1000);
    	 driver.close();
     }
	
	
	

}
