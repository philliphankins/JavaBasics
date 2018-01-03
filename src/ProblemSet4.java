
public class ProblemSet4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub\
/*Question 1
What will be printed by this block of Java code?
int n = 10;
while (n < 50) {
n = n * 2;
}
System.out.println(n);
A. 10
B. 40
C. 50
D. 80
*/
		
		System.out.println("Answer to Question #1");
		System.out.println();
		System.out.println("D. 80");
		System.out.println();
		
/*Complete the factorial() function below. It should return the product of all the numbers
from 1 to the parameter n. For example, factorial(5) should return 120 because 1 x 2 x
3 x 4 x 5 = 120. Think about what kind of loop you want to use to accomplish this.
Starting code:
public int factorial(int n) {
}
*/
		

		System.out.println("Answer to Question #2");
		System.out.println();
		System.out.println("public int factorial(int n) {");
		System.out.println("int factorial = 1;");
		System.out.println("for (int i = 1; i <= n; i++) {");
		System.out.println("factorial = factorial * i;");
		System.out.println("}");
		System.out.println("return factorial;");
		System.out.println("}");
		System.out.println();
		
/*Question 3
Complete the code in this function to find and return the lowest index in the String array
stringArray that the String target occurs. If the String target does not occur in
stringArray, -1 should be returned.
Starting code:
public int indexOfFirstOccurrence(String[] stringArray, String target)
{
return -1;
}
As an example of how this function should work, this code should print 1, because the word
“Java” appears at index 1.
String[] sentence = {"Learning", "Java", "is", "fun."};
int indexOfWordJava = indexOfFirstOccurrence(sentence, "Java");
System.out.println(indexOfWordJava);
Hint: you cannot compare two Strings using the == operator! This will be false unless
the two Strings are actually the same String object, not just two Strings with the same
letters. To check whether two Strings have the same letters, use the equals() method:
if (myString1.equals(myString2)).
*/
		
		System.out.println("Answer to Question #3");
		System.out.println();
		System.out.println("public int indexOfFirstOccurrence(String[] stringArray, String target)");
		System.out.println("{");
		System.out.println("for (int i = 0; i < stringArray.length; i++) {");
		System.out.println("if (stringArray[i].equals(target)) {");
		System.out.println("return i;");
		System.out.println("}");
		System.out.println("}");
		System.out.println("return -1");
		System.out.println("}");
		System.out.println();
		
/* Question 4
A savings account yields 5% interest annually. This Java function is designed to determine
how many years it will take for you to have $1,000,000 on deposit given an initial value. The
parameter represents the initial deposit, and the function should return an integer number
of years before there will be $1,000,000 or more in the account. Write a loop to determine
the number of years, and return that value.
(Hint: Do we know how many times this loop needs to iterate? Does this mean a for loop
or a while loop is more appropriate?)
Starting code:
public int yearsTilOneMillion(double initialBalance) {
return 0;
}
*/
		
		System.out.println("Answer to Question #4.");
		System.out.println();
		System.out.println("public int yearsTilOneMillion(double initialBalance) {");
		System.out.println("int years = 0;");
		System.out.println("double balance = initialBalance;");
		System.out.println("while (balance < 1000000) {");
		System.out.println("years++;");
		System.out.println("balance = balance * 1.05;");
		System.out.println("}");
		System.out.println("return years;");
		System.out.println("}");
		System.out.println();
		
/*Question 5
Complete the Java function below to print out all the Strings in the String array parameter
in reverse order. (The String at the highest index should be printed first, then the String at
the next highest index, and so on. The String at index 0 should be printed last.)
For example, if a String array called weekdays had value
{"Monday", "Tuesday", "Wednesday", "Thursday", "Friday"}
then this function call:
printInVerverse(weekdays);
would print:
Friday
Thursday
Wednesday
Tuesday
Monday
Starting code:
public void printInReverse(String[] stringArray) {
}
*/
		System.out.println("Answer to Question #5.");
		System.out.println();
		System.out.println("public void printInReverse(String[] stringArray) {");
		System.out.println("for (int i = 0; i < stringArray.length; i++) {");
		//When i has its smallest possible value, 0, the expression
		//below will be the length of the string array minus one,
		//which is the highest index. When i has its largest possible
		//value, stringArray.length - 1, this expression will be
		//0, which is the the lowest index.
		System.out.println("int indexToPrint = stringArray.length - 1 - i;");
		System.out.println("System.out.println(stringArray[indexToPrint]);");
		System.out.println("}");
		System.out.println("}");
		System.out.println();
		System.out.println("Or, for a cleaner version.");
		System.out.println();
		System.out.println("public void printInReverse(String[] stringArray) {");
		System.out.println("for (int i = stringArray.length - 1; i >= 0; i--) {");
		System.out.println("System.out.println(stringArray[i]);");
		System.out.println("}");
		System.out.println("}");
		System.out.println();
		
