
public class ProblemSet1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Question #1
Which of the following Java variable declarations has an error?
A. int x = 5;
B. double temperature = 75.6;
C. char grade = ’A’;
D. String name = ’Adam’
		 */
		System.out.println("Answer #1. D. String Name = Adam");
		System.out.println("Double qoutes are for text, single qoutes are for characters.");
		System.out.println();
		/*Question 2
What value for register will be printed at the end of this block of Java code? double register = 10.0; register = register + 5; //Customer pays $5. register = register - 2.5; //Customer receives $2.50 as change. register = register + 10; //Customer pays $10. register = register - 3; //Customer receives $3 as change. System.out.println(register);
A. 19.0
B. 19.5
C. 22.5
D. 25.5
*/
		System.out.println("Answer #2 B. 19.5");
		System.out.println();
		/*Question 3
* Define an integer variable called bankBalance. Initialize it to a value of 500.
* Then add 250 to it. Then subtract 100 from it. Finally, print the resulting value.
*/
		System.out.println("Answer #3");
		int bankBalance = 500;
				bankBalance = bankBalance + 250;
				bankBalance = bankBalance - 100;
				System.out.println(bankBalance);
				System.out.println("Please see code for programing used to achieve answer.");
				System.out.println();
				
/* Question 4
What value will be printed by this line of Java code? System.out.println(2.0 * (5 / 2));
A. 4
B. 4.0
C. 5
D. 5.0
E. This line of code will give an error. 
*/
		System.out.println("Answer #4");
		System.out.println("B. 4.0. The answer of the division of 5/2 will be truncated.");
		System.out.println();
		
/*	Question 5
Write Java code to define an integer variable called day, and a String variable called month.
Give month and day appropriate values for your birthday
*/
		
		int day = 1;
		String month = "January";
		System.out.println("Answer #5, see program for actual code");
		System.out.println(month);
		System.out.println(day);
		System.out.println();
		
/* Question 6
Write Java code to create a String variable called firstName, define it to be your first name as a String. 
Then define a variable called lastName and define it to be your last name as a String. Then dfine a variable called fullName and 
set it to be your first name followed by a space followed by your last name. 
Use the existing variables for your first and last name and String concatenation to define fullName. Finally, write code to print this text:
Hello, my name is [full name]. There are [number] letters in my name.
Use String concatenation to create the first String to print using the fullName variable, 
and use the .length() command on firstName and lastName to calculate the number of letters.
Note: you can concatenate an integer and a String and the integer will be converted to a String. For example, this expression:
"There are "+ 7 + "days in a week."
will be evaluated as the String:
"There are 7 days in a week."
*/
		
		String firstName = "Phillip";
		String lastName = "Hankins";
		String fullName = firstName + " " + lastName;
		
		System.out.println("Question #6, check program for actual code");
		System.out.println();		
		System.out.println("Hello, my name is " + fullName +".");
		int lettersinName = firstName.length() + lastName.length();
		System.out.println("There are " + lettersinName + " letters in my name.");
		
					
	
	}	
	
}
