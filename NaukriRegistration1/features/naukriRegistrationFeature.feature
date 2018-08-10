Feature: Naukri Registration
A website for Job searchers to fetch Jobs

#Scenario: User is a Fresher
#Given user wants to access to 'www.naukri.com'
#When he choses to Register
#And he choses I am a Fresher Option
#And user Enters his Personal details
#Then he is redirected to Succesfull Registration Page


#Scenario: User is a Professional
#Given user wants to access to 'www.naukri.com'
#When he choses to Register
#And he choses I am a Professinal Option
#And professonial Enters his personal details
#Then he is redirected to Succesfull Registration Page

Scenario: User is a Fresher enters wrong details
Given user wants to access to 'www.naukri.com'
When he choses to Register
And he choses I am a Fresher Option
And user clicks register now button
Then 'Please specify your email ID' 'Please specify a password' 'Please specify your mobile number' 'Please type your city name in the text box' Messages should display