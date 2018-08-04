package in.com.cg.files;
import java.io.File;//import file package
public class FileChecker {

	public static void main(String[] args)
	{
		File file=new File("P:\\Users\\nagasr\\desktop\\pack2.jar");//pathname
		if(file.exists())
		{
			System.out.println("File Existed");
		}
		else
		{
			System.out.println("File not found");
		}
	}

}
