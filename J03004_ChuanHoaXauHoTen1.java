package Exe;

import java.util.Scanner;

public class J03004_ChuanHoaXauHoTen1 {
	public static String standardWord(String s) {
		return s.substring(0, 1).toUpperCase() + s.substring(1).toLowerCase();
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
			for (String x : arr) {
				res += standardWord(x) + " ";
			}
			System.out.println(res.trim());
		}
	}
}
