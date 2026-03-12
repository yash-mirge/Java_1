package testIO;

import java.io.File;
import java.io.IOException;

public class Main1 {

	public static void main(String[] args) {

		try {
			File file = new File("demo.txt");
			file.createNewFile();
			
			System.out.println("file is created...");
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println(e);
		}

	}

}
