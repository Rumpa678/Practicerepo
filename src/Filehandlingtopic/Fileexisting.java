package Filehandlingtopic;
import java.io.File;
import java.io.IOException;

public class Fileexisting {

	public static void main(String[] args) throws IOException {
		File f8=new File("C:/Filehandling1/Donkey.txt");
		if(f8.delete())
		{
			System.out.println("File is handled");
		}
		else
		{
			System.out.println("File is not handled");
		}
		// TODO Auto-generated method stub

	}

}
