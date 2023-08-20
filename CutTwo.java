package Exe;

import java.util.Scanner;

public class CutTwo {
	public static long cutNumber(String s) {
		String newStr = "";
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '1') {
				newStr += '1';
			} else if (s.charAt(i) == '8' || s.charAt(i) == '9' || s.charAt(i) == '0') {
				newStr += '0';
			} else {
				return 0;
			}
		}
		return Long.parseLong(newStr);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();

		while (t-- > 0) {
			String s = sc.next();
			if (cutNumber(s) != 0) {
				System.out.println(cutNumber(s));
			} else {
				System.out.println("INVALID");
			}
		}
	}
}