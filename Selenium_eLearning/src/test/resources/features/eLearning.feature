Feature:  E-learning portal Registration



Scenario Outline:Registration to elearning portal Successful by filling the mandatory fields firstname, lastname, e-mail, 
Username,Confirm password.Below steps have to be verified

Validating Confirmation message after login 

verify the email provided on profile

Compose and send mail and validate confirmation mail sent message.



Given User navigate to "http://elearningm1.upskills.in/"

When  User click on SignUp

Then  User entered "<firstname>" firstname

And   User entered "<lastname>" lastname

And   User entered "<username>" username

And   User entered "<email>" email

And   User entered "<password>" password

And   User confirms "<password1>" Conf password

And   User clicks on Register button

Then  User validates the name

      """

      Dear <firstname> <lastname>,



Your personal settings have been registered.

      """
Then  User clicks on HomePage

And   Verify "<email>" email from profile section

And   Compose email and send to "naveen"

And   Verify the message "The message has been sent to naveen naveen (naveen)"



Examples:

| firstname | lastname  |username        |       email   |password|password1|
| Tester123 | SDET      |SDETTester12    |tester@test.com|testing1|testing1 |