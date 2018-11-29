Feature: Hotel Booking Functionality
Scenario: Firstname not entered
Given User is on hotel booking page
When Firstname is blank
Then Display Error Message 'Please enter Firstname'

Scenario: Lastname not entered
Given User is on hotel booking page
When Firstname is given but lastname is blank
Then Display Error Message 'Please enter Lastname'

Scenario: Email not entered
Given User is on hotel booking page
When Email is blank
Then Display alert 'Please enter email'

Scenario: Mobile Number not entered
Given User is on hotel booking page
When Mobile Number is blank
Then Display alert 'Please enter mobile number'

Scenario: Invalid Email
Given User is on hotel booking page
When Invalid email is entered
Then Display alert 'Invalid email'

Scenario: Invalid Mobile Number
Given User is on hotel booking page
When Invalid Mobile Number is entered
Then Display alert 'Invalid Mobile Number'

Scenario: Gender not selected
Given User is on hotel booking page
When gender not selected
Then Display alert 'select gender'

Scenario: City is not selected
Given User is on hotel booking page
When city is not selected
Then Display alert 'select a city'

Scenario: State is not selected
Given User is on hotel booking page
When state is not selected
Then Display alert 'select a state'

Scenario: Room type is not selected
Given User is on hotel booking page
When room type is not selected
Then Display alert 'select room type'

Scenario: Card holder name is not entered
Given User is on hotel booking page
When CardHolder name is not entered
Then Display alert 'enter card holder name'

Scenario: Card Number is not entered
Given User is on hotel booking page
When card number is not entered
Then Display alert 'enter card number'

Scenario: CVV is not entered
Given User is on hotel booking page
When cvv is not entered
Then Display alert 'enter cvv code'

Scenario: Expiry month is not entered
Given User is on hotel booking page
When expiry month is not entered
Then Display alert 'enter month expiry'

Scenario: Expiry year is not entered
Given User is on hotel booking page
When expiry year is not entered
Then Display alert 'enter year expiry'

Scenario: valid details
Given User is on hotel booking page
When user enters all valid details
Then go to Registration success Page