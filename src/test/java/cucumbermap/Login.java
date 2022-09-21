 package cucumbermap;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utility.SeleniumOperations;

public class Login 
{
	 @Given ("^user provide Browser name as \"(.*)\" and exe location as \"(.*)\"$")
	 public void bLaunch(String name ,String location )
	 {   Object[]input=new Object[2];
     input[0]=name;
     input[1]=location;
     SeleniumOperations.browserLaunch(input);
  
	 }
	 @Given ("^user enter url as \"(.*)\"$")
	 public void openApp(String url)
	 {
		 Object[]input1=new Object[1];
	        input1[0]=url;//openApplication
	        SeleniumOperations.openApplication(input1);

	 }
	 @Given ("^user cancel initial login window$")
     public void cancel()
     {
		 Object[]input2=new Object[1];
         input2[0]=" //*[@class='_2KpZ6l _2doB4z']";//clickElement
         SeleniumOperations.clickonElement(input2);

     }
	 @When ("^user navigate on login button$")
	 public void login()
	 {
		 Object[]input3=new Object[1];
         input3[0]="//*[text()='Login']"; // mousOver
         SeleniumOperations.mouseOverAction(input3);

	 }
	 @When ("^user click on login tab And  user click on MyProfile$")
	 public void click() throws Exception
	 {
		 Object[]input4=new Object[1];
         input4[0]="(//*[@class='_2NOVgj'])[1]";  //clickElement
         SeleniumOperations.clickonElement(input4);
         Thread.sleep(5000);
	 }
	 @When ("^user enter \"(.*)\" as username$")
	 public void sentUsername(String name) throws Exception
	 {
	     Thread.sleep(5000);
				 Object[]input5=new Object[2];
				         input5[0]="(//*[@type='text'])[2]";//sentText
				         input5[1]=name;
				         SeleniumOperations.sendText(input5);
				   
	 }
	 @When ("^user enter \"(.*)\" as password$")
	 public void sentPass(String pass) throws Exception
	 {     Thread.sleep(5000);  
	 Object[]input6=new Object[2];     //sendtext
     input6[0]="//*[@type='password']";
     input6[1]=pass;
     SeleniumOperations.sendText(input6);
 	 
	 }
	 @When ("^user click on Login button$")
	 public void submit() throws Exception
	 {   Thread.sleep(5000);
	 
	 Object[]input7=new Object[1];     //login
	         input7[0]="(//*[@type='submit'])[2]";
	         SeleniumOperations.clickonElement(input7);
  }
	 @Then ("^Application shows user profile to user$") 
	 public void validation() throws Exception
	 {   Thread.sleep(5000);
		 Object[]input8=new Object[2];
     input8[0]="//*[@class='_1ruvv2']";
     input8[1]="Lande Vikas";
     SeleniumOperations.validation(input8);
  }
	 
	 
	 
	 
	 
	 
}