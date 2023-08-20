package Exe;

import java.util.Scanner;

public class J01014 {
	public static boolean isPrime(long n) {
		if (n < 2) {
			return false;
		}
		for (long i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			long n = sc.nextLong();
			if (isPrime(n)) {
				System.out.println(n);
			} else {
				long max = 2;
				for (long i = 2; i <= Math.sqrt(n); i++) {
					while (n % i == 0) {
						max = i;
						if (isPrime(n / i)) {
							max = n / i;
							break;
						}
						n /= i;
					}
				}
				System.out.println(max);
			}

		}
	}
}
