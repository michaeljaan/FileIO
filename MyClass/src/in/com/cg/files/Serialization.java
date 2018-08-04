package in.com.cg.file6;
//serialization function
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
public class Serialization {

	public static void main(String[] args) {
		ArrayList<MyClass> list=new ArrayList<>();//declaring array 
		MyClass class1=new MyClass(101, "mike", 20000);//initialization of object
		MyClass class2=new MyClass(102, "jaan", 10000);
		MyClass class3=new MyClass(103, "mike", 15000);
		MyClass class4=new MyClass(104, "mike", 3000);
		MyClass class5=new MyClass(105, "mike", 40000);
		
		list.add(class1);//adding to list
		list.add(class2);
		list.add(class3);
		list.add(class4);
		list.add(class5);
		
		String fileName= "lis.txt";//creating file 
		
		try {//exception handling
			FileOutputStream fis=new FileOutputStream(fileName);//output object stream
			ObjectOutputStream oos = new ObjectOutputStream(fis);
			
			oos.writeObject(list);//writing object stream
			
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
