package in.com.cg.files;
import java.io.BufferedReader;//import packages
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class NoOfLine {

	public static void main(String[] args) throws IOException
	{
		int lineCount =0;//initialize line counter
		
		BufferedReader reader=new BufferedReader(new FileReader("P:/Users/nagasr/Desktop/new.txt"));//path of the file
		while(true)
		{
			String line=reader.readLine();//read the line from file
			if(line==null)//if there is no more line present
			{
				break;
			}
				lineCount++;//increment line counter
			
		}
		reader.close();//close file
		System.out.println("Line Count= "+lineCount);//display file
	}

}