/*Question 6
Complete the function below, which finds the range covered by an integer array. Inside
the function, find the smallest value in the parameter array, and find the largest value, and
return the largest value minus the smallest value. If the array has length 0, return -1.
For example, if the variable myIntArray had the value
{1, 0, 2, 3, -1, 2}
then the function call
findRange(myIntArray)
would return 4. The largest value in the array is 3, the smallest value is -1, and 3-(-1) = 4.
Starting code:
public int findRange(int[] intArray) {
return -1;
}
*/
		
		System.out.println("Answer to Question #6.");
		System.out.println();
		System.out.println("public int findRange(int[] intArray) {");
		System.out.println("if (intArray.length == 0) {");
		System.out.println("return -1;");
		System.out.println("}");
		System.out.println("int smallest = intArray[0];");
		System.out.println("int largest = intArray[0];");
		System.out.println("for (int i = 1; i < intArray.length; i++) {");
		System.out.println("if (intArray[i] < smallest) {");
		System.out.println("smallest = intArray[i];");
		System.out.println("}");
		System.out.println("if (intArray[i] > largest) {");
		System.out.println("largest = intArray[i];");
		System.out.println("}");
		System.out.println("}");
		System.out.println("return largest - smallest;");
		System.out.println("}");
		System.out.println();
		
		System.out.println("Question 7.");
		System.out.println("What will be printed by this block of Java code?");
		System.out.println();
		System.out.println("int rows = 3;");
		System.out.println("for (int i = 1; i <= rows; i++) {");
		System.out.println("String thisRow = \"\";");
		System.out.println("(for (int j = 0; j < i; j++) {");
		System.out.println("x");
		System.out.println("thisRow = thisRow + \"#\";");
		System.out.println("}");
		System.out.println("System.out.println(thisRow);");
		System.out.println("}");
		System.out.println();
		System.out.println("The answer is:");
		System.out.println();


		
		int rows = 3;
		for (int i = 1; i <= rows; i++) {
		String thisRow = "";
		for (int j = 0; j < i; j++) {
		thisRow = thisRow + "#";
		}
		System.out.println(thisRow);
		}
		System.out.println();
		
		
/* Question 8
Let’s improve the monopolyRoll() function from the previous problem set. Recall that in
Monopoly, players roll two six-sided dice to determine their move. If the same value is on
both dice, this is called “rolling doubles,” and it means they go again. In the last problem
set, you wrote a function that rolled two six-sided dice and, if the values on both die were
the same, rolled two more and returned the sum. This time, write a function that does the
same except it continues rolling until two non-equal values appear on the two dice. In other
words, the function should behave as follows:
1. Generate two random numbers in the 1 to 6 range.
2. If they are not the same, return the sum of all numbers rolled so far.
3. If they are the same, keep track of the total rolled so far and return to step 1.
Think about what kind of loop you want to define to repeat these steps. Again, you may
want to define a separate function for generating dice rolls.
Optional challenge: in Monopoly, if a player rolls doubles three times in a row, they go
to “jail.” Modify your function to keep track of the number of rolls made so far. If three
consecutive doubles are rolled, return -1 instead of continuing to roll.
Optional challenge 2: in the last lesson, you learned about while loops and for loops as a
way to make a computer program repeat. There is another method for making a program
repeat using only functions called recursion. A “recursive” function is one which calls itself
inside itself. See if you can write the monopolyRoll() function by calling monopolyRoll()
inside the function itself to handle the case where further rolls are made.
*/
		
		System.out.println("Answer to Question #8.");
		System.out.println("");
		System.out.println("public int diceRoll(int sides) {");
		//This expression generates a random double in the interval
		//[0, sides).
		System.out.println("double randomNumber = Math.random() * sides;");
		//Our random number is now in the interval [1, sides + 1)
		System.out.println("randomNumber = randomNumber + 1;");
		//Casting the random number to an integer will round it down
		//to an integer in the 1 to sides range.
		System.out.println("return (int) randomNumber;");
		System.out.println();
		System.out.println("}");
		System.out.println();
		System.out.println("public int monopolyRoll() {");
		System.out.println("int roll1 = diceRoll(6);");
		System.out.println("int roll2 = diceRoll(6);");
		System.out.println("int total = roll1 + roll2;");
		System.out.println("while (roll1 == roll2) {");
		System.out.println("roll1 = diceRoll(6);");
		System.out.println("roll2 = diceRoll(6);");
		System.out.println("total = total + roll1 + roll2;");
		System.out.println("}");
		System.out.println("return total;");
		System.out.println();
		
		System.out.println("Answer to question#8, challange #1.");
		System.out.println();
		System.out.println("public int monopolyRoll() {");
		System.out.println("int roll1 = diceRoll(6);");
		System.out.println("int roll2 = diceRoll(6);");
		System.out.println("int total = roll1 + roll2;");
		//An extra variable is added to keep track of how many rolls
		//have been made.
		System.out.println("int rollsSoFar = 1;");
		System.out.println("}");
		System.out.println("int rollsSoFar = 1;");
		System.out.println("while (roll1 == roll2) {");
		//Here, we return -1 if doubles have been rolled too
		//many times in a row.
		System.out.println("if (rollsSoFar >= 3) return -1;");
		System.out.println("roll1 = diceRoll(6);");
		System.out.println("roll2 = diceRoll(6);");
		System.out.println("total = total + roll1 + roll2;");
		System.out.println("rollsSoFar = rollsSoFar + 1;");
		System.out.println("}");
		System.out.println("return total;");
		System.out.println("}");
		System.out.println();
		
		System.out.println("Answer to Question #8, challange #2.");
		System.out.println();
		System.out.println("public int monopolyRoll() {");
		System.out.println("int roll1 = diceRoll(6);");
		System.out.println("int roll2 = diceRoll(6);");
		System.out.println("if (roll1 != roll2) {");
		System.out.println("return roll1 + roll2;");
		System.out.println("} else {");
//In the case where the two rolls are equal, we want to\r\n" + 
//return the current roll plus the return value of another\r\n" + 
//call to monopolyRoll(). This is called making a\r\n" + 
//recursive call. The recursive call will handle making\r\n" + 
//additional rolls, and recursive calls will keep getting\r\n" + 
//made until a roll is made where the two values are not\r\n" + 
//equal.
		System.out.println("return roll1 + roll2 + monopolyRoll();");
		System.out.println("}");
		System.out.println("}");
		
		
		
		
	}
		
	}


