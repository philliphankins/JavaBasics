
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
		

	}

}
