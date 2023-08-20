package Exe;

import java.util.Scanner;

public class Fibo {
	public static long[] fibo = new long[100];

	public static boolean binarySearch(long[] arr, long target) {
		int left = 0, right = arr.length - 1;
		while (left <= right) {
			int mid = (left + right) / 2;
			if (arr[mid] == target) {
				return true;
			}
			if (arr[mid] > target) {
				right = mid - 1;
			} else if (arr[mid] < target) {
				left = mid + 1;
			}
		}
		return false;
	}

	public static void createFibo() {
		fibo[0] = 0;
		fibo[1] = 1;
		fibo[2] = 1;
		for (int i = 3; i < 93; i++) {
			fibo[i] = fibo[i - 1] + fibo[i - 2];
		}
	}

	public static void main(String[] args) {
		createFibo();
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			long n = sc.nextLong();
			if (binarySearch(fibo, n)) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}
	}
}
