package task;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;




public class Collection_longprogram1 {

	public static void main(String[] args) {
           List<Integer> n=new LinkedList<Integer>();
           n.add(7);
           n.add(5);
           n.add(4,5);
           List<Integer>m=new LinkedList<>(Arrays.asList(6,3,1));
           n.addAll(m);
           m=new LinkedList<>(Arrays.asList(4,7));
           n.addAll(4,m);
           System.out.println(n);
	}

}
