
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
	
/*	Question 3
You are programming the behavior of an enemy in a video game. The enemy code has access
to two boolean variables, canSeePlayer and playerPoweredUp. canSeePlayer is true
when the enemy can see the player and false otherwise, and playerPoweredUp is true when
the player has found a special item that makes them impossible to defeat temporarily. Fill
in the correct conditions so that “Attack!” is printed when the enemy can see the player
and the player is not powered-up, “Run away!” is printed when the player is visible and is
powered-up, and finally, “Wander.” is printed if the player is not visible.
	
*/
	
	System.out.println("Question #3.");
	System.out.println();
	System.out.println("if (canSeePlayer) {");
	System.out.println("if (!playerPoweredUp) {");
	System.out.println("System.out.println(\"Attack!\");");
	System.out.println("} else {");
	System.out.println("System.out.println(\"Run away!\");");
	System.out.println("{");
	System.out.println("} else {");
	System.out.println("System.out.println(\"Wander.\");");
	System.out.println("Note that the \ was added to allow println to properly work.");
	System.out.println();
	
	
	
	
		
		
		
	

	}

}
