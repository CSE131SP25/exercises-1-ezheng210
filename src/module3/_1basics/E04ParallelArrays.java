package module3._1basics;

import java.util.Arrays;

public class E04ParallelArrays {
	
	//Exercise 4: Can you print out Mateo's score?
	//Can you change Sofia's score to 97 using an assignment statement in the code? 
	//Can you change the arrays so that they have 6 elements and add your name and score and print them out? 
	public static void main(String[] args) {
		// declare, create, initialize arrays
		int[ ] highScores = {99,98,98,88,68};
		String[ ] names = {"Jamal", "Emily", "Destiny", "Mateo", "Sofia"};

		// Print corresponding names and scores
		System.out.println(names[0] + " has a score of " + highScores[0]);
		System.out.println(names[1] + " has a score of " + highScores[1]);
		System.out.println(names[3] + " has a scores of " + highScores[3]);
		highScores[4] = 97;
		highScores = Arrays.copyOf(highScores, highScores.length + 1);
		names = Arrays.copyOf(names, highScores.length + 1);
		names[5] ="Edna";
		highScores[5] = 100;
		for (int i = 0; i < 6; i++)  {
			System.out.println(names[i] + " has a score of " + highScores[i]);
			
		}
		}
}

