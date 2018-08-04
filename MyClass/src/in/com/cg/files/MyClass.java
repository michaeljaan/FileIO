package in.com.cg.file6;
//main function class
import java.io.Serializable;

public class MyClass implements Serializable
{

	/**
	 * 
	 */
	private static final long serialVersionUID = -3795646675693695022L;//generate serial version ID
	private int id;//instance member
	private String name;
	private double salary;
	
	public MyClass(int id, String name, double salary)//constructor
	{
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString()//display function 
	{
		return "MyClass [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	
	
	
}
