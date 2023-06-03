package Filehandlingtopic;
import java.io.File;
import java.io.IOException;

import org.testng.annotations.Test;
public class Filecreation {

	@Test
	public void did() throws IOException
	{
		File f7=new File("C:/Filehandling1/Donkey.txt");
		if(f7.createNewFile())
		{
			System.out.println("File is created");
		}
		else{
			System.out.println("File is not created");
		}
		
		// TODO Auto-generated method stub

	}

}
