Feature:Login Functionality
Background: User has successfully logged in
Given user open "Chrome" browser with exe "D:\\Automation software support\\chromedriver.exe"
Given user open url as"https://www.flipkart.com/"

Scenario:Login functionality with valid credentials
When user click on cancel button 
When user move on login dropdown 
When user click on my profile
When user enter "abcd" as username
When user enter "xyz" as password
When user click on login button
Then application shows user profile to user
