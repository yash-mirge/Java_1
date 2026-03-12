package testIO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Student implements Serializable {
	int id;
	String name;

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}

	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

}

public class Main5 {
	public static void main(String[] args) {

		Student student = new Student(21, "Yash");

		try {
			ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("stdn.txt"));
			outputStream.writeObject(student);
			System.out.println("Data added....");
		} catch (IOException e) {
			System.out.println(e);
			e.printStackTrace();
		}
		try {
			ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("stdn.txt"));
			Student student2 = (Student) inputStream.readObject();
			System.out.println(student2);
		} catch (IOException | ClassNotFoundException e) {
			System.out.println(e);
			e.printStackTrace();
		}
		

	}
}
