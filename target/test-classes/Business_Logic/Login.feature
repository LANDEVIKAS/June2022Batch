 Feature: Login Functionality
 
 Background: user canclled initial Login window
 Given user provide Browser name as "Chrome" and exe location as "E:\\automation  support\\chromedriver.exe"
 Given user enter url as "http://www.Flipkart.com/"
 Given user cancel initial login window
 
 @SmokeTest
  Scenario: Login Functionality with valid credentoals
 When user navigate on login button
 When user click on login tab And  user click on MyProfile
 When user enter "9623433964" as username
 When user enter "Sai@1234" as password
 When user click on Login button
 Then Application shows user profile to user