package task;

abstract class parent{
	parent(){
		System.out.println("you are in parent constructor ");
	}
	abstract void meth();
	final void meth2()
	{
		System.out.println("Finnally you called");
	}
}
class child extends parent
{
	child()
	{
		System.out.println("Child class called");	
	}
	void meth()
	{
		System.out.println("Abstract method");
	}
}

public class Abstraction {

	public static void main(String[] args) {
              child c= new child();
              c.meth();
	}

}
