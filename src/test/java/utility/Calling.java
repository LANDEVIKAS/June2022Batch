package utility;

public class Calling
{       
		public static void main(String[]args) throws InterruptedException 
		{
			 
			Object[]input=new Object[2];
			        input[0]="Chrome";// launchBrowser
			        input[1]="E:\\automation  support\\chromedriver.exe";
			        SeleniumOperations.browserLaunch(input);
			        
			Object[]input1=new Object[1];
			        input1[0]="http://www.Flipkart.com/";//openApplication
			        SeleniumOperations.openApplication(input1);

			 Object[]input2=new Object[1];
			         input2[0]=" //*[@class='_2KpZ6l _2doB4z']";//clickElement
			         SeleniumOperations.clickonElement(input2);
			 
			 Object[]input3=new Object[1];
			         input3[0]="//*[text()='Login']"; // mousOver
			         SeleniumOperations.mouseOverAction(input3);

			 Object[]input4=new Object[1];
			         input4[0]="(//*[@class='_2NOVgj'])[1]";  //clickElement
			         SeleniumOperations.clickonElement(input4);
			 
			         Thread.sleep(5000);
			 Object[]input5=new Object[2];
			         input5[0]="(//*[@type='text'])[2]";//sentText
			         input5[1]="9623433964";
			         SeleniumOperations.sendText(input5);
			         Thread.sleep(5000);  
			 Object[]input6=new Object[2];     //sendtext
			         input6[0]="//*[@type='password']";
			         input6[1]="Sai@1234";
			         SeleniumOperations.sendText(input6);
			 Thread.sleep(5000);
			 
			 Object[]input7=new Object[1];     //login
			         input7[0]="(//*[@type='submit'])[2]";
			         SeleniumOperations.clickonElement(input7);
			         Thread.sleep(5000);
			Object[]input8=new Object[2];
			        input8[0]="//*[@class='_1ruvv2']";
			        input8[1]="Lande Vikas";
			        SeleniumOperations.validation(input8);

		      
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}



