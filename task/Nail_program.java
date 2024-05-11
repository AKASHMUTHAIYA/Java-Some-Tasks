package task;

import java.util.Scanner;

public class Nail_program {

	public static void main(String[] args) {
       Scanner sc= new Scanner(System.in);
       int n1 =sc.nextInt();
       int n2 =sc.nextInt();
       int count=0;
       {
    	  if(n1%n2==0)
    	  {
    		  count++;
    	  }
    	  else if(n1%n2<=1)
    	  {
    		  count++;
    		  System.out.println(count);
  
    	  }
    	  
    	 
    	  if(count==1)
    	  {
    	  count++;
    	  count++;
    	  }
    	 
       
       System.out.println(count);
       sc.close();
    	 }
       }
       
	}



