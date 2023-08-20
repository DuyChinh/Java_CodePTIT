package Exe;

import java.util.Scanner;

public class J02007_DemSoLanXuatHien {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int index = 1;
		while (t-- > 0) {

			int n = sc.nextInt();
			int a[] = new int[n];
			int cnt[] = new int[n];
			for (int i = 0; i < n; i++) {
				a[i] = sc.nextInt();
				cnt[a[i]]++;
			}
			System.out.printf("Test %d:", index++);
			System.out.println();
			for (int x : a) {
				if (cnt[x] > 0) {
					System.out.printf("%d xuat hien %d lan", x, cnt[x]);
					cnt[x] = 0;
				}
				System.out.println();
			}
		}
	}
}
