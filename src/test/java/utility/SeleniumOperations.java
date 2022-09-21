package utility;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class SeleniumOperations {


	public static WebDriver driver=null;

		public static void browserLaunch(Object[]inputParameters)
		 { try {
			String bName=(String)inputParameters[0];
		  String webDriverExePath=(String)inputParameters[1];
		  if(bName.equalsIgnoreCase("Chrome"))
		 {
		  System.setProperty("webdriver.chrome.driver",webDriverExePath);
		  driver=new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		  }
		  else if(bName.equalsIgnoreCase("Firefox"))
		     {
			  System.setProperty("webdriver.gecko.driver",webDriverExePath);
		  driver=new FirefoxDriver(); 
		   driver.manage().window().maximize();
		   driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		     }
		  }
		 catch(Exception e)
		    {
			 System.out.println(e);
		    }
		 }
		public static void openApplication(Object[]inputparameters)
		{ try{
			String strgUrl=(String) inputparameters[0];
		driver.get(strgUrl);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		     }
		   catch(Exception e)
		    { System.out.println(e);
	      	}	
		}
		public static void clickonElement(Object[]inputparameters)
		{  try{
			String locator=(String) inputparameters[0];
			driver.findElement(By.xpath(locator)).click();
			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			}
		catch(Exception e)
		{System.out.println(e);
		}	
		}
		public static void mouseOverAction(Object[]inputparameters)
		{
			try{
			String locator=(String) inputparameters[0];
			Actions act =new Actions(driver);
			WebElement abc=driver.findElement(By.xpath(locator));
			act.moveToElement(abc).build().perform();
			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			}catch(Exception e)
			{
				System.out.println(e);	
			}
		}
		
		public static void sendText(Object[]inputparameters)
		{  try{
			String locator=(String)inputparameters[0];
			String send=(String) inputparameters[1];
			driver.findElement(By.xpath(locator)).sendKeys(send);
			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		    }
		catch(Exception e)
		      {
			System.out.println(e);
		     }
		}
		public static void  validation(Object[]inputparameters)
		{  try {
			String locator=(String) inputparameters[0];
		   String giventext=(String) inputparameters[1];
		   driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			String finded=driver.findElement(By.xpath(locator)).getText();
		if(finded.equalsIgnoreCase(giventext))
		{
			System.out.println("Test Case Pass");
		      }else
		    {
			System.out.println("Test Case Fail");
		    }
	     	}catch(Exception e)
		    {
			System.out.println(e);
		   }
		}
		
	 
	}







