package utility;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Tempt 
{

	 

		
		public static void main(String[]args) throws InterruptedException
		{
		System.setProperty("webdriver.chrome.driver", "E:\\automation  support\\chromedriver.exe");	
			
			ChromeDriver driver=new ChromeDriver();
			driver.manage().window().maximize();	
			driver.get("http://www.Flipkart.com/");
			//cancl page
			driver.findElementByXPath("//*[@class='_2KpZ6l _2doB4z']").click();  //cancel
			Actions jkl=new Actions(driver);
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);    // implicit wait
			WebElement search=driver.findElementByXPath("//*[text()='Login']");  // login mous
			jkl.moveToElement(search).build().perform();
			Thread.sleep(500);
			driver.findElementByXPath("(//*[@class='_2NOVgj'])[1]").click();
	     //  driver.findElementByLinkText("My Profile").click();                  // profile
	       driver.findElementByXPath("(//*[@type='text'])[2]").sendKeys("9623433964");  //username
			driver.findElementByXPath("//*[@type='password']").sendKeys("Sai@1234");      //pass
			driver.findElementByXPath("(//*[@type='submit'])[2]").click();             // login
			Thread.sleep(5000);
			driver.findElementByLinkText("Manage Addresses").click();           // address
			Thread.sleep(5000);
			driver.findElementByXPath("//*[@class='_1QhEVk']").click();        // add address
			driver.findElementByXPath("(//*[@class='_1w3ZZo _2mFmU7'])[1]").sendKeys("Lande Vikas");  //name
			driver.findElementByXPath("(//*[@class='_1w3ZZo _2mFmU7'])[2]").sendKeys("9623433964");   // mobile number
			driver.findElementByXPath("(//*[@class='_1w3ZZo _2mFmU7'])[3]").sendKeys("413707");    //pincode
			driver.findElementByXPath("(//*[@class='_1w3ZZo _2mFmU7'])[4]").sendKeys("Naur");     // locality
			driver.findElementByXPath("//*[@name='addressLine1']").sendKeys("At.Naygaon tel.Shrirampur dist.nagar");//new address
			//driver.findElementByXPath("//*[@name='city']").sendKeys("Puntamba");
			Select state=new Select(driver.findElementByXPath("//*[@name='state']"));      // state
			state.selectByVisibleText("Maharashtra");
			driver.findElementByXPath("//*[@name='landmark']").sendKeys("Jai babaji mandir"); //landmark
			driver.findElementByXPath("//*[text()='Home']").click();                    // home
			driver.findElementByXPath("(//*[@type='button'])[2]").click();             // save
	        }
		
	}	

			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			


		
		
		
		
		
		
		





