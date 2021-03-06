package internship;  //Importing the package

import java.util.Random;
import java.util.Scanner;

public class Task1 {

	public static void main(String[] args)    // The main method. The execution starts from this method
	{	
		Random r1 = new Random();
		int num = (int)(Math.random()*100);   // Generating a random number between 1 and 100
		int attempt = 10;
		int currattempt = 1;
		
		while(currattempt <= attempt)        // Limiting the number of attempts and continuing untill the user guess the number
		{
			Scanner s1 = new Scanner(System.in);
			System.out.println("Enter a number between 1 and 100");  // Taking input from user
			int guess = s1.nextInt();
			
			if(num==guess)   // Checking if entered number matches the guess number
			{
				System.out.println("Congrats you won");
				System.out.println("The entered number matches the random number");
				int points = (10-currattempt + 1) * 10;  // Calculating the points
				String sf1 = String.format("You have scored %d points", points);
				System.out.println(sf1);
				break;      // Exiting the loop when entered number matches the guess number
			}
			else if(guess>num)   // Checking if entered number is greater than the guess
			{
				System.out.println("The entered number is greater than the random number");
			}
			else if(guess<num)   // Checking if entered number is smaller than the guess
			{
				System.out.println("The entered number is smaller than the random number");
			}
			
			String sf2 = String.format("This is your %d attempt", currattempt);  // Displaying the attempt number
			System.out.println(sf2);
			String sf3 = String.format("You have %d attempts left", 10-currattempt);  // Displaying the attempts left
			System.out.println(sf3);
			currattempt = currattempt + 1;
		}
		
	}

}
