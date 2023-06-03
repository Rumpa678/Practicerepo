package Filehandlingtopic;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Sure {

	public static void main(String[] args) throws IOException {
		File f1=new File("C:/Users/RUPA/Desktop/filehandling/rupa.txt");
		FileReader fw=new FileReader(f1);
				char[]arr=new char[(int) f1.length()];
		fw.read(arr);
		System.out.println(arr);
}

}
