package in.com.cg.file6;
//deserialization function
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

import in.com.cg.files2.Employee;

public class deserialization {

	public static void main(String[] args) 
	{
		ArrayList<MyClass> list;//declare array list
		
		
		try(FileInputStream fis=new FileInputStream("lis.txt");//create new file
				ObjectInputStream ois=new ObjectInputStream(fis);){
			
			list = (ArrayList<MyClass>) ois.readObject();//read object from bitstream
			System.out.println(list);
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}catch (Exception e) {
			e.printStackTrace();
		}

	}

}
