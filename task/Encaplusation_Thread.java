package task;

public class Encaplusation_Thread {

	public static void main(String[] args) {
         Thread thread1=new Thread(new MyRunnable("Thread 1")) ;
         Thread thread2=new Thread(new MyRunnable("Thread 2")) ;
         thread1.start();
         thread2.start();
         
	}
	static class MyRunnable implements Runnable
	{
		private final String name;
		public MyRunnable(String name)
		{
			this.name=name;
		}
		public void run()
		{
			for(int i=1;i<=10;i++)
			{
				System.out.println(name+":"+i);
				try {
					Thread.sleep(1000);
				}
				catch(InterruptedException e){
					
					e.printStackTrace();
				}
			}
		}
	}

}
