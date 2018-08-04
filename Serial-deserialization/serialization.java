package in.com.cg.files2;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
//main function for serialization
public class serialization 
{
	public static void main(String[] args)
	{
		Employee employee = new Employee(101, "mike", 10000);//object declaration.
		String filename="employee.txt";//creating file
		
		
		try {//exception handling
			FileOutputStream fis=new FileOutputStream(filename);//output object stream
			ObjectOutputStream oos = new ObjectOutputStream(fis);
			
			oos.writeObject(employee);//writing object stream
			
			System.out.println("Serialization successful.......");
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}catch (Exception e) {
			e.printStackTrace();
		
	}
}
}