package task;

import java.util.Scanner;

public class Cse_Act_training {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int L1=sc.nextInt();
		int L2=sc.nextInt();
		int L3=sc.nextInt();
		String Act_training=sc.next();
		
		switch(Act_training)
		{
		case ("L1"):
		{
			if(L2>L3)
				System.out.println("L3");
			else
				System.out.println("L2");
			break;
		}
		case ("L2"):
		{
			if(L3>L1)
				System.out.println("L1");
			else
				System.out.println("L3");
			break;
		}
		case ("L3"):
		{
			if(L2>L1)
				System.out.println("L1");
			else
				System.out.println("L2");
			break;
		}
		default:
			System.out.println("NOT VALID");
		
		}
		sc.close();
	}

}
