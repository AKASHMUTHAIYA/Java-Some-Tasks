package task;

import java.util.Scanner;

public class Game_one_player {
	
	public static void guess(int n)
	{
		Scanner sc= new Scanner(System.in);
		int number =(int)(20*Math.random());
		System.out.println("      Welcome to Great Girikalan Game show      ");
		System.out.println("         This game is a guessing game           ");
        
		
		for(int i=1;i<=n;i++)
		{
			System.out.println("-------------------------------------------------");
			System.out.print("Your guess: ");
			int guess=sc.nextInt();
			
			if(guess==number)
			{
				System.out.println("*************************************************");
    		System.out.println("      Congratulations! you Guessed      ");
    		System.out.println(" winner of the Great Girikalan Game Show! 🎉🥳");
    		break;
			}
			else if(number>guess)
				System.out.println("The number is greater than "+ guess);
			else if(number<guess)
				System.out.println("The number is less than "+ guess);
    		
    		if(i==n) 
        	{
        		System.out.println("*************************************************");
        		System.out.println("             Better luck next time!                ");
        		System.out.println("Thank you for playing the Great Girikalan Game Show");
        		System.out.println("          The guessed number is "+number            );
        		break;
        	}
    	
		}
		sc.close();
	}

	public static void main(String[] args) {
		guess(5);
		
	}

}
