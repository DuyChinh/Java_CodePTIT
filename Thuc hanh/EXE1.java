package Slide;

import java.util.Scanner;

public class EXE1 {
	public static String standardWord(String s) {
		return s.substring(0, 1).toUpperCase() + s.substring(1).toLowerCase();
	}
	
	public static String standardString(String s) {
		return s.substring(0).toLowerCase();
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		sc.nextLine();
		while (t--> 0) {
			String fullName = sc.nextLine();
			fullName = fullName.trim();
			String[] arr = fullName.split("\\s+");
			String res = "";
			for (int i = 0; i < arr.length; i++) {
				if(i == 0 ||  i == arr.length - 1) {
					res += standardWord(arr[i]) + " ";
				} else {
					res += standardString(arr[i]) + " ";
				}
			}
			System.out.println(res.trim());
		}
	}
}