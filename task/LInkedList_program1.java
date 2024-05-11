package task;
import java.util.*;
public class LInkedList_program1 {

	public static void main(String[] args) {
        LinkedList<String> a=new LinkedList<String>();
        
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the total linkedList length : ");
        int n=sc.nextInt();
        
       
        for(int i=1;i<=n;i++)
        {
        String b=sc.next();
        a.add(b);
        }
        System.out.println(a);
        System.out.print("Find the specific index Length:");
        int x=sc.nextInt();
        if(a.get(x) != null)
        {
        String c=a.get(x);
        System.out.println(c);
        System.out.println(c+"----->"+c.length());
        	
     
        }
        sc.close();
	}

}
