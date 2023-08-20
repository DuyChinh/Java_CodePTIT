package Exe;

import java.util.Scanner;

public class J01018 {
	public static boolean solve(String s) {
		int sum = s.charAt(0) - '0';
		for (int i = 1; i < s.length(); i++) {
			sum += s.charAt(i) - '0';
			if (Math.abs(s.charAt(i) - s.charAt(i - 1)) != 2) {
				return false;
			}
		}
		if (sum % 10 != 0) {
			return false;
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		sc.nextLine();
		while (t-- > 0) {
			String s = sc.nextLine();
			if (solve(s)) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}
	}
}
