package task;
import java.util.Scanner;
public class Cse_lab_que {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int l1=sc.nextInt();
		int l2=sc.nextInt();
		int l3=sc.nextInt();
	    
		if(l1<l2 && l1<l3)
			 System.out.println("L1");
		else if(l2<l1 && l2<l3)
			 System.out.println("L2");
		else
			System.out.println("L3");
        
		sc.close();
	}

}
