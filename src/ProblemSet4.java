
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
		
		
		
		
		
		
		
		
		
	}
		
	}


