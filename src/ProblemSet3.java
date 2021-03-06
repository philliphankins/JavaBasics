
public class ProblemSet3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
/*Question 1
In the function signature below, what is the return type?
public float squareRoot(int x)
A. public
B. float
C. squareRoot
D. int
*/
		
		System.out.println("Answer to Question #1.");
		System.out.println("B. Float");
		System.out.println();
		
/*Write the signature of a function called isPrime(). The access modifier should be public,
the return type should be boolean, and it should take a single integer parameter.
*/
		
		System.out.println("Answer to Question #2.");
		System.out.println("public boolean isPrime(int n");
		System.out.println();
		
/*Question 3
Which of the following function signatures has an error?
A. public getAccountBalanace(long accountNumber)
B. public void displayInTextBox(String string)
C. public int roundToNearestInt(double x)
D. public double getTemperature()
*/
		System.out.println("Answer to Question #3.");
		System.out.println("A. The function signature has no return type.");
		System.out.println();
		
/*Question 4
Write a Java function called absoluteValue(). The access modifier should be public, it
should have a return type of double, and it should take one double parameter as input. If
the double parameter is less than 0, it should return that number negated. Otherwise, it
should return the parameter unchanged.
*/
		
		System.out.println("Answer to Question #4");
		System.out.println();
		System.out.println("public double absoluteValue(double x) }");
		System.out.println("if (x < 0) {");
		System.out.println("return -x;");	
		System.out.println("} else {");
		System.out.println("return x");
		System.out.println();
		
/*Question 5
Write a Java function named calculateTip(). The access modifier should be public,
it should have a return type of double, and it should take as input a double parameter
representing the cost of a meal at a restaurant. And finally, it should return a double equal
to 15% of the cost parameter.
*/	
		
		System.out.println("Answer to Question #5");
		System.out.println();
		System.out.println("public double caclulateTip(double cost) }");
		System.out.println("double tip = cost * 0.15;");
		System.out.println("return tip;");
		System.out.println();
		
/* Question 6
Write a Java function called nametagText(). The access modifier should be public, the
return type should be String, and it should take a String parameter called name. In the
body of the function, return the String �Hello, my name is � with the name parameter added
to the end. (Hint: use String concatenation.)
*/
		
		System.out.println("Answer to Question #6.");
		System.out.println();
		System.out.println("public String nametagText(String name) }");
		System.out.println("String nametagText='Hello, my name is '+ name;");
		System.out.println("return nametagText;");
		System.out.println();
				
/*Question 7
Define two functions. The first should be called fahrenheitToCelsius(). It should be
a public function with return type double that takes a double argument that represents a
temperature in Fahrenheit degrees. It should return the equivalent temperature in Celsius
degrees. (To convert from Fahrenheit to Celsius, use the formula C = (F - 32) � 5/9.)
Next, define a function called printTemperature(). It should be public, it should have a
return type of void, and it should take a double parameter that represents a temperature in
Fahrenheit degrees. This function should print �F: � followed by the Fahrenheit parameter,
then �C: � followed by the equivalent value in Celsius degrees. Use the first function you
defined to calculate the appropriate Celsius value inside the second function.
*/
		
		System.out.println("Answer to Question #7.");
		System.out.println();
		/**
		* Converts from Fahrenheit to Celsius degrees.
		* @param fahrenheit Temperature in degrees Fahrenheit.
		* @return Equivalent temperature in degrees Celsius.
		*/
		System.out.println("public double fahrenheitToCelsius(double fahrenheit) {");
		System.out.println("return (farenheit - 32) * 5 / 9;");
		System.out.println("}");
		/**
		* Prints a temperature in both Fahrenheit and Celsius degrees.
		* @param fahrenheit Temperature in degrees Fahrenheit.
		*/
		System.out.println("public void printTemperature(double fahrenheit) {");
		System.out.println("System.out.println(\"F: \" + fahrenheit);");
		System.out.println("System.out.println(\"C: \" + fahrenheitToCelsius(fahrenheit));");
		System.out.print("}");
		System.out.println();
		
/*Question 8
Define a function called monopolyRoll(). This function provides a random result based on
the dice-rolling rules for the board game Monopoly. In Monopoly, players roll two six-sided
dice to determine their move. If they roll the same value on both dice, this is called �rolling
doubles,� and it means they go again. In our simplified version, the dice-roll function should
behave like this:
1. Generate two random integers in the 1 to 6 range.
2. If the numbers are not the same, return the sum.
3. If the numbers are the same, generate two more random integers in the 1 to 6 range,
and return the sum of all 4 numbers.
Hint: to make your code neater, you can define a second function that generates a random
integer in the 1 to 6 range (or in the 1 to x range based on a parameter) so that you do not
need to keep repeating that code.
*/
		
		/**
		* Returns a random integer simulating a dice roll.
		* @param sides Number of sides on the virtual die being rolled.
		* @return random number in the range of 1 to sides.
		*/
		
		
		System.out.println("Answer to Question #8");
		System.out.println(); 
		System.out.println("public int diceRoll(int sides) {");
		//This expression generates a random double in the interval
		//[0, sides). That is, a double greater than or equal to
		//0 and less than sides.
		System.out.println("double randomNumber = Math.random() * sides;");
		//Our random number is now in the interval [1, sides + 1)
		System.out.println("randomNumber = randomNumber + 1;");
		//Casting the random number to an integer will round it down to an
		//integer in the 1 to sides range.
		System.out.println("return (int) randomNumber;");
		System.out.println("}");
		System.out.println();
		System.out.println("public int monopolyRoll() }");
		System.out.println("int roll1 = diceRoll(6);");
		System.out.println("int roll2 = diceRoll(6);");
		System.out.println("total = roll1 + roll2;");
		System.out.println("if (roll1 == roll2) {");
		System.out.println("int roll3 = diceRoll(6);");
		System.out.println("int roll4 = diceRoll(6);");
		System.out.println("total = total + roll3 + roll4);");
		System.out.println("}");
		System.out.println("return total;");
		System.out.println("}");
		
		

		
		
		
		

	}

}
