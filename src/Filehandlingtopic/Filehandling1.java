package Filehandlingtopic;
import java.io.File;
import java.io.IOException;

public class Filehandling1 {

	public static void main(String[] args) throws IOException{
		File f5=new File("C:/Filehandling1");
		if(f5.mkdirs())
				{
			System.out.println("Folder is created");
				}
		else
		{
			System.out.println("Folder is not created");
		}
		// TODO Auto-generated method stub

	}

}
