package in.com.cg.files2;
//employee Class
import java.io.Serializable;

public class Employee implements Serializable//declaring this class as serializable 
{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -8173259726606665076L;//generating serial version ID 
	private int id;//instance member
	private String empName;
	private float salary;
	
	//getter and setter
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	
	public Employee(int id, String empName, float salary)//constructor 
	{
		super();
		this.id = id;
		this.empName = empName;
		this.salary = salary;
	}
	@Override
	public String toString()//tostring function 
	{
		return "Employee [id=" + id + ", empName=" + empName + ", salary=" + salary + "]";
	}
	
	
}
