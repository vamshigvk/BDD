Feature: Naukri Registration
A website for Job searchers to fetch Jobs

Scenario: User is a Fresher
Given user wants to access to 'www.naukri.com'
When he choses to Register
And he choses I am a Fresher Option
And user Enters a Valid Name
And user Enters Valid e-Mail ID
And user creates a Valid Password
And user enters a Valid Mobile-Number
And user uploads his Resume
And user enters his Current Location
Then he is redirected to Succesfull Registration Page


#Scenario: User is a Professional
#Given user wants to access to 'www.naukri.com'
#When he choses to Register
#And he choses I am a Professinal Option
#And user Enters a Valid Name
#And user Enters Valid e-Mail ID
#And user creates a Valid Password
#And user enters a Valid Mobile-Number
#And user enters his Total Work Experience in months
#And user enters his Total Work Experience in years
#And user uploads his Resume
#Then he is redirected to Succesfull Registration Page