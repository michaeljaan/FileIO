package in.com.cg.files;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Grep {

	public static void main(String[] args) throws IOException
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the string to match from GrepCommand:");
		Pattern pattern =Pattern.compile(scanner.next());
		Matcher matcher = pattern.matcher("");
		String file="";
		BufferedReader br=null;
		String line;
		try 
		{
			br=new BufferedReader(new FileReader(file));
		}catch (IOException e) {
			System.err.println("Cannot read '"+ file + "': " + e.getMessage());
		}
		while((line=br.readLine()) != null)
		{
			matcher.reset(line);
			if(matcher.find())
			{
				System.out.println(file + ": " +line);
			}
		}
		br.close();
		scanner.close();
		
	}

}
