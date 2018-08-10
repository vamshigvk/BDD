Feature: Conference Registration Feature
User wants to register for a Conference using his Personal Details and Payment Procedure

Scenario: User wants to register for a conference
	Given User opens 'ConferenceRegistration' page
	When he verifies titlea 
	And  clicks 'Next' without entering FirstName
	Then 'Please fill the First Name' message must be displayed
	
	When he enters a valid FirstName
	And he clicks 'Next' without entering LastName
	Then 'Please fill the Last Name' message must be displayed
	
	When he enters a valid LastName
	And he clicks 'Next' without entering eMail
	Then 'Please fill the Email' message must be displayed
	
	When he enters a valid eMail
	And he clicks 'Next' without entering Contact Number
	Then 'Please fill the Contact No' message must be displayed
	
	When he enters a valid contactNumber
	And he clicks 'Next' without selecting Number of People 
	Then 'Please fill the Number of people attending' message must be displayed 
	
	When he selects the Number of People atteding for the Conference
	And he clicks 'Next' without entering Building Name & Room No
	Then 'Please fill the Building & Room No' message must be displayed
	
	When he enters Building Name & Room No
	And he clicks 'Next' without entering Area name
	Then 'Please fill the Area name' message must be displayed
	
	
	When he enters Area Name
	And he clicks 'Next' without selecting city 
	Then 'Please select city' message must be displayed
	
	When he selects a city
	And he clicks 'Next' without selecting state
	Then 'Please select state' message must be displayed
	
	When he selects a State
	And he clicks 'Next' without entering membership status
	Then 'Please Select MemeberShip status' message must be displayed
	
	When he choses his Membership status
	And  he clicks 'Next'
	Then 'Personal details are validated.' message must be displayed
	
	When he clicks ok
	Then he is Redirected to Payment Page
	
	When he verifies titleb
	And clicks 'Make Payment' without entering cardholdername
	Then 'Please fill the Card holder name' is displayed
	
	When he enters cardholder name
	And he clicks 'Make Payment' without entering debitcardnumber
	Then 'Please fill the Debit card Number' is displayed
	
	When he enters Debit Card Number
	And  he clicks 'Make Payment' without entering cvv
	Then 'Please fill the CVV' is displayed
	
	When he enters cvv
	And he clicks 'Make Payment' without entering expiry month
	Then 'Please fill expiration month' is displayed
	
	When he enteres month
	And he clicks 'Make Payment' without entering expiry year
	Then 'Please fill expiration year' is displayed
	
	And he enters Expiration Year
	And clicks Make Payment
	Then 'Conference Room is Successfully Done' message must be displayed

