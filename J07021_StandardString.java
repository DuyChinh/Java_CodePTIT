package Codeptit;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class J07021_StandardString {
	public static String standard(String s) {
		return Character.toUpperCase(s.charAt(0)) + s.substring(1).toLowerCase();
	}
	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(new File("DATA.in"));
		while(sc.hasNextLine()) {
			String s = sc.nextLine().trim();
			String[] arr = s.split("\\s+");
			String res = "";
			for(String x : arr) {
				res+= standard(x) + " ";
			}
			if(res.compareTo("End") == 0 ) {
				System.exit(0);
			}
			System.out.println(res.trim());
		}
	}
}
