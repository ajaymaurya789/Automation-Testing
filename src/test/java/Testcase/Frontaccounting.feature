Feature: Login

@valid @smoke @testcase_login_001
Scenario: Verify the functionality of login by valid data
Given User launch an chrome browser
And User should be landed on front accounting site
When First clear and then enter "demouser" in username field.
And First clear and then enter "password" in password field.
And Click on login button
Then Validate login by title of the page
And close the browser


@invalid @regression @testcase_login_002
Scenario: Verify the functionality of login by invalid data
Given User launch an chrome browser
And User should be landed on front accounting site
When First clear and then enter "userdemo" in username field.
And First clear and then enter "password" in password field.
And Click on login button
Then Validate login by title of the page
And close the browser
