package task;
class test{
	String name= "AKASH MUTHAIYA P";
	int Score=5;
	double salary=800000;
	void display()
	{
		System.out.println("Our College Alumini "+name);
		System.out.println("placed in  "+Score+" company");
		System.out.println("With high package of "+salary+"per Annum");
	}
}

public class College {

	public static void main(String[] args) {
       test ts=new test();
       ts.display();
	}

}
