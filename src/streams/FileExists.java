package streams;

import java.io.File;
import java.io.IOException;

public class FileExists {

	public static void main(String[]args) {
	
	File file = new File("test.txt");
	File file2 = new File ("C:\\Users\\HP\\Desktop\test2.txt");
	File file3 = new File ("C:\\Users\\HP\\Desktop\\RandomFolder");
		
	if (file.exists()) {
		System.out.println("Der Ordner existiert.");
	} else {
		file.mkdir();
		System.out.println("Der Ordner wurde erstellt");
	}
	
		for(int i = 1; i < 11; i++) {
			File randfile = new File("C:\\Users\\HP\\Desktop\\RandomFolder\\random" + i + ".txt");
			
			if(randfile.exists()) {
				System.out.println("Das File existiert bereits.");
			} else {
				System.out.println("Das File existiert noch nicht.");
				
				try {
					randfile.createNewFile();
				} catch (IOException e) {
					e.printStackTrace();
				}
				
			}
		}
	}	
}

