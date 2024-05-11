package task;
class Hero extends Thread{
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println(i);
			try {
				Thread.sleep(1000);
			}
			catch(InterruptedException e){
				
				e.printStackTrace();
			}
		}
	}
}

public class Thread_1 {

	public static void main(String[] args) {
           Hero H1=new Hero();
           Hero H2=new Hero();
           H1.start();
           H2.start();
	}

}
