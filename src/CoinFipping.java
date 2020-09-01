import java.util.Scanner;

public class CoinFipping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String headsOrTailsGuess;
		int numberOfFlips =0;
		int correctCount=0;
		int percentageVal=0;
		int randomNumber =0;
		Scanner scnr = new Scanner(System.in);
		System.out.print("Guess which will have more: heads or tails? ");
		headsOrTailsGuess = scnr.nextLine();
		while(!headsOrTailsGuess.equalsIgnoreCase("heads") && !headsOrTailsGuess.equalsIgnoreCase("tails"))
		{
			System.out.println("Please enter either heads or tails ");
			System.out.print("Guess which will have more: heads or tails? ");
			headsOrTailsGuess = scnr.nextLine();
		}
		System.out.print("How many times shall we flip a coin? ");
		numberOfFlips = scnr.nextInt();
		while(numberOfFlips <=0)
		{
			System.out.println("Please enter a whole number greater than 0 ");
			System.out.print("How many times shall we flip a coin? ");
			numberOfFlips = scnr.nextInt();
		}
		for(int i = 1; i <= numberOfFlips; i++)
		{
			randomNumber = (int)(Math.random() * numberOfFlips) + i;
			//System.out.println("Random Number" + randomNumber);
	if(randomNumber % 2 == 0)
		{
			System.out.println("heads");
		if(headsOrTailsGuess.equalsIgnoreCase("heads"))
			{
				correctCount++;
			}
		}
		
		else
		{
			System.out.println("tails");
			if(headsOrTailsGuess.equalsIgnoreCase("tails"))
			{
				correctCount++;
			}
		}
		//System.out.println("Correct Count" + correctCount);	
	}
		percentageVal = (correctCount* 100) /numberOfFlips;
		
		
		System.out.println("Your guess, "+ headsOrTailsGuess + ",came up "+correctCount+" time(s). That's "+ percentageVal +"%");
	}
}
