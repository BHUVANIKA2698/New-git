package phase1proj;

import java.io.File;
import java.io.IOException;
	public class FileHandling {

		public static void main(String[] args) throws IOException{
	File f1 = new File("Myfolder");
	File f2 = new File("Myfolder/test.txt");
	File f3 = new File("Myfolder/proj.txt");

	f1.mkdir();
	f2.createNewFile();
	f3.createNewFile();
	System.out.println("Folder and File Created");
		}
	}

	

