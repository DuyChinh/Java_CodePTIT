package Exe;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class HelloFile {
	public static void main(String[] args) throws FileNotFoundException {
		File myFile = new File("Hello.txt");
		Scanner sc = new Scanner(myFile);
		while (sc.hasNext()) {
			System.out.println(sc.nextLine());
		}
	}
}
