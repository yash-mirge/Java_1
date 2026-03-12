package testIO;

import java.io.File;

public class Main4 {

	public static void main(String[] args) {
		File file = new File("demo.txt");
		if (file.delete()) {
			System.out.println("file is deleted..."  + file.getName());
		} else {
			System.out.println("file is not deleted...");
		}
	}

}
