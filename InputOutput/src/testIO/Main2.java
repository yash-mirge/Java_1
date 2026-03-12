package testIO;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main2 {

	public static void main(String[] args) {

		try {
			FileWriter fileWriter = new FileWriter("demo.txt");
			fileWriter.write("I have created a file.... ");
			fileWriter.close();
			System.out.println("data added....");
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println(e);
		}

	}
}
