
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
		
		
		
		
		
	}
		
	}


