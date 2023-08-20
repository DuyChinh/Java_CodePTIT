package Exe;

import java.util.Scanner;

public class Pow {
	public static final long MOD = (long) 1e9 + 7;
	public static long pow2(long a, long b) {
		if (b == 0) {
			return 1;
		}
		long x = pow2(a, b / 2);
		if (b % 2 == 1) {
			return ((x * x) % MOD * a) % MOD;
		}
		return (x * x) % MOD;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = 1;
		while (t != 0) {
			long a = sc.nextLong();
			long b = sc.nextLong();
			if (a == 0 && b == 0) {
				t = 0;
				break;
			}
			long res = pow2(a, b);
			System.out.println(res);
		}
	}
}
