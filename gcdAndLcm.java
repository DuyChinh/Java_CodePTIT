package Exe;

import java.util.Scanner;

public class gcdAndLcm {
	public static long gcd2(long a, long b) {
		if (b == 0) {
			return a;
		} else {
			return gcd2(b, a % b);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			long a = sc.nextLong();
			long b = sc.nextLong();
			System.out.println((a * b) / gcd2(a, b) + " " + gcd2(a, b));
		}
	}
}
