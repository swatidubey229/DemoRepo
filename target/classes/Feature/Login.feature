Feature: This script is all about login feature in free crm website
Scenario Outline: scenario description
	Given the user is on freecrm.com website
	When the user enters "<username>" and "<password>"
	Then user should be able to loginto the application
	Then user clicks on Contacts then new contact
	Then user puts "<firstname>","<lastname>" and "<position>" 
	Then new user gets created 
		
		Examples:
		| username       | password   | firstname | lastname | position   |
		| swatidubey1912 | C*pge*2402 | Fname     | Lname    | Engineer   |
		| swatidubey1912 | C*pge*2402 | Fname1    | Lname1   | Contracter |
		| swatidubey1912 | C*pge*2402 | Fname2    | Lname2   | Software   |
