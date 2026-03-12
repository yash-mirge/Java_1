package testIO;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main3 {

	public static void main(String[] args) {
		 File file = new File("demo.txt");
		 try (Scanner scanner = new Scanner(file)) {
			while (scanner.hasNextLine()) {
				String string =(String) scanner.nextLine();
				System.out.println(string);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println(e);
		}
		 
	}

}
