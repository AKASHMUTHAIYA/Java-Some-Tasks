package task;
import java.util.Scanner;

public class Game{

	public static void guessnumber(int n)
	{
		Scanner sc=new Scanner(System.in);
		int number = (int)(20*Math.random());
		
		System.out.println("      Welcome to Great Girikalan Game show      ");
		System.out.println("         This game is a guessing game           ");
		System.out.println("Players try to guess a randomly generated number");

        for(int i=1;i<=n;i++)
        {
        	System.out.println("-------------------------------------------------");
        	System.out.print("player 1 guess: ");
        	int player1=sc.nextInt();
        	System.out.print("player 2 guess: ");
        	int player2=sc.nextInt();
        	System.out.print("player 3 guess: ");
        	int player3=sc.nextInt();
        	
        	if(number == player1 )
        	{
        		System.out.println("*************************************************");
        		System.out.println("      Congratulations! Player 1 Guessed      ");
        		System.out.println(" winner of the Great Girikalan Game Show! 🎉🥳");
        		break;
        	}
        	else if(number == player2 )
        	{
        		System.out.println("*************************************************");
        		System.out.println("      Congratulations! Player 2 Guessed      ");
        		System.out.println(" winner of the Great Girikalan Game Show! 🎉🥳");
        		break;
        	}
        	else if(number == player3 )
        	{
        		
        		System.out.println("*************************************************");
        		System.out.println("      Congratulations! Player 3 Guessed      ");
        		System.out.println(" winner of the Great Girikalan Game Show! 🎉🥳");
        		break;
        	}
        	
        	
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
		
		guessnumber(5);
		
		
		}

}
