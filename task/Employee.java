package task;

class Emp
{
	final static String company = "TCS";
}
public class Employee {
    final static String company = "Zoho";
    final int id;
    final String name;
    double salary;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    void display() {
    	System.out.println("Employee id: " + id);
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Salary: " + salary);
    }

    public static void main(String[] args) {
        System.out.println("Welcome to " + Employee.company);
        System.out.println("===================================");
        Employee E1 = new Employee(123, "sky", 100000);
        E1.display();
        System.out.println("===================================");

        Employee E2 = new Employee(125, "JITHESH");
        E2.display();
       
      
    }
}
