package in.com.cg.files;

import java.io.BufferedReader;//import packages
import java.io.FileReader;
import java.io.IOException;

public class NoOfWords {

	public static void main(String[] args) throws IOException 
	{
		BufferedReader reader = null;
		int wordcount=0;//initialize the word counter
		try {
			reader = new BufferedReader(new FileReader("P:/Users/nagasr/Desktop/new.txt"));//path name
			
			String currentLine=reader.readLine();//read the line
			while(currentLine != null)
			{
				String[] words=currentLine.split(" ");//split the word
				wordcount=wordcount +words.length;//increment the word counter
				currentLine=reader.readLine();
			}
			System.out.println("number of Words: " + wordcount);//output the number of words
		}catch (IOException e) {
			e.printStackTrace();
		}

	}

}
