package in.com.cg.files2;
//deserialization main function
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserial 
{
	public static void main(String[] args)
	{
		Employee employee;//object declaration
		
		try(FileInputStream fis=new FileInputStream("employee.txt");//create new file
				ObjectInputStream ois=new ObjectInputStream(fis);){
			
			employee = (Employee) ois.readObject();//read object from bitstream
			System.out.println(employee);
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
