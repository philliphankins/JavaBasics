
public class ProblemSet2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Question 1
What will the following block of Java code print?

double balance = 0;
balance = balance + 20; //Add quarter 1 profits (thousands).
balance = balance - 25; //Subtract quarter 1 expenses (thousands).
balance = balance + 30; //Add quarter 2 profits (thousands).
balance = balance - 25; //Subtract quarter 1 expenses (thousands).
if (balance < 0) {
System.out.println("We’re in the red!");
} else if (balance > 0) {
System.out.println("We made a profit!");
} else {
System.out.println("We broke even.");

A. We’re in the red!
B. We made a profit!
C. We broke even.
}
*/
	System.out.println("Question #1.");	
	System.out.println("C. We broke even");
	System.out.println();

/*Question 2
What will be printed by the block of Java code below?
int dogs = 1;
int cats = 2;
if (dogs > 0 && cats == 0) {
if (dogs > 1) {
System.out.println("Dog lover");
} else {
System.out.println("Dog person");
}
} else if (cats > 0 && dogs == 0) {
if (cats > 1) {
System.out.println("Cat lover");
} else {
System.out.println("Cat person");
}
System.out.println("Meow!");
} else if (cats > 0 && dogs > 0) {
if (dogs > cats) {
System.out.println("I guess you like dogs more");
} else if (dogs == cats) {
System.out.println("I guess you like both equally");
} else {
System.out.println("I guess you like cats more");
}
} else {
System.out.println("What, don’t you like pets?");
}
*/
	
	System.out.println("Question #2.");
	System.out.println("The answer is 'I guess you like cats more.'");
	System.out.println();

	}

}
